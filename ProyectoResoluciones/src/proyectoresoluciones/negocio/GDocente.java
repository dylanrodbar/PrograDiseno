package proyectoresoluciones.negocio;

public class GDocente extends Gestor {
   
    private DAODocente daoDocente = new DAODocente();
    
    public GDocente(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public String consultarNombreProfesor(String codigoCurso, String periodo, int grupo){
        
        return daoDocente.consultarNombreProfesor(codigoCurso, periodo, grupo);
    }
    
    public void cargarDatos(){
        daoDocente.cargarDatos();
    }
    
}
