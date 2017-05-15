package proyectoresoluciones.negocio;

import java.util.ArrayList;
import proyectoresoluciones.datos.Considerando;
import proyectoresoluciones.datos.Resolucion;

public class GestorResolucion {
    
    private DAOResolucion daoResolucion = new DAOResolucion();
    
    public boolean crear(Object obj){
        
        return true;
        
    }
    
    public boolean crear(DTOResolucion dtoResolucion){
        
        /*
        Resolucion resolucion = new Resolucion();
        resolucion.setConsiderandos(dtoResolucion.getConsiderandos());
        resolucion.setCodigo(dtoResolucion.getCodigo());
        resolucion.setNombreAYR(dtoResolucion.getNombreAYR());
        resolucion.setHora(dtoResolucion.getHora());
        resolucion.setFecha(dtoResolucion.getFecha());
        resolucion.setNombreDirector(dtoResolucion.getNombreDirector());
        resolucion.setEstudiante(dtoResolucion.getEstudiante());
        resolucion.setCarnet(dtoResolucion.getCarnet());
        resolucion.setCurso(dtoResolucion.getCurso());
        resolucion.setNoGrupo(dtoResolucion.getNoGrupo());
        resolucion.setPeriodo(dtoResolucion.getPeriodo());
        resolucion.setProfesor(dtoResolucion.getProfesor());
        resolucion.setAsunto(dtoResolucion.getAsunto());
        resolucion.setAsunto2(dtoResolucion.getAsunto2());
        resolucion.setAsunto3(dtoResolucion.getAsunto3());*/
        
        ArrayList<Considerando> considerandos = new ArrayList<>();
        considerandos = dtoResolucion.getConsiderandos();
        String codigo = dtoResolucion.getCodigo();
        String nombreAYR = dtoResolucion.getNombreAYR();
        String hora = dtoResolucion.getHora();
        String fecha = dtoResolucion.getFecha();
        String nombreDirector = dtoResolucion.getNombreDirector();
        String estudiante = dtoResolucion.getEstudiante();
        String carnet = dtoResolucion.getCarnet();
        String curso = dtoResolucion.getCurso();
        String noGrupo = dtoResolucion.getNoGrupo();
        String periodo = dtoResolucion.getPeriodo();
        String profesor = dtoResolucion.getProfesor();

        int numeroSolicitud = dtoResolucion.getNumeroSolicitud();
        daoResolucion.configurarResolucion(codigo, nombreAYR, hora, fecha, nombreDirector, estudiante, carnet, curso, noGrupo, periodo, profesor, considerandos, numeroSolicitud);
        
       
        daoResolucion.generarResolucion();  
        return true;
        
    }
    
    public Object consultar(Object obj){
        
        return obj;
        
    }
    
