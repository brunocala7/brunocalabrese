public class Pedido {
    private String fecha;
    private Persona persona;
    private Plato plato;
    private String hora;
    private Boolean entrega;

    public Pedido (String fecha,Persona persona,Plato p1,String hora){
        this.fecha = fecha;
        this.persona = persona;
        this.plato = p1;
        this.hora = hora;
        this.entrega = false;
    }

    //GETTERS

    public String getFecha (){
        return this.fecha;
    }

    public Persona getPersona (){
        return this.persona;
    }

    public Plato getPlato (){
        return this.plato;
    }

    public String getHora (){
        return this.hora;
    }

    public Boolean getEntrega (){
        return this.entrega;
    }

    //SETTERS

    public void setFecha (String f){
        this.fecha = f;
    }

    public void setPersona (Persona p){
        this.persona = p;
    }

    public void setPlato (Plato plato){
        this.plato = plato;
    }

    public void setHora (String hora){
        this.hora = hora;
    }

    public void setEntrega (Boolean e){
        this.entrega = e;
    }
}
