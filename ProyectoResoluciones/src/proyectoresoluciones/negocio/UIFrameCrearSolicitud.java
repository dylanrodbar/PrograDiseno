package proyectoresoluciones.negocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import proyectoresoluciones.vista.FrameCrearSolicitud;
import proyectoresoluciones.datos.Situacion;
import proyectoresoluciones.datos.Curso;
import static proyectoresoluciones.datos.Situacion.ERROR_NOTA;
import static proyectoresoluciones.datos.Situacion.EXCLUSION_ACTA;
import static proyectoresoluciones.datos.Situacion.INCLUSION_ACTA;


public class UIFrameCrearSolicitud {
    
    private Facade facade = new Facade();
    private DTOSolicitud dtoSolicitud = new DTOSolicitud();
    
    
    public UIFrameCrearSolicitud(){}
    
    public boolean crearSolicitud(FrameCrearSolicitud frameCrearSolicitud){
        
        String fecha;
        String codigoCurso;
        String periodo;
        String idSolicitante;
        int grupo;
        Situacion situacion;
        String descripcion;
        String nombre;
        String identificacion;
        String correoElectronico;
        String telefono;
        String profesor;
        String archivo;
        
        if(frameCrearSolicitud.getTxtCorreoElectronico().getText().isEmpty()
                || frameCrearSolicitud.getTxtDescripcion().getText().isEmpty()
                || frameCrearSolicitud.getTxtIdentificacion().getText().isEmpty()
                || frameCrearSolicitud.getTxtNombre().getText().isEmpty()
                || frameCrearSolicitud.getTxtPeriodo().getText().isEmpty()
                || frameCrearSolicitud.getTxtTelefono().getText().isEmpty()
                || frameCrearSolicitud.getTxtIdSolicitante().getText().isEmpty()){
            
            System.out.println("Los campos de correo electrónico, descripción, fecha, identificación, nombre, período y teléfono no pueden estar vacíos");
            
        }
        
        else{
            
            fecha = new SimpleDateFormat("yyyy-MM-dd").format(frameCrearSolicitud.getTxtFecha().getValue());
            codigoCurso = frameCrearSolicitud.getComboCodigoCurso().getSelectedItem().toString();
            periodo = frameCrearSolicitud.getTxtPeriodo().getText();
            situacion = Situacion.valueOf(frameCrearSolicitud.getComboSituacion().getSelectedItem().toString());
            
            //int indice = frameCrearSolicitud.getComboSituacion().getSelectedIndex();
            
            //if (indice == 1) situacion = ERROR_NOTA;
            //if (indice == 2) situacion = EXCLUSION_ACTA;
            //if (indice == 3) situacion = INCLUSION_ACTA;
            
            descripcion = frameCrearSolicitud.getTxtDescripcion().getText();
            nombre = frameCrearSolicitud.getTxtNombre().getText();
            identificacion = frameCrearSolicitud.getTxtIdentificacion().getText();
            correoElectronico = frameCrearSolicitud.getTxtCorreoElectronico().getText();
            telefono = frameCrearSolicitud.getTxtTelefono().getText();
            idSolicitante = frameCrearSolicitud.getTxtIdSolicitante().getText();
            
            grupo = Integer.parseInt(frameCrearSolicitud.getComboGrupo().getSelectedItem().toString());
            
            profesor = frameCrearSolicitud.getTxtProfesor().getText();
            
            archivo = frameCrearSolicitud.getFile().getSelectedFile().getPath();
            
            System.out.println(archivo);
            
            dtoSolicitud.setFecha(fecha);
            dtoSolicitud.setCodigoCurso(codigoCurso);
            dtoSolicitud.setPeriodo(periodo);
            dtoSolicitud.setIdentificacion(identificacion);
            dtoSolicitud.setSituacion(situacion);
            dtoSolicitud.setDescripcion(descripcion);
            dtoSolicitud.setNombre(nombre);
            dtoSolicitud.setCorreoElectronico(correoElectronico);
            dtoSolicitud.setTelefono(telefono);
            dtoSolicitud.setIdSolicitante(idSolicitante);
            dtoSolicitud.setGrupo(grupo);
            dtoSolicitud.setProfesor(profesor);
            dtoSolicitud.setArchivo(archivo);
            
            facade.crearSolicitud(dtoSolicitud);
            
            
            
            
        }
        
        return true;
    }
    
    
    /*Método para lograr cargar los códigos de los cursos desde el excel*/
    public void cargarCursos(FrameCrearSolicitud frameCrearSolicitud){
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos = facade.cargarCursos();
        
        for(Curso curso: cursos){
            
            frameCrearSolicitud.getComboCodigoCurso().addItem(curso.getCodigo());
        
        }
        
        
    }
    
    
    
    public void cargarProfesores(FrameCrearSolicitud frameCrearSolicitud){
        
        
        
        String profesor;
        
        
        String codigoCurso = frameCrearSolicitud.getComboCodigoCurso().getSelectedItem().toString();
        String grupo = frameCrearSolicitud.getComboGrupo().getSelectedItem().toString();
        String periodo = frameCrearSolicitud.getTxtPeriodo().getText();
        
        
        
        profesor = facade.cargarProfesor(codigoCurso, grupo, periodo);
        
        System.out.println(profesor);
        
        frameCrearSolicitud.getTxtProfesor().setText(profesor);
        
        
        
        
        
        
    }
    
    public void cargarGrupos(FrameCrearSolicitud frameCrearSolicitud){
        
        frameCrearSolicitud.getComboGrupo().removeAllItems();
        
        ArrayList<String> grupos = new ArrayList<>();
        
        String codigoCurso = frameCrearSolicitud.getComboCodigoCurso().getSelectedItem().toString();
        String periodo = frameCrearSolicitud.getTxtPeriodo().getText();
        System.out.println(periodo);
        grupos = facade.cargarGrupos(codigoCurso, periodo);
        System.out.println(grupos.get(0));
        
        
        for(String grupo: grupos){
            
            frameCrearSolicitud.getComboGrupo().addItem(grupo);
        
        }
        
        
        
    }
    
    /*Método para lograr cargar las situaciones de inconsistencia desde el excel*/
    public void cargarSituaciones(FrameCrearSolicitud frameCrearSolicitud){
        
        
        
        ArrayList<String> situaciones = new ArrayList<>();
        situaciones = facade.cargarSituaciones();
        
        for(String situacion: situaciones){
            
            frameCrearSolicitud.getComboSituacion().addItem(situacion);
        
        }
        
        
    }
        
    }
    

