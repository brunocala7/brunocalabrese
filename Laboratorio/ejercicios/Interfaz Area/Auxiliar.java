import javax.swing.*;
import java.awt.*;
import java.lang.Float;

public class Auxiliar {
    
    public static void ventanaSimple (int numero){
        JFrame nuevaVentana = new JFrame();
        nuevaVentana.setSize(500,500);
        nuevaVentana.setLayout(new BorderLayout());

        JPanel inputs = new JPanel();
        JPanel boton = new JPanel();

        JTextField input = new JTextField();
        JLabel resultado = new JLabel();
        int res = 0;

        switch(numero){
            case 1:
                resultado.setText(Float.toString(Area.areaCirculo(Float.parseFloat(input.getText()))));
                break;
            case 2:
                resultado.setText(Float.toString(Area.areaCuadrado(Float.parseFloat(input.getText()))));
                break;
            case 3:
                resultado.setText(Float.toString(Area.areaEsfera(Float.parseFloat(input.getText()))));
                break;
            case 4:
                resultado.setText(Float.toString(Area.areaCubo(Float.parseFloat(input.getText()))));
        }

        inputs.add(input);
        boton.add(resultado);

        nuevaVentana.add(inputs,BorderLayout.NORTH);
        nuevaVentana.add(resultado,BorderLayout.CENTER);
        nuevaVentana.setVisible(true);
    }
}
