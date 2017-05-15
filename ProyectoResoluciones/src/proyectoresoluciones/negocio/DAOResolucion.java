package proyectoresoluciones.negocio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import proyectoresoluciones.datos.Considerando;
import proyectoresoluciones.datos.Resolucion;
import proyectoresoluciones.datos.CreadorArchivos;

public class DAOResolucion {
    
    Resolucion resolucion = new Resolucion();
    
    public DAOResolucion(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public boolean crearPrimeraResolucion(){
        
        resolucion = new Resolucion();
        
        return true;
    }
    
    public boolean generarResolucion(){
        /*GENERAR EN BASE DE DATOS*/
        resolucion.imprimirConsiderandos();
        System.out.println(this.resolucion.getCodigo());
        System.out.println(this.resolucion.getNombreAYR());
        System.out.println(this.resolucion.getHora());
        System.out.println(this.resolucion.getFecha());
        System.out.println(this.resolucion.getNombreDirector());
        System.out.println(this.resolucion.getEstudiante());
        System.out.println(this.resolucion.getCarnet());
        System.out.println(this.resolucion.getCurso());
        System.out.println(this.resolucion.getNoGrupo());
        System.out.println(this.resolucion.getPeriodo());
        System.out.println(this.resolucion.getProfesor());
        System.out.println(this.resolucion.getAsunto());
        System.out.println(this.resolucion.getAsunto3());
        
        
        int numeroSolicitud = this.resolucion.getNumSolicitud();
        String fecha = this.resolucion.getFecha();
        String coordinador = this.resolucion.getCarnet();
        String AYR = this.resolucion.getNombreAYR();
        String director = this.resolucion.getNombreDirector();
        System.out.println("NUMERO SOLICITUD:");
        System.out.println(numeroSolicitud);
        Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                CallableStatement proc= con.prepareCall("{call insert_resolucion(?,?,?,?,?)}");
                proc.setInt(1, numeroSolicitud);
                proc.setString(2, fecha);
                proc.setString(3, coordinador);
                proc.setString(4, AYR);
                proc.setString(5, director);
                
                proc.execute();
                
                
                con.close();
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        
        
        return true;
    }
    
    public Resolucion configurarResolucion(String codigo, String nombreAYR, String hora, String fecha, String nombreDirector, String estudiante, String carnet,
                                            String curso, String noGrupo, String periodo, String profesor,  ArrayList<Considerando> considerandos, int numeroSolicitud){
        
        Resolucion resolucionClonada = this.resolucion.clonar();
        resolucionClonada.setCodigo(codigo);
        resolucionClonada.setNombreAYR(nombreAYR);
        resolucionClonada.setHora(hora);
        resolucionClonada.setFecha(fecha);
        resolucionClonada.setNombreDirector(nombreDirector);
        resolucionClonada.setEstudiante(estudiante);
        resolucionClonada.setCarnet(carnet);
        resolucionClonada.setCurso(curso);
        resolucionClonada.setNoGrupo(noGrupo);
        resolucionClonada.setPeriodo(periodo);
        resolucionClonada.setProfesor(profesor);
        resolucionClonada.setConsiderandos(considerandos);
        resolucionClonada.setNumSolicitud(numeroSolicitud);
        
        this.resolucion = resolucionClonada;
        return resolucion;
    
    }
    
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    public void generarHTML(){
        
        CreadorArchivos creadorArchivos = new CreadorArchivos();
        creadorArchivos.generarHTML(this.resolucion);
        
    }
    
    public void generarArchivo(String tipo){
        CreadorArchivos creadorArchivos = new CreadorArchivos();
        creadorArchivos.crearArchivo(tipo, resolucion);
    }
    
    public void generarPDF(){
        
        CreadorArchivos creadorArchivos = new CreadorArchivos();
        creadorArchivos.generarPDF(this.resolucion);
        
    }
    
}
