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

