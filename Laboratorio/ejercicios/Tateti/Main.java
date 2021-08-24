import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

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
        JLabel c1 = new JLabel("X");
        tablero.setBackground(Color.cyan);
        tablero.add(c1);

        JLabel c2 = new JLabel("O");
        tablero.add(c2);

        JLabel c3 = new JLabel("O");
        tablero.add(c3);

        JLabel c4 = new JLabel("X");
        tablero.add(c4);

        JLabel c5 = new JLabel("O");
        tablero.add(c5);

        JLabel c6 = new JLabel("O");
        tablero.add(c6);

        JLabel c7 = new JLabel("X");
        tablero.add(c7);

        JLabel c8 = new JLabel("O");
        tablero.add(c8);

        JLabel c9 = new JLabel("O");
        tablero.add(c9);

        ventana.add(tablero, BorderLayout.CENTER);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
                ventana.dispose();
            }
        });

        ventana.setVisible(true);

    }
}
