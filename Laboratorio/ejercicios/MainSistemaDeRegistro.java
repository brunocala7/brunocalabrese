package com.company;

import java.util.Scanner;

public class MainSistemaDeRegistro {
    public static void main (String[] args){
        SistemaDeRegistro sistema = new SistemaDeRegistro();
        boolean sigue = true;
        String opcion;
        Scanner sc_string = new Scanner(System.in);

        while(sigue){
            sistema.iniciarSistema();

            opcion = sc_string.nextLine();

            switch (opcion){
                case "1":
                    sistema.registrarProductos();
                    break;
                case "2":
                    sistema.verImporteParcial();
                    break;
                case "3":
                    sistema.verImporteTotal();
                    sigue = false;
                    break;
            }
        }
    }
}
