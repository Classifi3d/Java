//Mustea Dumitru-Dan Lab12_1_1
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MusteaDan_Lab12_1_1 {
    public static void main(String[] args) {
        new MyFrame1();
         //! this is the same exercises I posed in lab11 because I added the functionality then

    }
}

class MyFrame1 {
    //variables
    static float result=0;
    static float input=0;

    MyFrame1() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab12_1_1");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.BLACK);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(new GridLayout(5,4));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //working calculator app
    //the order in which you use the buttons is a bit counter inttutive


    //buttons, labels and text fields
    Font f1 = new Font("Verdana", Font.BOLD, 24);
    JLabel inoutput1 = new JLabel("Input",JLabel.CENTER);
    inoutput1.setFont(f1);
    JTextField inoutput2 = new JTextField();
    JLabel inoutput3 = new JLabel("Output",JLabel.CENTER);
    inoutput3.setFont(f1);
    JTextField inoutput4 = new JTextField();
    JButton b0 = new JButton("0");
    b0.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input*=10;
            inoutput2.setText(String.valueOf(input));
        }  
    });    
    JButton b1 = new JButton("1");
    b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+1;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b2 = new JButton("2");
    b2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+2;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b3 = new JButton("3");    
    b3.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+3;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b4 = new JButton("4");    
    b4.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+4;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b5 = new JButton("5");    
    b5.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+5;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b6 = new JButton("6");    
    b6.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+6;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b7 = new JButton("7");    
    b7.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+7;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b8 = new JButton("8");

    b8.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+8;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b9 = new JButton("9");
    b9.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+9;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton bequ = new JButton("=");
    bequ.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            inoutput4.setText(String.valueOf(input));
            result=input;
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });   
    JButton bdel = new JButton("DEL");
    bdel.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=0;
            inoutput2.setText(String.valueOf(""));
            result=0;
            inoutput4.setText(String.valueOf(""));
        }  
    });  
    JButton badd = new JButton("+");
    badd.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result+input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    JButton bsub = new JButton("-");
    bsub.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result-input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    JButton bmul = new JButton("*");
    bmul.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result*input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    JButton bdiv = new JButton("/");
    bdiv.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result/input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    
    f.add(inoutput1);
    f.add(inoutput2);
    f.add(inoutput3);
    f.add(inoutput4);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(badd);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(bsub);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(bmul);
    f.add(bdel);
    f.add(b0);
    f.add(bequ);
    f.add(bdiv);
    
    f.setVisible(true);
}
}

//Mustea Dumitru-Dan Lab12_1_2
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class MusteaDan_Lab12_1_2 {
    public static void main(String[] args) {
        new MyFrame2();
         //! this is the same exercises I posed in lab11 because I added the functionality then

    }
}

