package proyectoresoluciones.negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import proyectoresoluciones.datos.Curso;
import proyectoresoluciones.datos.Situacion;
import proyectoresoluciones.datos.Solicitud;
import proyectoresoluciones.datos.Top;

public class DAOEstadistica {

    public ArrayList<Top> generarGraficoTopFive(String periodo){
        
        String nombreCurso; 
        int cantidad;
        ArrayList<Top> tops = new ArrayList<>();
        //int idSolicitante;
        //EstadoSolicitud estado;
        //int numSolicitud;
        
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                ResultSet rs = cstmt.executeQuery("call top_curso(\'"+periodo+"\')");
                
                while(rs.next()){
                    nombreCurso=rs.getString(2);
                    cantidad=Integer.parseInt(rs.getString(4));
                   
                    System.out.println(nombreCurso);
                    System.out.println(cantidad);
                    Top top =  new Top();
                    top.setNombre(nombreCurso);
                    top.setCantidad(cantidad);
                    
                    tops.add(top);
                }
                
            } catch (SQLException ex) {
               
            }
        return tops;
    }
    
    public ArrayList<Top> generarGraficoTopThree(){
        
        String nombreProfesor; 
        int modificaciones;
        ArrayList<Top> tops = new ArrayList<>();
        //int idSolicitante;
        //EstadoSolicitud estado;
        //int numSolicitud;
        
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                ResultSet rs = cstmt.executeQuery("call top_profesor");
                
                while(rs.next()){
                    nombreProfesor=rs.getString(2);
                    modificaciones=Integer.parseInt(rs.getString(5));
                   
                    System.out.println(nombreProfesor);
                    System.out.println(modificaciones);
                    Top top =  new Top();
                    top.setNombre(nombreProfesor);
                    top.setCantidad(modificaciones);
                    
                    tops.add(top);
                }
                
            } catch (SQLException ex) {
               
            }
        return tops;
    }
    
}