    public void generarHTML(DTOResolucion dtoResolucion){
        
        Resolucion resolucion = new Resolucion();
        
        ArrayList<Considerando> considerandos = new ArrayList<>();
        considerandos = dtoResolucion.getConsiderandos();
        String codigo = dtoResolucion.getCodigo();
        String nombreAYR = dtoResolucion.getNombreAYR();
        String hora = dtoResolucion.getHora();
        String fecha = dtoResolucion.getFecha();
        String nombreDirector = dtoResolucion.getNombreDirector();
        String estudiante = dtoResolucion.getEstudiante();
        String carnet = dtoResolucion.getCarnet();
        String curso = dtoResolucion.getCurso();
        String noGrupo = dtoResolucion.getNoGrupo();
        String periodo = dtoResolucion.getPeriodo();
        String profesor = dtoResolucion.getProfesor();

        int numeroSolicitud = dtoResolucion.getNumeroSolicitud();
        daoResolucion.configurarResolucion(codigo, nombreAYR, hora, fecha, nombreDirector, estudiante, carnet, curso, noGrupo, periodo, profesor, considerandos, numeroSolicitud);
        
        /*resolucion.setConsiderandos(dtoResolucion.getConsiderandos());
        resolucion.setCodigo(dtoResolucion.getCodigo());
        resolucion.setNombreAYR(dtoResolucion.getNombreAYR());
        resolucion.setHora(dtoResolucion.getHora());
        resolucion.setFecha(dtoResolucion.getFecha());
        resolucion.setNombreDirector(dtoResolucion.getNombreDirector());
        resolucion.setEstudiante(dtoResolucion.getEstudiante());
        resolucion.setCarnet(dtoResolucion.getCarnet());
        resolucion.setCurso(dtoResolucion.getCurso());
        resolucion.setNoGrupo(dtoResolucion.getNoGrupo());
        resolucion.setPeriodo(dtoResolucion.getPeriodo());
        resolucion.setProfesor(dtoResolucion.getProfesor());
        resolucion.setAsunto(dtoResolucion.getAsunto());
        resolucion.setAsunto2(dtoResolucion.getAsunto2());
        resolucion.setAsunto3(dtoResolucion.getAsunto3());
        resolucion.setConsiderandos(dtoResolucion.getConsiderandos()); /*Aquí mando los considerandos*/
        daoResolucion.generarHTML();
        
    }
    
    
    /*public void generarHTML(DTOResolucion dtoResolucion){
        
        Resolucion resolucion = new Resolucion();
        
        ArrayList<Considerando> considerandos = new ArrayList<>();
        considerandos = dtoResolucion.getConsiderandos();
        String codigo = dtoResolucion.getCodigo();
        String nombreAYR = dtoResolucion.getNombreAYR();
        String hora = dtoResolucion.getHora();
        String fecha = dtoResolucion.getFecha();
        String nombreDirector = dtoResolucion.getNombreDirector();
        String estudiante = dtoResolucion.getEstudiante();
        String carnet = dtoResolucion.getCarnet();
        String curso = dtoResolucion.getCurso();
        String noGrupo = dtoResolucion.getNoGrupo();
        String periodo = dtoResolucion.getPeriodo();
        String profesor = dtoResolucion.getProfesor();
        String asunto = dtoResolucion.getAsunto();
        String asunto2 = dtoResolucion.getAsunto2();
        String asunto3 = dtoResolucion.getAsunto3();
        int numeroSolicitud = dtoResolucion.getNumeroSolicitud();
        daoResolucion.configurarResolucion(codigo, nombreAYR, hora, fecha, nombreDirector, estudiante, carnet, curso, noGrupo, periodo, profesor, asunto, asunto2, asunto3, considerandos, numeroSolicitud);
        
        resolucion.setConsiderandos(dtoResolucion.getConsiderandos());
        resolucion.setCodigo(dtoResolucion.getCodigo());
        resolucion.setNombreAYR(dtoResolucion.getNombreAYR());
        resolucion.setHora(dtoResolucion.getHora());
        resolucion.setFecha(dtoResolucion.getFecha());
        resolucion.setNombreDirector(dtoResolucion.getNombreDirector());
        resolucion.setEstudiante(dtoResolucion.getEstudiante());
        resolucion.setCarnet(dtoResolucion.getCarnet());
        resolucion.setCurso(dtoResolucion.getCurso());
        resolucion.setNoGrupo(dtoResolucion.getNoGrupo());
        resolucion.setPeriodo(dtoResolucion.getPeriodo());
        resolucion.setProfesor(dtoResolucion.getProfesor());
        resolucion.setAsunto(dtoResolucion.getAsunto());
        resolucion.setAsunto2(dtoResolucion.getAsunto2());
        resolucion.setAsunto3(dtoResolucion.getAsunto3());
        resolucion.setConsiderandos(dtoResolucion.getConsiderandos()); Aquí mando los considerandos
        daoResolucion.generarHTML();
        
    }*/
    
    public void generarArchivo(DTOResolucion dtoResolucion, String tipo){
        
        
        ArrayList<Considerando> considerandos = new ArrayList<>();
        considerandos = dtoResolucion.getConsiderandos();
        String codigo = dtoResolucion.getCodigo();
        String nombreAYR = dtoResolucion.getNombreAYR();
        String hora = dtoResolucion.getHora();
        String fecha = dtoResolucion.getFecha();
        String nombreDirector = dtoResolucion.getNombreDirector();
        String estudiante = dtoResolucion.getEstudiante();
        String carnet = dtoResolucion.getCarnet();
        String curso = dtoResolucion.getCurso();
        String noGrupo = dtoResolucion.getNoGrupo();
        String periodo = dtoResolucion.getPeriodo();
        String profesor = dtoResolucion.getProfesor();
  
        int numeroSolicitud = dtoResolucion.getNumeroSolicitud();
        daoResolucion.configurarResolucion(codigo, nombreAYR, hora, fecha, nombreDirector, estudiante, carnet, curso, noGrupo, periodo, profesor, considerandos, numeroSolicitud);
        
        daoResolucion.generarArchivo(tipo);
        
    }
    
}
