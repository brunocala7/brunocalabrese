import java.util.ArrayList;

public class TarjetaEquis {
    private float saldo;
    private float saldoNegativoMaximo;
    private float numeroId;
    ArrayList<Viaje> listaViajes;

    public TarjetaEquis(Float s,Float sn,Float n){
        this.saldo = s;
        this.saldoNegativoMaximo = sn;
        this.numeroId = n;
        this.listaViajes = new ArrayList<>();
    }

    //GETTERS
    public float getSaldo() {
        return this.saldo;
    }

    public float getSaldoNegativo (){
        return this.saldoNegativoMaximo;
    }

    public Float getId() {
        return this.numeroId;
    }

    public ArrayList<Viaje> getListaViajes (){
        return this.listaViajes;
    }

    //SETTERS
    public void setSaldo (Float s){
        this.saldo = s;
    }

    public void setSaldoNegativo (Float s){
        this.saldo = s;
    }

    public void setNumeroId (Float n){
        this.numeroId = n;
    }

    public void setListaViajes (ArrayList<Viaje> l){
        this.listaViajes = l;
    }

    //METODOS
    public void cargarSube(float monto){
        this.saldo += monto;
    }

    public void realizarViaje(Viaje viaje){
        this.listaViajes.add(viaje);
    }

    public Float ultimoMontoAbonado (){
        Float monto = 0.f;

        monto = this.listaViajes.get(listaViajes.size()-1).getPrecio();

        return monto;
    }
}
