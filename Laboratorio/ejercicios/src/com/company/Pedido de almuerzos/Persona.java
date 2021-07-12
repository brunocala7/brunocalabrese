public class Persona {
    private String nombre;
    private String apellido;

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona () {
        this.nombre = "";
        this.apellido = "";
    }

    public String getNombre (){
        return this.nombre;
    }

    public String getApellido (){
        return this.apellido;
    }

    public void setNombre (String nom){
        this.nombre = nom;
    }

    public void setApellido (String ape){
        this.nombre = ape;
    }
}
