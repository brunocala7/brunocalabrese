import java.util.ArrayList;

public class Viaje extends ArrayList<Viaje> {
    private float precio;
    private String fecha;
    private String hora;

    public Viaje (){
        this.fecha = "19/4/2021";
        this.hora = "15:42";
        this.precio = 40.0f;
    }

    public Viaje (Float p,String f,String h){
        this.precio = p;
        this.fecha = f;
        this.hora = h;
    }

    //GETTERS
    public Float getPrecio(){
        return this.precio;
    }

    public String getFecha(){
        return this.fecha;
    }

    public String getHora(){
        return this.hora;
    }

    //SETTERS
    public void setPrecio(Float p) {
        this.precio = p;
    }

    public void setFecha(String f) {
        this.fecha = f;
    }

    public void setHora(String h) {
        this.hora = h;
    }

    @Override
    public String toString(){
        String devolucion = "hora: " + this.getHora() + " | fecha: " + this.getFecha() + " | precio: " + this.getPrecio();

        return devolucion;
    }


    
}