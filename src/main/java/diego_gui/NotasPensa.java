package diego_gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
public class NotasPensa extends VentanaHorario implements Tvent, Componentes{
    //atributos
    private JFrame not;
    private JPanel pan;
    //area de texto
    private JTextArea escribir;
    //botones
    private JButton cerr;
    //listners 
    private ActionListener cls;
    //etiquetas
    private JLabel title;
    //constructor
    public NotasPensa(){
        general();
    }
    //metodos de la propia clase 
    private void general(){
        tVent();
    }
    //metodos de interface
    @Override
    public void tVent() {
        tPan();
        not=new JFrame();
        not.setVisible(true);
        not.setSize(320,320);
        not.setLocation(330,50);
        not.add(pan);
    }

    @Override
    public void tPan() {
        pan=new JPanel();
        pan.setLayout(null);
        pan.setBackground(Color.BLACK);
        botones();
        tetiquet();
        areaste();
        getContentPane().add(pan);
    }

    @Override
    public void areaste() {
        escribir=new JTextArea();
        escribir.setBounds(10,60,270,150);
        pan.add(escribir);
    }

    @Override
    public void tetiquet() {
        title=new JLabel();
        title.setText("Que piensa el día de hoy");
        title.setFont(new Font("Arial Black",Font.CENTER_BASELINE,18));
        title.setForeground(Color.WHITE);
        title.setBounds(30,12,300,30);
        pan.add(title);
    }

    @Override
    public void tcheck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cajoncitos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void botones() {
        cerr=new JButton();
        cerr.setText("Cerrar");
        cerr.setBounds(150,225,89,30);
        cls=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               not.dispose();
            }
        };
        cerr.addActionListener(cls);
        pan.add(cerr);
    }
    
    
}
