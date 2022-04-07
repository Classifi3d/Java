//Mustea Dumitru-Dan Lab06_1
import java.util.Scanner;

public class MusteaDan_Lab06_1 {

    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]){

        int n;
        try{
            System.out.println("Insert a number");
            n=keyboard.nextInt(); 
        }catch(Exception E){
            System.out.println("Wrong type of number");
            n=0;
        }

        double array[] = new double[n];

        for(int i=0;i<n;i++){
            try{
                System.out.println("Insert a number");
                array[i]=keyboard.nextInt(); 
            }catch(Exception E){
                System.out.println("Wrong type of number");
                array[i]=0;
            }
        }
        try{
            for(int i=0;i<n*2;i++){//programming erorr
                System.out.println("Insert a number");
                System.out.println(array[i]); 
            }            
        }catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("Invalid index for accessing the array!");
        }

    }
}
//Mustea Dumitru-Dan Lab06_2
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusteaDan_Lab06_2 {

    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]){

        int n;
        try{
            System.out.println("Insert a number that corresponds to a type of exception. 1-Arithmetic 2.IndexOutOfBounds 3.Security 4.FileNotFound 5.NullPointer 6.NumberFormat");
            n=keyboard.nextInt(); 
        }catch(Exception E){
            System.out.println("Wrong type of number");
            n=1;
        }

        try{
            assert (n>=1&&n<=6);
            switch(n){
                case 1:
                    throw new ArithmeticException();
                case 2:
                    throw new IndexOutOfBoundsException(); 
                case 3:
                    throw new SecurityException(); 
                case 4:
                    throw new FileNotFoundException(); 
                case 5:
                    throw new NullPointerException();
                case 6:
                    throw new NumberFormatException(); 
            }
        }
        catch(ArithmeticException E){
            System.out.println("Arithmetic Exception caught!");
        }
        catch(IndexOutOfBoundsException E){
            System.out.println("Index Out Of Bounds Exception caught!");
        }
        catch(SecurityException E){
            System.out.println("Security Exception caught!");
        }
        catch(FileNotFoundException E){
            System.out.println("File Not Found Exception caught!");
        }
        catch(NullPointerException E){
            System.out.println("Null Pointer Exception caught!");
        }
        catch(NumberFormatException E){
            System.out.println("Number Format Exception caught!");
        }
        catch (AssertionError E) {
            System.out.println("Invalid Number");
        }
        catch(Exception E){
            System.out.println("General Exception caught!");
        }
        finally{
            System.out.println("Exceptions may or may not have been found");
        }
 
        



    }
}
//Mustea Dumitru-Dan Lab06_3
import MusteaDan_Lab06_3_package.Class1;
import MusteaDan_Lab06_3_package.Int1;
import MusteaDan_Lab06_3_package.Int2;
import java.util.Scanner;

public class MusteaDan_Lab06_3{

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Class2 a = new Class2();
        int val;
        try{
            System.out.println("Insert a number");
            val=keyboard.nextInt(); 
        }catch(Exception E){
            System.out.println("Not a number error!");
            val=1;
        }
        a.setX((double)val);
        try{
            System.out.println("Insert a number");
            val=keyboard.nextInt(); 
        }catch(Exception E){
            System.out.println("Not a number error!");
            val=1;
        }
        a.setY((double)val);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a.sum());   
        System.out.println(a.product());
    }
}

class Class2 extends Class1 implements Int1,Int2{
    public int sum(){
        return Int1.x +Int1.y;
    }
    public double product(){
        return Int2.x*Int2.y;
    }
}
//Mustea Dumitru-Dan Lab06_4
import java.lang.Exception;

public class MusteaDan_Lab06_4 {
    public static void main(String[] args) {
        ThrowException a = new ThrowException();

        try{
            a.a();
        }
        catch(SmallerException E){
            System.out.println("Smaller Exception");

        }

        try{
           a.b();
        }
        catch(SmallerException E){
            System.out.println("Smaller Exception");
        }
        catch(SuperException E){
            System.out.println("Super Exception");
        }

    }
}

class SuperException extends Exception{
    private static final long serialVersionUID = -2414716562436410070L;

    public SuperException(String message){
        super(message);
    }
}

class SmallerException extends SuperException{
    private static final long serialVersionUID = 9179287553495847083L;

    public SmallerException(String message){
        super(message);
    }
}

