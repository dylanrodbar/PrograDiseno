package proyectoresoluciones.datos;

   

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PDF extends Archivo {
    
    
    public void imprimir(Resolucion resolucion){
        
        
        
        try {
            //variables de resolucion
            String codigo = resolucion.getCodigo();
            String directorAYR = resolucion.getNombreAYR();
            String hora = resolucion.getHora();
            String fecha = resolucion.getFecha();
            String directorIC = resolucion.getNombreDirector();
            String estudiante = resolucion.getEstudiante();
            String carnet = resolucion.getCarnet();
            String curso = resolucion.getCurso();
            String noGrupo = resolucion.getNoGrupo();
            String periodo = resolucion.getPeriodo();
            String profesor = resolucion.getProfesor();
            String asunto = resolucion.getAsunto();
            ArrayList<Considerando> considerandos = resolucion.getConsiderandos();
            String asunto3 = resolucion.getAsunto3();


            String resolucionS = "Resolución de la Dirección de la Escuela de Ingeniería en Computación \n Instituto Tecnológico "
                    + "de Costa Rica\n \nAtención: " + directorAYR + ", Director \nDepartamento de Admisión y Registro \n \n"
                    + "A las " + hora + " horas del " + fecha + ", el suscrito " + directorIC + ", Director de la Escuela de Ingeniería"
                    + " en Computación en atención al caso de modificación de acta del estudiante " + estudiante + ", carné " + carnet + ","
                    + " sobre el curso " + curso + ", grupo " + noGrupo + ", del " + periodo + ", resuelvo:\n \nRESULTANDO ÚNICO: \nPor un"
                    + " error involuntario, " + asunto + " del estudiante " + estudiante + " con identificación " + carnet + " en el "
                    + curso + ", grupo " + noGrupo + " impartido por el profesor " + profesor + " en el " + periodo + " y al final del"
                    + " semestre, el profesor no pudo registrar en el acta la calificación obtenida por el estudiante.\n \nCONSIDERANDOS:"
                    + " \n";
            
            String resolucionS2 = "\n \nRESUELVO: \nAutorizar la modificación del acta del curso " + curso + ", grupo "
                    + noGrupo + " en el " + periodo + " impartido por el profesor " + profesor + " para incluir al estudiante " + estudiante
                    + ", carné " + carnet + " " + asunto3 + ".\n \nNOTIFÍQUESE\n" + directorIC + "\nDirector Escuela Ingeniería en "
                    + "Computación \nInstituto Tecnológico de Costa Rica";
            //Crea documento
            
            PdfWriter writer = null;
            
            File file = new File("Archivos\\ArchivoPDF.pdf");
            //Inicializa PDF writer
            writer = new PdfWriter("Archivos\\ArchivoPDF.pdf");
            //Inicializa PDF 
            PdfDocument pdf = new PdfDocument(writer);
            // Inicializa documento
            Document document = new Document(pdf);
            // Crea PdfFont
            PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
            // Agrega Parrafo
            document.add(new Paragraph(resolucionS).setFont(font));
            // Crea lista Considerandos
            List list = new List()
                    .setSymbolIndent(12)
                    .setListSymbol("\u2022")
                    .setFont(font);
            // Add ListItem objects
            
            for (int i = 0; i < considerandos.size(); i++){
                list.add(new ListItem(considerandos.get(i).considerando));
            }

            // Add the list
            document.add(list);
            document.add(new Paragraph(resolucionS2).setFont(font));
            //Close document
            document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }

      
        
    }
    
}
