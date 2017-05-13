package proyectoresoluciones;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//para generar html
import org.stringtemplate.v4.*;


public class ProyectoResoluciones {

    /*Aquí se van a tomar los datos de las hojas de excel para llenar las clases*/
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        /* Se ponen las etiquetas siempre despues de un \\ para evitar errores. 
        los espacios que se rellenan deben ir entre <> y luego se les asigna
        el contenido con pantilla.add(nombreEspacio,contenido).
        El resultado se graba en la carpeta Archivos con el nombre Archivo.html*/
        ST plantilla = new ST("\\<html>\\<head> \\<title> Resolución de la Dirección de la Escuela de "
                + "Ingeniería en Computación \\<br> Instituto Tecnológico de Costa Rica \\</title> \\</head>"
                + "\\<body> \\<h1> Resolución de la Dirección de la Escuela de Ingeniería en Computación \\<br>"
                + "Instituto Tecnológico de Costa Rica \\</h1> \\<h2> <codigo> \\</h2> \\<p>"
                + "Atención: <directorAYR>, Director \\<br> Departamento de Admisión y Registro \\</p> "
                + "\\<p> A las <hora> horas del <fecha>, el suscrito <directorIC>, Director de la Escuela de Ingeniería"
                + " en Computación en atención al caso de modificación de acta del estudiante <estudiante>, carné <carnet>,"
                + " sobre el curso <curso>, grupo <noGrupo>, del <periodo>, resuelvo:\\</p> \\<h3>"
                + "RESULTANDO ÚNICO: \\</h3> \\<p> Por un error involuntario, <asunto> del estudiante <estudiante> "
                + "con identificación <carnet> en el <curso>, grupo <noGrupo> impartido por el profesor <profesor> en el"
                + " <periodo> y al final del semestre, el profesor no pudo registrar en el acta la calificación obtenida"
                + " por el estudiante.\\</p> \\<h3> CONSIDERANDO UNICO: \\</h3> \\<p> Después de haber realizado"
                + " la investigación del caso, y consultado al profesor <profesor>, quien impartió el curso <curso>, "
                + "grupo <noGrupo> en el <periodo> se logra comprobar que el estudiante <estudiante>, carné <carnet>,"
                + " <asunto2>, por lo que esta Dirección solicita gestionar la modificación del acta correspondiente.\\</p>"
                + "\\<h3> RESUELVO: \\</h3> \\<p> Autorizar la modificación del acta del curso <curso>, grupo <noGrupo> "
                + "en el <periodo> impartido por el profesor <profesor> para incluir al estudiante <estudiante>,"
                + " carné <carnet> <asunto3>.\\</p> \\<h3> NOTIFÍQUESE \\</h3> \\<p> <directorIC> \\<br> Director Escuela "
                + "Ingeniería en Computación \\<br>Instituto Tecnológico de Costa Rica\\</p> \\</body> \\</html>");
        
        //Asigno valores
        plantilla.add("codigo", "RES-IC-001-2017");
        plantilla.add("directorAYR", "Máster Geovanni Rojas Rodríguez");
        plantilla.add("hora", "diez");
        plantilla.add("fecha", "treinta de enero del año dos mil diecisiete");
        plantilla.add("directorIC", "Ing.Mauricio Arroyo Herrera");
        plantilla.add("estudiante", "UGARTE UGARTE FERNANDO");
        plantilla.add("carnet","201048339");
        plantilla.add("curso","IC-8007 PROTECCION Y SEGURIDAD EN COMPUTACION");
        plantilla.add("noGrupo","01");
        plantilla.add("periodo","segundo semestre del año dos mil quince");
        plantilla.add("profesor", "JORGE VARGAS CALVO");
        plantilla.add("asunto", "no se tramitó la inclusión");
        plantilla.add("asunto2", "efectivamente aprobó el curso con una nota de noventa y cinco (95)");
        plantilla.add("asunto3", "con una nota de aprobación de noventa y cinco (95)");
        String texto = plantilla.render();
        
        //Genero el archivo html
        PrintWriter writer = new PrintWriter ("Archivos\\ArchivoHtml.html", "Unicode");
        writer.println(texto);
        writer.close();
        
        try {
            
            //Create Workbook instance holding reference to .xlsx file
            try (FileInputStream file = new FileInputStream(new File("C:\\Users\\user\\Google Drive\\l Semestre 2017\\Diseño de Software\\Proyectos\\Proyecto 1\\Proyecto 1\\DatosProyecto1.xlsx"))) {
                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                
                //Get first/desired sheet from the workbook
                DataFormatter formatter = new DataFormatter();
                XSSFSheet sheet = workbook.getSheetAt(0);
                
                //Iterate through each rows one by one
                for (Iterator<Row> it = sheet.iterator(); it.hasNext();) {
                    
                    Row row = it.next();
                    for (Cell cell : row) {
                        CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                        System.out.print(cellRef.formatAsString());
                        System.out.print(" - ");
                        // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
                        String text = formatter.formatCellValue(cell);
                        System.out.println(text);

                        
                    }       
                }
                
                
            }
            catch (Exception e) {
                System.out.println("P .");
            }
    } catch (Exception e) {
        e.printStackTrace();
    }
        
    }
    
}
