package proyectoresoluciones.negocio;

import proyectoresoluciones.vista.FrameConfigPlantilla;

public class UIFrameConfigPlantilla {
    
    private Facade facade = new Facade();
    
    public UIFrameConfigPlantilla(){}
    
    public void cargarDatos(FrameConfigPlantilla frameConfigPlantilla, DTOSolicitud dtoSolicitud){
        frameConfigPlantilla.setTxtFecha(dtoSolicitud.getFecha());
        frameConfigPlantilla.setTxtCarnet(dtoSolicitud.getIdentificacion());
        frameConfigPlantilla.setTxtCurso(dtoSolicitud.getCodigoCurso());
        frameConfigPlantilla.setTxtEstudiante(dtoSolicitud.getNombre());
        frameConfigPlantilla.setTxtNumeroSolicitud(String.valueOf(dtoSolicitud.getNumSolicitud()));
        System.out.println(dtoSolicitud.getCodigoCurso());
        System.out.println(dtoSolicitud.getPeriodo());
        System.out.println(dtoSolicitud.getGrupo());
        String nombreProfesor = facade.consultarNombreProfesor(dtoSolicitud.getCodigoCurso(), dtoSolicitud.getPeriodo(), dtoSolicitud.getGrupo());
        System.out.println("Nombre profesor: ");
        System.out.println(nombreProfesor);
        System.out.println("holi");
        //nombreProfesor = /*Llamar a consulta con el idProfesor*/
                
        //frameConfigPlantilla.setTxtProfesor(nombreProfesor);
        //frameConfigPlantilla.setTxtProfesor(dtoSolicitud.getProfesor());/*lksldj*/
        frameConfigPlantilla.setTxtProfesor(nombreProfesor);
        frameConfigPlantilla.setTxtNumeroGrupo(dtoSolicitud.getGrupo()+"");
        frameConfigPlantilla.setTxtPeriodo(dtoSolicitud.getPeriodo());
        
        
    }
    
}
