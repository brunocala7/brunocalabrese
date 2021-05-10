package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;


public class MainHashSet {
    public static void main (String[] args) {
        Scanner sc_int = new Scanner(System.in);
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        HashSet <Integer> hashSetNumeros = new HashSet<>();
        int cantidad = 0;
        int num_parcial = 0;

        System.out.print("Cantidad de números que va a ingresar: ");
        cantidad = sc_int.nextInt();

        for(int i = 0;i < cantidad;i++){
            num_parcial = sc_int.nextInt();
            listaNumeros.add(num_parcial);
        }

        for(Integer a : listaNumeros){
            hashSetNumeros.add(a);
        }

        System.out.println("Lista sin números repetidos:");

        for(Integer a : hashSetNumeros){
            System.out.print(a + " - ");
        }
    }
}
