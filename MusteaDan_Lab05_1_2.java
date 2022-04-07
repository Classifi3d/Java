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


