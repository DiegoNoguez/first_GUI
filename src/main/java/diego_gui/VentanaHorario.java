package diego_gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;
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
    private JTextField gru,g2;
    private JFrame agenda;
    //labels var
    private JLabel ac3,ac4,ac5,ac6,ac7;
    private JLabel bienvenida,titulo,enca,horario,act,ac2,et,hr;
    private String horas[]={"7:00","8:00","9:00","10:00","11:00","12:00","13:00",
    "14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00"};
    //PANELES
    private JPanel lienzo,d1,d2,d3,d4,d5,d6,d7;
    private JTabbedPane general;
    //combobox
    private JComboBox hora=new JComboBox(horas);
    private JComboBox hora2=new JComboBox(horas);
    private JComboBox htgr=new JComboBox(horas);
    private JComboBox hrs=new JComboBox(horas);
    private JComboBox hora5=new JComboBox(horas);
    private JComboBox hora6=new JComboBox(horas);
    private JComboBox hora7=new JComboBox(horas);
    //textield 
    private JTextField g3=new JTextField();
    private JTextField g4=new JTextField();
    private JTextField g5=new JTextField();
    private JTextField g6=new JTextField();
    private JTextField g7=new JTextField();
    //action lISTENER
    private ActionListener adar,clean,cleanActi,ad2,cl2,clA2,ad3,ad4,ad5,ad6,ad7;
    private ActionListener cl3,cl4,cl5,cl6,cl7;
    private ActionListener cla3,cla4,cla5,cla6,cla7;
    private ActionListener ga,no,hum;
    //LABELS Y BOTONES
    private JLabel mon=new JLabel("Actividad");
    private JLabel time=new JLabel("Hora");
    private JButton agregar=new JButton("Agregar");
    private JButton limpiar=new JButton("Limpiar");
    private JButton borrar=new JButton("Borrar Actividad");
    private JButton agreg =new JButton();
    private JButton limpin =new JButton();
    private JButton borr=new JButton();
    //VARIABLES DE CICLOS Y EJE
    private byte i;
    private short eje_y;
    public VentanaHorario(){
        panel();
        agenda =new JFrame("AGENDA");
        agenda.setVisible(true);
        agenda.setSize(900,710);
        agenda.setDefaultCloseOperation(EXIT_ON_CLOSE);
        agenda.add(lienzo);
    }
    private void panel(){
        lienzo=new JPanel();
        subpaneles();
        etiquetas();
        imagenes();
        botonesAdita();
        lienzo.setLayout(null);
        lienzo.setBackground(Color.orange);
        getContentPane().add(lienzo);
        lienzo.add(general);
    }
    private void botonesAdita(){
        JButton bControl=new JButton();
        bControl.setBounds(760,150,100,40);
        bControl.setText("Gastos");
        ga =new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AditamentosH lic=new AditamentosH();
            }
        };
        bControl.addActionListener(ga);
        lienzo.add(bControl);
        
        //creacion del boton de notas rapidas
        JButton bnotes=new JButton();
        bnotes.setBounds(760,350,100,40);
        bnotes.setText("Notas");
        lienzo.add(bnotes);
        
        //Boton de estado de animo
        JButton banimo=new JButton();
        banimo.setText("Estado Animo");
        banimo.setBounds(760,550,120,40);
        lienzo.add(banimo);
    }
    private void subpaneles(){
        d1=new JPanel();
        d1.setLayout(null);
        lunes();
        d2=new JPanel();
        d2.setLayout(null);
        d2.setBackground(Color.PINK);
        martes();
        d3=new JPanel();
        d3.setLayout(null);
        miercoles();
        d4=new JPanel();
        d4.setLayout(null);
        d4.setBackground(Color.PINK);
        jueves();
        d5=new JPanel();
        viernes();
        d5.setLayout(null);
        d6=new JPanel();
        sabado();
        d6.setLayout(null);
        d6.setBackground(Color.PINK);
        d7=new JPanel();
        domingo();
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
    private void impred2(){
      eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d2.add(horario);
            eje_y+=30;
        }  
    }
    private void imh3(){
        eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d3.add(horario);
            eje_y+=30;
        }
    }
    private void imh4(){
        eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d4.add(horario);
            eje_y+=30;
        }
    }
    private void imh5(){
        eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d5.add(horario);
            eje_y+=30;
        }
    }
    private void imh6(){
        eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d6.add(horario);
            eje_y+=30;
        }
    }
    private void imh7(){
        eje_y=90;
        for(i=0;i<=14;i++){
            horario=new JLabel();
            horario.setText(horas[i]);
            horario.setBounds(8,eje_y,40,20);
            d7.add(horario);
            eje_y+=30;
        }
    }
    private void lunes(){
        impresionHorario();
        acD1();
        mon.setBounds(12,8,90,30);
        mon.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d1.add(mon);
        time.setBounds(240,8,80,30);
        time.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d1.add(time);
        gru=new JTextField();
        gru.setBounds(10,40,200,30);
        d1.add(gru);
        hora=new JComboBox(horas);
        hora.setBounds(240,40,60,30);
        d1.add(hora);
        agregar.setBounds(320,40,80,30);
        d1.add(agregar);
        limpiar.setBounds(410,40,95,30);
        d1.add(limpiar);
        borrar.setBounds(520,40,210,30);
        d1.add(borrar);
    }
    private void martes(){
        acD2();
        et=new JLabel("Actividad");
        et.setBounds(12,8,90,30);
        et.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d2.add(et);
        hr=new JLabel("Hora");
        hr.setBounds(240,8,80,30);
        hr.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d2.add(hr);
        g2=new JTextField();
        g2.setBounds(10,40,200,30);
        d2.add(g2);
        hora2=new JComboBox(horas);
        hora2.setBounds(240,40,60,30);
        d2.add(hora2);
        impred2();
    }
    private void miercoles(){
        acD3();
        imh3();
        JLabel ertt=new JLabel("Actividad");
        ertt.setBounds(12,8,90,30);
        ertt.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d3.add(ertt);
        JLabel htrr=new JLabel("Hora");
        htrr.setBounds(240,8,80,30);
        htrr.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d3.add(htrr);
        g3=new JTextField();
        g3.setBounds(10,40,200,30);
        d3.add(g3);
        htgr=new JComboBox(horas);
        htgr.setBounds(240,40,60,30);
        d3.add(htgr);
    }
    private void jueves(){
        acD4();
        imh4();
        JLabel ertt=new JLabel("Actividad");
        ertt.setBounds(12,8,90,30);
        ertt.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d4.add(ertt);
        hr=new JLabel("Hora");
        hr.setBounds(240,8,80,30);
        hr.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d4.add(hr);
        g4=new JTextField();
        g4.setBounds(10,40,200,30);
        d4.add(g4);
        hrs=new JComboBox(horas);
        hrs.setBounds(240,40,60,30);
        d4.add(hrs);
    }
    private void viernes(){
        acD5();
        imh5();
        et=new JLabel("Actividad");
        et.setBounds(12,8,90,30);
        et.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d5.add(et);
        hr=new JLabel("Hora");
        hr.setBounds(240,8,80,30);
        hr.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d5.add(hr);
        g5=new JTextField();
        g5.setBounds(10,40,200,30);
        d5.add(g5);
        hora5=new JComboBox(horas);
        hora5.setBounds(240,40,60,30);
        d5.add(hora5);
    }
    private void sabado(){
        acD6();
        imh6();
        et=new JLabel("Actividad");
        et.setBounds(12,8,90,30);
        et.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d6.add(et);
        hr=new JLabel("Hora");
        hr.setBounds(240,8,80,30);
        hr.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d6.add(hr);
        g6=new JTextField();
        g6.setBounds(10,40,200,30);
        d6.add(g6);
        hora6=new JComboBox(horas);
        hora6.setBounds(240,40,60,30);
        d6.add(hora6);
    }
    private void domingo(){
        acD7();
        imh7();
        et=new JLabel("Actividad");
        et.setBounds(12,8,90,30);
        et.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d7.add(et);
        hr=new JLabel("Hora");
        hr.setBounds(240,8,80,30);
        hr.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        d7.add(hr);
        g7=new JTextField();
        g7.setBounds(10,40,200,30);
        d7.add(g7);
        hora7=new JComboBox(horas);
        hora7.setBounds(240,40,60,30);
        d7.add(hora7);
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
    private void acD1(){
        adar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                act=new JLabel();
                String opcion;
                opcion=(String)hora.getSelectedItem();
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
                d1.add(gru);
            }
        };
        limpiar.addActionListener(clean);
        cleanActi=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion;
                opcion=(String)hora.getSelectedItem();
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
    private void acD2(){
        agreg=new JButton("Agregar");
        agreg.setBounds(320,40,80,30);
        d2.add(agreg);
        limpin=new JButton("Limpiar");
        limpin.setBounds(410,40,95,30);
        d2.add(limpin);
        borr=new JButton("Limpiar Actividad");
        borr.setBounds(520,40,210,30);
        d2.add(borr); 
        ad2=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ac2=new JLabel();
                String opcion2;
                opcion2=(String)hora2.getSelectedItem();
                switch(opcion2){
                    case "7:00"->{
                        ac2.setBounds(60,90,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "8:00"->{
                        ac2.setBounds(60,120,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "9:00"->{
                        ac2.setBounds(60,150,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "10:00"->{
                        ac2.setBounds(60,180,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "11:00"->{
                        ac2.setBounds(60,210,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "12:00"->{
                        ac2.setBounds(60,240,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "13:00"->{
                        ac2.setBounds(60,270,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "14:00"->{
                        ac2.setBounds(60,300,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "15:00"->{
                        ac2.setBounds(60,330,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "16:00"->{
                        ac2.setBounds(60,360,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "17:00"->{
                        ac2.setBounds(60,390,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "18:00"->{
                        ac2.setBounds(60,420,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "19:00"->{
                        ac2.setBounds(60,450,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "20:00"->{
                        ac2.setBounds(60,480,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                    case "21:00"->{
                        ac2.setBounds(60,510,300,20);
                        ac2.setText(g2.getText());
                        d2.add(ac2);
                    }
                }
                updateComponentTreeUI(agenda);
            }
            
        };
        agreg.addActionListener(ad2);
        cl2=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                g2.setText(null);
            }  
        };
        limpin.addActionListener(cl2);
        clA2=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion2;
                opcion2=(String)hora2.getSelectedItem();
                switch(opcion2){
                    case "7:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "8:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "9:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "10:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "11:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "12:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "13:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "14:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "15:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "16:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "17:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "18:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "19:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "20:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                    case "21:00"->{
                        ac2.setText(null);
                        d2.add(ac2);
                    }
                }
            }
        };
        borr.addActionListener(clA2);
    }
    private void acD3(){
        JButton ragreg=new JButton("Agregar");
        ragreg.setBounds(320,40,80,30);
        d3.add(ragreg);
        JButton olimpin=new JButton("Limpiar");
        olimpin.setBounds(410,40,95,30);
        d3.add(olimpin);
        JButton tborr=new JButton("Limpiar Actividad");
        tborr.setBounds(520,40,210,30);
        d3.add(tborr);
        ad3=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ac3=new JLabel();
                String op3;
                op3=(String)htgr.getSelectedItem();
                switch(op3){
                    case "7:00"->{
                        ac3.setBounds(60,90,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "8:00"->{
                        ac3.setBounds(60,120,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "9:00"->{
                        ac3.setBounds(60,150,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "10:00"->{
                        ac3.setBounds(60,180,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "11:00"->{
                        ac3.setBounds(60,210,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "12:00"->{
                        ac3.setBounds(60,240,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "13:00"->{
                        ac3.setBounds(60,270,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "14:00"->{
                        ac3.setBounds(60,300,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "15:00"->{
                        ac3.setBounds(60,330,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "16:00"->{
                        ac3.setBounds(60,360,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "17:00"->{
                        ac3.setBounds(60,390,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "18:00"->{
                        ac3.setBounds(60,420,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "19:00"->{
                        ac3.setBounds(60,450,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "20:00"->{
                        ac3.setBounds(60,480,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                    case "21:00"->{
                        ac3.setBounds(60,510,300,20);
                        ac3.setText(g3.getText());
                        d3.add(ac3);
                    }
                }
                updateComponentTreeUI(agenda);
            }
        };
        ragreg.addActionListener(ad3);
        cl3=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                g3.setText(null);
                d3.add(g3);
            }
        };
        olimpin.addActionListener(cl3);
        cla3=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String op3;
                op3=(String)htgr.getSelectedItem();
                switch(op3){
                    case "7:00"->{
                        ac3.setText(null);
                    }
                    case "8:00"->{
                        ac3.setText(null);
                    }
                    case "9:00"->{
                        ac3.setText(null);
                    }
                    case "10:00"->{
                        ac3.setText(null);
                    }
                    case "11:00"->{
                        ac3.setText(null);
                    }
                    case "12:00"->{
                        ac3.setText(null);
                    }
                    case "13:00"->{
                        ac3.setText(null);
                    }
                    case "14:00"->{
                        ac3.setText(null);
                    }
                    case "15:00"->{
                        ac3.setText(null);
                    }
                    case "16:00"->{
                        ac3.setText(null);
                    }
                    case "17:00"->{
                        ac3.setText(null);
                    }
                    case "18:00"->{
                        ac3.setText(null);
                    }
                    case "19:00"->{
                        ac3.setText(null);
                    }
                    case "20:00"->{
                        ac3.setText(null);
                    }
                    case "21:00"->{
                        ac3.setText(null);
                    }
                }
            }
        };
        tborr.addActionListener(cla3);
    }
    private void acD4(){
        JButton agregu=new JButton("Agregar");
        agregu.setBounds(320,40,80,30);
        d4.add(agregu);
        JButton clelimpin=new JButton("Limpiar");
        clelimpin.setBounds(410,40,95,30);
        d4.add(clelimpin);
        JButton buorr=new JButton("Limpiar Actividad");
        buorr.setBounds(520,40,210,30);
        d4.add(buorr);
        ad4=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ac4=new JLabel();
                String op4;
                op4=(String)hrs.getSelectedItem();
                switch(op4){
                    case "7:00"->{
                        ac4.setBounds(60,90,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "8:00"->{
                        ac4.setBounds(60,120,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "9:00"->{
                        ac4.setBounds(60,150,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "10:00"->{
                        ac4.setBounds(60,180,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "11:00"->{
                        ac4.setBounds(60,210,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "12:00"->{
                        ac4.setBounds(60,240,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "13:00"->{
                        ac4.setBounds(60,270,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "14:00"->{
                        ac4.setBounds(60,300,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "15:00"->{
                        ac4.setBounds(60,330,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "16:00"->{
                        ac4.setBounds(60,360,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "17:00"->{
                        ac4.setBounds(60,390,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "18:00"->{
                        ac4.setBounds(60,420,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "19:00"->{
                        ac4.setBounds(60,450,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "20:00"->{
                        ac4.setBounds(60,480,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                    case "21:00"->{
                        ac4.setBounds(60,510,300,20);
                        ac4.setText(g4.getText());
                        d4.add(ac4);
                    }
                }
                updateComponentTreeUI(agenda);
            }
        };
        agregu.addActionListener(ad4);
        cl4=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                g4.setText(null);
                d4.add(g4);
            }
        };
        clelimpin.addActionListener(cl4);
        cla4=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String op4;
                op4=(String)hrs.getSelectedItem();
                switch(op4){
                    case "7:00"->{
                        ac4.setText(null);
                    }
                    case "8:00"->{
                        ac4.setText(null);
                    }
                    case "9:00"->{
                        ac4.setText(null);
                    }
                    case "10:00"->{
                        ac4.setText(null);
                    }
                    case "11:00"->{
                        ac4.setText(null);
                    }
                    case "12:00"->{
                        ac4.setText(null);
                    }
                    case "13:00"->{
                        ac4.setText(null);
                    }
                    case "14:00"->{
                        ac4.setText(null);
                    }
                    case "15:00"->{
                        ac4.setText(null);
                    }
                    case "16:00"->{
                        ac4.setText(null);
                    }
                    case "17:00"->{
                        ac4.setText(null);
                    }
                    case "18:00"->{
                        ac4.setText(null);
                    }
                    case "19:00"->{
                        ac4.setText(null);
                    }
                    case "20:00"->{
                        ac4.setText(null);
                    }
                    case "21:00"->{
                        ac4.setText(null);
                    }
                }
            }
        };
        buorr.addActionListener(cla4);
    }
    private void acD5(){
        JButton atgreg=new JButton("Agregar");
        atgreg.setBounds(320,40,80,30);
        d5.add(atgreg);
        JButton lhimpin=new JButton("Limpiar");
        lhimpin.setBounds(410,40,95,30);
        d5.add(lhimpin);
        JButton boutrr=new JButton("Limpiar Actividad");
        boutrr.setBounds(520,40,210,30);
        d5.add(boutrr);
        ad5=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ac5=new JLabel();
                String op5;
                op5=(String)hora5.getSelectedItem();
                switch(op5){
                    case "7:00"->{
                        ac5.setBounds(60,90,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "8:00"->{
                        ac5.setBounds(60,120,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "9:00"->{
                        ac5.setBounds(60,150,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "10:00"->{
                        ac5.setBounds(60,180,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "11:00"->{
                        ac5.setBounds(60,210,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "12:00"->{
                        ac5.setBounds(60,240,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "13:00"->{
                        ac5.setBounds(60,270,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac4);
                    }
                    case "14:00"->{
                        ac5.setBounds(60,300,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "15:00"->{
                        ac5.setBounds(60,330,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "16:00"->{
                        ac5.setBounds(60,360,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "17:00"->{
                        ac5.setBounds(60,390,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "18:00"->{
                        ac5.setBounds(60,420,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "19:00"->{
                        ac5.setBounds(60,450,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "20:00"->{
                        ac5.setBounds(60,480,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                    case "21:00"->{
                        ac5.setBounds(60,510,300,20);
                        ac5.setText(g5.getText());
                        d5.add(ac5);
                    }
                }
                updateComponentTreeUI(agenda);
            }
        };
        atgreg.addActionListener(ad5);
        cl5=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                g5.setText(null);
                d5.add(g5);
            }
        };
        lhimpin.addActionListener(cl5);
        cla5 =new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String op5;
                op5=(String)hora5.getSelectedItem();
                switch(op5){
                    case "7:00"->{
                        ac5.setText(null);
                    }
                    case "8:00"->{
                        ac5.setText(null);
                    }
                    case "9:00"->{
                        ac5.setText(null);
                    }
                    case "10:00"->{
                        ac5.setText(null);
                    }
                    case "11:00"->{
                        ac5.setText(null);
                    }
                    case "12:00"->{
                        ac5.setText(null);
                    }
                    case "13:00"->{
                        ac5.setText(null);
                    }
                    case "14:00"->{
                        ac5.setText(null);
                    }
                    case "15:00"->{
                        ac5.setText(null);
                    }
                    case "16:00"->{
                        ac5.setText(null);
                    }
                    case "17:00"->{
                        ac5.setText(null);
                    }
                    case "18:00"->{
                        ac5.setText(null);
                    }
                    case "19:00"->{
                        ac5.setText(null);
                    }
                    case "20:00"->{
                        ac5.setText(null);
                    }
                    case "21:00"->{
                        ac5.setText(null);
                    }
                }
            }
        };
        boutrr.addActionListener(cla5);
    }
    private void acD6(){
        JButton hagreg=new JButton("Agregar");
        hagreg.setBounds(320,40,80,30);
        d6.add(hagreg);
        JButton nmlimpin=new JButton("Limpiar");
        nmlimpin.setBounds(410,40,95,30);
        d6.add(nmlimpin);
        JButton borerr=new JButton("Limpiar Actividad");
        borerr.setBounds(520,40,210,30);
        d6.add(borerr);
        ad6=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ac6=new JLabel();
                String op6;
                op6=(String)hora6.getSelectedItem();
                switch(op6){
                    case "7:00"->{
                        ac6.setBounds(60,90,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "8:00"->{
                        ac6.setBounds(60,120,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "9:00"->{
                        ac6.setBounds(60,150,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "10:00"->{
                        ac6.setBounds(60,180,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "11:00"->{
                        ac6.setBounds(60,210,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "12:00"->{
                        ac6.setBounds(60,240,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "13:00"->{
                        ac6.setBounds(60,270,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "14:00"->{
                        ac6.setBounds(60,300,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "15:00"->{
                        ac6.setBounds(60,330,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "16:00"->{
                        ac6.setBounds(60,360,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "17:00"->{
                        ac6.setBounds(60,390,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "18:00"->{
                        ac6.setBounds(60,420,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "19:00"->{
                        ac6.setBounds(60,450,300,20);
                        ac6.setText(g4.getText());
                        d6.add(ac6);
                    }
                    case "20:00"->{
                        ac6.setBounds(60,480,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                    case "21:00"->{
                        ac6.setBounds(60,510,300,20);
                        ac6.setText(g6.getText());
                        d6.add(ac6);
                    }
                }
                updateComponentTreeUI(agenda);
            }
        };
        hagreg.addActionListener(ad6);
        cl6=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                g6.setText(null);
                d6.add(g6);
            }
        };
        nmlimpin.addActionListener(cl6);
        cla6 =new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String op6;
                op6=(String)hora6.getSelectedItem();
                switch(op6){
                    case "7:00"->{
                        ac6.setText(null);
                    }
                    case "8:00"->{
                        ac6.setText(null);
                    }
                    case "9:00"->{
                        ac6.setText(null);
                    }
                    case "10:00"->{
                        ac6.setText(null);
                    }
                    case "11:00"->{
                        ac6.setText(null);
                    }
                    case "12:00"->{
                        ac6.setText(null);
                    }
                    case "13:00"->{
                        ac6.setText(null);
                    }
                    case "14:00"->{
                        ac6.setText(null);
                    }
                    case "15:00"->{
                        ac6.setText(null);
                    }
                    case "16:00"->{
                        ac6.setText(null);
                    }
                    case "17:00"->{
                        ac6.setText(null);
                    }
                    case "18:00"->{
                        ac6.setText(null);
                    }
                    case "19:00"->{
                        ac6.setText(null);
                    }
                    case "20:00"->{
                        ac6.setText(null);
                    }
                    case "21:00"->{
                        ac6.setText(null);
                    }
                }
            }
        };
    }
    private void acD7(){
        JButton reagreg=new JButton("Agregar");
        reagreg.setBounds(320,40,80,30);
        d7.add(reagreg);
        JButton gtlimpin=new JButton("Limpiar");
        gtlimpin.setBounds(410,40,95,30);
        d7.add(gtlimpin);
        JButton werborr=new JButton("Limpiar Actividad");
        werborr.setBounds(520,40,210,30);
        d7.add(werborr);
        ad7=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ac7=new JLabel();
                String op7;
                op7=(String)hora7.getSelectedItem();
                switch(op7){
                    case "7:00"->{
                        ac7.setBounds(60,90,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "8:00"->{
                        ac7.setBounds(60,120,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "9:00"->{
                        ac7.setBounds(60,150,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "10:00"->{
                        ac7.setBounds(60,180,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "11:00"->{
                        ac7.setBounds(60,210,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "12:00"->{
                        ac7.setBounds(60,240,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "13:00"->{
                        ac7.setBounds(60,270,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "14:00"->{
                        ac7.setBounds(60,300,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "15:00"->{
                        ac7.setBounds(60,330,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "16:00"->{
                        ac7.setBounds(60,360,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "17:00"->{
                        ac7.setBounds(60,390,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "18:00"->{
                        ac7.setBounds(60,420,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "19:00"->{
                        ac7.setBounds(60,450,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "20:00"->{
                        ac7.setBounds(60,480,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                    case "21:00"->{
                        ac7.setBounds(60,510,300,20);
                        ac7.setText(g7.getText());
                        d7.add(ac7);
                    }
                }
                updateComponentTreeUI(agenda);
            }
        };
        reagreg.addActionListener(ad7);
        cl7=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                g7.setText(null);
                d7.add(g7);
            }
        };
        gtlimpin.addActionListener(cl7);
        cla7 =new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String op7;
                op7=(String)hora7.getSelectedItem();
                switch(op7){
                    case "7:00"->{
                        ac7.setText(null);
                    }
                    case "8:00"->{
                        ac7.setText(null);
                    }
                    case "9:00"->{
                        ac7.setText(null);
                    }
                    case "10:00"->{
                        ac7.setText(null);
                    }
                    case "11:00"->{
                        ac7.setText(null);
                    }
                    case "12:00"->{
                        ac7.setText(null);
                    }
                    case "13:00"->{
                        ac7.setText(null);
                    }
                    case "14:00"->{
                        ac7.setText(null);
                    }
                    case "15:00"->{
                        ac7.setText(null);
                    }
                    case "16:00"->{
                        ac7.setText(null);
                    }
                    case "17:00"->{
                        ac7.setText(null);
                    }
                    case "18:00"->{
                        ac7.setText(null);
                    }
                    case "19:00"->{
                        ac7.setText(null);
                    }
                    case "20:00"->{
                        ac7.setText(null);
                    }
                    case "21:00"->{
                        ac7.setText(null);
                    }
                }
            }
        };
    }
    
}
