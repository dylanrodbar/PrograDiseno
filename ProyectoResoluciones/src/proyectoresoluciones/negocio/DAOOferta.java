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
import proyectoresoluciones.datos.Docente;

public class DAOOferta extends DAO {
    
    
    public DAOOferta(){}
    
    public boolean crear(Object obj){ 
        
        return true;
        
    }
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    public String consultarProfesor(String codigoCurso, String grupo, String periodo){
        
        String cedulaProfesor = "";
        int grupoC = Integer.parseInt(grupo);
        
        
        
        ArrayList<String> grupos= new ArrayList<>();
        System.out.println(codigoCurso);
        System.out.println(periodo);
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                System.out.println(codigoCurso);
                System.out.println();
                ResultSet rs = cstmt.executeQuery("{call select_profesor_curso_grupo(\'"+codigoCurso+"\',\'"+periodo+"\',\'"+grupoC+"\')}");
                while(rs.next()){
                    cedulaProfesor=rs.getString(2);

                    
                }
                
            } catch (SQLException ex) {
               
            }
        
        return cedulaProfesor;
        
    }
    
    public ArrayList<String> consultarGrupos(String codigoCurso, String periodo){
        String numeroGrupo;
        String codigoCursoExcel;
       
        System.out.println("Codigo curso: "+codigoCurso);
        System.out.println("Periodo: "+periodo);
        ArrayList<String> grupos= new ArrayList<>();
        System.out.println(codigoCurso);
        System.out.println(periodo);
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                ResultSet rs = cstmt.executeQuery("{call select_gruposxcurso(\'"+codigoCurso+"\',\'"+periodo+"\')}");
                while(rs.next()){
                    numeroGrupo=Integer.toString(rs.getInt(1));
                    System.out.println(numeroGrupo);
                    grupos.add(numeroGrupo);
                }
                
            } catch (SQLException ex) {
               
            }
        
        
        return grupos;
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public void cargarDatos(){
        String periodo;
        //Curso curso;
        String codigoCurso;
        int grupo;
        //Docente docente;
        String idDocente;
        String horario;
        String aula;
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\valeb\\Downloads\\Proyecto_1\\Proyecto 1\\DatosProyecto1.xlsx"))) {
                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                
                //Get first/desired sheet from the workbook
                DataFormatter formatter = new DataFormatter();
                /*Se lee la hoja del plan*/
                XSSFSheet sheet = workbook.getSheetAt(3);
                Iterator<Row> its = sheet.iterator();
                its.next();
                //Iterate through each rows one by one
                for (Iterator<Row> it = its; it.hasNext();) {
                    
                    Row row = it.next();
                    
                    periodo = formatter.formatCellValue(row.getCell(0));
                    codigoCurso = formatter.formatCellValue(row.getCell(1));
                    grupo = Integer.parseInt(formatter.formatCellValue(row.getCell(2)));
                    idDocente = formatter.formatCellValue(row.getCell(3));
                    horario = formatter.formatCellValue(row.getCell(4));
                    aula = formatter.formatCellValue(row.getCell(5));
                    
                    Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                CallableStatement proc= con.prepareCall("{call insert_grupo(?,?,?,?,?,?)}");
                proc.setInt(1, grupo);
                proc.setString(2, codigoCurso);
                proc.setString(3, periodo);
                proc.setString(4, idDocente);
                proc.setString(5, horario);
                proc.setString(6, aula);
                
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