class ThrowException {
    public void a() throws SmallerException{
        throw new SmallerException("Wrong");
    }
    public void b() throws SuperException{
        throw new SuperException("Wrong");
    }
}

//Mustea Dumitru-Dan Lab06_5
import java.lang.Exception;
import java.util.Scanner;
import javax.management.RuntimeErrorException;



public class MusteaDan_Lab06_5 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws RuntimeErrorException, AcuteTriangle, RightTriangle {
        Point a,b,c;
        System.out.println("Insert the x and y coordinates of 3 points");
        a=new Point(IntegerRead(),IntegerRead());
        b=new Point(IntegerRead(),IntegerRead());
        c=new Point(IntegerRead(),IntegerRead());
        // 0-0 0-4 2-0 right triangle 

        try{
            Triangle.isObtuseTriangle(a, b, c);
        }
        catch(ImpossibleTriangle E){
            System.out.println("The 3 points do not make a triangle");
            throw new RuntimeErrorException(null);
        }
        catch(RightTriangle E){
            System.out.println("This is a right triangle");
        }
        catch(AcuteTriangle E){
            System.out.println("This is a acutetriangle");
        }

    }

    public static int IntegerRead(){
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

}


class AcuteTriangle extends Exception{
    private static final long serialVersionUID = 1187177798496014782L;

    public AcuteTriangle(String message){
        super(message);
    }
}

class RightTriangle extends Exception{
    private static final long serialVersionUID = -6991139007382333679L;

    public RightTriangle(String message){
        super(message);
    }
}

class ImpossibleTriangle extends Exception{
    private static final long serialVersionUID = 1355654448518402904L;

    public ImpossibleTriangle(String message){
        super(message);
    }
}


class Point{
    private int x;
    private int y;
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    void setX(int x){
        this.x=x;
    }
    void setY(int y){
        this.y=y;
    }  
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
}

class Triangle{

    private static float getDistanceBetweenTwoPoints(Point a,Point b){
        float p1=b.getX()-a.getX();
        float p2=b.getY()-a.getY();
        return (float)Math.sqrt((p1*p1+p2*p2));
    }

    public static void isObtuseTriangle(Point a,Point b,Point c) throws ImpossibleTriangle, AcuteTriangle, RightTriangle{
        int all = a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY());

        if(all==0){
            throw new ImpossibleTriangle(null);
        }
        float seg1,seg2,seg3;
        seg1=getDistanceBetweenTwoPoints(a, b);
        seg2=getDistanceBetweenTwoPoints(b, c);
        seg3=getDistanceBetweenTwoPoints(a, c);
        System.out.println(seg1 + " " + seg2 + " " + seg3);

        if(seg1>=seg2&&seg1>=seg3){
            if(seg1*seg1==seg2*seg2+seg3*seg3){
                throw new RightTriangle("Right Triangle");
            }else if(seg1*seg1<seg2*seg2+seg3*seg3){
                throw new AcuteTriangle("Acute Triangle");           
            }else if(seg1*seg1>seg2*seg2+seg3*seg3){
                System.out.println("This is an Obtuse Triangle");
            }
        }else if(seg2>=seg1&&seg2>=seg3){
            if(seg2*seg2==seg1*seg1+seg3*seg3){
                throw new RightTriangle("Right Triangle");
            }else if(seg2*seg2<seg1*seg1+seg3*seg3){
                throw new AcuteTriangle("Acute Triangle");                 
            }else if(seg2*seg2>seg1*seg1+seg3*seg3){
                System.out.println("This is an Obtuse Triangle");
            }

        }else if(seg3>=seg2&&seg3>=seg1){
            if(seg3*seg3==seg2*seg2+seg1*seg1){
                throw new RightTriangle("Right Triangle");
            }else if(seg3*seg3<seg2*seg2+seg1*seg1){
                throw new AcuteTriangle("Acute Triangle");                  
            }else if(seg3*seg3>seg2*seg2+seg1*seg1){
                System.out.println("This is an Obtuse Triangle");
            }

        }


    }
}

//Mustea Dumitru-Dan Lab06_6
public class MusteaDan_Lab06_6 {

