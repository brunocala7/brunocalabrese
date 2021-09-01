import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    static Boolean j = true;
    static int winner = 0;


/*
X - 0 - X - X - 0 - 0 - X - 0 - 0 
y = 1
i = 1
j = 1

| X | 0 | X | 
|  |  |  |
|  |  |  |
*/ 


    public static void ver_ganador(JPanel tab) {
        //Crear matriz
        int hor = 0;
        int ver = 0;

        String matriz[][] = new String[3][3];
        for(int y = 0;y < tab.getComponents().length;y++){
            JButton b1 = (JButton)tab.getComponent(y);
            matriz[hor][ver] = b1.getText();

            if(hor == 2){
                hor = 0;
                ver++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
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

        System.out.println(tablero.getComponent(4).getLocation().getY());

    

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
                ver_ganador(tablero);
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
            }
        });

        ventana.setVisible(true);

    }
}