class MyFrame2 {
    //variables
    static float result=0;
    static float input=0;
    GridBagConstraints gbc = new GridBagConstraints();
    MyFrame2() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab12_1_2");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.BLACK);
    f.setResizable(false);
    f.setSize(250,250);
    f.setLayout(new GridBagLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //working calculator app
    //the order in which you use the buttons is a bit counter inttutive


    //buttons, labels and text fields
    Font f1 = new Font("Arial", Font.BOLD, 14);
    JLabel inoutput1 = new JLabel("Input",JLabel.CENTER);
    inoutput1.setFont(f1);

    JTextField inoutput2 = new JTextField();
    inoutput2.setPreferredSize(new Dimension(40,20));
    JLabel inoutput3 = new JLabel("Output",JLabel.CENTER);
    inoutput3.setFont(f1);
    JTextField inoutput4 = new JTextField();
    inoutput4.setPreferredSize(new Dimension(40,20));
    JButton b0 = new JButton("0");
    b0.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input*=10;
            inoutput2.setText(String.valueOf(input));
        }  
    });    
    JButton b1 = new JButton("1");
    b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+1;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b2 = new JButton("2");
    b2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+2;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b3 = new JButton("3");    
    b3.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+3;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b4 = new JButton("4");    
    b4.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+4;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b5 = new JButton("5");    
    b5.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+5;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b6 = new JButton("6");    
    b6.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+6;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b7 = new JButton("7");    
    b7.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+7;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b8 = new JButton("8");

    b8.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+8;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton b9 = new JButton("9");
    b9.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=input*10+9;
            inoutput2.setText(String.valueOf(input));
        }  
    });  
    JButton bequ = new JButton("=");
    bequ.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            inoutput4.setText(String.valueOf(input));
            result=input;
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });   
    JButton bdel = new JButton("DEL");
    bdel.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            input=0;
            inoutput2.setText(String.valueOf(""));
            result=0;
            inoutput4.setText(String.valueOf(""));
        }  
    });  
    JButton badd = new JButton("+");
    badd.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result+input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    JButton bsub = new JButton("-");
    bsub.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result-input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    JButton bmul = new JButton("*");
    bmul.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result*input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    JButton bdiv = new JButton("/");
    bdiv.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            result=result/input;
            inoutput4.setText(String.valueOf(result));
            input=0;
            inoutput2.setText(String.valueOf(""));
        }  
    });  
    
    gbc.gridx=0;
    gbc.gridy=0;
    f.add(inoutput1,gbc);
    gbc.gridx=1;
    gbc.gridy=0;
    f.add(inoutput2,gbc);
    gbc.gridx=2;
    gbc.gridy=0;
    f.add(inoutput3,gbc);
    gbc.gridx=3;
    gbc.gridy=0;
    f.add(inoutput4,gbc);
    gbc.gridx=0;
    gbc.gridy=1;
    f.add(b1,gbc);
    gbc.gridx=1;
    gbc.gridy=1;
    f.add(b2,gbc);
    gbc.gridx=2;
    gbc.gridy=1;
    f.add(b3,gbc);
    gbc.gridx=3;
    gbc.gridy=1;
    f.add(badd,gbc);
    gbc.gridx=0;
    gbc.gridy=2;
    f.add(b4,gbc);
    gbc.gridx=1;
    gbc.gridy=2;
    f.add(b5,gbc);
    gbc.gridx=2;
    gbc.gridy=2;
    f.add(b6,gbc);
    gbc.gridx=3;
    gbc.gridy=2;
    f.add(bsub,gbc);
    gbc.gridx=0;
    gbc.gridy=4;
    f.add(b7,gbc);
    gbc.gridx=1;
    gbc.gridy=4;
    f.add(b8,gbc);
    gbc.gridx=2;
    gbc.gridy=4;
    f.add(b9,gbc);
    gbc.gridx=3;
    gbc.gridy=4;
    f.add(bmul,gbc);
    gbc.gridx=0;
    gbc.gridy=5;
    f.add(bdel,gbc);
    gbc.gridx=1;
    gbc.gridy=5;
    f.add(b0,gbc);
    gbc.gridx=2;
    gbc.gridy=5;
    f.add(bequ,gbc);
    gbc.gridx=3;
    gbc.gridy=5;
    f.add(bdiv,gbc);
    
    
    f.setVisible(true);
}
}

//Mustea Dumitru-Dan Lab12_1_3
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class MusteaDan_Lab12_1_3 {
    public static void main(String[] args) {
        new MyFrame3();
        //! this is the same exercises I posed in lab11 because I added the functionality then
    }
}

class MyFrame3 {

    MyFrame3() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab12_1_3");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.BLACK);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(new GridLayout(1,1));
    JTabbedPane tp = new JTabbedPane();
    f.add(tp);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    //tab1
    tp.addTab("Drawing",p1);
    MyCanvas1 c = new MyCanvas1();
    JButton b1 = new JButton("Draw");


