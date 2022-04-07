//Mustea Dumitru-Dan Lab02_4
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
}
