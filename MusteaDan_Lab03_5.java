//Mustea Dumitru-Dan Lab03_5
import java.util.Scanner;
import java.util.Arrays;

public class MusteaDan_Lab03_5 {
    private static Scanner keyboard;

    public static void insertionSort(int array[]) {//INSERTION SORT  
        int length = array.length;  
        for (int j = 1; j < length; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }
    
    public static void bubbleSort(int array[]){ //BUBBLE SORT  
        int length = array.length;
        int i, j;  
        for (i = 0; i < length-1; i++){     
        for (j = 0; j < length-i-1; j++){  
            if (array[j] > array[j+1]){  
                int aux = array[j];
                array[j] = array[j+1];
                array[j+1] = aux;  
            }
        }
        }
    }

    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString1="",inputString2="";
        System.out.println("Insert the number of integers that will be read");//reading the string
        inputString1 = keyboard.nextLine();
        //https://stackoverflow.com/questions/5439529/determine-if-a-string-is-an-integer-in-java look more into different methods of working
        int number1=0;
        number1 = Integer.valueOf(inputString1);//converting the string into a number
        int numberArray[] = new int[number1];
        int numberArrayAux[] = new int[number1];
        for(int i=0;i<number1;i++){//reading the amount of numbers inputed earlier
            inputString2 = keyboard.nextLine();
            numberArray[i] = Integer.valueOf(inputString2);//converting the string into a number
        }

        System.out.println("====Original-Array====");//original aray
        System.out.println(Arrays.toString(numberArray));

        System.arraycopy(numberArray,0,numberArrayAux,0,number1);
        Arrays.sort(numberArray);
        System.out.println("====Quick-Sorted====");
        System.out.println(Arrays.toString(numberArray));//quick sorted

        System.arraycopy(numberArrayAux,0,numberArray,0,number1);
        insertionSort(numberArray);
        System.out.println("====Insertion-Sorted====");
        System.out.println(Arrays.toString(numberArray));//insertion sorted

        System.arraycopy(numberArrayAux,0,numberArray,0,number1);
        bubbleSort(numberArray);
        System.out.println("====Bubble-Sorted====");
        System.out.println(Arrays.toString(numberArray));//bubble sorted        
        
    }
}

