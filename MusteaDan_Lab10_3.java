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

