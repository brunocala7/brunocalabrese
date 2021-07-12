import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Menu m = new Menu();
        int opcion = 0;
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);

        while(seguir){
            System.out.println("1- ALUMNOS");
            System.out.println("2- PROFESORES");
            System.out.println("3- PLATOS");
            System.out.println("4- PEDIDOS");
            System.out.println("5- SALIR");

            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("1- ALTA");
                    System.out.println("2- BAJA");
                    System.out.println("3- MODIFICACION");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            m.agregarAlumno();
                            break;
                    
                        case 2: 
                            m.cambiarAlumno();
                            break;
                        case 3: 
                            m.borrarAlumno();
                    }
                    break;
                case 2: 
                    System.out.println("1- ALTA");
                    System.out.println("2- BAJA");
                    System.out.println("3- MODIFICACION");
                    opcion = sc.nextInt();
                    switch (opcion){
                        case 1:
                            m.agregarProfesor();
                            break;
                        case 2:
                            m.borrarProfesor();
                            break;
                        case 3:
                            m.cambiarProfesor();
                    }

                    break;
                case 3:
                    System.out.println("1- ALTA");
                    System.out.println("2- BAJA");
                    System.out.println("3- MODIFICACION");
                    opcion = sc.nextInt();

                    switch (opcion){
                        case 1:
                            m.agregarPlato();
                            break;
                        case 2:
                            m.borrarPlatos();
                            break;
                        case 3:
                            m.cambiarPlato();
                    }
                    break;
                case 4: 
                    System.out.println("1- ALTA");
                    System.out.println("2- BAJA");
                    System.out.println("3- MODIFICACION");
                    System.out.println("4- LISTA PEDIDOS");
                    opcion = sc.nextInt();
                    switch(opcion){
                        case 1:
                            m.agregarPedido();
                            break;
                        case 2:
                            m.borrarPedidos();
                            break;
                        case 3:
                            m.cambiarPedido();
                            break;
                        case 4:
                            System.out.println(m.listadoPlatos());
                    }
                    break;
                case 5:
                    seguir = false;
                    break;
            }
        }
    }
}
