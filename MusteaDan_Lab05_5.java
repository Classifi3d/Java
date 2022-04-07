//Mustea Dumitru-Dan Lab05_5   
import java.util.Arrays;

public class MusteaDan_Lab05_5 {
    public static void main(String[] args){
        String[] array = {"January","February","March","April","May","June","July","August","September","October","December"};
        System.out.println("======= Original array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> a.length() - b.length());
        System.out.println("======= Smallest to Largest Length Sorted array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> b.length() - a.length());
        System.out.println("======= Largest to smallest Length Sorted array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> a.compareTo(b));
        System.out.println("======= Alphabetically Sorted array =======");
        System.out.println(Arrays.toString(array)); 

        Arrays.sort(array, (a, b) -> a.compareTo(b));   
        Arrays.sort(array, (a, b) -> letterMfinder(b) - letterMfinder(a));
        System.out.println("======= Alphabetically Sorted with M strings first array =======");
        System.out.println(Arrays.toString(array)); 
    }

    static int letterMfinder(String a){
        a.toUpperCase();
        if(a.charAt(0)=='M'){
            return 1;
        }else{
            return 0;
        }
    }

}

