package com.company;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static HashSet<Usuario> conductores = new HashSet<>();
    static HashSet<Usuario> operadores = new HashSet<>();
    static HashSet<Usuario> musicalizadores = new HashSet<>();
    static HashSet<Programa> programas = new HashSet<>();

    public static Usuario ingresoUsuario(){
        Scanner scanner_aux = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner_aux.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner_aux.nextLine();
        System.out.print("Ingrese DNI: ");
        int dni = scanner_aux.nextInt();
        System.out.print("Ingrese Fecha de alta: ");
        String fecha = scanner_aux.nextLine();

        Usuario usuario = new Usuario(nombre,apellido,dni,fecha);

        return usuario;
    }

    public static Usuario buscarOperador(String nombre){
        Boolean encontro = false;
        Usuario user = new Usuario();

        for(Usuario operador : operadores){
            if(operador.getNombre() == nombre){
                encontro = true;
                user = operador;
            }
        }

        if(!encontro){
            System.out.println("No se encontro el operador");
        }

        return user;
    }

    public static Programa ingresoPrograma(){
        Scanner scanner_aux = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner_aux.nextLine();
        System.out.print("Ingrese nombre del operador técnico: ");
        String nombreOperador = scanner_aux.nextLine();
        Usuario operador = buscarOperador(nombreOperador);

    }

    public static void main(String[] args) {
        Usuario nuevoUsuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner_integer = new Scanner(System.in);

        while(true){
            System.out.println("1- Ingresar Conductor");
            System.out.println("2- Ingresar Musicalizador");
            System.out.println("3- Ingresar Operador");
            System.out.println("4- Ingresar Programa");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    nuevoUsuario = ingresoUsuario();
                    conductores.add(nuevoUsuario);
                    break;
                case 2:
                    nuevoUsuario = ingresoUsuario();
                    musicalizadores.add(nuevoUsuario);
                    break;
                case 3:
                    nuevoUsuario = ingresoUsuario();
                    operadores.add(nuevoUsuario);
                    break;
                case 4:

                    break;

            }
        }
    }
}