    public static float getRandomFloatBetweenRange(double min, double max){
        float number = (float)((Math.random()*((max-min)+1))+min) ;
        return number;
    }
    public static void main(String[] args) throws OverSaturated {
        final int MIN = 0; // 0 by default
        final int MAX = 2255; //255 by default 
        HSV hsvObj = new HSV();
        RGB rgbObj = new RGB(); 

        int tries=0;
        boolean ok=false;
        while(ok==false && tries<10){
            try{
                System.out.println("=========== The "+(tries+1)+" attempt =============");
                rgbObj.setRGB(getRandomFloatBetweenRange(MIN, MAX), getRandomFloatBetweenRange(MIN, MAX), getRandomFloatBetweenRange(MIN, MAX));
                System.out.println(rgbObj.toString());
                hsvObj = Color.RGBtoHSV(rgbObj);
                System.out.println("============= The result ==============");
                System.out.println(hsvObj.toString());
                ok=true;
            }catch(OverSaturated E){
                System.out.println("Exception caught");
            }
            tries++;
        }
        if(tries>=10){
            throw new OverSaturated(null);
        }


    }
}

class OverSaturated extends Exception{
    private static final long serialVersionUID = 8509900960280807078L;

    public OverSaturated(String message){
        super(message);
    }
}


class Color{
    public static HSV RGBtoHSV(RGB rgbObj) throws OverSaturated{
        HSV hsvObj = new HSV();
        float min,max,delta;
        min = Math.min(rgbObj.getR(),Math.min(rgbObj.getG(),rgbObj.getB()));
        max = Math.max(rgbObj.getR(),Math.max(rgbObj.getG(),rgbObj.getB()));
        hsvObj.setV(max);
        delta=max-min;

        if(max!=0){
            hsvObj.setS((delta/max)*100);
        }else{
            hsvObj.setS(0);
            hsvObj.setH(-1);
        }

        if(rgbObj.getR()==0){
            hsvObj.setH((rgbObj.getG()-rgbObj.getB())/delta);
        }else if(rgbObj.getG()==max){
            hsvObj.setH(2+(rgbObj.getB()-rgbObj.getR())/delta);
        }else{
            hsvObj.setH(4+(rgbObj.getR()-rgbObj.getG())/delta);
        }

        hsvObj.setH(hsvObj.getH()*60);
        if(hsvObj.getH()<0){
            hsvObj.setH(hsvObj.getH()+360);
        }

        if(hsvObj.getS()>90){
            throw new OverSaturated(null);
        }

        return hsvObj;
    }

    public static RGB HSVtoRGB(HSV hsvObj){
        RGB rgbObj = new RGB();
        int i;
        float f, p, q, t;
        
        if(hsvObj.getS()==0){
            rgbObj.setR(hsvObj.getV());
            rgbObj.setR(hsvObj.getV());
            rgbObj.setR(hsvObj.getV());
        }

        // sector 0 to 5
        i = (int)Math.floor(hsvObj.getH());
        f=hsvObj.getH()-i;
        p=hsvObj.getV()*(1-hsvObj.getS());
        q=hsvObj.getV()*(1-hsvObj.getS()*f);
        t=hsvObj.getV()*(1-hsvObj.getS()*(1-f));

        switch( i ) {
            case 0:
                rgbObj.setR(hsvObj.getV());
                rgbObj.setG(t);
                rgbObj.setB(p);
                break;
            case 1:
                rgbObj.setR(q);
                rgbObj.setG(hsvObj.getV());
                rgbObj.setB(p);
                break;
            case 2:
                rgbObj.setR(p);
                rgbObj.setG(hsvObj.getV());
                rgbObj.setB(t);
                break;
            case 3:
                rgbObj.setR(p);
                rgbObj.setG(q);
                rgbObj.setB(hsvObj.getV());
                break;
            case 4:
                rgbObj.setR(t);
                rgbObj.setG(p);
                rgbObj.setB(hsvObj.getV());
                break;
            // case 5:
            default:		
                rgbObj.setR(hsvObj.getV());
                rgbObj.setG(p);
                rgbObj.setB(q);
                break;
        }



        return rgbObj;
    }

}

