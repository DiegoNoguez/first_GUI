package diego_gui;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class VentanaHorario extends JFrame {
    private JFrame agenda;
    private JLabel titulo;
    private JPanel lienzo;
    public VentanaHorario(){
        agenda =new JFrame("AGENDA");
        panel();
        agenda.setVisible(true);
        agenda.setLocation(425,110);
        agenda.setSize(552,450);
        agenda.setDefaultCloseOperation(EXIT_ON_CLOSE);
        agenda.add(lienzo);
    }
    private void panel(){
        lienzo=new JPanel();
        lienzo.setBackground(Color.orange);
        getContentPane().add(lienzo);
        
    }
    
}
