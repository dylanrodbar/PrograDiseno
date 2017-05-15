package proyectoresoluciones.negocio;

import proyectoresoluciones.vista.FrameConfigPlantilla;

public class UIFrameConfigPlantilla {
    
    private Facade facade = new Facade();
    
    public UIFrameConfigPlantilla(){}
    
    public void cargarDatos(FrameConfigPlantilla frameConfigPlantilla, DTOResolucion dtoResolucion){
        frameConfigPlantilla.setTxtFecha(dtoResolucion.getFecha());
        frameConfigPlantilla.setTxtCarnet(dtoResolucion.getCarnet());
        frameConfigPlantilla.setTxtCurso(dtoResolucion.getCurso());
        frameConfigPlantilla.setTxtEstudiante(dtoResolucion.getEstudiante());
        frameConfigPlantilla.setTxtNumeroSolicitud(String.valueOf(dtoResolucion.getNumeroSolicitud()));


        String nombreProfesor = facade.consultarNombreProfesor(dtoResolucion.getCurso(), dtoResolucion.getPeriodo(), Integer.parseInt(dtoResolucion.getNoGrupo()));


        frameConfigPlantilla.setTxtProfesor(nombreProfesor);
        frameConfigPlantilla.setTxtNumeroGrupo(dtoResolucion.getNoGrupo());
        frameConfigPlantilla.setTxtPeriodo(dtoResolucion.getPeriodo());
        
        
    }
    
}
