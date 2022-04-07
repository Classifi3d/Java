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

