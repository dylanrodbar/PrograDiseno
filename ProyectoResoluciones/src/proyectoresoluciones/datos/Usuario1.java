package proyectoresoluciones.datos;

import java.util.ArrayList;

public class Usuario1 extends Usuario{
    
    private ArrayList<Solicitud> solicitudes = new ArrayList<Solicitud>();
    
    public Usuario1(){}
    
    public String getIdentificacion(){
        
        return this.identificacion;
        
    }
    
    public String getNombre(){
        
        return this.nombre;
        
    }
    
    public String getPrimerApellido(){
        
        return this.primerApellido;
        
    }
    
    public String getSegundoApellido(){
        
        return this.segundoApellido;
        
    }
    
    public String getCorreoElectronico(){
        
        return this.correoElectronico;
        
    }
    
    public String getTelefono(){
        
        return this.telefono;
        
    }
    
    public void setIdentificacion(String identificacion){
        
        this.identificacion = identificacion;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
        
    }
    
    public void setPrimerApellido(String primerApellido){
        
        this.primerApellido = primerApellido;
        
    }
    
    public void setSegundoApellido(String segundoApellido){
        
        this.segundoApellido = segundoApellido;
        
    }
    
    public void setCorreoElectronico(String correoElectronico){
        
        this.correoElectronico = correoElectronico;
        
    }
    
    public void setTelefono(String telefono){
        
        this.telefono = telefono;
        
    }
          
    
}
