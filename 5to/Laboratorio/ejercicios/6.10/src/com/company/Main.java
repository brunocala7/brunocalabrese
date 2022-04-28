package com.company;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void crearArchivo(Persona p1){
        File archivo = new File("src/com/company/ejemplo.txt");
        FileWriter archivoAEscribir = null;

        try {

            archivoAEscribir = new FileWriter(archivo);
            BufferedWriter escritura = new BufferedWriter(archivoAEscribir);

            escritura.write("Nombre" + p1.getNombre());
            escritura.write("Edad" + p1.getEdad());
            escritura.write("Dni" + p1.getDni());
            escritura.write("Telefono" + p1.getTelefono());
            escritura.write("Dirección" + p1.getDireccion());

            escritura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarArchivo(){
        File archivo = new File("src/com/company/ejemplo.txt");
        FileReader archivoAleer = null;

        try {
            archivoAleer = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(archivoAleer);
            String linea = lectura.readLine();

            while(linea != null) {
                System.out.println(linea);
                linea = lectura.readLine();
            }

            lectura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	    Persona persona = new Persona();

        String consulta = "INSERT INTO persona VALUES (" + persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion() + "," + persona.getDni() + "," + persona.getTelefono() + ";";
        AccesoBaseDeDatos baseDeDatos = new AccesoBaseDeDatos("base","persona");

        baseDeDatos.conectar("fnes","fsef");
        baseDeDatos.modificarTabla(consulta);



    }
}