    //tab2
    tp.addTab("Font",p2);
    String[] myFontList = { "Century Gothic", "Helvetica", "Calibri", "Arial", "Times New Roman" };
    Arrays.sort(myFontList);
    JComboBox<String> cmb1 = new JComboBox<String>(myFontList);
    cmb1.setSelectedIndex(-1);
    String[] mySizeList = { "4", "8", "10", "11", "12", "14", "28","36","72" };
    JComboBox<String> cmb2 = new JComboBox<String>(mySizeList);
    cmb2.setSelectedIndex(-1);
    String[] myColorList = { "Red", "Green", "Blue", "Yellow", "White","Gray" };
    Arrays.sort(myColorList);
    JComboBox<String> cmb3 = new JComboBox<String>(myColorList);
    cmb3.setSelectedIndex(-1);
    p2.add(cmb1);
    p2.add(cmb2);
    p2.add(cmb3);
    //tab3
    tp.addTab("Shape",p3);
    JTextField size1 = new JTextField();
    size1.setPreferredSize(new Dimension(60,20));
    JTextField size2 = new JTextField();
    size2.setPreferredSize(new Dimension(60,20));
    String[] myShapeList = { "Circle", "Square", "Rectangle", "Oval"};
    Arrays.sort(myShapeList);
    JComboBox<String> cmb4 = new JComboBox<String>(myShapeList);
    cmb4.setSelectedIndex(-1);

    cmb4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String shapeName = (String)cmb4.getSelectedItem();
            if(shapeName=="Square"){
                size2.setVisible(false);
            }else if(shapeName=="Circle"){
                size2.setVisible(false);
            }else{
                size2.setVisible(true);
            }
        }  
    });

    p3.add(cmb4);
    p3.add(size1);
    p3.add(size2);

    //tab1 draw button
    b1.setPreferredSize(new Dimension(480,20));
    b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            String shapeName=(String)cmb4.getSelectedItem();
            String colorName = (String)cmb3.getSelectedItem();
            String sizeNr = (String)cmb2.getSelectedItem();
            String fontName=(String)cmb1.getSelectedItem();
            String s1 = size1.getText();
            String s2 = size2.getText();
            try{//size 1
                c.setSize1(Integer.parseInt(s1));
            }catch(Exception E){
                System.out.println("Insert the size  of the shape!");
                c.setSize1(-1);
            }
            try{//size 2
                c.setSize2(Integer.parseInt(s2));
            }catch(Exception E){
                System.out.println("Insert the size of the shape!");
                c.setSize2(-1);
            }
            try{
                c.setSizeNr(Integer.parseInt(sizeNr));
            }catch(Exception E){
                System.out.println("Insert the size of the text!");
                c.setSizeNr(0);
            }
            if(shapeName!=null){
                c.setShapeName(shapeName);
            }
            if(colorName!=null){
                c.setColorName(colorName);
            }
            if(fontName!=null){
                c.setFontName(fontName);
            }
            p1.add(c);
            
        }  
    });
    p1.add(b1);
    p1.add(c);

    

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    f.setVisible(true);
    }
}

class MyCanvas1 extends Canvas{
    String fontName=" ";
    int sizeNr=0;
    String colorName=" ";
    int size1=0;
    int size2=0;
    String shapeName=" ";

    Graphics g1;
    Graphics g2;
    MyCanvas1(){
        this.setSize(new Dimension(500,400));
        this.setBackground(Color.BLACK);


    }
    public void paint(Graphics g){

        //text
        //  Font
        Font ftext = new Font("Veranda",Font.PLAIN,24);
        try{
            ftext = new Font(fontName,Font.PLAIN,sizeNr);
        }
        catch(Exception e){
            ftext = new Font("Veranda",Font.PLAIN,24);
        }

        //  Color
        Color ctext = Color.WHITE;
        try {
            if(colorName=="White"){
                ctext = Color.WHITE;  
            }else if(colorName=="Blue"){
                ctext = Color.BLUE;  
            }else if(colorName=="Gray"){
                ctext = Color.GRAY;
            }
            else if(colorName=="Green"){
                ctext = Color.GREEN;
            }
            else if(colorName=="Red"){
                ctext = Color.RED;
            }
            else if(colorName=="Yellow"){
                ctext = Color.YELLOW;
            }
        } catch (Exception e) {
            ctext = Color.WHITE;
        }

        //shape and text
        g.setColor(ctext);
        g.setFont(ftext);
        if(shapeName=="Circle"){
            g.drawOval(125,125,size1,size1);
            g.drawString("Circle",150,300);
        }else if(shapeName=="Oval"){
            g.drawOval(125,125,size1,size2);
            g.drawString("Oval",150,300);
        }else if(shapeName=="Square"){
            g.drawRect(125,125,size1,size1);
            g.drawString("Square",150,300);
        }else if(shapeName=="Rectangle"){
            g.drawRect(125,125,size1,size2);
            g.drawString("Rectangle",150,300);
        }
    }

