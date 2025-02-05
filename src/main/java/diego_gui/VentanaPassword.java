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
import javax.swing.JPasswordField;
public class VentanaPassword extends JFrame{
    private JPanel panel1,panel2;
    private JLabel titulo,us,pas;
    private JTextField cajonus;
    private JButton botAcep, botCan;
    private JPasswordField cajonPass;
    private String usuario="Diego",password="615lopez278";
    public ActionListener accion,cancel;
    private JFrame ventana1,ventana2;
    private byte contador;
    public  VentanaPassword(){
        ventana1=new JFrame();
        lienzo();
        ventana1.setVisible(true);
        ventana1.setSize(310,220);
        ventana1.setTitle("LOGIN");
        ventana1.setLocationRelativeTo(null);
        ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana1.add(panel1);
    }
    private void componentes(){
        encabezados();
        cajones();
        botones();
    }
    private void lienzo(){
        panel1=new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel1);
        componentes();
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
        cajonPass=new JPasswordField();
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
        //agregacion de eventos al boton de aeptar y contador de errores
        accion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usuario.equals(cajonus.getText())&&password.equals(cajonPass.getText())){
                    JOptionPane.showMessageDialog(null,"INICIANDO SESION");
                    ventana1.dispose();
                    VentanaHorario llamada =new VentanaHorario();
                }else{//esta es una clase anonima ya que esta destro de un metodo
                    JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA"
                            + " INCORRECTOS");
                    cajonus.setText(null);
                    cajonPass.setText(null);
                    if(contador==3){
                        ventana1.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"Verifica por favor");
                        contador+=1;
                    }
                }
            }
        };
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
    
    public static void main(String[]args){
        VentanaPassword call = new VentanaPassword();
    }
}
