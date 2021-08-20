import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialPasajeros;
    private String linea;

    public Sistema (String l){
        this.pasajerosPresentes = new ArrayList<>();
        this.historialPasajeros = new ArrayList<>();
        this.linea = l;
    }

    //GETTERS

    public ArrayList<Pasajero> getPasajerosPresentes() {
        return this.pasajerosPresentes;
    }

    public ArrayList<Pasajero> getHistorialPasajeros (){
        return this.historialPasajeros;
    }

    public String getLinea (){
        return this.linea;
    }

    //SETTERS

    public void setPasajerosPresentes(ArrayList<Pasajero> a) {
        this.pasajerosPresentes = a;
    }

    public void setHistorialPasajeros(ArrayList<Pasajero> a) {
        this.historialPasajeros = a;
    }

    public void setLinea (String linea){
        this.linea = linea;
    }

    // METODOS

    public void subePasajero(Pasajero pasajero) {
        if(seSuperaElSaldoNegativo(pasajero)){
            System.out.println("Saldo Insuficiente");
        }
        else{
            System.out.println("Bienvenido!");
            this.pasajerosPresentes.add(pasajero);
            this.historialPasajeros.add(pasajero);
        }
    }

    public void seBajaPasajero(Pasajero pasajero){
        System.out.println("Chau!");
        this.pasajerosPresentes.remove(pasajero);
    }

    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez(){
        HashSet<Pasajero> lista = new HashSet<>();

        for (Pasajero pasajero : this.historialPasajeros) {
            lista.add(pasajero);
        }

        return lista;
    }

    public HashMap<Pasajero,Float> pasajerosConUltimoMontoAbonado(){
        HashMap<Pasajero,Float> lista = new HashMap<>();

        for (Pasajero pasajero : this.pasajerosQueSeHanSubidoAlgunaVez()) {
            lista.put(pasajero, pasajero.tarjeta.ultimoMontoAbonado());
        }

        return lista;
    }

    public Float ultimoMontoAbonadoPorPasajero(float numeroId){
        Float monto = 0.f;

        for (Pasajero pasajero : this.pasajerosConUltimoMontoAbonado().keySet()) {
            if(pasajero.getTarjeta().getId() == numeroId){
                monto = this.pasajerosConUltimoMontoAbonado().get(pasajero);
            }
        }

        return monto;
    }

    public Boolean seSuperaElSaldoNegativo(Pasajero p1){
        return p1.getTarjeta().getSaldo() < p1.getTarjeta().getSaldoNegativo();
    }
}
