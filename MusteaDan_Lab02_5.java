//Mustea Dumitru-Dan Lab02_5
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
