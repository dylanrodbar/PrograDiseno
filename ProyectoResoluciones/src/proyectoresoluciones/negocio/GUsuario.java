package proyectoresoluciones.negocio;

import proyectoresoluciones.datos.Usuario;
import proyectoresoluciones.datos.Estudiante;
import proyectoresoluciones.datos.Docente;
import proyectoresoluciones.datos.Usuario1;

public class GUsuario extends Gestor {
     
    private DAOUsuario daoUsuario= new DAOUsuario();
    
    public GUsuario(){}
    
    
    public boolean crear(DTOUsuario dto){ 
        return true;
        
    }
    
    public String consultarUsuario(DTOUsuario dto){ 
        
        Usuario1 usuario = new Usuario1();
        usuario.setCorreoElectronico(dto.getCorreoElectronico());
        usuario.setIdentificacion(dto.getIdentificacion());
        String resultado;
        resultado = daoUsuario.consultarUsuario(usuario);
        System.out.println(resultado);
 
        return resultado;
        
        
    }
    /*
    public boolean consultarEstudiante(DTOUsuario dtoUsuario){
        
        Usuario usuario = new Estudiante();
        usuario.setCorreoElectronico(dtoUsuario.getCorreoElectronico());
        usuario.setIdentificacion(dtoUsuario.getIdentificacion());
        usuario = daoUsuario.consultarUsuario(usuario);
        
        /*Se obtiene el usuario, si es null, el usuario no es estudiante* /
        if(usuario == null) return false;
        else return true;
        
        //return super.consultar(usuario);
        
    }
    
    public boolean consultarProfesor(DTOUsuario dtoUsuario){
        
        Usuario usuario = new Docente();
        usuario.setCorreoElectronico(dtoUsuario.getCorreoElectronico());
        usuario.setIdentificacion(dtoUsuario.getIdentificacion());
        usuario = daoUsuario.consultarUsuario(usuario);
        
        /*Se obtiene el usuario, si es null, el usuario no es estudiante* /
        if(usuario == null) return false;
        else return true;
        
    }
    */
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }

    @Override
    public boolean crear(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
