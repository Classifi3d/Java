//Mustea Dumitru-Dan Lab03_4
import java.util.Scanner;

public class MusteaDan_Lab03_4 {
    private static Scanner keyboard;

    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString="";
        System.out.println("Insert a number");//reading the string
        inputString = keyboard.nextLine();
        try{
            int number = Integer.valueOf(inputString);//converting the string into a number
            System.out.print("The number in binary form: ");
            System.out.println(Integer.toBinaryString(number));//printing the result in binary
            System.out.print("The number in octal form: ");
            System.out.println(Integer.toOctalString(number));//printing the result in octal
            System.out.print("The number in hex form: ");
            System.out.println(Integer.toHexString(number));//printing the result in hex
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input");//invalid input
        }

    }
}

