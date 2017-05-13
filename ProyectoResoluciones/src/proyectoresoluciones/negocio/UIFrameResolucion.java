package proyectoresoluciones.negocio;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import proyectoresoluciones.vista.FrameResolucion;

public class UIFrameResolucion {
    
    private Facade facade = new Facade();
    private DTOResolucion dtoResolucion = new DTOResolucion();

    
    private String codigo;
    private String nombreAYR;
    private String hora;
    private String fecha; 
    private String nombreDirector;
    private String estudiante;
    private String carnet;
    private String curso;
    private String noGrupo;
    private String periodo;
    private String profesor;
    private String asunto;
    private String asunto2;
    private String asunto3;
    private int numeroSolicitud;
    
    
    
    public UIFrameResolucion(
        
    
    ){}
    
    public void cargarDatosPlantilla(FrameResolucion frameResolucion){
        
        codigo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroResolucion().getText();
        nombreAYR = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorAYR().getText();
        fecha = frameResolucion.getFrameConfigPlantilla().getTxtFecha().getText();
        nombreDirector = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorEscuela().getText();
        estudiante = frameResolucion.getFrameConfigPlantilla().getTxtEstudiante().getText();
        carnet = frameResolucion.getFrameConfigPlantilla().getTxtCarnet().getText();
        curso = frameResolucion.getFrameConfigPlantilla().getTxtCurso().getText();
        noGrupo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroGrupo().getText();
        periodo = frameResolucion.getFrameConfigPlantilla().getTxtPeriodo().getText();
        profesor = frameResolucion.getFrameConfigPlantilla().getTxtProfesor().getText();
        asunto = frameResolucion.getFrameConfigPlantilla().getTxtAsunto1().getText();
        asunto3 = frameResolucion.getFrameConfigPlantilla().getTxtAsunto3().getText();
        hora = frameResolucion.getFrameConfigPlantilla().getTxtHora().getText();
        numeroSolicitud = Integer.parseInt(frameResolucion.getFrameConfigPlantilla().getTxtNumeroSolicitud().getText());
        
     
        String[] row = new String[10];
        row[0] = fecha;
        row[1] = carnet;
        row[2] = estudiante;
        row[3] = periodo;
        row[4] = curso;
        row[5] = profesor;
        row[6] = noGrupo;
        row[7] = String.valueOf(numeroSolicitud);
   
        frameResolucion.getModeloDatos().addRow(row);
        
        
    }
    
    public boolean crearResolucion(FrameResolucion frameResolucion){
        
        ArrayList<String> considerandos = new ArrayList<>();
        
        TableModel tableModel = frameResolucion.getTablaConsiderandos().getModel();

        int columnas = tableModel.getColumnCount();

        int filas = tableModel.getRowCount();

        for(int i=0; i<filas; i++) {

            for(int j=0; j<columnas; j++){
                considerandos.add((String) tableModel.getValueAt(i,j));
            }
        
        }
        
        
        
        codigo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroResolucion().getText();
        nombreAYR = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorAYR().getText();
        fecha = frameResolucion.getFrameConfigPlantilla().getTxtFecha().getText();
        nombreDirector = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorEscuela().getText();
        estudiante = frameResolucion.getFrameConfigPlantilla().getTxtEstudiante().getText();
        carnet = frameResolucion.getFrameConfigPlantilla().getTxtCarnet().getText();
        curso = frameResolucion.getFrameConfigPlantilla().getTxtCurso().getText();
        noGrupo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroGrupo().getText();
        periodo = frameResolucion.getFrameConfigPlantilla().getTxtPeriodo().getText();
        profesor = frameResolucion.getFrameConfigPlantilla().getTxtProfesor().getText();
        asunto = frameResolucion.getFrameConfigPlantilla().getTxtAsunto1().getText();
        asunto3 = frameResolucion.getFrameConfigPlantilla().getTxtAsunto3().getText();
        hora = frameResolucion.getFrameConfigPlantilla().getTxtHora().getText();
        numeroSolicitud = Integer.parseInt(frameResolucion.getFrameConfigPlantilla().getTxtNumeroSolicitud().getText());
        System.out.println("NUMERO SOLICITUD:");
        System.out.println(numeroSolicitud);

        
        dtoResolucion.setConsiderandos(considerandos);
        dtoResolucion.setCodigo(codigo);
        dtoResolucion.setNombreAYR(nombreAYR);
        dtoResolucion.setHora(hora);
        dtoResolucion.setFecha(fecha);
        dtoResolucion.setNombreDirector(nombreDirector);
        dtoResolucion.setEstudiante(estudiante);
        dtoResolucion.setCarnet(carnet);
        dtoResolucion.setCurso(curso);
        dtoResolucion.setNoGrupo(noGrupo);
        dtoResolucion.setPeriodo(periodo);
        dtoResolucion.setProfesor(profesor);
        dtoResolucion.setAsunto(asunto);
        dtoResolucion.setAsunto2(asunto2);
        dtoResolucion.setAsunto3(asunto3);
        dtoResolucion.setNumeroSolicitud(numeroSolicitud);
        
        
        facade.crearResolucion(dtoResolucion);
        
        

        return true;
    }
    
