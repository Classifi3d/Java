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

