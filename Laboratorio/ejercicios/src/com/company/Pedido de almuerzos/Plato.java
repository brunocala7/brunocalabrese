public class Plato {
    private String nombre;
    private Float precio;

    public Plato (String nombre,Float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Plato (){
        this.nombre = "";
        this.precio = 0.f;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Float getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
