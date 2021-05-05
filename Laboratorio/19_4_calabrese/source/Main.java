package source;
import java.util.Scanner;

public class Main{
    

    public static void main (String[] args){
        float total = 0;
        float precio = 0;
        String opcion;
        String nombre;
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_float = new Scanner(System.in);


        while(true){
            System.out.println("REGISTRO DE PRODUCTOS");
            System.out.println("Importe Parcial: " + total);
            System.out.print("Nombre del producto: ");
            nombre = sc_string.nextLine();
            System.out.print("Precio del producto: ");
            precio = sc_float.nextFloat();

            Producto p1 = new Producto(nombre,precio);

            total += p1.getPrecio();

            System.out.println("1 -> Finalizar compra");
            System.out.println("Importe parcial: " + total);

            opcion = sc_int.nextLine();

            if (opcion.equals("1")){
                break;
            }
        }

        System.out.println("Importe total: " + total);
    }
    
}