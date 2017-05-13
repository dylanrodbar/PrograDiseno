package proyectoresoluciones.negocio;

public abstract class Gestor {
    
    
    public abstract boolean crear(Object obj);
    public abstract Object consultar(Object obj);
    public abstract boolean modificar(Object obj);
    public abstract boolean eliminar(Object obj);
}
