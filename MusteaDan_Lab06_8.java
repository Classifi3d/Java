//Mustea Dumitru-Dan Lab06_8
import java.util.Scanner;
import java.util.regex.Pattern;

public class MusteaDan_Lab06_8 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert a valid Romanian car plate");              
        boolean flag=false;
        while(flag==false){
            String registrationPlate;
            registrationPlate=keyboard.nextLine();
            //registrationPlate="CJ36DAN";
            try{
                Plate.isValidPlate(registrationPlate);
                System.out.println("Valid plate!");
                flag=true;
            }catch(InvalidPlate E){
                System.out.println("The plate is incorrect");
            }
        }

    }
}

class Plate{
    public static boolean isValidPlate(String registrationPlate) throws InvalidPlate{
        //^((?<county>[a-zA-Z]{2}|[bB])[- ]?(?<number>\d{2}|(?<=[bB][- ]?)\d{3})[- ]?(?<letters>([a-hj-np-zA-HJ-NP-Z][a-zA-Z][a-hj-np-zA-HJ-NP-Z]))$)
        String registrationPlateLaw = "^((?<county>[a-zA-Z]{2}|[bB])[- ]?(?<number>\\d{2}|(?<=[bB][- ]?)\\d{3})[- ]?(?<letters>([a-hj-np-zA-HJ-NP-Z][a-zA-Z][a-hj-np-zA-HJ-NP-Z]))$)";
        boolean flag = Pattern.matches(registrationPlateLaw,registrationPlate);
        if(flag==true){
            return true;
        }else{
            throw new InvalidPlate(null);
        }
    }
}


class InvalidPlate extends Exception{
    private static final long serialVersionUID = 7749371412795159684L;

    public InvalidPlate(String message){
        super(message);
    }    
}