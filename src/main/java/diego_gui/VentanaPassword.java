package diego_gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class VentanaPassword extends JFrame{
    private JPanel panel1;
    private JLabel titulo,us,pas;
    private JTextField cajonus,cajonPass;
    private JButton botAcep, botCan;
    private String usuario="Diego",password="12345";
    public ActionListener accion,cancel;
    private JFrame ventana1,ventana2;
    private byte contador;
    public  VentanaPassword(){
        ventana1=new JFrame();
        ventana1.setVisible(true);
        ventana1.setSize(310,220);
        ventana1.setTitle("LOGIN");
        ventana1.setLocationRelativeTo(null);
        ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();
    }
    private void componentes(){
        lienzo();
        encabezados();
        cajones();
        botones();
    }
    private void lienzo(){
        panel1=new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel1);
        ventana1.add(panel1);
        
    } 
    private void encabezados(){
        titulo=new JLabel();
        panel1.setLayout(null);
        titulo.setBounds(50,10,300,20);
        titulo.setText("INICIA SESIÓN");
        titulo.setForeground(Color.PINK);
        titulo.setFont(new Font("Broadway",Font.ITALIC,25));
        panel1.add(titulo);
        
        us=new JLabel();
        us.setText("USUARIO");
        us.setBounds(15,20,100,100);
        us.setForeground(Color.white);
        us.setFont(new Font("Bernard MT Condensed",Font.BOLD,20));
        panel1.add(us);
        
        pas=new JLabel();
        pas.setText("PASSWORD");
        pas.setBounds(15,50,110,100);
        pas.setForeground(Color.WHITE);
        pas.setFont(new Font("Bernard MT Condensed",Font.BOLD,20));
        panel1.add(pas);
    }
    private void cajones(){
        cajonus=new JTextField();
        cajonus.setBounds(115,60,150,20);
        cajonus.setBackground(Color.WHITE);
        panel1.add(cajonus);
        cajonPass=new JTextField();
        cajonPass.setBounds(115,90,150,20);
        cajonPass.setBackground(Color.WHITE);
        panel1.add(cajonPass);
    }
    private void botones(){
        botAcep=new JButton();
        botAcep.setText("ACEPTAR");
        botAcep.setBounds(50,135,90,20);
        panel1.add(botAcep);
        contador=0;
        //agregacion de eventos al boton
        accion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usuario.equals(cajonus.getText())&&password.equals(cajonPass.getText())){
                    JOptionPane.showMessageDialog(null,"Iniciando Sesíon");
                    ventana1.dispose();
                    secondVen();
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña"
                            + " incorrectos");
                    JOptionPane.showMessageDialog(null,"Verifica por favor");
                    cajonus.setText(null);
                    cajonPass.setText(null);
                    if(contador==3){
                        ventana1.dispose();
                    }else{
                        contador+=1;
                    }
                }
            }
        };
        //agregar contador de numero de veces que da aceptar
        botAcep.addActionListener(accion);
        //boton cancelar
        botCan=new JButton();
        botCan.setText("CANCELAR");
        botCan.setBounds(150,135,100,20);
        panel1.add(botCan);
        // hacer que se borre todo al clikear cancelar
        cancel=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cajonus.setText(null);
                cajonPass.setText(null);
            }
        };
        botCan.addActionListener(cancel);
    }
    private void secondVen(){
        ventana2=new JFrame();
        ventana2.setVisible(true);
        ventana2.setLocationRelativeTo(null);
        ventana2.setSize(450,380);
        ventana2.setTitle("Organizador/agenda");
        ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[]args){
        VentanaPassword call = new VentanaPassword();
        
    }
}
