package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;


public class MainHashSet2 {
    public static void main (String[] args) {
        Scanner sc_int = new Scanner(System.in);
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        ArrayList <Integer> listaNumeros2 = new ArrayList<>();
        HashSet <Integer> hashSetNumeros = new HashSet<>();
        HashSet <Integer> hashSetNumeros2 = new HashSet<>();
        int cantidad = 0;
        int num_parcial = 0;
        boolean sonIguales = true;

        System.out.print("Cantidad de números que va a ingresar: ");
        cantidad = sc_int.nextInt();

        for(int i = 0;i < cantidad;i++){
            num_parcial = sc_int.nextInt();
            listaNumeros.add(num_parcial);
        }

        System.out.print("Cantidad de números que va a ingresar: ");
        cantidad = sc_int.nextInt();

        for(int i = 0;i < cantidad;i++){
            num_parcial = sc_int.nextInt();
            listaNumeros2.add(num_parcial);
        }

        for(Integer a : listaNumeros){
            hashSetNumeros.add(a);
        }

        for(Integer a : listaNumeros2){
            hashSetNumeros2.add(a);
        }

        if(hashSetNumeros.size() != hashSetNumeros2.size()){
            sonIguales = false;
        }
        else{
            for(Integer a : hashSetNumeros){
                if(!hashSetNumeros2.contains(a)){
                    sonIguales = false;
                }
            }
        }

        if(sonIguales){
            System.out.println("TIENEN LOS MISMOS ELEMENTOS");
        }
        else{
            System.out.println("NO TIENEN LOS MISMOS ELEMENTOS");
        }

    }
}
