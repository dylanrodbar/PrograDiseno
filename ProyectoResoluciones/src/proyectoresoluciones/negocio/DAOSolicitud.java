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
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import proyectoresoluciones.datos.EstadoSolicitud;
import proyectoresoluciones.datos.Estudiante;
import proyectoresoluciones.datos.Situacion;
import static proyectoresoluciones.datos.Situacion.ERROR_NOTA;
import static proyectoresoluciones.datos.Situacion.EXCLUSION_ACTA;
import static proyectoresoluciones.datos.Situacion.INCLUSION_ACTA;
import proyectoresoluciones.datos.Solicitud;

public class DAOSolicitud extends DAO {
    
    public DAOSolicitud(){}
    
    public boolean crear(Object obj){ 
        
        
        
        return true;
        
    }
    
    public boolean crearSolicitud(Solicitud solicitud){
        
        /*Escribir en excel*/
        /*El estado de la solicitud queda en pendiente*/
        
        
        String fecha=solicitud.getFecha();
        String identificacion=solicitud.getIdSolicitante();
        String periodo=solicitud.getPeriodo();
        String codigo=solicitud.getCodigoCurso();
        int grupo=solicitud.getGrupo();
        
        String carne=solicitud.getEstudiante().getIdentificacion();
        String nombre=solicitud.getEstudiante().getNombre();
        String correo=solicitud.getEstudiante().getCorreoElectronico();
        String telefono=solicitud.getEstudiante().getTelefono();
        
        int situacion= solicitud.getSituacion().ordinal()+1;
        System.out.println(situacion);
        String descripcion=solicitud.getDescripcion();
        String profesor = solicitud.getProfesor();
        String archivo = solicitud.getArchivo();
        String estado = "PENDIENTE"; //Ver esto
        String evidencia = "reyeno";
        //2017-3-22
        
        Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                CallableStatement proc= con.prepareCall("{call insert_solicitud(?,?,?,?,?,?,?,?,?,?,?,?)}");
                proc.setString(1, fecha);
                proc.setString(2, identificacion);
                proc.setString(3, periodo);
                proc.setString(4, codigo);
                proc.setInt(5, grupo);
                proc.setString(6, carne);
                proc.setString(7, nombre);
                proc.setString(8, correo);
                proc.setString(9, telefono);
                proc.setInt(10, situacion);
                proc.setString(11, descripcion);
                proc.setString(12, evidencia);
                
                proc.execute();
                
                
                con.close();
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        
        return true;
    }
    
    
    
    public Object consultar(Object obj){ 
        
        return obj;
        
    }
    
