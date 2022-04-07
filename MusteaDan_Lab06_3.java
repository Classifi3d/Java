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
