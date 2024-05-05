package diego_gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
public class Humor extends VentanaHorario implements Tvent, Componentes {
    private JFrame ve;
    private JPanel pa;
    private JLabel title;
    private JButton cerk;
    private JCheckBox estados,est,est2,est3,est4,est5;
    private ActionListener cx;
    public Humor(){
        general();
    }
    private void general(){
        tVent();
    }
    @Override
    public void tVent() {
        ve=new JFrame();
        tPan();
        ve.setVisible(true);
        ve.setSize(420,370);
        ve.setLocation(330,50); 
        ve.add(pa);
    }

    @Override
    public void tPan() {
        pa=new JPanel();
        pa.setLayout(null);
        tcheck();
        tetiquet();
        botones();
        pa.setBackground(Color.GRAY);
        getContentPane().add(pa);
    }

    @Override
    public void areaste() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tetiquet() {
        title=new JLabel();
        title.setText("COMO TE ENCUENTRAS EL DÍA DE HOY");
        title.setFont(new Font("Arial Balck",Font.CENTER_BASELINE,18));
        title.setForeground(Color.WHITE);
        title.setBounds(5,12,400,30);
        pa.add(title);
    }

    @Override
    public void tcheck() {
        estados=new JCheckBox();
        estados.setText("Feliz");
        estados.setBounds(16,60,100,30);
        pa.add(estados);
        est=new JCheckBox();
        est.setText("Contento");
        est.setBounds(16,90,100,30);
        pa.add(est);
        est2=new JCheckBox();
        est2.setText("Aburrido");
        est2.setBounds(16,120,100,30);
        pa.add(est2);
        est3=new JCheckBox();
        est3.setText("Triste");
        est3.setBounds(16,150,100,30);
        pa.add(est3);
        est4=new JCheckBox();
        est4.setText("Sin animos");
        est4.setBounds(16,180,100,30);
        pa.add(est4);
        est5=new JCheckBox();
        est5.setBounds(16,210,100,30);
        est5.setText("NO LO SE ");
        pa.add(est5);
    }

    @Override
    public void cajoncitos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void botones() {
        cerk=new JButton();
        cerk.setText("Cerrar");
        cerk.setBounds(215,300,90,30);
        cx=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               ve.dispose();
            }
        };
        cerk.addActionListener(cx);
        pa.add(cerk);
    }
    
}
