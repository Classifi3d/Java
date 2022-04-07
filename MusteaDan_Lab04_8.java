//Mustea Dumitru-Dan Lab04_8
import java.util.Scanner;

public class MusteaDan_Lab04_8 {
    public static void main(String args[]){
        Key key = new Key();//making a key object and displaying it
        key.display();
    }
}

class Key{
    private static Scanner keyboard = new Scanner(System.in); 
    
    private char[] charArray= new char[20];
    Key(){
        System.out.println("Enter a key with 20 digits or uppercase character");
        String stringKey = keyboard.nextLine();
        char[] arrayKey = stringKey.toCharArray();
        for(int i=0;i<20;i++){
            charArray[i]=arrayKey[i];
        }
        verify();
    }

    private boolean verifyChar(){//a first verification which determines if the key has the correct values in it
        boolean flag=true;
        for(int i=0;i<20;i++){
            if(!((charArray[i]>='A'&&charArray[i]<='Z')||(charArray[i]>='0'&&charArray[i]<='9'))){//only upper characters and digits
                flag=false;
            }
        }
        return flag;
    }
    public void display(){//displays the key with the '-' characters once every 5 digits
        for(int i=0;i<20;i++){
            System.out.print(charArray[i]);
            if(i==4||i==9||i==14){
                System.out.print("-");
            }
        }System.out.print('\n');
    }

    private int numberOfLetters(){//counts how many letters there are in the key
        if(verifyChar()==true){
            int counter=0;
            for(int i=0;i<20;i++){
                if(charArray[i]>='A'&&charArray[i]<='Z'){
                    counter++;
                }
            }
            //System.out.println("Number of letters "+counter);
            return counter;
        }else{
            //System.out.println("The key is invalid");
            return -1;
        }
    }
    private int numberOfDigits(){//counts how many digits there are in the key
        if(verifyChar()==true){
            int counter=0;
            for(int i=0;i<20;i++){
                if(charArray[i]>='0'&&charArray[i]<='9'){
                    counter++;
                }
                
            }      
            //System.out.println("Number of digits "+counter);
            return counter;
        }else{
            //System.out.println("The key is invalid");
            return -1;
        }
    }

    public void verify(){
        int digits=numberOfDigits();
        int letters=numberOfLetters();
        if(digits>letters&&letters>0&&digits>0){//if the number of digits is bigger then the number of letters, and also if the results are valid then the key is correct
            System.out.println("Valid Key!");
        }else{
            System.out.println("Invalid Authentication Key!");
        }
    }

}