    /*Aquí llenamos un ArrayList con los cursos*/
    public ArrayList<Solicitud> consultarSolicitudes(String estado){
        
        /*Se toma el estado para obtener las solicitudes que tiene dicho estado*/
        System.out.println("Estado "+estado);
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        String fecha; 
        String carnetEstudiante;
        String nombreEstudiante;
        String correoEstudiante;
        String telefonoEstudiante;
        String periodo;
        String codigoCurso;
        String idSolicitante;
        int grupo;
        int numeroSolicitud;
        Situacion situacion;
        String descripcion; 
        String categoria;
        //estado = "PENDIENTE";
        //int idSolicitante;
        //EstadoSolicitud estado;
        //int numSolicitud;
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                ResultSet rs = cstmt.executeQuery("call select_solicitud(\'"+estado+"\')");
                while(rs.next()){
                    
                    idSolicitante = rs.getString(1);
                    fecha=rs.getString(2);
                    carnetEstudiante=rs.getString(3);
                    nombreEstudiante=rs.getString(4);
                    correoEstudiante=rs.getString(5);
                    telefonoEstudiante=rs.getString(6);
                    periodo=rs.getString(7);
                    codigoCurso=rs.getString(8);
                    grupo=rs.getInt(9);
                    //situacion = Situacion.valueOf(String.valueOf(rs.getInt(9)));
                    
                    situacion=Situacion.valueOf(rs.getString(10));
                    descripcion=rs.getString(11);
                    categoria=rs.getString(12);
                    numeroSolicitud = rs.getInt(13);
                         
                    Solicitud solicitud = new Solicitud();
                    solicitud.setIdSolicitante(idSolicitante);
                    solicitud.setFecha(fecha);
                    solicitud.setEstudiante(nombreEstudiante, carnetEstudiante, correoEstudiante, telefonoEstudiante);
                    solicitud.setPeriodo(periodo);
                    solicitud.setCodigoCurso(codigoCurso);
                    solicitud.setGrupo(grupo);
                    
                    
                    solicitud.setGrupo(grupo);
                    solicitud.setSituacion(situacion);
                    solicitud.setDescripcion(descripcion);
                    solicitud.setNumSolicitud(numeroSolicitud);
                   
                    
                    solicitudes.add(solicitud);
                }
                
            } catch (SQLException ex) {
               
            }
        
        
        return solicitudes;
        
    }
    
    public boolean modificar(Object obj){ 
        
        return true;
        
    }
    
    public boolean eliminar(Object obj){ 
        
        return true;
        
    }
    
    public void cargarDatos(){
        
        String fecha; 
        String carnetEstudiante;
        String nombreEstudiante;
        String correoEstudiante;
        String telefonoEstudiante;
        String periodo;
        String codigoCurso;
        int grupo;
        Situacion situacion;
        String descripcion; 
        String categoria;
        String profesor;
        
        //int idSolicitante;
        //EstadoSolicitud estado;
        //int numSolicitud;
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\MaríaLaura\\Documents\\proyectoDiseno\\ProyectoResoluciones\\DatosFormulario.xlsx"))) {
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
                    
                    
                    fecha = formatter.formatCellValue(row.getCell(0));
                    carnetEstudiante = formatter.formatCellValue(row.getCell(1));
                    nombreEstudiante = formatter.formatCellValue(row.getCell(2));
                    correoEstudiante = formatter.formatCellValue(row.getCell(3));
                    telefonoEstudiante = formatter.formatCellValue(row.getCell(4));
                    periodo = formatter.formatCellValue(row.getCell(5));
                    codigoCurso = formatter.formatCellValue(row.getCell(6));
                    grupo = Integer.parseInt(formatter.formatCellValue(row.getCell(7)));
                    categoria = formatter.formatCellValue(row.getCell(8));
                    //Hacer la consulta del profesor (identificación a partir de codigoCurso y numeroGrupo)  profesor = ....;
                    
                    
                    if(categoria.compareTo("ERROR_NOTA") == 0 ) situacion = ERROR_NOTA;
                    if(categoria.compareTo("EXCLUSION_ACTA") == 0) situacion = EXCLUSION_ACTA;
                    if(categoria.compareTo("INCLUSION_ACTA") == 0) situacion = INCLUSION_ACTA;
                    
                    descripcion = formatter.formatCellValue(row.getCell(9));
                 
                    String s=fecha;
                    String[] tokens1 = s.split(" ");
                    s=tokens1[1];
                    
                    String[] tokens = s.split("/");
                    
                    
                    fecha=tokens[2]+"-"+tokens[0]+"-"+tokens[1];
        Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                            CallableStatement proc= con.prepareCall("{call insert_solicitud(?,?,?,?,?,?,?,?,?,?,?,?)}");
                            proc.setString(1, fecha);
                            proc.setString(2, carnetEstudiante);
                            proc.setString(3, periodo);
                            proc.setString(4, codigoCurso);
                            proc.setInt(5, grupo);
                            proc.setString(6, carnetEstudiante);
                            proc.setString(7, nombreEstudiante);
                            proc.setString(8, correoEstudiante);
                            proc.setString(9, telefonoEstudiante);
                            proc.setInt(10, 1);
                            proc.setString(11, descripcion);
                            proc.setString(12, "evidencia");

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
    
    public void cambiarEstadoSolicitud(int numeroSolicitud, String estado){
        Connection con= null;
        con= proyectoresoluciones.dbConnection.conectDB();
            try {
                            CallableStatement proc= con.prepareCall("{call anular_solicitud(?)}");
                            proc.setInt(1, numeroSolicitud);

                            proc.execute();


                            con.close();

                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
        
    }
    
    public Solicitud consultarSolicitud(int numeroSolicitud){
        
        Solicitud solicitud = new Solicitud();
        String fecha; 
        String idSolicitante;
        String carnetEstudiante;
        String nombreEstudiante;
        String correoEstudiante;
        String telefonoEstudiante;
        String periodo;
        String codigoCurso;
        int grupo;
        Situacion situacion;
        String descripcion; 
        String categoria;
        String estado;
        String archivo;
        String profesor;
        
        
        
        try {
            Connection con = proyectoresoluciones.dbConnection.conectDB();
                Statement cstmt = con.createStatement();
                ResultSet rs = cstmt.executeQuery("call select_solicitudxid(\'"+numeroSolicitud+"\')");
                while(rs.next()){
                    fecha=rs.getString(1);
                    periodo=rs.getString(2);
                    idSolicitante=rs.getString(3);
                    situacion=Situacion.valueOf(rs.getString(4));
                    estado=rs.getString(5);
                    descripcion=rs.getString(6);
                    grupo=rs.getInt(7);
                    carnetEstudiante=rs.getString(8);
                    nombreEstudiante=rs.getString(9);
                    correoEstudiante=rs.getString(10);
                    telefonoEstudiante=rs.getString(11);
                    codigoCurso=rs.getString(12);
                    archivo=rs.getString(13);
                    profesor=rs.getString(14);
                         
                   
                    
         
        
        solicitud.setFecha(fecha);
        solicitud.setPeriodo(periodo);
        solicitud.setIdSolicitante(idSolicitante);
        solicitud.setSituacion(ERROR_NOTA);
        solicitud.setEstado(EstadoSolicitud.ANULADA);
        solicitud.setDescripcion(descripcion);
        solicitud.setGrupo(numeroSolicitud);
        solicitud.setEstudiante(nombreEstudiante, carnetEstudiante, correoEstudiante, telefonoEstudiante);
        solicitud.setCodigoCurso(codigoCurso);
        solicitud.setNumSolicitud(numeroSolicitud);
        solicitud.setArchivo(archivo);
        solicitud.setProfesor(profesor);
                }
                
            } catch (SQLException ex) {
               
            }
        return solicitud;
    }
}
