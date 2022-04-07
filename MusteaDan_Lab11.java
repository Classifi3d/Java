//Mustea Dumitru-Dan Lab11_1
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MusteaDan_Lab11_1 {
    public static void main(String[] args) {
        new MyFrame1();
    }
}

class MyFrame1 {
    //variables
    static float result=0;
    static float input=0;

    MyFrame1() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab11_1");

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

//Mustea Dumitru-Dan Lab11_2
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class MusteaDan_Lab11_2 {
    public static void main(String[] args) {
        new MyFrame2();
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
    JFrame f = new JFrame("Mustea Dan Lab11_2");

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

//Mustea Dumitru-Dan Lab11_3
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class MusteaDan_Lab11_3 {
    public static void main(String[] args) {
        new MyFrame3();
        //this is a working color and text selector!!! (to create an image select all fields)
    }
}

class MyFrame3 {

    MyFrame3() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab11_3");

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

//Mustea Dumitru-Dan Lab11_4
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MusteaDan_Lab11_4 {
    public static void main(String[] args) {
        new MyFrame4();
    }
}

class MyFrame4 {
    //variables
    static float result=0;
    static float input=0;

    MyFrame4() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab11_4");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.WHITE);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(new GridLayout(5,4));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel output = new JLabel(" ");
    output.setHorizontalAlignment(JLabel.CENTER);
    JTextField text = new JTextField();
    text.setPreferredSize(new Dimension(30,20));
    JButton b = new JButton("Print");
    b.setPreferredSize(new Dimension(480,20));
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            output.setText(text.getText());
        }  
    });

    f.add(b);
    f.add(text);
    f.add(output);

    
    f.setVisible(true);
}
}

//Mustea Dumitru-Dan Lab11_5
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MusteaDan_Lab11_5 {
    public static void main(String[] args) {
        new MyFrame5();
    }
}

class MyFrame5 {
    //variables
    static float result=0;
    static float input=0;

    MyFrame5() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab11_5");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.WHITE);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(new GridLayout(5,4));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel output = new JLabel(" ");
    output.setHorizontalAlignment(JLabel.CENTER);
    JTextField textr = new JTextField();
    textr.setPreferredSize(new Dimension(30,20));
    JTextField textg = new JTextField();
    textg.setPreferredSize(new Dimension(30,20));
    JTextField textb = new JTextField();
    textb.setPreferredSize(new Dimension(30,20));
    JButton b = new JButton("Show color");
    b.setPreferredSize(new Dimension(480,20));
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            int r,g,b;
            output.setVisible(true);
            try {
                r=Integer.parseInt(textr.getText());
                g=Integer.parseInt(textg.getText());
                b=Integer.parseInt(textb.getText());
                if(r<0 || r>=255 || g<0 || g>=255 || b<0 || b>255 ){
                    throw new Exception();
                }
                output.setForeground(new Color(r,g,b));
                output.setText(r+" "+g+" "+b+'\n');
            } catch (Exception E) {
                output.setForeground(Color.RED);
                output.setText("Invalid Input Data!");
            }
        }  
    });
    f.add(b);
    f.add(textr);
    f.add(textg);
    f.add(textb);
    f.add(output);
    output.setVisible(false);

    
    f.setVisible(true);
}
}


//Mustea Dumitru-Dan Lab11_6
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.regex.*; 
import java.util.regex.*; 
import javax.swing.*;

public class MusteaDan_Lab11_6 {
    public static void main(String[] args) {
        new MyFrame6();
    }
}

class MyFrame6 {
    //variables
    static float result=0;
    static float input=0;

    MyFrame6() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab11_6");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.WHITE);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(new GridLayout(7,2));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Student studentInformation = new Student();

