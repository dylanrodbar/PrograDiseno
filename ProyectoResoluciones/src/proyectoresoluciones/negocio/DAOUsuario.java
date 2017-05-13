package proyectoresoluciones.negocio;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import proyectoresoluciones.datos.Usuario;
import proyectoresoluciones.datos.Estudiante;
import proyectoresoluciones.datos.Docente;
import proyectoresoluciones.datos.Usuario1;

public class DAOUsuario extends DAO {
    
    public DAOUsuario(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    
    /*Para comprobar si los datos digitados son de estudiante o profesor*/

    /**
     *
     * @param usuario
     * @return
     */

    public String consultarUsuario(Usuario1 usuario){
        
        try {
                
                Connection con = proyectoresoluciones.dbConnection.conectDB();
                String id_usuario=usuario.getIdentificacion();
                String correo=usuario.getCorreoElectronico();
                Statement cstmt = con.createStatement(); 
                ResultSet rs = cstmt.executeQuery("{call verificar_usuario(\'"+id_usuario+"\',\'"+correo+"\')}");
                while(rs.next()){
                    System.out.println(rs.getString(1));
                   return rs.getString(1);
                }
                
              con.close();
              rs.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        return "error";
                
    }
    
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
}
