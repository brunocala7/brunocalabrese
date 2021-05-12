package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaDeRegistroDePersonas {
    private ArrayList<Persona> personas;

    public SistemaDeRegistroDePersonas(){

    }

    public void registrarPersona (String nombre,int edad,int dni,int telefono,String direccion) {
        Persona p1 = new Persona(nombre,edad,dni,telefono,direccion);

        personas.add(p1);
    }

    public void eliminarPersona (int dni) {
        int indice = 0;

        for (int i = 0;i < personas.size();i++){
            if(personas.get(i).getDni() == dni){
                indice = i;
            }
        }

        personas.remove(indice);
    }

    public void modificarPersona (int dni) {
        int opcion = 0;
        int indice = 0;
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);

        for(int i = 0;i < personas.size();i++){
            if(personas.get(i).getDni() == dni){
                indice = i;
            }
        }

        System.out.println("QUE DATO DESEA CAMBIAR?");
        System.out.println("1 - NOMBRE");
        System.out.println("2 - EDAD");
        System.out.println("3 - DNI");
        System.out.println("4 - TELEFONO");
        System.out.println("5 - DIRECCION");

        switch (opcion){
            case 1:
                personas.get(indice).setNombre(sc_string.nextLine());
                break;
            case 2: 
                personas.get(indice).setEdad(sc_int.nextInt());
                break;
            case 3:
                personas.get(indice).setDni(sc_string.nextInt());
                break;
            case 4: 
                personas.get(indice).setTelefono(sc_string.nextInt());
                break;
            case 5: 
                personas.get(indice).setDireccion(sc_string.nextLine());
                break;
        }
    }

    public void mostrarPersonasMayoresDeEdad (){
        for(Persona p1 : personas){
            if(p1.getEdad() > 17){
                System.out.print(p1.getNombre() + " - ");
            }
        }
    }

    public void mostrarTodasLasPersonas () {
        for(Persona p1 : personas){
            System.out.print(p1.getNombre() + " - ");
        }
    }

    public boolean salirDelSistema () {
        System.out.println("bye!");

        return false;
    }
}
