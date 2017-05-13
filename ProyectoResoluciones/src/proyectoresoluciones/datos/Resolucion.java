package proyectoresoluciones.datos;

import java.util.ArrayList;

public class Resolucion extends Prototipo{
    
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
    private int numSolicitud;
    
    
    private Solicitud solicitud;
    private ArrayList<Considerando> considerandos = new ArrayList<Considerando>();
    
    /*Se crea una nueva resolución con los valores predeterminados*/
    public Resolucion(){
        
        this.nombreDirector = "Ing. Mauricio Arroyo Herrera";
        this.nombreAYR = "Máster Geovanni Rojas Rodríguez";
        
    }
    
    /*Constructor que se llama cada vez que se clona*/
    public Resolucion(String nombreDirector, String nombreAYR){
        
        this.nombreDirector = nombreDirector;
        this.nombreAYR = nombreAYR;
        
    }
 
    
    @Override
    public Resolucion clonar(){
        
        return new Resolucion(this.nombreDirector, this.nombreAYR);
        
    }

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

    public void setConsiderandos(ArrayList<Considerando> considerandos) {
        this.considerandos = considerandos;
    }
    
    
    
    
    public void imprimirConsiderandos(){
        for(Considerando considerando: considerandos){
            System.out.println(considerando.getConsiderando());
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
     * @return the numSolicitud
     */
    public int getNumSolicitud() {
        return numSolicitud;
    }

    /**
     * @param numSolicitud the numSolicitud to set
     */
    public void setNumSolicitud(int numSolicitud) {
        this.numSolicitud = numSolicitud;
    }
    
    
    
}
