//Mustea Dumitru-Dan Lab03_10
import java.util.Scanner;
import java.lang.System;

public class MusteaDan_Lab03_10 {
    private static Scanner keyboard;   
    
    public static double getRandomDoubleBetweenRange(double min, double max){//generates a double number between 2 values 
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }
    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String A,B = new String();
        System.out.println("Insert the A string");//reading the string
        A = keyboard.nextLine();
        int aLength=A.length();


        //System.out.println("Insert the B string");//reading the key string
        //B = keyboard.nextLine();
        B="fsad";//key
        B.toLowerCase();
        int bLength=B.length();
        int bNumbers[]=new int[bLength];
        System.out.println("Associated numerical values for string B");
        for(int i=0;i<bLength;i++){
            bNumbers[i]=(int)getRandomDoubleBetweenRange(0, 100);//the int values associated for string B
            System.out.print(bNumbers[i]+" ");
        }System.out.print("\n");


        //finding the sum
        int sum=0;
        for(int i=0;i<aLength;i++){
            for(int j=0;j<bLength;j++){
                if(A.charAt(i)==B.charAt(j)){//if the same letter is found
                    //System.out.println("A: "+A.charAt(i)+"B: "+B.charAt(j));
                    sum+=bNumbers[j]+i+1;//add the value of the letter from string B, add the index of A and add 1 for the diffrence of index counting
                }
            }
        }
        
        //encryption check
        System.out.println(sum);
        if(sum<101){//if it's 100 or less the enctyption fails
            System.out.println("INVALID ENCRYPTION");
        }else{
            System.out.println("VALID ENCRYPTION");
        }
    }
}

