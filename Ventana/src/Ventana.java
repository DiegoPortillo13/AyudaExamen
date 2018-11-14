   //-- IMPORTAMOS LIBRERIAS QUE UTILIZAREMOS
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame { 
    //Declaracion de los componentes a usar
    private JButton Boton1 = new JButton("Boton 1");
    private JButton Boton2 = new JButton("Boton 2");
    private JButton Boton3 = new JButton("Boton 3");
    private JButton Boton4 = new JButton("Boton 4");
    private JButton Boton5 = new JButton("Boton 5");
    private JLabel Texto = new JLabel("Mi nombre");
    private JPanel Panel = new JPanel();
    public Ventana(){
        //Titulo
        setTitle("CBTis 122");
        //Tamaño de la ventana
        setSize(500, 500);
        //Para q no se pueda cmabiar el tamaño
        setResizable(false);
        //Para q se detenga cuanbdo cierres la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Contenedor para los componentes 
        Container Cont= getContentPane();
        SpringLayout layout = new SpringLayout();
        Cont.setLayout(layout);
        //Se le Agrega Las coordenadas donde va a ir 
        //Las coordenadas empiezan de la Esquina Sueperior IZQ
        layout.putConstraint(SpringLayout.WEST,Boton1, 50,SpringLayout.WEST,Cont);//Movimiento en X (IZQ o DER)
        layout.putConstraint(SpringLayout.NORTH,Boton1, 70,SpringLayout.NORTH,Cont);//Movimiento en Y(ARRIBA O ABAJO)
        
        layout.putConstraint(SpringLayout.WEST,Boton2, 50,SpringLayout.WEST,Cont);
        layout.putConstraint(SpringLayout.NORTH,Boton2, 100,SpringLayout.NORTH,Cont);
        
        layout.putConstraint(SpringLayout.WEST,Boton3, 50,SpringLayout.WEST,Cont);
        layout.putConstraint(SpringLayout.NORTH,Boton3, 130,SpringLayout.NORTH,Cont);
        
        layout.putConstraint(SpringLayout.WEST,Boton4, 300,SpringLayout.WEST,Cont);
        layout.putConstraint(SpringLayout.NORTH,Boton4, 70,SpringLayout.NORTH,Cont);
        
        layout.putConstraint(SpringLayout.WEST,Boton5, 300,SpringLayout.WEST,Cont);
        layout.putConstraint(SpringLayout.NORTH,Boton5, 100,SpringLayout.NORTH,Cont);
        
        layout.putConstraint(SpringLayout.WEST,Texto, 200,SpringLayout.WEST,Cont);
        layout.putConstraint(SpringLayout.NORTH,Texto, 30,SpringLayout.NORTH,Cont);
        
        Cont.add(Boton1);
        Cont.add(Boton2);
        Cont.add(Boton3);
        Cont.add(Boton4);
        Cont.add(Boton5);
        Cont.add(Texto);
        
    }
    public static void main(String[] args){
        Ventana init = new Ventana();
        init.setVisible(true);
    }
}


