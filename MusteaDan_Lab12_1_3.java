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

