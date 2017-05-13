package proyectoresoluciones.negocio;

import proyectoresoluciones.datos.Solicitud;
import proyectoresoluciones.vista.FrameConsultar;

public class UIFrameConsultar {
    
    private Facade facade = new Facade();
    
    
    public UIFrameConsultar(){}
    
    public void consultarSolicitud(FrameConsultar frameConsultar){
        
        String fecha;
        String carnetEstudiante;
        String nombreEstudiante;
        String correoEstudiante;
        String telefonoEstudiante;
        String periodo;
        String curso;
        String grupo;
        String categoria;
        String descripcion;
        String idSolicitante;
        String estado;
        
        
        int numeroSolicitud = Integer.parseInt(frameConsultar.getTxtNumeroSolicitud().getText());
        Solicitud solicitud = new Solicitud();
        
        
        
        solicitud = facade.consultarSolicitud(numeroSolicitud);
        
        fecha = solicitud.getFecha();
        carnetEstudiante = String.valueOf(solicitud.getEstudiante().getIdentificacion());
        nombreEstudiante = solicitud.getEstudiante().getNombre();
        correoEstudiante = solicitud.getEstudiante().getCorreoElectronico();
        telefonoEstudiante = String.valueOf(solicitud.getEstudiante().getTelefono());
        periodo = solicitud.getPeriodo();
        curso = solicitud.getCodigoCurso();
        grupo = String.valueOf(solicitud.getGrupo());
        descripcion = solicitud.getDescripcion();
        idSolicitante = "solicitante";
            
            
            
            frameConsultar.cargarEnModelo(fecha, idSolicitante, carnetEstudiante, nombreEstudiante, telefonoEstudiante,
                                            telefonoEstudiante, periodo, curso, grupo, descripcion);
        
    }
    
}
