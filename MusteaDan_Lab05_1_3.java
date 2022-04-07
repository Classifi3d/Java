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
