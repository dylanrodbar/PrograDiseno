package proyectoresoluciones.negocio;

import java.util.ArrayList;
import proyectoresoluciones.datos.Curso;
import proyectoresoluciones.datos.Top;

public class GEstadistica {
    private DAOEstadistica daoEstadistica = new DAOEstadistica();
    
    public GEstadistica(){}
    
    
    public ArrayList<Top> generarGraficoTopFive(String periodo){
            
        return daoEstadistica.generarGraficoTopFive(periodo);
            
    }
    
    public ArrayList<Top> generarGraficoTopThree(){
            
        return daoEstadistica.generarGraficoTopThree();
            
    }
    
}
