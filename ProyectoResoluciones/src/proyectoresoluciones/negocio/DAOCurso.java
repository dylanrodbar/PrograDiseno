package proyectoresoluciones.negocio;


import java.io.File;
import java.io.FileInputStream;
import proyectoresoluciones.datos.Curso;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DAOCurso extends DAO {
    
    public DAOCurso(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    /*Aquí llenamos un ArrayList con los cursos*/
    public ArrayList<Curso> consultarCursos(){
        
        ArrayList<Curso> cursos = new ArrayList<>();
        String codigo;
        String nombre;
        int creditos;
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\user\\Google Drive\\l Semestre 2017\\Diseño de Software\\Proyectos\\Proyecto 1\\Proyecto 1\\DatosProyecto1.xlsx"))) {
                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                
                //Get first/desired sheet from the workbook
                DataFormatter formatter = new DataFormatter();
                /*Se lee la hoja del plan*/
                XSSFSheet sheet = workbook.getSheetAt(1);
                Iterator<Row> its = sheet.iterator();
                its.next();
                //Iterate through each rows one by one
                for (Iterator<Row> it = its; it.hasNext();) {
                    
                    Row row = it.next();
                    
                    codigo = formatter.formatCellValue(row.getCell(0));
                    nombre = formatter.formatCellValue(row.getCell(1));
                    creditos = Integer.parseInt(formatter.formatCellValue(row.getCell(2)));
                    
                    Curso curso = new Curso();
                    curso.setCodigo(codigo);
                    curso.setNombre(nombre);
                    curso.setCreditos(creditos);
                    cursos.add(curso);
                     
                }
                
                
            }
            catch (Exception e) {
                System.out.println("Problema leyendo archivo en path.");
            }
    } catch (Exception e) {
        e.printStackTrace();
    }
        
    
        
        
        
        
        return cursos;
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public void cargarDatos(){
        
        String codigo;
        String nombre;
        int creditos;
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\user\\Google Drive\\l Semestre 2017\\Diseño de Software\\Proyectos\\Proyecto 1\\Proyecto 1\\DatosProyecto1.xlsx"))) {
                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                
                //Get first/desired sheet from the workbook
                DataFormatter formatter = new DataFormatter();
                /*Se lee la hoja del plan*/
                XSSFSheet sheet = workbook.getSheetAt(1);
                Iterator<Row> its = sheet.iterator();
                its.next();
                //Iterate through each rows one by one
                for (Iterator<Row> it = its; it.hasNext();) {
                    
                    Row row = it.next();
                    
                    codigo = formatter.formatCellValue(row.getCell(0));
                    nombre = formatter.formatCellValue(row.getCell(1));
                    creditos = Integer.parseInt(formatter.formatCellValue(row.getCell(2)));

                     
                }
                
                
            }
            catch (Exception e) {
                System.out.println("Problema leyendo archivo en path.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