    public void generarHTML(FrameResolucion frameResolucion){
        
        
        
        ArrayList<String> considerandos = new ArrayList<>();
        
        TableModel tableModel = frameResolucion.getTablaConsiderandos().getModel();

        int columnas = tableModel.getColumnCount();

        int filas = tableModel.getRowCount();

        for(int i=0; i<filas; i++) {

            for(int j=0; j<columnas; j++){
                considerandos.add((String) tableModel.getValueAt(i,j));
            }
        
        }
        
        String codigo;
        String nombreAYR;
        String hora;
        String fecha; 
        String nombreDirector;
        String estudiante;
        String carnet;
        String curso;
        String noGrupo;
        String periodo;
        String profesor;
        String asunto;
        String asunto2;
        String asunto3;
        
        codigo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroResolucion().getText();
        nombreAYR = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorAYR().getText();
        fecha = frameResolucion.getFrameConfigPlantilla().getTxtFecha().getText();
        nombreDirector = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorEscuela().getText();
        estudiante = frameResolucion.getFrameConfigPlantilla().getTxtEstudiante().getText();
        carnet = frameResolucion.getFrameConfigPlantilla().getTxtCarnet().getText();
        curso = frameResolucion.getFrameConfigPlantilla().getTxtCurso().getText();
        noGrupo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroGrupo().getText();
        periodo = frameResolucion.getFrameConfigPlantilla().getTxtPeriodo().getText();
        profesor = frameResolucion.getFrameConfigPlantilla().getTxtProfesor().getText();
        asunto = frameResolucion.getFrameConfigPlantilla().getTxtAsunto1().getText();
        asunto3 = frameResolucion.getFrameConfigPlantilla().getTxtAsunto3().getText();
        hora = frameResolucion.getFrameConfigPlantilla().getTxtHora().getText();
        
        dtoResolucion.setConsiderandos(considerandos);
        dtoResolucion.setCodigo(codigo);
        dtoResolucion.setNombreAYR(nombreAYR);
        dtoResolucion.setHora(hora);
        dtoResolucion.setFecha(fecha);
        dtoResolucion.setNombreDirector(nombreDirector);
        dtoResolucion.setEstudiante(estudiante);
        dtoResolucion.setCarnet(carnet);
        dtoResolucion.setCurso(curso);
        dtoResolucion.setNoGrupo(noGrupo);
        dtoResolucion.setPeriodo(periodo);
        dtoResolucion.setProfesor(profesor);
        dtoResolucion.setAsunto(asunto);
        dtoResolucion.setAsunto3(asunto3);
        
        
        facade.generarHTML(dtoResolucion);
        
        frameResolucion.limpiarTabla();
    }
    
