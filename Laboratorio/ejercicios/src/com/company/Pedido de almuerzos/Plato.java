public class Plato {
    private String nombre;
    private Float precio;

    public Plato (String nombre,Float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Float getPrecio(){
        return this.precio;
    }
}
