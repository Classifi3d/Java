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
