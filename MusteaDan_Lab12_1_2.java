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

