import javax.swing.*;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Main {
    static Boolean j = true;
    static int winner = 0;


/*
c=0
0 - 0 - X - X - X - X - 0 - X - 0
0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8

| O | O | X |
| X | X | X |
| O | X | O |
*/


    public static int ver_ganador(JPanel tab) {
        //Crear matriz
        int ganador = 0;

        ArrayList<String> l = new ArrayList<>();

        for (int i = 0; i < tab.getComponents().length; i++) {
            JButton b = (JButton) tab.getComponent(i);
            l.add(b.getText());
        }

        for (int i = 0; i < 3; i+=3) { // HORIZONTALES
            if(l.get(i) == l.get(i+1) && l.get(i) == "X"  && l.get(i) == l.get(i+2)) {
                ganador = 1;
            }
            else if(l.get(i) == l.get(i+1) && l.get(i) == "O"  && l.get(i) == l.get(i+2)) {
                ganador = 2;
            }
        }

        for (int i = 0; i < 3; i++) { // VERTICALES
            if((l.get(i) == l.get(i+3) && l.get(i) == "X" ) && l.get(i) == l.get(i+6)) {
                ganador = 1;
            }
            else if((l.get(i) == l.get(i+3) && l.get(i) == "O" ) && l.get(i) == l.get(i+6)) {
                ganador = 2;
            }
        }
        //DIAGONALES
        if(l.get(0) == l.get(4) && l.get(0) == "X" && l.get(0) == l.get(8)){
            ganador = 1;
        }
        else if(l.get(0) == l.get(4) && l.get(0) == "O" && l.get(0) == l.get(8)){
            ganador = 2;
        }
        if(l.get(2) == l.get(4) && l.get(2) == "X" && l.get(2) == l.get(6)){
            ganador = 1;
        }
        else if(l.get(2) == l.get(4) && l.get(2) == "O" && l.get(2) == l.get(6)){
            ganador = 2;
        }


        return ganador;
    }

    public static void main(String[] args) {
        

        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500, 500);
        ventana.setLayout(new BorderLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraDeMenu = new JMenuBar();
        ventana.setJMenuBar(barraDeMenu);

        JMenu opcionesParaArchivos = new JMenu("Opciones");
        barraDeMenu.add(opcionesParaArchivos);

        JMenuItem archivoNuevo = new JMenuItem("Nueva Partida");
        opcionesParaArchivos.add(archivoNuevo);

        JMenuItem abrirArchivo = new JMenuItem("Puntaje Obtenido");
        opcionesParaArchivos.add(abrirArchivo);

        JMenuItem salir = new JMenuItem("Salir");
        opcionesParaArchivos.add(salir);

        JPanel puntaje = new JPanel();
        JLabel ganador = new JLabel();
        puntaje.add(ganador);

        JPanel tablero = new JPanel();
        tablero.setLayout(new GridLayout(3,3));
        
        JButton b1 = new JButton();
        tablero.add(b1);

        JButton b2 = new JButton();
        tablero.add(b2);

        JButton b3 = new JButton();
        tablero.add(b3);

        JButton b4 = new JButton();
        tablero.add(b4);

        JButton b5 = new JButton();
        tablero.add(b5);

        JButton b6 = new JButton();
        tablero.add(b6);

        JButton b7 = new JButton();
        tablero.add(b7);

        JButton b8 = new JButton();
        tablero.add(b8);

        JButton b9 = new JButton();
        tablero.add(b9);

        ventana.add(tablero, BorderLayout.CENTER);
        ventana.add(puntaje, BorderLayout.SOUTH);

        archivoNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < tablero.getComponents().length; i++) {
                    JButton b = (JButton)tablero.getComponent(i);
                    b.setText("");
                }
                ganador.setText("");
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
                ventana.dispose();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b1.getText() == ""){
                    b1.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                System.out.println(winner);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b2.getText() == ""){
                    b2.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b3.getText() == ""){
                    b3.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b4.getText() == ""){
                    b4.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b5.getText() == ""){
                    b5.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b6.getText() == ""){
                    b6.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b7.getText() == ""){
                    b7.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b8.getText() == ""){
                    b8.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = "";
                if(j){
                    t = "X";
                }
                else{
                    t = "O";
                }
                if(b9.getText() == ""){
                    b9.setText(t);
                    if(j){
                        j = false;
                    }
                    else{
                        j = true;
                    }
                }
                winner = ver_ganador(tablero);
                if(winner == 1){
                    ganador.setText("Gan?? el jugador 1");
                }
                else if(winner == 2){
                    ganador.setText("Gan?? el jugador 2");
                }
            }
        });

        ventana.setVisible(true);
 /*
    c=0
    0 - 0 - X - X - X - X - 0 - X - 0

    | O | O | X |
    | X | X | X |
    | O | X | O |
*/
    }
}
