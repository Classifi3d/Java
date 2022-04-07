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

