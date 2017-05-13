package proyectoresoluciones.negocio;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import proyectoresoluciones.datos.Situacion;

import proyectoresoluciones.datos.Solicitud;

public class GSolicitud extends Gestor {
   
    private DAOSolicitud daoSolicitud = new DAOSolicitud();
    
    public GSolicitud(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public boolean crear(DTOSolicitud dtoSolicitud){
        
        Solicitud solicitud = new Solicitud();
        solicitud.setCodigoCurso(dtoSolicitud.getCodigoCurso());
        solicitud.setDescripcion(dtoSolicitud.getDescripcion());
        solicitud.setEstudiante(dtoSolicitud.getNombre(), dtoSolicitud.getIdentificacion(), dtoSolicitud.getCorreoElectronico(), dtoSolicitud.getTelefono());
        solicitud.setFecha(dtoSolicitud.getFecha());
        solicitud.setPeriodo(dtoSolicitud.getPeriodo());
        solicitud.setSituacion(dtoSolicitud.getSituacion());
        solicitud.setIdSolicitante(dtoSolicitud.getIdSolicitante());
        solicitud.setGrupo(dtoSolicitud.getGrupo());
        solicitud.setProfesor(dtoSolicitud.getProfesor());
        solicitud.setArchivo(dtoSolicitud.getArchivo());
        
        daoSolicitud.crearSolicitud(solicitud);  
        return true;
        
    }
    
    public boolean leerArchivo(String path){
             Solicitud solicitud = new Solicitud();
             try {
            
            //Crea Workbook instance 
            try (FileInputStream file = new FileInputStream(new File(path))) {
                
                //Crea Workbook instance 
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                DataFormatter formatter = new DataFormatter();
                XSSFSheet sheet = workbook.getSheetAt(0);
                int i = 0;
                //Iterate through each rows one by one
                for (Iterator<Row> it = sheet.iterator(); it.hasNext();) {
                    
                    Row row = it.next();
                    if (i == 0){
                        i++;
                        continue;
                    }
                    
                    int j = 0;
                    String nombre = "";
                    String id = "";
                    String correo = "";
                    String telefono = "";
                    for (Cell cell : row) {
                        CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                        System.out.print(cellRef.formatAsString());
                        System.out.print(" - ");
                        // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
                        String text = formatter.formatCellValue(cell);
                        System.out.println(text);
                        
                        

                        if (j == 0){
                            String s=text;
                            String[] tokens1 = s.split(" ");
                            s=tokens1[0];
                    
                            String[] tokens = s.split("/");
                    
                    
                            text=tokens[2]+"-"+tokens[0]+"-"+tokens[1];
                            solicitud.setFecha(text);
                        }
                        if (j == 1){
                            id = text;
                        }
                        if (j == 2){
                            nombre = text;
                            System.out.println("nombre "+nombre);
                        }
                        if (j == 3){
                            correo = text;
                        }
                        if (j == 4){
                            telefono = text;
                            solicitud.setEstudiante(nombre, id, correo, telefono);
                            solicitud.setIdSolicitante(id);
                            System.out.println(nombre+id+telefono+"lllll");
                           
                        }
                        if (j == 5){
                            solicitud.setPeriodo(text);
                        }
                        if (j == 6){
                            solicitud.setCodigoCurso(text);
                        }
                        if (j == 7){
                            solicitud.setGrupo(Integer.parseInt(text));
                        }
                        if (j == 8){
                            Situacion situacion = Situacion.valueOf(text);
                            solicitud.setSituacion(situacion);
                            System.out.println(situacion.name());
                            //if (text == "ERROR_NOTA"){
                            //    solicitud.setSituacion(Situacion.ERROR_NOTA);
                            //}
                           
                            //else if (text == "EXCLUSION_ACTA"){
                            //    solicitud.setSituacion(Situacion.EXCLUSION_ACTA);
                            //}
                            //else{
                            //    solicitud.setSituacion(Situacion.INCLUSION_ACTA);
                            //}
                        }
        
                        
                        if (j == 9){
                            solicitud.setDescripcion(text);
                        }
                       j++;                             
                    }
                                              
                        solicitud.setProfesor("");
                        
                        solicitud.setArchivo(null);
        
                        daoSolicitud.crearSolicitud(solicitud);  
            }
   
            }
            catch (Exception e) {
                System.out.println("Problema leyendo archivo en path.");
            }
    } catch (Exception e) {
        e.printStackTrace();
        
    }
        return true;
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    public ArrayList<Solicitud> consultarS(String estado){
        
        
        return daoSolicitud.consultarSolicitudes(estado);
        
    }
    
    public void cambiarEstadoSolicitud(int numeroSolicitud, String estado){
        
        daoSolicitud.cambiarEstadoSolicitud(numeroSolicitud, estado);
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public void cargarDatos(){
        daoSolicitud.cargarDatos();
    }
    
    public Solicitud consultarSolicitud(int numeroSolicitud){
        
        return daoSolicitud.consultarSolicitud(numeroSolicitud);
    }
}
