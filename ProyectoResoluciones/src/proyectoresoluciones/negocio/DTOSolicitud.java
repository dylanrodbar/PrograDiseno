package proyectoresoluciones.negocio;
import proyectoresoluciones.datos.Situacion;

public class DTOSolicitud {
    
       private String fecha;
       private String codigoCurso;
       private String periodo;
       private String idSolicitante;
       private Situacion situacion;
       private String descripcion;
       private String nombre;
       private String identificacion;
       private String correoElectronico;
       private String telefono;
       private int grupo;
       private String archivo;
       private String profesor;
       private int numSolicitud;
       
       public DTOSolicitud(){}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Situacion getSituacion() {
        return situacion;
    }

    public void setSituacion(Situacion situacion) {
        this.situacion = situacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(int numSolicitud) {
        this.numSolicitud = numSolicitud;
    }
    
    
       
    
    
       
       
}
