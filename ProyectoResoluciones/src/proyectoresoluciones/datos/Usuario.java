package proyectoresoluciones.datos;

public abstract class Usuario {
    
    protected String identificacion;
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String correoElectronico;
    protected String telefono;
    
    public abstract String getIdentificacion();
    public abstract String getNombre();
    public abstract String getPrimerApellido();
    public abstract String getSegundoApellido();
    public abstract String getCorreoElectronico();
    public abstract String getTelefono();
    
    public abstract void setIdentificacion(String identificacion);
    public abstract void setNombre(String nombre);
    public abstract void setPrimerApellido(String primerApellido);
    public abstract void setSegundoApellido(String segundoApellido);
    public abstract void setCorreoElectronico(String correoElectronico);
    public abstract void setTelefono(String telefono);

}
