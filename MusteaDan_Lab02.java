//Mustea Dumitru-Dan Lab02_2
import java.util.Scanner;

class MusteaDan_Lab02_2 {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        //maxium number before overflow is 20

        long inputNumber = keyboard.nextInt();
        long outputNumber=1;
        
        for(long i=inputNumber;i>0;i--){
            outputNumber*=i;
        }

        System.out.println(outputNumber);
    }   
}

//Mustea Dumitru-Dan Lab02_3
import java.util.Scanner;

class MusteaDan_Lab02_3 {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        
        System.out.println("Enter two integers");

        long inputNumber1 = keyboard.nextInt();
        long inputNumber2 = keyboard.nextInt();
        while(inputNumber1!=inputNumber2){
            if(inputNumber1>inputNumber2){
                inputNumber1=inputNumber1-inputNumber2;
            }
            else{
                inputNumber2=inputNumber2-inputNumber1;
            }
        }
        System.out.println(inputNumber1);
    }   
}//Mustea Dumitru-Dan Lab02_4
import java.util.Scanner;

class MusteaDan_Lab02_4 {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        long inputNumber = keyboard.nextInt();
        for(int i=2;i<inputNumber/2;i++){
            if(inputNumber%i==0){
                System.out.println(i);
                while(inputNumber%i==0){
                    inputNumber/=i;
                }
            }
        }

        System.out.println(inputNumber);
    }   
}//Mustea Dumitru-Dan Lab02_5
import java.util.Scanner;

class MusteaDan_Lab02_5 {
    private static Scanner keyboard;

    private static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    } 

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        
        System.out.println("Enter the of integer that will be read from the keyboard");
        long inputNumberOfValues = keyboard.nextInt();
        for(long i=0;i<inputNumberOfValues;i++){
            int number;
            number = keyboard.nextInt();
            if(isPrime(number)==true){
                System.out.println("It's prime!");
            }else{
                System.out.println("It's NOT prime!");   
            }
        }

    }   
}