package source;

public class Producto {
    private float precio;
    private String nombre;

    public Producto(String nombre,float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
