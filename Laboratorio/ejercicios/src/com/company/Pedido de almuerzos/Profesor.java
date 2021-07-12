public class Profesor extends Persona {
    private int descuento;

    public Profesor (String nombre,String apellido,int descuento){
        super(nombre, apellido);
        this.descuento = descuento;
    }

    public int getDescuento(){
        return this.descuento;
    }

    public void setDescuento (int desc){
        this.descuento = desc;
    }
}
