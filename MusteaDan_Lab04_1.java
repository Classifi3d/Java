//Mustea Dumitru-Dan Lab04_1   
import java.util.Scanner;

public class MusteaDan_Lab04_1 {
    private static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);
        Methods methods = new Methods();
    
        System.out.println("==== 1st Method ====");
        double avg=methods.meanOfNumbers("4.53243","5.2323","1.2222","5.232","3.3","9.3","0.0002","1.003,2");
        System.out.println(avg);

        System.out.println("==== 2nd Method ====");
        System.out.println("Insert an integer");
        int n = keyboard.nextInt();
        double doubleArray[];
        doubleArray=methods.doubleArray(n);
        int length=doubleArray.length;
        for(int i=0;i<length;i++){//displaying the double array
            System.out.print(doubleArray[i]+" ");
        }System.out.println();

        System.out.println("==== 3rd Method ====");
        char charArray[]="Hey this is the original string!".toCharArray();
        System.out.println(charArray);
        charArray=methods.toUppercase(charArray);
        System.out.println(charArray);

    }
}

class Methods{

    
    private static double getRandomDoubleBetweenRange(double min, double max){//generates a double number between 2 values 
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }

    public double meanOfNumbers(String... args){//returns the means of all the parameters
        double sum=0.f;
        for(String arg: args){
            try{//the try is present not only to make sure the parameters entered are valid, but also to prevent a double overflow
                sum+=Double.parseDouble(arg);//adding to a sum float varaibles then converting them into double 

            }
            catch(NumberFormatException e){  
            }
        }
        return sum/args.length;
    }

    public double[] doubleArray(int n){
        double array[] = new double[n];
        for(int i=0;i<n;i++){
            array[i]=getRandomDoubleBetweenRange(-100000,100000);//generates random Z numbers and adding them to the array
        }
        return array;
    } 

    public char[] toUppercase(char[] array){
        int length=array.length;
        for(int i=0;i<length;i++){
            if(array[i]>='a' && array[i]<='z'){//if a character is lowercase 
                array[i]-=('a' - 'A');//using the ascii values, decress it's value with the difference between lowercase and uppercase elements to make it uppercase
            }
        }
        return array;
    }

}




