package diego_gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class AditamentosH extends VentanaHorario implements Componentes, OpeBas, Tvent {
    private JFrame ventana;
    private JPanel p;
    private JTextField ca1,ca2,result;
    private JLabel titulo,can1,can2;
    private JButton cerrar;
    private ActionListener close,re;
    private int r;
    public AditamentosH(){
        tVent();
    }
    @Override
    public void areaste() {  
    }
    @Override
    public void tetiquet() {
        titulo =new JLabel("GESTIÓN DE GASTOS");
        titulo.setBounds(120,8,260,30);
        titulo.setFont(new Font("Arial Black",Font.CENTER_BASELINE,20));
        titulo.setForeground(Color.WHITE);
        p.add(titulo);
        
        can1=new JLabel("Ingreso");
        can1.setBounds(4,40,97,30);
        can1.setFont(new Font("Arial Black",Font.BOLD,16));
        can1.setForeground(Color.WHITE);
        p.add(can1);
        
        can2=new JLabel("Gasto");
        can2.setBounds(225,40,85,30);
        can2.setFont(new Font("Arial Black",Font.BOLD,16));
        can2.setForeground(Color.WHITE);
        p.add(can2);
        
    }

    @Override
    public void tcheck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void suma() {
        
    }

    @Override
    public void resta() {
        short n1,n2;
        n1=Short.parseShort(ca1.getText());
        n2=Short.parseShort(ca2.getText());
        r=n1-n2;
    }

    @Override
    public void multi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void divid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tVent() {
        tPan();
        ventana=new JFrame();
        ventana.setVisible(true);
        ventana.setSize(480,400);
        ventana.setLocation(310, 45);
        ventana.add(p);
    }

    @Override
    public void tPan() {
        p=new JPanel();
        p.setLayout(null);
        cajoncitos();
        tetiquet();
        botones();
        p.setBackground(Color.GRAY);
        getContentPane().add(p);
    }

    @Override
    public void cajoncitos() {
        ca1=new JTextField();
        ca1.setBounds(75,44,100,20);
        p.add(ca1);
        ca2=new JTextField();
        ca2.setBounds(310,45,100,20);
        p.add(ca2);
    }

    @Override
    public void botones() {
        cerrar=new JButton();
        cerrar.setText("Cerrar");
        cerrar.setBounds(320,300,100,20);
        close=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        };
        cerrar.addActionListener(close);
        p.add(cerrar);
        
        JButton restar =new JButton();
        restar.setText("RESTAR");
        restar.setBounds(100,290,100,30);
        re=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                resta();
                JLabel resultado=new JLabel();
                resultado.setText("Lo que te resta es "+r);
                resultado.setFont(new Font("Arial Black",Font.CENTER_BASELINE,18));
                resultado.setBounds(100,150,250,30);
                resultado.setForeground(Color.WHITE);
                p.add(resultado);
                p.repaint();
                p.revalidate();
            }
        };
        restar.addActionListener(re);
        p.add(restar);
        
    }

}
