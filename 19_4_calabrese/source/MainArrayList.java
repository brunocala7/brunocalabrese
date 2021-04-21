package source;
import java.util.ArrayList;
import java.util.Scanner;


public class MainArrayList {
    public static float calcular_total(ArrayList<Producto> productos){
        float total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;

    }

    public static void main (String[] args){
        float precio;
        float opcion;
        String nombre;
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_float = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();


        while(true){
            System.out.println("REGISTRO DE PRODUCTOS");
            System.out.println("Importe Parcial: " + calcular_total(productos));
            System.out.print("Nombre del producto: ");
            nombre = sc_string.nextLine();
            System.out.print("Precio del producto: ");
            precio = sc_float.nextFloat();

            Producto p1 = new Producto(nombre,precio);

            productos.add(p1);

            System.out.println("0 -> Continuar compra");
            System.out.println("1 -> Finalizar compra");
            System.out.println("Importe parcial: " + calcular_total(productos));

            opcion = sc_float.nextFloat();

            if (opcion == 1){
                break;
            }
        }

        System.out.println("Importe total: " + calcular_total(productos));
    }
}