    public String getFontName() {
        return this.fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getSizeNr() {
        return this.sizeNr;
    }

    public void setSizeNr(int sizeNr) {
        this.sizeNr = sizeNr;
    }

    public String getColorName() {
        return this.colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getSize1() {
        return this.size1;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public int getSize2() {
        return this.size2;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

}

//Mustea Dumitru-Dan Lab12_2
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MusteaDan_Lab12_2 {
    public static void main(String[] args) {
        new MyFrame4("Mustea Dan Lab12_2");
    }
}

/* -------------------------------- /Frame/ -------------------------------- */
class MyFrame4 extends JFrame {
    MyCanvas4 c;
    static final int COLOR_MIN = 0;
    static final int COLOR_MAX = 255;
    static int R = 0;
    static int G = 0;
    static int B = 0;

    MyFrame4(String title) {

    super(title);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.GRAY);
    setResizable(false);
    setSize(500,500);
    setLayout(new GridBagLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagConstraints grid = new GridBagConstraints();
    c = new MyCanvas4();

    grid.gridx = 2;
    grid.gridy = 0;
    add(c,grid);


    JSlider redSlider = new JSlider(JSlider.HORIZONTAL,COLOR_MIN,COLOR_MAX,COLOR_MIN);
    redSlider.setMajorTickSpacing(255);
    redSlider.setPaintTicks(true);
    redSlider.setPreferredSize(new Dimension(100,50));
    redSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            R=redSlider.getValue();
            MyCanvas4.myColor=new Color(R,G,B);
            // System.out.println(R+" "+G+" "+B);
            c.repaint();
        }
    });
    grid.gridx = 1;
    grid.gridy = 1;
    add(redSlider,grid);   


    JSlider greenSlider = new JSlider(JSlider.HORIZONTAL,COLOR_MIN,COLOR_MAX,COLOR_MIN);
    greenSlider.setMajorTickSpacing(255);
    greenSlider.setPaintTicks(true);
    greenSlider.setPreferredSize(new Dimension(100,50));
    greenSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            G=greenSlider.getValue();
            MyCanvas4.myColor=new Color(R,G,B);
            // System.out.println(R+" "+G+" "+B);
            c.repaint();
        }
    });
    grid.gridx = 2;
    grid.gridy = 1;
    add(greenSlider,grid);


    JSlider blueSlider = new JSlider(JSlider.HORIZONTAL,COLOR_MIN,COLOR_MAX,COLOR_MIN);
    blueSlider.setMajorTickSpacing(255);
    blueSlider.setPaintTicks(true);
    blueSlider.setPreferredSize(new Dimension(100,50));
    blueSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            B=blueSlider.getValue();
            MyCanvas4.myColor=new Color(R,G,B);
            // System.out.println(R+" "+G+" "+B);
            c.repaint();
        }
    });
    grid.gridx = 3;
    grid.gridy = 1;
    add(blueSlider,grid);

    setVisible(true);

    }
 
}


/* ------------------------------ /Canvas/ ---------------------------- */ 
class MyCanvas4 extends Canvas{
    Graphics g;
    public static Color myColor;
    
    MyCanvas4(){
        this.setSize(new Dimension(100,100));

        
    }
    @Override
	public void paint(Graphics g) {
        g.setColor(myColor);
        g.fillRect(0,0,100,100);
        // System.out.println(redSlider.getValue()+" "+greenSlider.getValue()+" "+blueSlider.getValue());

	}



}

