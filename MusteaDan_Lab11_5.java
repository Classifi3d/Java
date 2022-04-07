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


