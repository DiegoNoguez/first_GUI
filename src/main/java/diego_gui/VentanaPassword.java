package diego_gui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
public class VentanaPassword extends JFrame{
    private JPanel panel1;
    private JLabel titulo,us,pas;
    private JTextField cajonus,cajonPass;
    private JButton botAcep, botCan;
    public  VentanaPassword(){
        this.setVisible(true);
        this.setSize(310,220);
        this.setTitle("LOGIN");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();
    }
    private void componentes(){
        lienzo();
        encabezados();
        cajones();
    }
    private void lienzo(){
        panel1=new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel1);
        
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
        
    }
    public static void main(String[]args){
        VentanaPassword call = new VentanaPassword();
        
    }
}
