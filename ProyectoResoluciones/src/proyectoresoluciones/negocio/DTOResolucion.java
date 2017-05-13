package proyectoresoluciones.negocio;

import java.util.ArrayList;
import proyectoresoluciones.datos.Considerando;
import proyectoresoluciones.datos.Solicitud;

public class DTOResolucion {
    
    private String codigo;
    private String nombreAYR;
    private String hora;
    private String fecha; 
    private String nombreDirector;
    private String estudiante;
    private String carnet;
    private String curso;
    private String noGrupo;
    private String periodo;
    private String profesor;
    private String asunto;
    private String asunto2;
    private String asunto3;
    private int numeroSolicitud;
    
    
    private Solicitud solicitud;private ArrayList<Considerando> considerandos = new ArrayList<Considerando>();
    
    
    public DTOResolucion(){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getNombreAYR() {
        return nombreAYR;
    }

    public void setNombreAYR(String nombreAYR) {
        this.nombreAYR = nombreAYR;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public ArrayList<Considerando> getConsiderandos() {
        return considerandos;
    }

    public void setConsiderandos(ArrayList<String> considerandos) {
        
        for(String s: considerandos){
            
            Considerando considerando = new Considerando();
            considerando.setConsiderando(s);
            this.considerandos.add(considerando);
            
        }
        
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the estudiante
     */
    public String getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the noGrupo
     */
    public String getNoGrupo() {
        return noGrupo;
    }

    /**
     * @param noGrupo the noGrupo to set
     */
    public void setNoGrupo(String noGrupo) {
        this.noGrupo = noGrupo;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the asunto2
     */
    public String getAsunto2() {
        return asunto2;
    }

    /**
     * @param asunto2 the asunto2 to set
     */
    public void setAsunto2(String asunto2) {
        this.asunto2 = asunto2;
    }

    /**
     * @return the asunto3
     */
    public String getAsunto3() {
        return asunto3;
    }

    /**
     * @param asunto3 the asunto3 to set
     */
    public void setAsunto3(String asunto3) {
        this.asunto3 = asunto3;
    }

    /**
     * @return the numeroSolicitud
     */
    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    /**
     * @param numeroSolicitud the numeroSolicitud to set
     */
    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }
    
    
    
    
    
    
    
}