class RGB{
    private float r;
    private float g;
    private float b;
    public void setR(float r){
        this.r=r;
    }
    public void setG(float g){
        this.g=g;
    }
    public void setB(float b){
        this.b=b;
    }
    public void setRGB(float r,float g,float b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public float getR(){
        return this.r;
    }
    public float getG(){
        return this.g;
    }
    public float getB(){
        return this.b;
    }
    RGB(){
        this.r=0;
        this.g=0;
        this.b=0;
    }
    RGB(float r,float g,float b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    @Override
    public String toString() {
        return Float.toString(this.r)+"  "+Float.toString(this.g)+"  "+Float.toString(this.b);
    }
}

class HSV{
    private float h;
    private float s;
    private float v;
    public void setH(float h){
        this.h=h;
    }
    public void setS(float s){
        this.s=s;
    }
    public void setV(float v){
        this.v=v;
    }
    public void setHSV(float h,float s,float v){
        this.h=h;
        this.s=s;
        this.v=v;
    }
    public float getH(){
        return this.h;
    }
    public float getS(){
        return this.s;
    }
    public float getV(){
        return this.v;
    }
    HSV(){
        this.h=0;
        this.s=0;
        this.v=0;
    }
    HSV(float h,float s,float v){
        this.h=h;
        this.s=s;
        this.v=v;
    }
    @Override
    public String toString() {
        return Float.toString(this.h)+"  "+Float.toString(this.s)+"  "+Float.toString(this.v);
    }
}

//Mustea Dumitru-Dan Lab06_7
import ImageProcessor.*;

public class MusteaDan_Lab06_7 {
    public static short getRandomShortBetweenRange(int min, int max){
        return (short)((Math.random()*((max-min)+1))+min);
    }
    public static void main(String[] args) {
        final int MIN = 0; // 0 by default
        final int MAX = 255; //255 by default 
        final int N = 2048;
        final int M = 2048;
        final short R=190;
        final short G=255;
        final short B=210;

        long startNano = System.nanoTime();
        long startMili = System.currentTimeMillis();
        MyImage screen = new MyImage(N,M);
        System.out.println("======== Uninitialized display ========");
        screen.display();
        System.out.println("======== Random values display ========");
        for(int i=0;i<screen.getN();i++){
            for(int j=0;j<screen.getM();j++){
                Pixel aux = new Pixel(getRandomShortBetweenRange(MIN,MAX),getRandomShortBetweenRange(MIN,MAX),getRandomShortBetweenRange(MIN,MAX));
                screen.setPixel(i, j, aux);
            }
        }
        screen.display();

        System.out.println("======== Whitin Parameters values display ========");
        screen.matrixWithinParameters(R,G,B);
        screen.display();

        System.out.println("======== Delete all pixels display ========");
        screen.deleteAllPixels();
        screen.display();
        
        System.out.println("======== Elapsed Time ========");
        long finishNano = System.nanoTime();
        long finishMili = System.currentTimeMillis();
        long timeElapsedNano = finishNano - startNano;
        long timeElapsedMili = finishMili - startMili;
        System.out.println("Nano time: "+timeElapsedNano);
        System.out.println("Miliseconds time: "+timeElapsedMili);

        /* --------------------------------------------------------------------------- */
        /*                              My Timing Results                              */
        /* --------------------------------------------------------------------------- */
        /*  For 32:32       Nano Time:  174545580       Miliseconds Time:  174         */
        /*  For 64:64       Nano Time:  264782212       Miliseconds Time:  265         */
        /*  For 128:128     Nano Time:  552479506       Miliseconds Time:  553         */
        /*  For 256:256     Nano Time:  1378148931      Miliseconds Time:  1378        */
        /*  For 512:512     Nano Time:  4617479694      Miliseconds Time:  4617        */
        /*  For 1024:2014   Nano Time:  16448860334     Miliseconds Time:  16449       */
        /* --------------------------------------------------------------------------- */
        /* The program has a complixity of about O(8*n*m):                             */
        /*   4 ciclyes of which are used for displaying                                */
        /*   1 for assinging instantiation                                             */
        /*   1 for assinging values                                                    */
        /*   1 for keeping the values whiting certain parameters                       */
        /*   1 for deleting the values                                                 */
        /* Compiled on a 6 core AMD FX 6300 processor                                  */
        /* --------------------------------------------------------------------------- */
    }
}
//Mustea Dumitru-Dan Lab06_8
import java.util.Scanner;
import java.util.regex.Pattern;

public class MusteaDan_Lab06_8 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert a valid Romanian car plate");              
        boolean flag=false;
        while(flag==false){
            String registrationPlate;
            registrationPlate=keyboard.nextLine();
            //registrationPlate="CJ36DAN";
            try{
                Plate.isValidPlate(registrationPlate);
                System.out.println("Valid plate!");
                flag=true;
            }catch(InvalidPlate E){
                System.out.println("The plate is incorrect");
            }
        }

    }
}

