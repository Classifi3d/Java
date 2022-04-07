//Mustea Dumitru-Dan Lab06_2
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusteaDan_Lab06_2 {

    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]){

        int n;
        try{
            System.out.println("Insert a number that corresponds to a type of exception. 1-Arithmetic 2.IndexOutOfBounds 3.Security 4.FileNotFound 5.NullPointer 6.NumberFormat");
            n=keyboard.nextInt(); 
        }catch(Exception E){
            System.out.println("Wrong type of number");
            n=1;
        }

        try{
            assert (n>=1&&n<=6);
            switch(n){
                case 1:
                    throw new ArithmeticException();
                case 2:
                    throw new IndexOutOfBoundsException(); 
                case 3:
                    throw new SecurityException(); 
                case 4:
                    throw new FileNotFoundException(); 
                case 5:
                    throw new NullPointerException();
                case 6:
                    throw new NumberFormatException(); 
            }
        }
        catch(ArithmeticException E){
            System.out.println("Arithmetic Exception caught!");
        }
        catch(IndexOutOfBoundsException E){
            System.out.println("Index Out Of Bounds Exception caught!");
        }
        catch(SecurityException E){
            System.out.println("Security Exception caught!");
        }
        catch(FileNotFoundException E){
            System.out.println("File Not Found Exception caught!");
        }
        catch(NullPointerException E){
            System.out.println("Null Pointer Exception caught!");
        }
        catch(NumberFormatException E){
            System.out.println("Number Format Exception caught!");
        }
        catch (AssertionError E) {
            System.out.println("Invalid Number");
        }
        catch(Exception E){
            System.out.println("General Exception caught!");
        }
        finally{
            System.out.println("Exceptions may or may not have been found");
        }
 
        



    }
}
