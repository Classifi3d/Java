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
//Mustea Dumitru-Dan Lab05_4
import java.util.Scanner;

public class MusteaDan_Lab05_4 {
    public static void main(String[] args){
        Fraction x = new Fraction();
        Fraction y = new Fraction();
        System.out.println("The implicit constructor values");
        System.out.println(x.getA() +" "+x.getB());
        System.out.println(y.getA() +" "+y.getB());
        x.setA(27);
        x.setB(3);
        y.setA(42);
        y.setB(2);
        System.out.println("The intialized values");
        System.out.println(x.getA() +" "+x.getB());
        System.out.println(y.getA() +" "+y.getB());
        x=x.simplify();
        y=y.simplify();
        System.out.println("The simplifed values");
        System.out.println(x.getA() +" "+x.getB());
        System.out.println(y.getA() +" "+y.getB()); 
        x=x.add(x, y);
        System.out.println("The added fractions");
        System.out.println(x.getA() +" "+x.getB());
        System.out.println();    
        Fraction_ext xext = new Fraction_ext();
        Fraction_ext yext = new Fraction_ext();
        System.out.println("The implicit constructor values");
        System.out.println(xext.getA() +" "+xext.getB());
        System.out.println(yext.getA() +" "+yext.getB());
        xext.setA(47);
        xext.setB(2);
        yext.setA(12);
        yext.setB(7);   
        System.out.println("The intialized values");
        System.out.println(xext.getA() +" "+xext.getB());
        System.out.println(yext.getA() +" "+yext.getB()); 
        xext=xext.simplify();
        yext=yext.simplify();
        System.out.println("The simplifed values");
        System.out.println(xext.getA() +" "+xext.getB());
        System.out.println(yext.getA() +" "+yext.getB()); 
        xext=xext.sub(yext,xext);
        System.out.println("The subtracted fractions");
        System.out.println(xext.getA() +" "+xext.getB());  

    }

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

class Fraction{
    protected int a,b;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    Fraction(){
        this.a=0;
        this.b=1;
    }
    Fraction(int a,int b){
        this.a=a;
        if(b!=0){
            this.b=b;
        }else{
            this.b=1;
        }
    }
    int gcdMod(int x, int y) {
        if (y==0){
            return x;
        }
        return gcdMod(y,x%y);
    }
    public Fraction simplify(){
        int gcdVar=gcdMod(this.a,this.b);
        Fraction aux = new Fraction();
        aux.a=this.a/gcdVar;
        aux.b=this.b/gcdVar;
        return aux;
    }
    public Fraction add(Fraction x,Fraction y){
        Fraction aux = new Fraction();
        aux.a=x.a+y.a;
        aux.b=x.b+y.b;
        return aux;
    }
}

class Fraction_ext extends Fraction{
    Fraction_ext(){
        super();
    }
    Fraction_ext(int a,int b){
        super(a,b);
    }
    int gcdSub(int x,int y){
        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        return x;
    }

    @Override
    public Fraction_ext simplify() {
        int gcdVar=gcdSub(this.a,this.b);
        Fraction_ext aux = new Fraction_ext();
        aux.a=this.a/gcdVar;
        aux.b=this.b/gcdVar;
        return aux;
    }

    public Fraction_ext sub(Fraction_ext x,Fraction_ext y){
        Fraction_ext aux = new Fraction_ext();
        aux.a=x.a-y.a;
        aux.b=x.b-y.b;
        return aux;
    }

}

//Mustea Dumitru-Dan Lab05_5   
import java.util.Arrays;

public class MusteaDan_Lab05_5 {
    public static void main(String[] args){
        String[] array = {"January","February","March","April","May","June","July","August","September","October","December"};
        System.out.println("======= Original array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> a.length() - b.length());
        System.out.println("======= Smallest to Largest Length Sorted array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> b.length() - a.length());
        System.out.println("======= Largest to smallest Length Sorted array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> a.compareTo(b));
        System.out.println("======= Alphabetically Sorted array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> a.compareTo(b));   
        Arrays.sort(array, (a, b) -> letterMfinder(b) - letterMfinder(a));
        System.out.println("======= Alphabetically Sorted with M strings first array =======");
        System.out.println(Arrays.toString(array)); 
    }

    static int letterMfinder(String a){
        a.toUpperCase();
        if(a.charAt(0)=='M'){
            return 1;
        }else{
            return 0;
        }
    }

}

//Mustea Dumitru-Dan Lab05_6

public class MusteaDan_Lab05_6 {
    public static void main(String[] args){
    Pawn a = new Pawn();
    Rook b = new Rook();
    Bishop c = new Bishop();
    Knight d = new Knight();
    King e = new King();
    Queen f = new Queen();
    Coordinates currentPosition = new Coordinates();
    display(a.move(currentPosition, Direction.N));
    display(b.move(currentPosition, Direction.S));
    display(c.move(currentPosition, Direction.NE));
    display(d.move(currentPosition, Direction.NW));
    display(e.move(currentPosition, Direction.W));
    display(f.move(currentPosition, Direction.SE));
    }

    static void display(Coordinates aux){
        System.out.println(aux.x+":"+aux.y);
    }

}
enum Direction {N, S, E, W, NE, NW, SE, SW};

class Coordinates{
    public int x;
    public int y;
    Coordinates(){
        this.x=0;
        this.y=0;
    }

    // x - horizontal       0 -----> N
    // y - vertical         0 ^ N   
}


interface ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen);
}

class Pawn implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case NE:
                aux.x=piece.x+1;
                aux.y=piece.y+1;
            return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+1;
                return aux;
            default:
                return aux;
        }
    }
}

