package proyectoresoluciones.negocio;

import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DAODocente extends DAO {
    
    public DAODocente(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public String consultarNombreProfesor(String codigoCurso, String periodo, int grupo){
        String nombreProfesor = "";
        
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                System.out.println(codigoCurso);
               
                ResultSet rs = cstmt.executeQuery("{call select_profesor_curso_grupo(\'"+codigoCurso+"\',\'"+periodo+"\',\'"+grupo+"\')}");
                while(rs.next()){
                    nombreProfesor=rs.getString(1);
                    System.out.println(nombreProfesor);
                    System.out.println("Hola");
                    
                }
                
            } catch (SQLException ex) {
               
            }
        return nombreProfesor;
        
    }
    
    public void cargarDatos(){
        String identificacion;
        String nombre;
        String correoElectronico;
        String telefono;
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\valeb\\Downloads\\Proyecto_1\\Proyecto 1\\DatosProyecto1.xlsx"))) {
                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                
                //Get first/desired sheet from the workbook
                DataFormatter formatter = new DataFormatter();
                /*Se lee la hoja del plan*/
                XSSFSheet sheet = workbook.getSheetAt(0);
                Iterator<Row> its = sheet.iterator();
                its.next();
                //Iterate through each rows one by one
                for (Iterator<Row> it = its; it.hasNext();) {
                    
                    Row row = it.next();
                    
                    identificacion = formatter.formatCellValue(row.getCell(0));
                    nombre = formatter.formatCellValue(row.getCell(1));
                    correoElectronico = formatter.formatCellValue(row.getCell(2));
                    telefono = formatter.formatCellValue(row.getCell(2));

                    Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                CallableStatement proc= con.prepareCall("{call insert_usuario(?,?,?,?,?)}");
                proc.setString(1, identificacion);
                proc.setString(2, nombre);
                proc.setString(3, correoElectronico);
                proc.setString(4, telefono);
                proc.setString(5, "profesor");
                
                proc.execute();
                
                
                con.close();
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
                     
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
