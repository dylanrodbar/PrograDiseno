package proyectoresoluciones.negocio;

import java.util.ArrayList;

public class GOferta {
    
    private DAOOferta daoOferta = new DAOOferta();
    
    public GOferta(){}
    
    public String consultarProfesor(String codigoCurso, String grupo, String periodo){
        
        
        return daoOferta.consultarProfesor(codigoCurso, grupo, periodo);
        
    }
    
    public ArrayList<String> consultarGrupos(String codigoCurso, String periodo){
        
        
        return daoOferta.consultarGrupos(codigoCurso, periodo);
        
    }
    
    public void cargarDatos(){
        daoOferta.cargarDatos();
    }
    
}
