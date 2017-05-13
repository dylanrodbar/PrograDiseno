package proyectoresoluciones.datos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.stringtemplate.v4.ST;

public class HTML extends Archivo {
    
    public HTML(){}
    
    public void imprimir(Resolucion resolucion){
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
                + " por el estudiante.\\</p> \\<h3> CONSIDERANDOS: \\</h3> \\<p> <considerandos> \\</p>"
                + "\\<h3> RESUELVO: \\</h3> \\<p> Autorizar la modificación del acta del curso <curso>, grupo <noGrupo> "
                + "en el <periodo> impartido por el profesor <profesor> para incluir al estudiante <estudiante>,"
                + " carné <carnet> <asunto3>.\\</p> \\<h3> NOTIFÍQUESE \\</h3> \\<p> <directorIC> \\<br> Director Escuela "
                + "Ingeniería en Computación \\<br>Instituto Tecnológico de Costa Rica\\</p> \\</body> \\</html>");
        
        //Asigno valores
        ArrayList<Considerando> considerandos = resolucion.getConsiderandos();
        String listaConsiderandos = "";
        for (int i = 0; i < considerandos.size(); i++){
            listaConsiderandos+= considerandos.get(i).considerando;
            listaConsiderandos+=" ";
        }  
        
        plantilla.add("codigo", resolucion.getCodigo());
        plantilla.add("directorAYR", resolucion.getNombreAYR());
        plantilla.add("hora", resolucion.getHora());
        plantilla.add("fecha", resolucion.getFecha());
        plantilla.add("directorIC", resolucion.getNombreDirector());
        plantilla.add("estudiante", resolucion.getEstudiante());
        plantilla.add("carnet", resolucion.getCarnet());
        plantilla.add("curso", resolucion.getCurso());
        plantilla.add("noGrupo", resolucion.getNoGrupo());
        plantilla.add("periodo", resolucion.getPeriodo());
        plantilla.add("profesor", resolucion.getProfesor());
        plantilla.add("asunto", resolucion.getAsunto());
        plantilla.add("considerandos", listaConsiderandos);
        plantilla.add("asunto3", resolucion.getAsunto3());
        String texto = plantilla.render();
        
        //Genero el archivo html
        PrintWriter writer = null;
        try {
            writer = new PrintWriter ("Archivos\\ArchivoHtml.html", "Unicode");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(HTML.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.println(texto);
        writer.close();
        
        
    }
    
}
