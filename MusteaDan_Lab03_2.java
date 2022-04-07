//Mustea Dumitru-Dan Lab03_2
import java.util.Scanner;

public class MusteaDan_Lab03_2 {
    private static Scanner keyboard;

    public static boolean canBeChar(String str){//verifies if it can be a char
        if(str.length()!=1){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString="",inputCharString="";//strings intializations
        char inputChar;
        System.out.println("Insert a string");//reading the string
        inputString = keyboard.nextLine();

        System.out.println("Insert a char");//reading the char which is currently a string
        inputCharString = keyboard.nextLine();

        if(canBeChar(inputCharString)==true){//if the 2nd string can be a char
            inputChar = inputCharString.charAt(0);//convert to char
            char charArray[] = inputString.toCharArray();//makes a new char array after the 1st input string
            int counter=0;

            for(int i=0;i<charArray.length;i++){//searches and counts the number of that char's occurences in the text
                if(charArray[i]==inputChar){
                    counter++;
                }
            }
            System.out.println(counter);//prints the number of occurences 
        }else{
            System.out.println("The character enterd is not a charater!");//the program asked for a character, the user entered multiple characters
        }
    }
}

