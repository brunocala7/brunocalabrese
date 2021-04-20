package source;
import java.util.Scanner;

public class Main{
    

    public static void main (String[] args){
        float total,precio;
        String nombre;
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_float = new Scanner(System.in);


        while(true){
            System.out.println("REGISTRO DE PRODUCTOS");
            System.out.print("Nombre del producto:");
            nombre = sc_string.nextLine();
            System.out.print("Precio del producto");
            precio = sc_float.nextFloat();

            Producto p1 = new Producto(nombre,precio);

            total += p1.precio;

        }
        

        
    }
    
}