class Rook implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case S:
                aux.x=piece.x;
                aux.y=piece.y-1;
            return aux;
            case E:
                aux.x=piece.x+1;
                aux.y=piece.y;
                return aux;
            case W:
                aux.x=piece.x-1;
                aux.y=piece.y;
                return aux;
            default:
                return aux;
        }
    }
}

class Bishop implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case NE:
                aux.x=piece.x+1;
                aux.y=piece.y+1;
                return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+1;
                return aux;
            case SE:
                aux.x=piece.x+1;
                aux.y=piece.y-1;
            case SW:
                aux.x=piece.x-1;
                aux.y=piece.y-1;
            default:
                return aux;
        }
    }
}

class Knight implements ChessPiece{
    /*
    Knight Move Pattern for each direction:

    X#         #X            #
    X   = N     X = NW     XXx = NE    ...
    X           X               
    */ 
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x+1;
                aux.y=piece.y+2;
                return aux;
            case S:
                aux.x=piece.x-1;
                aux.y=piece.y-2;
            return aux;
            case E:
                aux.x=piece.x+2;
                aux.y=piece.y-1;
                return aux;
            case W:
                aux.x=piece.x-2;
                aux.y=piece.y+1;
                return aux;
            case NE:
                aux.x=piece.x+2;
                aux.y=piece.y+1;
                return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+2;
                return aux;
            case SE:
                aux.x=piece.x+1;
                aux.y=piece.y-2;
            case SW:
                aux.x=piece.x-2;
                aux.y=piece.y-1;
            default:
                return aux;
        }
    }
}

class King implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case S:
                aux.x=piece.x;
                aux.y=piece.y-1;
            return aux;
            case E:
                aux.x=piece.x+1;
                aux.y=piece.y;
                return aux;
            case W:
                aux.x=piece.x-1;
                aux.y=piece.y;
                return aux;
            default:
                return aux;
        }
    }
}

class Queen implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case S:
                aux.x=piece.x;
                aux.y=piece.y-1;
            return aux;
            case E:
                aux.x=piece.x+1;
                aux.y=piece.y;
                return aux;
            case W:
                aux.x=piece.x-1;
                aux.y=piece.y;
                return aux;
            case NE:
                aux.x=piece.x+1;
                aux.y=piece.y+1;
                return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+1;
                return aux;
            case SE:
                aux.x=piece.x+1;
                aux.y=piece.y-1;
            case SW:
                aux.x=piece.x-1;
                aux.y=piece.y-1;
            default:
                return aux;
        }
    }
}

//Mustea Dumitru-Dan Lab05_1_1
import java.lang.Math;

abstract interface MyMathMathods {
    public static float addition(float a,float b){
        return a+b;
    }
    public static float subtraction(float a,float b){
        return a-b;
    }
    public static float multiplication(float a,float b){
        return a*b;
    }
    public static float division(float a,float b){
        return a/b;
    }
    public static float squareRoot(float a){
        return (float)Math.sqrt(a);
    }
    public static float powerRaising(float a,int pow){
        return (float)Math.pow(a,(double)pow);
    }
  }

  
public class MusteaDan_Lab05_1_1 implements MyMathMathods {
    public static void main(String[] args) {
        float a=3.434f;
        float b=3;
        System.out.println("addition: "+MyMathMathods.addition(a, b));
        System.out.println("subtraction: "+MyMathMathods.subtraction(a, b));
        System.out.println("multiplication: "+MyMathMathods.multiplication(a, b));
        System.out.println("division: "+MyMathMathods.division(a, b));
        System.out.println("square root: "+MyMathMathods.squareRoot(b));
        System.out.println("power raising: "+MyMathMathods.powerRaising(a, (int)b));
    }
}
//Mustea Dumitru-Dan Lab05_1_2

abstract interface MyMathMathods1 {
    public float addition(float a,float b);
}
abstract interface MyMathMathods2 {
    public float subtraction(float a,float b);
}
abstract interface MyMathMathods3 {
    public float multiplication(float a,float b);
}
abstract interface MyMathMathods4 {
    public float division(float a,float b);
}

class MyMath implements MyMathMathods1,MyMathMathods2,MyMathMathods3,MyMathMathods4{
    public float addition(float a,float b){
        return a+b;
    }
    public float subtraction(float a,float b){
        return a-b;
    }
    public float multiplication(float a,float b){
        return a*b;
    }
    public float division(float a,float b){
        return a/b;
    }
}

  
public class MusteaDan_Lab05_1_2  {
    public static void main(String[] args) {
        float a=3.434f;
        float b=3;
        MyMath obj= new MyMath();
        System.out.println("addition: "+obj.addition(a, b));
        System.out.println("subtraction: "+obj.subtraction(a, b));
        System.out.println("multiplication: "+obj.multiplication(a, b));
        System.out.println("division: "+obj.division(a, b));

    }
}


//Mustea Dumitru-Dan Lab05_1_3

interface MyMathMathodsOp {
    public float operation(float a,float b);
}

class MyMath2{
    public float op1(float a, float b, MyMathMathodsOp op) {
        return op.operation(a, b);
    }
}

  
public class MusteaDan_Lab05_1_3  {
    public static void main(String[] args) {

        MyMath2 obj = new MyMath2();
        MyMathMathodsOp add = (a, b) -> a + b;
        MyMathMathodsOp sub = (a, b) -> a - b;
        MyMathMathodsOp mul = (a, b) -> a * b;
        MyMathMathodsOp div = (a, b) -> a / b;

        System.out.println("addition: "+obj.op1(56, 3, add));
        System.out.println("subtraction: "+obj.op1(56, 3, sub));
        System.out.println("multiplication: "+obj.op1(56, 3, mul));
        System.out.println("division: "+obj.op1(56, 3, div));

    }
}
