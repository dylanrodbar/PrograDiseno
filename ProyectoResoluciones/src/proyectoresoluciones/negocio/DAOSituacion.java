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
import proyectoresoluciones.datos.Curso;

public class DAOSituacion extends DAO {
    
    
    public DAOSituacion(){}
    
    
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
    
    public void cargarDatos(){
        
        String situacion;
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\valeb\\Downloads\\Proyecto_1\\Proyecto 1\\DatosProyecto1.xlsx"))) {
                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                
                //Get first/desired sheet from the workbook
                DataFormatter formatter = new DataFormatter();
                /*Se lee la hoja del plan*/
                XSSFSheet sheet = workbook.getSheetAt(2);
                Iterator<Row> its = sheet.iterator();
                its.next();
                //Iterate through each rows one by one
                for (Iterator<Row> it = its; it.hasNext();) {
                    
                    Row row = it.next();
                    
                    situacion = formatter.formatCellValue(row.getCell(0));
                    
                    Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                CallableStatement proc= con.prepareCall("{call insert_inconsistencia(?)}");
                proc.setString(1, situacion);
                
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
    
    
    
    
    
    
    public ArrayList<String> cargarSituaciones(){
        String situacion;
        ArrayList<String> situaciones = new ArrayList<>();
        
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                ResultSet rs = cstmt.executeQuery("call select_inconsistencia");
                while(rs.next()){
                    situacion=rs.getString(2);
                    situaciones.add(situacion);
                   
                }
                
            } catch (SQLException ex) {
               
            }
        
        return situaciones;
    }
    
    
    
}
