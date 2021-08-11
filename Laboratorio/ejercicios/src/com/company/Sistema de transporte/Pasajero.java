public class Pasajero extends TarjetaEquis {
    private String nombre;
    private String apellido;
    TarjetaEquis tarjeta;

    public Pasajero (String nombre,String apellido,TarjetaEquis tar){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tar;
    }

    //GETTERS 
    public String getNombre (){
        return this.nombre;
    }

    public String getApellido (){
        return this.apellido;
    }

    public TarjetaEquis getTarjeta (){
        return this.tarjeta;
    }

    //SETTERS
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public void setTarjeta(TarjetaEquis t){
        this.tarjeta = t;
    }

    @Override
    public String toString(){
        String s = "nombre: " + this.getNombre() + "\n" + "apellido: " + this.getApellido() + "\n" + "\n" + "Viajes realizados:" + "\n" + this.tarjeta.toString();

        return s;
    }

    public static void main(String[] args) {
        Viaje v = new Viaje(10.f, "12/7", "6:09");
        Viaje v2 = new Viaje();

        TarjetaEquis t = new TarjetaEquis();
        t.listaViajes.add(v2);
        t.listaViajes.add(v);

        

        Pasajero p = new Pasajero("nombre", "apellido", t);

        System.out.println(p.toString());
    }
}
