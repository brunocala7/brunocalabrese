public class Viaje{
    private float precio;
    private String fecha;
    private String hora;

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
}