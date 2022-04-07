//Mustea Dumitru-Dan Lab06_1
import java.util.Scanner;

public class MusteaDan_Lab06_1 {

    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]){

        int n;
        try{
            System.out.println("Insert a number");
            n=keyboard.nextInt(); 
        }catch(Exception E){
            System.out.println("Wrong type of number");
            n=0;
        }

        double array[] = new double[n];

        for(int i=0;i<n;i++){
            try{
                System.out.println("Insert a number");
                array[i]=keyboard.nextInt(); 
            }catch(Exception E){
                System.out.println("Wrong type of number");
                array[i]=0;
            }
        }
        try{
            for(int i=0;i<n*2;i++){//programming erorr
                System.out.println("Insert a number");
                System.out.println(array[i]); 
            }            
        }catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("Invalid index for accessing the array!");
        }

    }
}
