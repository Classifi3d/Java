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

