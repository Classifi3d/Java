//Mustea Dumitru-Dan Lab03_7
import java.util.Scanner;

public class MusteaDan_Lab03_7 {
    private static Scanner keyboard;

    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString="0";
        System.out.println("Insert a number that's bigger than 16.777.216");//reading the string
        inputString = keyboard.nextLine();
        int val=Integer.parseInt(inputString);//making it an int
		System.out.println(Integer.toBinaryString(val)); 
		int bitmask = 0x000000FF;//the mask for least significant byte
		System.out.println(Integer.toBinaryString(val & bitmask));
		bitmask = 0x0000FF00;//the mask for the 2nd byte
		System.out.println(Integer.toBinaryString((val & bitmask)>>8));
		bitmask = 0x00FF0000;//the mask for the 3rd byte
		System.out.println(Integer.toBinaryString((val & bitmask)>>16));
		bitmask = 0xFF000000;//the mask for the most significant byte
		System.out.println(Integer.toBinaryString((val & bitmask)>>24));
    }
}

