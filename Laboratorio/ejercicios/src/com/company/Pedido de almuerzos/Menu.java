import java.util.HashMap;
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

    //AGREGAR

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
        String fecha,hora,nombrePersona,apellidoPersona,nombrePlato;
        Persona p_pedido;
        Plato plato;
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la fecha del pedido: ");
        fecha = sc.nextLine();

        System.out.print("Ingrese el nombre de la persona: ");
        nombrePersona = sc.nextLine();

        System.out.print("Ingrese el apellido de la persona: ");
        apellidoPersona = sc.nextLine();

        System.out.print("Ingrese el nombre del plato: ");
        nombrePlato = sc.nextLine();

        System.out.print("Ingrese la hora del pedido: ");
        hora = sc.nextLine();

        for (Persona p1 : personas) {
            if((nombrePersona == p1.getNombre()) && (apellidoPersona == p1.getApellido())){
                p_pedido = p1;
            }
        }

        for (Plato p1 : platos) {
            if(nombrePlato == p1.getNombre()){
                plato = p1;
            }
        }
        
        Pedido pedido = new Pedido(fecha, p_pedido, plato, hora);
        this.pedidos.add(pedido);
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

    public void agregarPlato(){
        String nombre;
        Float precio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del plato: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese el precio del plato: ");
        precio = sc.nextFloat();

        Plato p1 = new Plato(nombre, precio);

        this.platos.add(p1);
    }

    //SETTERS

    public void cambiarAlumno(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1- NOMBRE");
        System.out.print("2- APELLIDO");
        System.out.print("3- DIVISION");
        opcion = sc.nextInt();

        String cambio;

        switch(opcion){
            case 1:
                System.out.print("Ingrese el nombre actual de la persona: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el nombre a cambiar: ");
                cambio = sc.nextLine();

                for (Alumno alumno : alumnos) {
                    if(alumno.getNombre() == nombre){
                        alumno.setNombre(nombre);
                    }
                }

                break;
            case 2:
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.nextLine();
                System.out.print("Ingrese el apellido a cambiar: ");
                cambio = sc.nextLine();

                for (Alumno alumno : alumnos) {
                    if(alumno.getNombre() == apellido){
                        alumno.setApellido(cambio);
                    }
                }

                break;
            case 3:
                System.out.print("Ingrese la division: ");
                String division = sc.nextLine();
                System.out.print("Ingrese la division a cambiar: ");
                cambio = sc.nextLine();

                for (Alumno alumno : alumnos) {
                    if(alumno.getNombre() == division){
                        alumno.setDivision(division);
                    }
                }

                break;
        }
    }

    //DELETERS

    public void borrarAlumno() {
        String nombre,apellido;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellido: ");
        apellido = sc.nextLine();

        for (Alumno alumno : alumnos) {
            if((alumno.getNombre() == nombre) && (alumno.getApellido() == apellido)){
                alumnos.remove(alumno);
            }
        }
    }

    public void borrarProfesor() {
        String nombre,apellido;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellido: ");
        apellido = sc.nextLine();

        for (Profesor profesor : profesores) {
            if((profesor.getNombre() == nombre) && (profesor.getApellido() == apellido)){
                alumnos.remove(profesor);
            }
        }
    }

    public void borrarPlatos() {
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        for(Plato plato : platos){
            if(plato.getNombre() == nombre){
                platos.remove(plato);
            }
        }
    }

    public void borrarPedidos (){
        String hora;
        Scanner sc = new Scanner(System.in);

        hora = sc.nextLine();

        for (Pedido pedido : pedidos) {
            if(pedido.getHora() == hora){
                pedidos.remove(pedido);
            }
        }
    }

    public HashMap listadoPlatos(){
        HashMap<Plato,Float> listado = new HashMap<>();
        String nombre,apellido;
        Float precio = 0f;
        int desc = 0;
        Persona p2;

        for (Pedido pe1 : this.pedidos) {
            Plato p1 = new Plato(pe1.getPlato().getNombre(),pe1.getPlato().getPrecio());
            apellido = pe1.getPersona().getApellido();
            for (Profesor pr1 : profesores) {
                if(pr1.getApellido() == apellido){
                    desc = pr1.getDescuento();
                }
            }
            precio = (desc * 100) / precio;
        }

        return listado;
    }
}
