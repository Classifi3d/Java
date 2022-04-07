# ---------------------------------------------------------------------------- #
#                     MusteaDan_Lab06_3_package  Package                       #
# ---------------------------------------------------------------------------- #



# ------------------------------- Class1.java -------------------------------- #

package MusteaDan_Lab06_3_package;

public class Class1 {
    protected double x;
    protected double y;
    public Class1(){
        x=0;
        y=0;
    }
    public Class1(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

# ------------------------------- Int1.java -------------------------------- #

package MusteaDan_Lab06_3_package;

public interface Int1 {
    public int x = 1;
    public int y = 5;
    public static int sum(){
        return x+y;
    }
}

# ------------------------------- Int2.java -------------------------------- #

package MusteaDan_Lab06_3_package;

public interface Int2 {
    public double x=10;
    public double y=5;
    public static double product(){
        return x*y;
    }
}



