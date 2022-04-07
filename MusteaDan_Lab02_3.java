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
}
