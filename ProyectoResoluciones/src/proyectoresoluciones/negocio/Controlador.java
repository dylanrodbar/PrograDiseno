package proyectoresoluciones.negocio;

import java.io.File;
import proyectoresoluciones.datos.Curso;

import java.util.ArrayList;
import proyectoresoluciones.datos.Solicitud;
import proyectoresoluciones.datos.Top;

public class Controlador {
    
    private GCurso gCurso = new GCurso();
    private GDocente gDocente = new GDocente();
    private GEstudiante gEstudiante = new GEstudiante();
    private GOferta gOferta = new GOferta();
    private GSolicitud gSolicitud = new GSolicitud();
    private GUsuario gUsuario = new GUsuario();
    private GSituacion gSituacion = new GSituacion();
    private GestorResolucion gestorResolucion = new GestorResolucion();
    private GEstadistica gEstadistica = new GEstadistica();
  
    
    public Controlador(){}
        
        public String iniciarSesion(DTOUsuario dtoUsuario){
            
            return gUsuario.consultarUsuario(dtoUsuario);
            
        }
        
        public boolean crearSolicitud(DTOSolicitud dtoSolicitud){
            
            gSolicitud.crear(dtoSolicitud);
            return true;
            
        }
        
        public boolean crearResolucion(DTOResolucion dtoResolucion){
            
            gestorResolucion.crear(dtoResolucion);
            return true;
            
        }
        
        public ArrayList<Curso> cargarCursos(){
            
            ArrayList<Curso> cursos = new ArrayList<>();
            cursos = gCurso.consultarC();
            
            return cursos;
            
            
        }
        
        public String cargarProfesor(String codigoCurso, String grupo, String periodo){
            
            String profesor = "";
            
            profesor = gOferta.consultarProfesor(codigoCurso, grupo, periodo);         
            
            return profesor;
            
        }
        
        public String consultarNombreProfesor(String codigoCurso, String periodo, int grupo){
            
            String cedulaProfesor = "";
            cedulaProfesor = gDocente.consultarNombreProfesor(codigoCurso, periodo, grupo);
            
            return cedulaProfesor;
            
        }
        
        public ArrayList<String> cargarGrupos(String codigoCurso, String periodo){
            
            ArrayList<String> grupos = new ArrayList<>();
            grupos = gOferta.consultarGrupos(codigoCurso, periodo);            
            
            
            return grupos;
        }
        
        public ArrayList<Solicitud> cargarSolicitudes(String estado){
            
            ArrayList<Solicitud> solicitudes = new ArrayList<>();
            solicitudes = gSolicitud.consultarS(estado);
            
            return solicitudes;
            
        }
        
        public ArrayList<String> cargarSituaciones(){
            
            ArrayList<String> situaciones = new ArrayList<>();
            situaciones = gSituacion.cargarSituaciones();
            
            return situaciones;
            
            
        }
        
        public void cargarDatos(){
            
            gDocente.cargarDatos();
            gCurso.cargarDatos();
            gSituacion.cargarDatos();
            gOferta.cargarDatos();
            gSolicitud.cargarDatos();
            
        }
        
        public void cargarArchivo(String path){

            gSolicitud.leerArchivo(path);
            
        }
        
        public void generarHTML(DTOResolucion dtoResolucion){
            
            gestorResolucion.generarHTML(dtoResolucion);
            
        }
        
        public void generarArchivo(DTOResolucion dtoResolucion, String tipo){
            
            gestorResolucion.generarArchivo(dtoResolucion, tipo);
            
        }
        
        public void generarPDF(DTOResolucion dtoResolucion){
            
            //gestorResolucion.generarPDF(dtoResolucion);
            
        }
        
        public void cambiarEstadoSolicitud(int numeroSolicitud, String estado){
            
            gSolicitud.cambiarEstadoSolicitud(numeroSolicitud, estado);
            
        }
        
        public Solicitud consultarSolicitud(int numeroSolicitud){
            Solicitud solicitud = new Solicitud();
            solicitud = gSolicitud.consultarSolicitud(numeroSolicitud);
            
            return solicitud;
        }
        
        public ArrayList<Top> generarGraficoTopFive(String periodo){
            
            ArrayList<Top> tops = new ArrayList<>();
            tops = gEstadistica.generarGraficoTopFive(periodo);
            return tops;
            
        }
        
        public ArrayList<Top> generarGraficoTopThree(){
            
            ArrayList<Top> tops = new ArrayList<>();
            tops = gEstadistica.generarGraficoTopThree();
            return tops;
            
        }
        
        
}
