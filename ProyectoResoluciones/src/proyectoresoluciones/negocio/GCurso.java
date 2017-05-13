package proyectoresoluciones.negocio;

import proyectoresoluciones.datos.Curso;
import java.util.ArrayList;

public class GCurso extends Gestor {
    
    private DAOCurso daoCurso = new DAOCurso();
    
    public GCurso(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    public ArrayList<Curso> consultarC(){
        
        
        return daoCurso.consultarCursos();
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public void cargarDatos(){
        daoCurso.cargarDatos();
    }
    
}
