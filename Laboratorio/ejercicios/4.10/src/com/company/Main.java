package com.company;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void crearArchivo(){
        File archivo = new File("src/com/company/ejemplo.txt");
        FileWriter archivoAEscribir = null;

        try {

            archivoAEscribir = new FileWriter(archivo);
            BufferedWriter escritura = new BufferedWriter(archivoAEscribir);


            for (int i = 0; i < 10; i++) {
                escritura.write("Holaaa! \n");
            }

            escritura.close();

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
