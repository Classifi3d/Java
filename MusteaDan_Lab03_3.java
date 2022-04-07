//Mustea Dumitru-Dan Lab03_3
import java.util.Scanner;
import java.lang.System;

public class MusteaDan_Lab03_3 {
    private static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString="";
        System.out.println("Insert a string");//reading the string
        inputString = keyboard.nextLine();
        
        char arrayA[] = inputString.toCharArray();//making a char array after the inputed string
        char arrayB[] = new char[inputString.length()];//making another with the same length
        System.arraycopy(arrayA,0,arrayB,0,3);//using arraycopu() to copy the first 3 characters from the 1st to the 2nd
        System.out.println(arrayB);//printing the result

    }
}

