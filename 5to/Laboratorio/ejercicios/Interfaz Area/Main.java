import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args){
        JFrame ventana = new JFrame("Calculo de area");
        ventana.setLayout(new BorderLayout());
        ventana.setSize(1000,1000);

        JPanel panelSuperior = new JPanel();
        JPanel panelCentral = new JPanel();

        panelCentral.setLayout(new GridLayout(3,3));

        JButton b_circ = new JButton("Circulo");
        JButton b_cuadrado = new JButton("Cuadrado");
        JButton b_esfera = new JButton("Esfera");
        JButton b_cubo = new JButton("Cubo");
        JButton b_triangulo = new JButton("Triangulo");

        JLabel texto = new JLabel("Cálculo de áreas");

        panelSuperior.add(texto);

        panelCentral.add(b_circ);
        panelCentral.add(b_cuadrado);
        panelCentral.add(b_esfera);
        panelCentral.add(b_cubo);
        panelCentral.add(b_triangulo);

        ventana.add(panelCentral,BorderLayout.CENTER);
        ventana.add(panelSuperior,BorderLayout.NORTH);

        b_circ.addMouseListener(
            new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Auxiliar.ventanaSimple(1);
                }
            }
        );
        b_esfera.addMouseListener(
            new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Auxiliar.ventanaSimple(2);
                }
            }
        );
        b_cuadrado.addMouseListener(
            new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Auxiliar.ventanaSimple(3);
                }
            }
        );
        b_cubo.addMouseListener(
            new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Auxiliar.ventanaSimple(4);
                }
            }
        );
        b_triangulo.addMouseListener(
            new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    Auxiliar.ventanaCompleja();
                }
            }
        );

        ventana.setVisible(true);

    }
}