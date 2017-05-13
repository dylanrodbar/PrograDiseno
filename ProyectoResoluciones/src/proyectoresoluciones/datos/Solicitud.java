package proyectoresoluciones.datos;

public class Solicitud {
    private String fecha; 
    private String periodo;
    private String idSolicitante;
    private Situacion situacion;
    private EstadoSolicitud estado;
    private String descripcion; 
    private int grupo;
    private Estudiante estudiante;
    private String codigoCurso;
    private int numSolicitud;
    private String archivo;
    private String profesor;
    
    
    
    public Solicitud(){}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String nombre, String identificacion, String correoElectronico, String telefono) {
        
        estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setIdentificacion(identificacion);
        estudiante.setCorreoElectronico(correoElectronico);
        estudiante.setTelefono(telefono);
        
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public int getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(int numSolicitud) {
        this.numSolicitud = numSolicitud;
    }
    
    public String getArchivo(){
        return archivo;   
    }
    
    public void setArchivo(String archivo){
        this.archivo = archivo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    
    
    
    
    
    
    
    
    
}