    JLabel lab1 = new JLabel("First Name");
    lab1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab2 = new JLabel("Sure Name");
    lab2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab3 = new JLabel("Year of Study");  
    lab3.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab4 = new JLabel("Faculty");  
    lab4.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab5 = new JLabel("Budget");  
    lab5.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab6 = new JLabel("Course");
    lab6.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JTextField text1 = new JTextField();
    text1.setPreferredSize(new Dimension(30,20));
    text1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JTextField text2 = new JTextField();
    text2.setPreferredSize(new Dimension(30,20));
    text2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    String[] myYearList = { "1", "2", "3", "4", "5", "6"};
    Arrays.sort(myYearList);
    JComboBox<String> combo1 = new JComboBox<String>(myYearList);
    combo1.setSelectedIndex(-1);
    combo1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    String[] myFacultyList = { "AC", "ETTI", "FAU", "ARMM", "Constructions", "IMM", "Instalations", "IE", "CM"};
    Arrays.sort(myFacultyList);
    JComboBox<String> combo2 = new JComboBox<String>(myFacultyList);
    combo2.setSelectedIndex(-1);
    combo2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    String[] course = { "CAD", "SDIC", "SE", "ETM", "Microwaves", "ASC", "AIC"};
    Arrays.sort(course);
    JComboBox<String> combo3 = new JComboBox<String>(course);
    combo3.setSelectedIndex(-1);
    combo3.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JCheckBox check = new JCheckBox("Check if you're at budget");
    check.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JButton b = new JButton("Print");
    b.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JTextArea output = new JTextArea();
    output.setBounds(2,20, 10,10);  
    output.setBorder(BorderFactory.createLineBorder(Color.GRAY));


    b.setPreferredSize(new Dimension(480,20));
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            output.setForeground(Color.BLACK);
            Boolean valid=true;
            Boolean nameValid=true;
            String nameValidationString="^[A-Za-z]+([\\ A-Za-z]+)*";
            if(Pattern.matches(nameValidationString,text1.getText())){
                studentInformation.setName(text1.getText());
            }else{
                valid = false;
                nameValid=false;
            }

            if(Pattern.matches(nameValidationString,text2.getText())){
                studentInformation.setSurename(text2.getText());
            }else{
                valid=false;
                nameValid=false;
            }

            if(combo1.getSelectedIndex()>-1&&combo1.getSelectedIndex()<myYearList.length){
                try{
                    studentInformation.setYearOfStudy(Integer.parseInt(combo1.getSelectedItem().toString()));
                }catch(Exception E){
                    valid=false;
                }
            }else{
                valid=false;
            }

            if(combo2.getSelectedIndex()>-1&&combo2.getSelectedIndex()<myFacultyList.length){
                studentInformation.setFaculty(combo2.getSelectedItem().toString());

            }else{
                valid=false;
            }

            if(check.isSelected()){
                studentInformation.setFinancing(true);
            }else{
                studentInformation.setFinancing(false);
            }

            if(combo3.getSelectedIndex()>-1&&combo3.getSelectedIndex()<course.length){
                studentInformation.setCourse(combo3.getSelectedItem().toString());
            }else{
                valid=false;
            }
            
            if(valid==true){
                output.setText(studentInformation.getName()+" "+
                                studentInformation.getSurename()+" "+
                                studentInformation.getYearOfStudy()+" "+
                                studentInformation.getFaculty()+" "+
                                studentInformation.getFinancing()+" "+
                                studentInformation.getCourse()+" ");  
            }else{
                if(nameValid==false){
                    output.setForeground(Color.RED);
                    output.setText("Invalid Name Entered!");
                }else {
                    output.setForeground(Color.RED);
                    output.setText("Insufficient Or Invalid Data Entered!");
                }
            }
        }  
    });

    f.add(lab1);
    f.add(lab2);
    f.add(text1);
    f.add(text2);
    f.add(lab3);
    f.add(lab4);
    f.add(combo1);
    f.add(combo2);
    f.add(lab5);
    f.add(lab6);
    f.add(check);
    f.add(combo3);
    f.add(b);
    f.add(output);

    
    f.setVisible(true);
}
}

class Student{
    String name;//textfield
    String surename;//textfield
    int yearOfStudy;//dropdown
    String faculty;//dropdown
    Boolean financing;//checkbox
    String course;//dropdown

    public Student() {
    }

    public Student(String name, String surename, int yearOfStudy, String faculty, Boolean financing, String course) {
        this.name = name;
        this.surename = surename;
        this.yearOfStudy = yearOfStudy;
        this.faculty = faculty;
        this.financing = financing;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return this.surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Boolean isFinancing() {
        return this.financing;
    }

    public String getFinancing() {
        if(financing==true){
            return "Budget";
        }else{
            return "Tax";
        }
    }

    public void setFinancing(Boolean financing) {
        this.financing = financing;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student surename(String surename) {
        setSurename(surename);
        return this;
    }

    public Student yearOfStudy(int yearOfStudy) {
        setYearOfStudy(yearOfStudy);
        return this;
    }

    public Student faculty(String faculty) {
        setFaculty(faculty);
        return this;
    }

    public Student financing(Boolean financing) {
        setFinancing(financing);
        return this;
    }

    public Student course(String course) {
        setCourse(course);
        return this;
    }
}
