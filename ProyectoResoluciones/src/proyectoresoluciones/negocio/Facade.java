package proyectoresoluciones.negocio;

import java.util.ArrayList;
import proyectoresoluciones.datos.Curso;
import proyectoresoluciones.datos.Solicitud;
import proyectoresoluciones.datos.Top;


public class Facade {
    
    Controlador controlador = new Controlador();
    
    public int verificarUsuario(String usuario, UIFrameLogin uiFrameLogin){
       
        if (usuario.compareTo("coordinador")==0){
            
            return 0;
           
        }
        else if (usuario.compareTo("profesor")==0 || usuario.compareTo("estudiante")==0){
            return 1;
        }
        return -1;

    }
    
    public String iniciarSesion(DTOUsuario dtoUsuario){
            return controlador.iniciarSesion(dtoUsuario);

            
        }
        
        public boolean crearSolicitud(DTOSolicitud dtoSolicitud){
            return controlador.crearSolicitud(dtoSolicitud);

            
        }
        
        public boolean crearResolucion(DTOResolucion dtoResolucion){
            return controlador.crearResolucion(dtoResolucion);

            
        }
        
        public String consultarNombreProfesor(String codigoCurso, String periodo, int grupo){
            
            String cedulaProfesor = "";
            
            cedulaProfesor = controlador.consultarNombreProfesor(codigoCurso, periodo, grupo);
            return cedulaProfesor;
            
        }
        
        public ArrayList<Curso> cargarCursos(){
            return controlador.cargarCursos();

            
        }
        
        public String cargarProfesor(String codigoCurso, String grupo, String periodo){
            return controlador.cargarProfesor(codigoCurso, grupo, periodo);

            
        }
        
        public ArrayList<String> cargarGrupos(String codigoCurso, String periodo){
            return controlador.cargarGrupos(codigoCurso, periodo);

        }
        
        public ArrayList<Solicitud> cargarSolicitudes(String estado){
            return controlador.cargarSolicitudes(estado);

        }
        
        public ArrayList<String> cargarSituaciones(){
            return controlador.cargarSituaciones();

            
        }
        
        public void cargarDatos(){
            controlador.cargarDatos();

            
        }
        
        public void cargarArchivo(String path){
            controlador.cargarArchivo(path);

            
        }
        
        public void generarHTML(DTOResolucion dtoResolucion){
            controlador.generarHTML(dtoResolucion);

            
        }
        
        public void generarArchivo(DTOResolucion dtoResolucion, String tipo){
            controlador.generarArchivo(dtoResolucion, tipo);
        }
        
        public void generarPDF(DTOResolucion dtoResolucion){
            controlador.generarPDF(dtoResolucion);
  
            
        }
        
        public void cambiarEstadoSolicitud(int numeroSolicitud, String estado){
            controlador.cambiarEstadoSolicitud(numeroSolicitud, estado);

            
        }
        
        public Solicitud consultarSolicitud(int numeroSolicitud){
            return controlador.consultarSolicitud(numeroSolicitud);

        }
        
        public ArrayList<Top> generarGraficoTopFive(String periodo){
            
            ArrayList<Top> tops = new ArrayList<>();
            tops = controlador.generarGraficoTopFive(periodo);
            return tops;
            
        }
        
        public ArrayList<Top> generarGraficoTopThree(){
            
            ArrayList<Top> tops = new ArrayList<>();
            tops = controlador.generarGraficoTopThree();
            return tops;
            
        }
    
}
