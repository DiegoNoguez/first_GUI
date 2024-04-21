package diego_gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Event;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
public class VentanaHorario extends JFrame {
    private ImageIcon creed,mast;
    private JTextField gru;
    private JFrame agenda;
    private JLabel bienvenida,titulo,enca,horario,act,pruebas,pru;
    private String horas[]={"7:00","8:00","9:00","10:00","11:00","12:00","13:00",
    "14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00"};
    private JPanel lienzo,d1,d2,d3,d4,d5,d6,d7;
    private JComboBox hora=new JComboBox(horas);
    private ActionListener adar,clean,cleanActi;
    private JTabbedPane general;
    private JLabel mon=new JLabel("Actividad");
    private JLabel time=new JLabel("Hora");
    private JButton agregar=new JButton("Agregar");
    private JButton limpiar=new JButton("Limpiar");
    private JButton borrar=new JButton("Borrar Actividad");
    private byte i;
    private short eje_y;
    public VentanaHorario(){
        panel();
        agenda =new JFrame("AGENDA");
        agenda.setVisible(true);
        agenda.setSize(825,710);
        agenda.setDefaultCloseOperation(EXIT_ON_CLOSE);
        agenda.add(lienzo);
    }
    private void panel(){
        lienzo=new JPanel();
        subpaneles();
        etiquetas();
        imagenes();
        lienzo.setLayout(null);
        lienzo.setBackground(Color.orange);
        getContentPane().add(lienzo);
        lienzo.add(general);
    }
    private void subpaneles(){
        d1=new JPanel();
        d1.setLayout(null);
        lunes();
        d2=new JPanel();
        d2.setLayout(null);
        d2.setBackground(Color.PINK);
        d3=new JPanel();
        d3.setLayout(null);
        d4=new JPanel();
        d4.setLayout(null);
        d4.setBackground(Color.PINK);
        d5=new JPanel();
        d5.setLayout(null);
        d6=new JPanel();
        d6.setLayout(null);
        d6.setBackground(Color.PINK);
        d7=new JPanel();
        d7.setLayout(null);
        general=new JTabbedPane();
        general.setBounds(7,114,750,710);
        general.setBackground(Color.cyan);
        general.add("LUNES",d1);
        general.add("MARTES",d2);
        general.add("MIERCOLES",d3);
        general.add("JUEVES",d4);
        general.add("VIERNES",d5);
        general.add("SABADO",d6);
        general.add("DOMINGO",d7);
        lienzo.add(general);
    }
    private void impresionHorario(){
        eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d1.add(horario);
            eje_y+=30;
        }
    }
    private void lunes(){
        impresionHorario();
        accionBotonesd1();
        mon.setBounds(12,8,90,30);
        mon.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d1.add(mon);
        time.setBounds(240,8,80,30);
        time.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d1.add(time);
        gru=new JTextField();
        gru.setBounds(10,40,200,30);
        d1.add(gru);
        hora.setBounds(240,40,60,30);
        d1.add(hora);
        agregar.setBounds(320,40,80,30);
        d1.add(agregar);
        limpiar.setBounds(410,40,95,30);
        d1.add(limpiar);
        borrar.setBounds(520,90,210,30);
        d1.add(borrar);
    }
    private void etiquetas(){
        titulo=new JLabel("HORARIO");
        titulo.setBounds(270,4,230,40);
        titulo.setFont(new Font("ROG Fonts",Font.CENTER_BASELINE,35));
        lienzo.add(titulo);
        
        bienvenida=new JLabel("Bienvenido Diego");
        bienvenida.setBounds(220,50,310,28);
        bienvenida.setFont(new Font("ROG Fonts",Font.ROMAN_BASELINE,26));
        lienzo.add(bienvenida);
        //subtitulo
        enca=new JLabel();
        enca.setText("INGRESA LAS ACTIVIDADES A REALIZAR Y SU RESPECTIVO"
                + " DÍA Y HORA");
        enca.setFont(new Font("Times New Roman",Font.TYPE1_FONT,20));
        enca.setBounds(10,90,700,30);
        lienzo.add(enca);
    }
    private void imagenes(){
        creed=new ImageIcon("creediv.png");
        JLabel con =new JLabel();
        con.setBounds(10,3,90,95);
        con.setIcon(new ImageIcon(creed.getImage().getScaledInstance(90, 90,Image.SCALE_SMOOTH)));
        lienzo.add(con);
        
        mast=new ImageIcon("gears.jpeg");
        JLabel contenedor=new JLabel();
        contenedor.setBounds(550,3,250,90);
        contenedor.setIcon(new ImageIcon(mast.getImage().getScaledInstance(250,90,Image.SCALE_SMOOTH)));
        lienzo.add(contenedor);
    }
    private void accionBotonesd1(){
        adar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                act=new JLabel();
                String opcion;
                opcion=(String) hora.getSelectedItem();
                switch(opcion){
                    case "7:00"->{
                        act.setBounds(60,90,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "8:00"->{
                        act.setBounds(60,120,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "9:00"->{
                        act.setBounds(60,150,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "10:00"->{
                        act.setBounds(60,180,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "11:00"->{
                        act.setBounds(60,210,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "12:00"->{
                        act.setBounds(60,240,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "13:00"->{
                        act.setBounds(60,270,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "14:00"->{
                        act.setBounds(60,300,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "15:00"->{
                        act.setBounds(60,330,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "16:00"->{
                        act.setBounds(60,360,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "17:00"->{
                        act.setBounds(60,390,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "18:00"->{
                        act.setBounds(60,420,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "19:00"->{
                        act.setBounds(60,450,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "20:00"->{
                        act.setBounds(60,480,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                    case "21:00"->{
                        act.setBounds(60,510,300,20);
                        act.setText(gru.getText());
                        d1.add(act);
                    }
                }
                updateComponentTreeUI(agenda);
            } 
        };
        agregar.addActionListener(adar);
        clean=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gru.setText(null);
            }  
        };
        limpiar.addActionListener(clean);
        cleanActi=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion;
                opcion=(String) hora.getSelectedItem();
                switch(opcion){
                    case "7:00"->{
                        act.setText(null);
                    }
                    case "8:00"->{
                        act.setText(null);
                    }
                    case "9:00"->{
                        act.setText(null);
                    }
                    case "10:00"->{
                        act.setText(null);
                    }
                    case "11:00"->{
                        act.setText(null);
                    }
                    case "12:00"->{
                        act.setText(null);
                    }
                    case "13:00"->{
                        act.setText(null);
                    }
                    case "14:00"->{
                        act.setText(null);
                    }
                    case "15:00"->{
                        act.setText(null);
                    }
                    case "16:00"->{
                        act.setText(null);
                    }
                    case "17:00"->{
                        act.setText(null);
                    }
                    case "18:00"->{
                        act.setText(null);
                    }
                    case "19:00"->{
                        act.setText(null);
                    }
                    case "20:00"->{
                        act.setText(null);
                    }
                    case "21:00"->{
                        act.setText(null);
                    }
                }
            }
        };
        borrar.addActionListener(cleanActi);
        
    }
}
