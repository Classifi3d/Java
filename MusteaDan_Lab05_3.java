//Mustea Dumitru-Dan Lab05_3
import java.util.Scanner;

interface Paint{
    float paintPerSurfaceUnit = 1.4f;
}

public class MusteaDan_Lab05_3{
    public static void main(String... args){
        int l,w,h,r1,r2;
        MyKeyboardRead read = new MyKeyboardRead();
        System.out.println("Insert l and w for the rectangle");
        l=read.IntegerRead();
        w=read.IntegerRead();
        Rectangle deck = new Rectangle();
        deck.SetL(l);
        deck.SetW(w);
        System.out.println("Insert r for the sphere");
        r1=read.IntegerRead();
        Sphere bigBall = new Sphere();
        bigBall.SetR(r1);
        System.out.println("Insert r and h for the cylinder");    
        h=read.IntegerRead();
        r2=read.IntegerRead();
        Cylinder tank = new Cylinder();
        tank.SetH(h);
        tank.SetR(r2);
        PaintThing paint = new PaintThing();
        System.out.println("The amount of paint needed for each shape is");
        System.out.println(paint.paintShape(deck.area())); 
        System.out.println(paint.paintShape(bigBall.area())); 
        System.out.println(paint.paintShape(tank.area())); 
	} 
}

class PaintThing implements Paint{
    public float paintShape(float area){
        return (float)paintPerSurfaceUnit*area;
    }
}

class Sphere extends Shape{
    private int r;
    public float area(){
        return (float)(4*(float)3.14159*r*r);
    }
    public void SetR(int r){
        this.r=r;
    }
    public int GetR(){
       return r; 
    }
    @Override
    public String toString(){
        return shapeName;
    }
}

class Rectangle extends Shape{
    private int l,w;
    public float area(){
        return l*w;
    }
    public void SetL(int l){
        this.l=l;
    }
    public void SetW(int w){
        this.w=w;
    }
    public int GetL(){
        return l; 
    }
    public int GetW(){
        return w; 
    }
    @Override
    public String toString(){
        return shapeName;
    }
}

class Cylinder extends Shape{
    private int r,h;
    public float area(){
        return (float) (2*(float)3.14159*r*h + 2*(float)3.14159*r*r);
    }
    public void SetR(int r){
        this.r=r;
    }
    public void SetH(int h){
        this.h=h;
    }
    public int GetR(){
        return r; 
    }
    public int GetH(){
        return h; 
    }
    @Override
    public String toString(){
        return shapeName;
    }
}


abstract class Shape{
    String shapeName;
    abstract float area();

    @Override
    public String toString(){
        return shapeName;
    }
}

class MyKeyboardRead{

    private static Scanner keyboard = new Scanner(System.in);
    
    public int IntegerRead(){
        int n;
        try{
            System.out.println("Insert a number");
            n=keyboard.nextInt(); 
            return n;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return 1;
        }
    }
    public String StringRead(){
        String str;
        try{
            System.out.println("Insert a string");
            str=keyboard.next(); 
            return str;
        }catch(Exception E){
            System.out.println("Wrong type of data");
            return "Default";
        }
    }

}
