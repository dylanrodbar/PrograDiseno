package proyectoresoluciones.negocio;

import javax.swing.JFileChooser;
import proyectoresoluciones.vista.FrameMenuPrincipal;

public class UIGoogleForms {
    
    private Facade facade = new Facade();

    
    public UIGoogleForms(){}
    
    public void cargarArchivo(FrameMenuPrincipal frameMenuPrincipal){
        try{
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode( JFileChooser.FILES_ONLY );
        if( fc.showOpenDialog( frameMenuPrincipal ) == JFileChooser.APPROVE_OPTION )
        {

            facade.cargarArchivo(fc.getSelectedFile().getAbsolutePath());

        }
        }
        catch (Exception e){
            
        }
    }
    
}