    public void generarArchivo(FrameResolucion frameResolucion){
        ArrayList<String> considerandos = new ArrayList<>();
        
        TableModel tableModel = frameResolucion.getTablaConsiderandos().getModel();

        int columnas = tableModel.getColumnCount();

        int filas = tableModel.getRowCount();

        for(int i=0; i<filas; i++) {

            for(int j=0; j<columnas; j++){
                considerandos.add((String) tableModel.getValueAt(i,j));
            }
        
        }
        
        
        String codigo;
        String nombreAYR;
        String hora;
        String fecha; 
        String nombreDirector;
        String estudiante;
        String carnet;
        String curso;
        String noGrupo;
        String periodo;
        String profesor;
        String asunto;
        String asunto2;
        String asunto3;
        
        String tipoArchivo;
        
        tipoArchivo = frameResolucion.getTipoArchivo();
        codigo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroResolucion().getText();
        nombreAYR = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorAYR().getText();
        fecha = frameResolucion.getFrameConfigPlantilla().getTxtFecha().getText();
        nombreDirector = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorEscuela().getText();
        estudiante = frameResolucion.getFrameConfigPlantilla().getTxtEstudiante().getText();
        carnet = frameResolucion.getFrameConfigPlantilla().getTxtCarnet().getText();
        curso = frameResolucion.getFrameConfigPlantilla().getTxtCurso().getText();
        noGrupo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroGrupo().getText();
        periodo = frameResolucion.getFrameConfigPlantilla().getTxtPeriodo().getText();
        profesor = frameResolucion.getFrameConfigPlantilla().getTxtProfesor().getText();
        asunto = frameResolucion.getFrameConfigPlantilla().getTxtAsunto1().getText();
        asunto3 = frameResolucion.getFrameConfigPlantilla().getTxtAsunto3().getText();
        hora = frameResolucion.getFrameConfigPlantilla().getTxtHora().getText();
        
        dtoResolucion.setConsiderandos(considerandos);
        dtoResolucion.setCodigo(codigo);
        dtoResolucion.setNombreAYR(nombreAYR);
        dtoResolucion.setHora(hora);
        dtoResolucion.setFecha(fecha);
        dtoResolucion.setNombreDirector(nombreDirector);
        dtoResolucion.setEstudiante(estudiante);
        dtoResolucion.setCarnet(carnet);
        dtoResolucion.setCurso(curso);
        dtoResolucion.setNoGrupo(noGrupo);
        dtoResolucion.setPeriodo(periodo);
        dtoResolucion.setProfesor(profesor);
        dtoResolucion.setAsunto(asunto);
        dtoResolucion.setAsunto3(asunto3);
        
        
        facade.generarArchivo(dtoResolucion, tipoArchivo);
        
        frameResolucion.limpiarTabla();
    }
    
    public void generarPDF(FrameResolucion frameResolucion){
        
        ArrayList<String> considerandos = new ArrayList<>();
        
        TableModel tableModel = frameResolucion.getTablaConsiderandos().getModel();

        int columnas = tableModel.getColumnCount();

        int filas = tableModel.getRowCount();

        for(int i=0; i<filas; i++) {

            for(int j=0; j<columnas; j++){
                considerandos.add((String) tableModel.getValueAt(i,j));
            }
        
        }
        
        
        String codigo;
        String nombreAYR;
        String hora;
        String fecha; 
        String nombreDirector;
        String estudiante;
        String carnet;
        String curso;
        String noGrupo;
        String periodo;
        String profesor;
        String asunto;
        String asunto2;
        String asunto3;
        
        
        codigo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroResolucion().getText();
        nombreAYR = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorAYR().getText();
        fecha = frameResolucion.getFrameConfigPlantilla().getTxtFecha().getText();
        nombreDirector = frameResolucion.getFrameConfigPlantilla().getTxtNombreDirectorEscuela().getText();
        estudiante = frameResolucion.getFrameConfigPlantilla().getTxtEstudiante().getText();
        carnet = frameResolucion.getFrameConfigPlantilla().getTxtCarnet().getText();
        curso = frameResolucion.getFrameConfigPlantilla().getTxtCurso().getText();
        noGrupo = frameResolucion.getFrameConfigPlantilla().getTxtNumeroGrupo().getText();
        periodo = frameResolucion.getFrameConfigPlantilla().getTxtPeriodo().getText();
        profesor = frameResolucion.getFrameConfigPlantilla().getTxtProfesor().getText();
        asunto = frameResolucion.getFrameConfigPlantilla().getTxtAsunto1().getText();
        asunto3 = frameResolucion.getFrameConfigPlantilla().getTxtAsunto3().getText();
        hora = frameResolucion.getFrameConfigPlantilla().getTxtHora().getText();
        
        dtoResolucion.setConsiderandos(considerandos);
        dtoResolucion.setCodigo(codigo);
        dtoResolucion.setNombreAYR(nombreAYR);
        dtoResolucion.setHora(hora);
        dtoResolucion.setFecha(fecha);
        dtoResolucion.setNombreDirector(nombreDirector);
        dtoResolucion.setEstudiante(estudiante);
        dtoResolucion.setCarnet(carnet);
        dtoResolucion.setCurso(curso);
        dtoResolucion.setNoGrupo(noGrupo);
        dtoResolucion.setPeriodo(periodo);
        dtoResolucion.setProfesor(profesor);
        dtoResolucion.setAsunto(asunto);
        dtoResolucion.setAsunto3(asunto3);
        
        
        facade.generarPDF(dtoResolucion);
        
        frameResolucion.limpiarTabla();
    }
    
}
