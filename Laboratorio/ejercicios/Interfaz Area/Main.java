import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.Integer;

public class Main {

    public static void main(String[] args){
        JFrame ventana = new JFrame("Calculo de area");
        ventana.setLayout(new BorderLayout());
        ventana.setSize(1000,1000);

        JPanel panelSuperior = new JPanel();
        JPanel panerCentral = new JPanel();

        panerCentral.setLayout(new GridLayout(3,3));

        JButton b_circ = new JButton("Ciruculo");
        JButton b_cuadrado = new JButton("Ciruculo");
        JButton b_esfera = new JButton("Ciruculo");
        JButton b_cubo = new JButton("Ciruculo");
        JButton b_triangulo = new JButton("Ciruculo");

        JLabel texto = new JLabel("Cálculo de áreas");
        panelSuperior.add(texto);

        panerCentral.add(b_circ);
        panerCentral.add(b_cuadrado);
        panerCentral.add(b_esfera);
        panerCentral.add(b_cubo);
        panerCentral.add(b_triangulo);

        ventana.add(panerCentral,BorderLayout.CENTER);
        ventana.add(panelSuperior,BorderLayout.NORTH);

        b_circ.addMouseListener(
            new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    
                    Auxiliar.ventanaSimple(1);
                }
            }
        );

        ventana.setVisible(true);
    }
}