import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.Float;

public class Auxiliar {
    
    public static void ventanaSimple (int numero){
        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(1000, 1000);

        JLabel texto = new JLabel();
        texto.setText("Ingrese un Número");
        texto.setSize(200, 25);
        texto.setLocation(25, 25);

        JTextField c1 = new JTextField();
        c1.setSize(200,25);
        c1.setLocation(250,25);

        JButton b1 = new JButton();
        b1.setLocation(25,100);
        b1.setSize(200,50);
        b1.setText("Calcular");

        JLabel j1 = new JLabel();
        j1.setLocation(25,200);
        j1.setSize(200,25);

        ventana.add(texto);
        ventana.add(c1);
        ventana.add(b1);
        ventana.add(j1);
        ventana.setVisible(true);

        b1.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    switch (numero) {
                        case 1:
                            j1.setText(Float.toString(Area.areaCirculo(Float.parseFloat(c1.getText()))));
                            break;
                    
                        case 2:
                            j1.setText(Float.toString(Area.areaEsfera(Float.parseFloat(c1.getText()))));
                            break;
                        case 3:
                            j1.setText(Float.toString(Area.areaCuadrado(Float.parseFloat(c1.getText()))));
                            break;
                        case 4:
                            j1.setText(Float.toString(Area.areaCubo(Float.parseFloat(c1.getText()))));
                            break;
                    }
                }
            }
        );
    }

    public static void ventanaCompleja (){
        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(1000, 1000);

        JLabel texto = new JLabel();
        texto.setText("Ingrese un Número");
        texto.setSize(200, 25);
        texto.setLocation(25, 25);
        JLabel texto2 = new JLabel();
        texto2.setText("Ingrese un Número");
        texto2.setSize(200, 25);
        texto2.setLocation(25, 50);

        JTextField c1 = new JTextField();
        c1.setSize(200,25);
        c1.setLocation(250,25);
        JTextField c2 = new JTextField();
        c2.setSize(200,25);
        c2.setLocation(250,50);

        JButton b1 = new JButton();
        b1.setLocation(25,100);
        b1.setSize(200,50);
        b1.setText("Calcular");

        JLabel j1 = new JLabel();
        j1.setLocation(25,200);
        j1.setSize(200,25);

        ventana.add(texto);
        ventana.add(texto2);
        ventana.add(c1);
        ventana.add(c2);
        ventana.add(b1);
        ventana.add(j1);
        ventana.setVisible(true);

        b1.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    j1.setText(Float.toString(Area.areaTriangulo(Float.parseFloat(c1.getText()),Float.parseFloat(c2.getText()))));
                }
            }
        );
    }
}
