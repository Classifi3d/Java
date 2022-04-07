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

