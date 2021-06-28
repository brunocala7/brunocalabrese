import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientesVisitantes;

    public Banco () {
        this.nombre = "Banelco";
        this.clientesVisitantes = new ArrayList<>();
    }

    public HashSet<Integer> cbusDeClientesVisitantes() {
        HashSet<Integer> lista = new HashSet<>();

        for (Cliente c1 : this.clientesVisitantes) {
            lista.add(c1.getCbu());
        }

        return lista;
    }

    public void imprimirLista(HashSet<Integer> lista) {
        for (Integer cbu : lista) {
            System.out.print(cbu + " - ");
        }
    }

    public HashMap<Integer,Integer> cantidadDeVisitasPorCliente (){
        int visitas = 0;
        HashMap<Integer,Integer> listaVisitas = new HashMap<>();

        for (Cliente cliente : this.clientesVisitantes) {
            if(listaVisitas.containsKey(cliente.getCbu())){
                visitas = listaVisitas.get(cliente.getCbu());

                listaVisitas.replace(cliente.getCbu(), visitas + 1);
            }
            else{
                listaVisitas.put(cliente.getCbu(),0);
            }
        }

        return listaVisitas;
    }

    public void printVisitas(HashMap<Integer,Integer> listaVisitas) {
        
        for (Integer clave : listaVisitas.keySet()) {
            System.out.println("clave: " + clave + " - valor: " + listaVisitas.get(clave));
        }
    }
}
