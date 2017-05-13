package proyectoresoluciones.negocio;

import java.util.ArrayList;
import java.util.Vector;
import proyectoresoluciones.datos.Curso;
import proyectoresoluciones.datos.Situacion;
import proyectoresoluciones.datos.Solicitud;
import proyectoresoluciones.vista.FrameResolucion;
import proyectoresoluciones.vista.FrameSolicitud;

public class UIFrameSolicitud {
    
    private Facade facade = new Facade();

    private DTOSolicitud dtoSolicitud;
    
    public UIFrameSolicitud(){}
    
    
    public void cargarSolicitudes(FrameSolicitud frameSolicitud){
        
        frameSolicitud.limpiarTabla();
        
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
        String situacion;
        int numeroSolicitud;
        
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        String estadoBuscar = frameSolicitud.getComboEstado().getSelectedItem().toString();
        
        solicitudes = facade.cargarSolicitudes(estadoBuscar);
        
        for(Solicitud solicitud: solicitudes){
            
            fecha = solicitud.getFecha();
            carnetEstudiante = String.valueOf(solicitud.getEstudiante().getIdentificacion());
            nombreEstudiante = solicitud.getEstudiante().getNombre();
            correoEstudiante = solicitud.getEstudiante().getCorreoElectronico();
            telefonoEstudiante = String.valueOf(solicitud.getEstudiante().getTelefono());
            periodo = solicitud.getPeriodo();
            curso = solicitud.getCodigoCurso();
            grupo = String.valueOf(solicitud.getGrupo());
            situacion = solicitud.getSituacion().name();
            numeroSolicitud = solicitud.getNumSolicitud();
            descripcion = solicitud.getDescripcion();
            idSolicitante = solicitud.getIdSolicitante();
            numeroSolicitud = solicitud.getNumSolicitud();
            
            System.out.println(fecha);
            System.out.println(carnetEstudiante);
            System.out.println(nombreEstudiante);
            System.out.println(correoEstudiante);
            System.out.println(telefonoEstudiante);
            System.out.println(periodo);
            
            
            
            frameSolicitud.cargarEnModelo(fecha, idSolicitante, carnetEstudiante, nombreEstudiante, telefonoEstudiante,
                                             periodo, curso, grupo, situacion, descripcion, numeroSolicitud);
        
        }
        
    }
    
    public void anularSolicitud(FrameSolicitud frameSolicitud){
        
        int fila = frameSolicitud.getTablaSolicitudes().getSelectedRow();
        int columna = 10;
        int numSolicitud = Integer.parseInt(frameSolicitud.getTablaSolicitudes().getValueAt(fila, columna).toString());
        System.out.println("NUMERO SOLICITUD");
        System.out.println(numSolicitud);
        facade.cambiarEstadoSolicitud(numSolicitud, "ANULADO");
        
    }
    
    public void aplicarResolucion(FrameSolicitud frameSolicitud){
        
        frameSolicitud.dispose();
        

    }
    
    
            
    
    
    
    
}
