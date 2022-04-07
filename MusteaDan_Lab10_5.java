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


