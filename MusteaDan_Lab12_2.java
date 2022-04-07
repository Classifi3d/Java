//Mustea Dumitru-Dan Lab12_2
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MusteaDan_Lab12_2 {
    public static void main(String[] args) {
        new MyFrame4("Mustea Dan Lab12_2");
    }
}

/* -------------------------------- /Frame/ -------------------------------- */
class MyFrame4 extends JFrame {
    MyCanvas4 c;
    static final int COLOR_MIN = 0;
    static final int COLOR_MAX = 255;
    static int R = 0;
    static int G = 0;
    static int B = 0;

    MyFrame4(String title) {

    super(title);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.GRAY);
    setResizable(false);
    setSize(500,500);
    setLayout(new GridBagLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagConstraints grid = new GridBagConstraints();
    c = new MyCanvas4();

    grid.gridx = 2;
    grid.gridy = 0;
    add(c,grid);


    JSlider redSlider = new JSlider(JSlider.HORIZONTAL,COLOR_MIN,COLOR_MAX,COLOR_MIN);
    redSlider.setMajorTickSpacing(255);
    redSlider.setPaintTicks(true);
    redSlider.setPreferredSize(new Dimension(100,50));
    redSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            R=redSlider.getValue();
            MyCanvas4.myColor=new Color(R,G,B);
            // System.out.println(R+" "+G+" "+B);
            c.repaint();
        }
    });
    grid.gridx = 1;
    grid.gridy = 1;
    add(redSlider,grid);   


    JSlider greenSlider = new JSlider(JSlider.HORIZONTAL,COLOR_MIN,COLOR_MAX,COLOR_MIN);
    greenSlider.setMajorTickSpacing(255);
    greenSlider.setPaintTicks(true);
    greenSlider.setPreferredSize(new Dimension(100,50));
    greenSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            G=greenSlider.getValue();
            MyCanvas4.myColor=new Color(R,G,B);
            // System.out.println(R+" "+G+" "+B);
            c.repaint();
        }
    });
    grid.gridx = 2;
    grid.gridy = 1;
    add(greenSlider,grid);


    JSlider blueSlider = new JSlider(JSlider.HORIZONTAL,COLOR_MIN,COLOR_MAX,COLOR_MIN);
    blueSlider.setMajorTickSpacing(255);
    blueSlider.setPaintTicks(true);
    blueSlider.setPreferredSize(new Dimension(100,50));
    blueSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            B=blueSlider.getValue();
            MyCanvas4.myColor=new Color(R,G,B);
            // System.out.println(R+" "+G+" "+B);
            c.repaint();
        }
    });
    grid.gridx = 3;
    grid.gridy = 1;
    add(blueSlider,grid);

    setVisible(true);

    }
 
}


/* ------------------------------ /Canvas/ ---------------------------- */ 
class MyCanvas4 extends Canvas{
    Graphics g;
    public static Color myColor;
    
    MyCanvas4(){
        this.setSize(new Dimension(100,100));

        
    }
    @Override
	public void paint(Graphics g) {
        g.setColor(myColor);
        g.fillRect(0,0,100,100);
        // System.out.println(redSlider.getValue()+" "+greenSlider.getValue()+" "+blueSlider.getValue());

	}



}

