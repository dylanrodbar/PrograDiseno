package proyectoresoluciones.negocio;

import java.util.ArrayList;

public class GSituacion {
    
    DAOSituacion daoSituacion = new DAOSituacion();
    
    public GSituacion(){}
    
    public void cargarDatos(){
        daoSituacion.cargarDatos();
    }
    
    public ArrayList<String> cargarSituaciones(){
        
        return daoSituacion.cargarSituaciones();
    }
    
    
}
