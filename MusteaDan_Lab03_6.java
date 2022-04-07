//Mustea Dumitru-Dan Lab03_6
import java.lang.Math;

public class MusteaDan_Lab03_6 {
    public static double getRandomDoubleBetweenRange(double min, double max){
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }
    
    public static void main(String args[]){
        double number0,number1,number2,operationDouble;

        number0 = Math.random();
        System.out.println("A random generated number");
        System.out.println(number0);

        number1=getRandomDoubleBetweenRange(-1000000,1000000);
        number2=getRandomDoubleBetweenRange(-1000000,1000000);
        System.out.println("The 2 random generated numbers");
        System.out.println(number1 + " and " + number2);
        operationDouble=getRandomDoubleBetweenRange(1,4);
        //System.out.println(operationDouble);
        int operation = (int) operationDouble;

        if(operation==1){
            System.out.println("The random operation is addition");
            System.out.println(number1+number2);
        }else if(operation==2){
            System.out.println("The random operation is subtraction");
            System.out.println(number1-number2);
        }else if(operation==3){
            System.out.println("The random operation is multiplication");
            System.out.println(number1*number2);
        }else{
            System.out.println("The random operation is division");
            System.out.println(number1/number2);
        }
    }
}

