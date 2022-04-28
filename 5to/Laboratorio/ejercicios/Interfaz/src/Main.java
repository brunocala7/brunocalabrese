import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(1000, 1000);

        JLabel texto = new JLabel();
        texto.setText("Ingrese su Nombre");
        texto.setSize(200, 25);
        texto.setLocation(25, 25);

        JLabel texto2 = new JLabel();
        texto2.setText("Ingrese su Edad");
        texto2.setSize(200, 25);
        texto2.setLocation(25, 50);

        JLabel texto3 = new JLabel();
        texto3.setText("Ingrese su DNI");
        texto3.setSize(200, 25);
        texto3.setLocation(25, 75);

        JLabel texto4 = new JLabel();
        texto4.setText("Ingrese su Telefono");
        texto4.setSize(200, 25);
        texto4.setLocation(25, 100);

        JLabel texto5 = new JLabel("Ingrese su direccion");
        texto5.setSize(200, 25);
        texto5.setLocation(25, 125);

        JTextField c1 = new JTextField();
        c1.setSize(200,25);
        c1.setLocation(225,25);

        JTextField c2 = new JTextField();
        c2.setSize(200,25);
        c2.setLocation(225,50);

        JTextField c3 = new JTextField();
        c3.setSize(200,25);
        c3.setLocation(225,75);

        JTextField c4 = new JTextField();
        c4.setSize(200,25);
        c4.setLocation(225,100);

        JTextField c5 = new JTextField();
        c5.setSize(200,25);
        c5.setLocation(225,125);

        JButton boton = new JButton("Imprimir los datos");
        boton.setBounds(25,200,200,33);

        JLabel respuesta = new JLabel();
        respuesta.setSize(1250,200);
        respuesta.setLocation(25,250);

        ventana.add(texto);
        ventana.add(texto2);
        ventana.add(texto3);
        ventana.add(texto4);
        ventana.add(texto5);
        ventana.add(c1);
        ventana.add(c2);
        ventana.add(c3);
        ventana.add(c4);
        ventana.add(c5);
        ventana.add(boton);
        ventana.add(respuesta);
        ventana.setVisible(true);


        boton.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String texto = c1.getText();
                        String texto2 = c2.getText();
                        String texto3 = c3.getText();
                        String texto4 = c4.getText();
                        String texto5 = c5.getText();
                        p1.setNombre(texto);
                        p1.setEdad(Integer.parseInt(texto2));
                        p1.setDni(Integer.parseInt(texto3));
                        p1.setTelefono(Integer.parseInt(texto4));
                        p1.setDireccion(texto5);
                        texto = "Nombre: " + texto + " | " + "Edad: " + texto2 + " | " + "Dni: " + texto3 + " | " + "Telefono: " + texto4 + " | " + "Direccion: " + texto5;
                        respuesta.setText(texto);
                    }
                });
    }
}
