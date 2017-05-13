package proyectoresoluciones.negocio;

public class UIFrameMenuPrincipal {
    
    private Facade facade = new Facade();

    
    
    public UIFrameMenuPrincipal(){}
    
    public void cargarDatos(){
        
        facade.cargarDatos();
        
    }
    
}