class Plate{
    public static boolean isValidPlate(String registrationPlate) throws InvalidPlate{
        //^((?<county>[a-zA-Z]{2}|[bB])[- ]?(?<number>\d{2}|(?<=[bB][- ]?)\d{3})[- ]?(?<letters>([a-hj-np-zA-HJ-NP-Z][a-zA-Z][a-hj-np-zA-HJ-NP-Z]))$)
        String registrationPlateLaw = "^((?<county>[a-zA-Z]{2}|[bB])[- ]?(?<number>\\d{2}|(?<=[bB][- ]?)\\d{3})[- ]?(?<letters>([a-hj-np-zA-HJ-NP-Z][a-zA-Z][a-hj-np-zA-HJ-NP-Z]))$)";
        boolean flag = Pattern.matches(registrationPlateLaw,registrationPlate);
        if(flag==true){
            return true;
        }else{
            throw new InvalidPlate(null);
        }
    }
}


class InvalidPlate extends Exception{
    private static final long serialVersionUID = 7749371412795159684L;

    public InvalidPlate(String message){
        super(message);
    }    
}//Mustea Dumitru-Dan Lab06_9
import java.util.Scanner;
import java.lang.Exception;

public class MusteaDan_Lab06_9 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Position hardCodedPoint = new Position("hardCodedPoint",2,4,4);
        int distance = 3;
        Position array[]=new Position[3];
        int n;
        System.out.println("Insert the number of position objects");
        n=IntegerRead();
        try{
            for(int i=0;i<n;i++){
                boolean flag=false;
                while(flag==false){//until we find a good point
                    String point_name;
                    int x,y,z;
                    try{//only allow points that are a certain distance apart from the hard coded point
                        point_name=stringRead();
                        x=IntegerRead();
                        y=IntegerRead();
                        z=IntegerRead();
                        Position aux=new Position(point_name,x,y,z);
                        if(Position.checkClose(hardCodedPoint,aux,distance)==true){
                            flag=true;
                            array[i] = new Position(point_name,x,y,z);  
                        }else{
                            flag=false;
                            throw new PointTooClose(null);
                        }
                    }catch(PointTooClose E){
                        System.out.println("The point is too close");
                    }
                }
  
            }
        }catch(ArrayIndexOutOfBoundsException E){
            System.out.println("The nubmer of objects is too high");
        }
    }

    private static int IntegerRead(){
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
    private static String stringRead(){
        String string;
        try{
            System.out.println("Insert a string");
            string=keyboard.next(); 
            return string;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return "Default";
        }
    }
    
}

class PointTooClose extends Exception{
    private static final long serialVersionUID = 4924023854813034704L;

    public PointTooClose(String message){
        super(message);
    }    
}

class Position{

    private String point_name;
    private Integer x,y,z;
    public Position(){
        point_name="default";
        x=0;
        y=0;
        z=0;
    }
    public Position(String point_name,int x,int y,int z){
        this.point_name=point_name;
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setXYZ(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setName(String point_name){
        this.point_name=point_name;
    }
    public void setXYZ(String point_name,int x,int y,int z){
        this.point_name=point_name;
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String getName(){
        return this.point_name;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getZ(){
        return this.z;
    }
    public static boolean checkClose(Position a,Position b,float distance) throws PointTooClose{
        //The equation d = ((x2 - x1)2 + (y2 - y1)2 + (z2 - z1)2)^1/2 
        int p1= b.getX()-a.getX();
        int p2= b.getY()-a.getY();
        int p3= b.getZ()-a.getZ();
        float d = (float)Math.sqrt(p1*p1+p2*p2+p3*p3);
        if(d<distance){//too close
            return false;
        }else{
            return true;
        }

    }


}//Mustea Dumitru-Dan Lab06_10
import dbInteraction.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MusteaDan_Lab06_10 {//Main class
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}

class Datebase{

}

class VerifyPersonExtended extends VerifyPerson{
    public boolean checkPassword(){
        String nameFormat = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
        return Pattern.matches(nameFormat,this.getSurename());
    }
    public boolean checkUserID(){
        String nameFormat ="[a-zA-Z0-9.]";
        return Pattern.matches(nameFormat,this.getSurename());
    }
}

class Test{

}
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



