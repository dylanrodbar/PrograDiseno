package proyectoresoluciones.negocio;

import proyectoresoluciones.vista.FrameLogin;

public class UIFrameLogin {
    
    private Facade facade = new Facade();
    private DTOUsuario dtoUsuario = new DTOUsuario();

    
    public UIFrameLogin(){}
    

    
    /*El UI recibe el frame que utiliza como parámetro para posteriormente enviarlo al facade*/
    public int iniciarSesion(FrameLogin frameLogin){
        
        String correoElectronico;
        String identificacion;
        
        
        /*Se valida que no se dejara ningún campo vacío*/
        if(frameLogin.getTxtCorreoElectronico().getText().isEmpty() || frameLogin.getTxtIdentificacion().getText().isEmpty()){
            
            System.out.println("Los espacios para el correo electrónico ni la contraseña pueden estar vacíos");
            
        }
        
        else{
            
            correoElectronico = frameLogin.getTxtCorreoElectronico().getText();
            identificacion = frameLogin.getTxtIdentificacion().getText();            
            dtoUsuario.setCorreoElectronico(correoElectronico);
            dtoUsuario.setIdentificacion(identificacion);      
            String tipo = facade.iniciarSesion(dtoUsuario);
            if (tipo.compareTo("coordinador")==0 || tipo.compareTo("profesor")==0 || tipo.compareTo("estudiante")==0){
                int permiso = facade.verificarUsuario(tipo, this);
                return permiso;
            }
            
            
            
        }
        
        return -1;
    }
    
    
}
