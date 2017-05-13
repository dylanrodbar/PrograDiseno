package proyectoresoluciones.negocio;

//Graficos
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities;
import proyectoresoluciones.datos.Curso;
import proyectoresoluciones.datos.Top;

import proyectoresoluciones.vista.FrameEstadisticas;

public class UIFrameEstadisticas {
    
    public UIFrameEstadisticas(){}
    private Facade facade = new Facade();
    
    public void generarGraficoTopFive(FrameEstadisticas frameEstadisticas) throws IOException{
        
        //Grafico Top 5 Cursos
        String[] cursos = new String[5];
        int[] cantidades= new int[5];

        String periodo = frameEstadisticas.getTxtPeriodo().getText();
        ArrayList<Top> tops = new ArrayList<>();
        tops = facade.generarGraficoTopFive(periodo);
        
        for(int i = 0; i < tops.size(); i++){
            
            cursos[i] = tops.get(i).getNombre();
            cantidades[i] = tops.get(i).getCantidad();
        
        }
        //Cursos y cantidad de resoluciones de cada uno en el periodo
        
        /*cursos[1] = "Curso2";
        cursos[2] = "Curso3";
        cursos[3] = "Curso4";
        cursos[4] = "Curso5";
        cantidades[0] = 3;
        cantidades[1] = 7;
        cantidades[2] = 2;
        cantidades[3] = 5;
        cantidades[4] = 7;*/
        String periodoActual = "I Semestre 2015";
        
        for(int i = 0; i < tops.size() ; i++){
            
          frameEstadisticas.getDataset().addValue( cantidades[i] , "Curso" , cursos[i]);
          
        }
        
        frameEstadisticas.iniciarBarChart(periodoActual);
        
        int width = 640;    /* Width of the image */
        int height = 480;   /* Height of the image */ 
        File BarChart = new File( "top5Cursos.jpeg" ); 
        
        ChartUtilities.saveChartAsJPEG( BarChart , frameEstadisticas.getBarChart() , width , height );
        
    }
    
    public void generarGraficoTopThree(FrameEstadisticas frameEstadisticas) throws IOException{
     
        //Grafico Top 3 Profes
        String[] profesores = new String[3];
        int[] modificaciones= new int[3];

        //Profes y cantidad de modificaciones de cada uno
        ArrayList<Top> tops = new ArrayList<>();
        tops = facade.generarGraficoTopThree();
        
        for(int i = 0; i < tops.size(); i++){
            
            profesores[i] = tops.get(i).getNombre();
            modificaciones[i] = tops.get(i).getCantidad();
        
        }
        
        String periodoActual = "I Semestre 2015";
        
        for(int i = 0; i < tops.size() ; i++){
            
          frameEstadisticas.getDataset2().addValue( modificaciones[i] , "Profesor" , profesores[i]);
          
        }
        
        frameEstadisticas.iniciarBarChart2(periodoActual);
        
        int width = 640;    /* Width of the image */
        int height = 480;   /* Height of the image */ 
        
        File BarChart2 = new File( "top3Profes.jpeg" ); 
        
        ChartUtilities.saveChartAsJPEG( BarChart2 , frameEstadisticas.getBarChart2() , width , height );
    }
    
}
