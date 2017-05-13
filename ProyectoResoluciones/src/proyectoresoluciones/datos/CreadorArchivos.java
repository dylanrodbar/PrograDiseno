package proyectoresoluciones.datos;

public class CreadorArchivos {
    private Archivo archivo;
    
    public CreadorArchivos(){}
    
    public void crearArchivo(String tipo, Resolucion resolucion){
        Archivo archivoI = null;
        
        if(tipo.compareTo("PDF") == 0){
            
            archivoI = new PDF();
            
            
        }
        
        else if (tipo.compareTo("HTML") == 0){
            
            archivoI = new HTML();
        }
        
        archivoI.imprimir(resolucion);
        System.out.println("Se imprimió archivo");
        
        
    }
    
    public void generarHTML(Resolucion resolucion){
        
        this.archivo = new HTML();
        this.archivo.imprimir(resolucion);
        
    }
    
    public void generarPDF(Resolucion resolucion){
        
        this.archivo = new PDF();
        this.archivo.imprimir(resolucion);
    }
}
