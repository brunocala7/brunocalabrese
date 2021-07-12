import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    private HashSet<Pedido> pedidos;
    private HashSet<Alumno> alumnos;
    private HashSet<Profesor> profesores;
    private HashSet<Persona> personas;
    private HashSet<Plato> platos;

    public Menu (){
        pedidos = new HashSet<>();
        alumnos = new HashSet<>();
        profesores = new HashSet<>();
        personas = new HashSet<>();
        platos = new HashSet<>();
    }

    public void agregarAlumno(){
        String nombre,apellido,division;
        Scanner scaner = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = scaner.nextLine();
        System.out.print("Apellido: ");
        apellido = scaner.nextLine();
        System.out.print("Division: ");
        division = scaner.nextLine();


        Persona p1 = new Persona(nombre, apellido);
        Alumno a1 = new Alumno(nombre,apellido,division);

        this.alumnos.add(a1);
        this.personas.add(p1);
    }

    public void agregarPedido(){
        String nombre;
    }

    public void agregarProfesor(){
        String nombre,apellido;
        int desc;
        Scanner scaner = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = scaner.nextLine();
        System.out.print("Apellido: ");
        apellido = scaner.nextLine();
        System.out.print("Descuento: ");
        desc = scaner.nextInt();

        Persona p1 = new Persona(nombre, apellido);
        Profesor pr1 = new Profesor(nombre,apellido,desc);

        this.profesores.add(pr1);
        this.personas.add(p1);
    }

    

    public void agregarPlato(Plato a1){
        this.platos.add(a1);
    }
}
