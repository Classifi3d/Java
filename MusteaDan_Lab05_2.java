//Mustea Dumitru-Dan Lab05_2
import java.lang.Math;
import java.util.Scanner;

public class MusteaDan_Lab05_2 extends MyKeyboardRead {
    public static void main(String[] args) {
    int n;
    n=IntegerRead();
    GeometricForm form[] = new GeometricForm[n];
    float totalArea=0,totalPerimeter=0;
    for(int i=0;i<n;i++){
        System.out.println("Insert a number that represents a shape you want to add to the list");
        System.out.println("1-Square, 2-Rectangle, 3-Circle 4-Equilateral Triangle 5-Isoceles Triangle");
        int type=IntegerRead();
        switch(type){
            case 1:
                Square aux1 = new Square();
                System.out.println("Insert L");
                aux1.setL(IntegerRead());
                form[i]=aux1;
                totalArea+=form[i].area();
                totalPerimeter+=form[i].perimeter();
                break;
            case 2:
                Rectangle aux2 = new Rectangle();
                System.out.println("Insert L, then P");
                aux2.setLP(IntegerRead(),IntegerRead());
                form[i]=aux2;
                totalArea+=form[i].area();
                totalPerimeter+=form[i].perimeter();
                break;
            case 3:
                Circle aux3 = new Circle();
                System.out.println("Insert R");
                aux3.setR(IntegerRead());
                form[i]=aux3;
                totalArea+=form[i].area();
                totalPerimeter+=form[i].perimeter();
                break;
            case 4:
                EchilateralTriangle aux4 = new EchilateralTriangle();
                System.out.println("Insert L");
                aux4.setL(IntegerRead());
                form[i]=aux4;
                totalArea+=form[i].area();
                totalPerimeter+=form[i].perimeter();
                break;
            case 5:
                Rectangle aux5 = new Rectangle();
                System.out.println("Insert L, then B");
                aux5.setLP(IntegerRead(),IntegerRead());
                form[i]=aux5;
                totalArea+=form[i].area();
                totalPerimeter+=form[i].perimeter();
                break;
        }
    }

    System.out.println("The sum of the area of all the shapes is: "+totalArea);
    System.out.println("The sum of the perimeter of all the shapes is: "+totalPerimeter);
       
    }
}


interface GeometricForm{
    float area();
    float perimeter();

}

class Square implements GeometricForm{
    private int l;
    public void setL(int l){
        this.l=l;
    }
    public int getL(){
        return this.l;
    }
    public float area(){
        return l*l;
    }
    public float perimeter(){
        return l*4;
    }
}

class Rectangle implements GeometricForm{
    private int l,p;
    public void setLP(int l,int p){
        this.l=l;
        this.p=p;
    }
    public int getL(){
        return this.l;
    }
    public int getP(){
        return this.p;
    }
    public float area(){
        return l*p;
    }
    public float perimeter(){
        return l*2+p*2;
    }
}

class Circle implements GeometricForm{
    private int r;
    public void setR(int r){
        this.r=r;
    }
    public int getR(){
        return this.r;
    }
    public float area(){
        return (float)r*r*3.149156f;
    }
    public float perimeter(){
        return (float)2*3.149156f*r;
    }
}

class EchilateralTriangle implements GeometricForm{
    private int l;
    public void setL(int l){
        this.l=l;
    }
    public int getL(){
        return this.l;
    }
    public float area(){
        return (float)l*l*((float)Math.sqrt(3)/4);
    }
    public float perimeter(){
        return l*3;
    }
}

class IsoscelesTriangle implements GeometricForm{
    private int l,b;
    public void setL(int l){
        this.l=l;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getL(){
        return this.l;
    }
    public int getB(){
        return this.b;
    }
    public float area(){
        return (float)b/2*(float)Math.sqrt(l*l-(b*b)/4);
    }
    public float perimeter(){
        return 2*l+b;
    }
}

class MyKeyboardRead{
    private static Scanner keyboard = new Scanner(System.in);
    
    static public int IntegerRead(){
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
    static public String StringRead(){
        String str;
        try{
            System.out.println("Insert a string");
            str=keyboard.next(); 
            return str;
        }catch(Exception E){
            System.out.println("Wrong type of data");
            return "ABC";
        }
    }

}
