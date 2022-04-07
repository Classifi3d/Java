//Mustea Dumitru-Dan Lab10_1
import java.awt.*;
import javax.swing.*;

public class MusteaDan_Lab10_1 {
    public static void main(String[] args) {
        new MyFrame1();
    }
}

class MyFrame1 {
    MyFrame1() {

    /* -------------------------------- /Frame/ -------------------------------- */

    JFrame f = new JFrame("Mustea Dan Lab10_1");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.CYAN);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* ----------------------------- /Conents of Frame/ ----------------------- */

    JLabel l1 =new JLabel("Mustea Dan Group 2023",JLabel.CENTER);
    Font f1 = new Font("Verdana", Font.BOLD, 24);
    l1.setHorizontalAlignment(JLabel.CENTER);
    l1.setVerticalAlignment(JLabel.CENTER);  
    l1.setVerticalTextPosition(JLabel.CENTER);
    l1.setHorizontalTextPosition(JLabel.CENTER); 
    l1.setFont(f1);
    l1.setForeground(Color.BLUE);
    l1.setBounds(0,0,500,500);


    f.add(l1);

    }
}

//Mustea Dumitru-Dan Lab10_2
import java.awt.*;
import javax.swing.*;

public class MusteaDan_Lab10_2 {
    public static void main(String[] args) {
        new MyFrame2("Mustea Dan Lab10_2");
    }
}

/* -------------------------------- /Frame/ -------------------------------- */
class MyFrame2 extends JFrame {
    MyCanvas2 c;

    
    MyFrame2(String title) {
    super(title);
    setLayout(new FlowLayout());
    c = new MyCanvas2();
    add(c);

    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.WHITE);
    setResizable(false);
    setSize(500,500);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
 
}


/* ------------------------------ /Canvas/ ---------------------------- */ 
class MyCanvas2 extends Canvas{
    Graphics g;
    // BufferedImage bi = null;
    
    MyCanvas2(){
        this.setSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);


    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.drawOval(125,0,250,250);
    }

}

//Mustea Dumitru-Dan Lab10_3
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MusteaDan_Lab10_3 {
    public static void main(String[] args) {
        new MyFrame3("Mustea Dan Lab10_3");
    }
}

/* -------------------------------- /Frame/ -------------------------------- */
class MyFrame3 extends JFrame {
    MyCanvas3 c;
    
    
    MyFrame3(String title) {
    super(title);
    // setLayout(new FlowLayout());
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.CYAN);
    setResizable(false);
    setSize(500,500);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    c = new MyCanvas3();
    add(c);
   

    }
 
}


/* ------------------------------ /Canvas/ ---------------------------- */ 
class MyCanvas3 extends Canvas{
    Graphics g,g2;

    BufferedImage bi = null;
    
    MyCanvas3(){
        this.setSize(new Dimension(500, 500));
		this.setBackground(new Color(255, 125, 0));
        try {
            bi = ImageIO.read(new File("image_01.jpg")); 

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Image could not be read");
            // System.exit(1);
        }
        
    }
    @Override
	public void paint(Graphics g) {
        g.drawImage(bi, 100, 50, this);
        Font f1 = new Font("Veranda",Font.BOLD,24);
        g.setFont(f1);
        g.setColor(Color.BLACK);
        g.drawString("image_01.jpg",150,300);

	}



}

//Mustea Dumitru-Dan Lab10_5
import java.awt.*;
import javax.swing.*;

public class MusteaDan_Lab10_5 {
    public static void main(String[] args) {
        new MyFrame5("Mustea Dan Lab10_5");
    }
}

/* -------------------------------- /Frame/ -------------------------------- */
class MyFrame5 extends JFrame {
    MyCanvas5 c;

    
    MyFrame5(String title) {
    super(title);
    setLayout(new FlowLayout());
    c = new MyCanvas5();
    add(c);

    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.BLACK);
    setResizable(false);
    setSize(500,500);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
 
}


/* ------------------------------ /Canvas/ ---------------------------- */ 
class MyCanvas5 extends Canvas{
    Graphics g;
    // BufferedImage bi = null;
    
    MyCanvas5(){
        this.setSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);


    }
    @Override
    public void paint(Graphics g){
        int counter=0;
        int x,y,z;
        x=0;
        y=0;
        z=0;
        for(int i=0;i<255;i++){//black to red
            x=i;
            Color c=new Color(x,y,z);//x = red , y=green, z=blue
            g.setColor(c);
            g.drawOval(125,125,250,250);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(counter<3){//repeats 3 times
            
            for(int i=0;i<255;i++){//red to green
                y=i;
                x=255-i;
                Color c=new Color(x,y,z);//x = red , y=green, z=blue
                g.setColor(c);
                g.drawOval(125,125,250,250);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<255;i++){//green to blue
                z=i;
                y=255-i;
                Color c=new Color(x,y,z);//x = red , y=green, z=blue
                g.setColor(c);
                g.drawOval(125,125,250,250);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<255;i++){//blue to red
                x=i;
                z=255-i;
                Color c=new Color(x,y,z);//x = red , y=green, z=blue
                g.setColor(c);
                g.drawOval(125,125,250,250);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            counter++;
        }
        System.exit(1);//exits
        
        
    }

}


