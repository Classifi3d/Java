//Mustea Dumitru-Dan Lab06_10
import dbInteraction.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MusteaDan_Lab06_10 {//Main class
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}

class Datebase{

}

class VerifyPersonExtended extends VerifyPerson{
    public boolean checkPassword(){
        String nameFormat = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
        return Pattern.matches(nameFormat,this.getSurename());
    }
    public boolean checkUserID(){
        String nameFormat ="[a-zA-Z0-9.]";
        return Pattern.matches(nameFormat,this.getSurename());
    }
}

class Test{

}
