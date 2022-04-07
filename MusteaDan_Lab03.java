//Mustea Dumitru-Dan Lab03_1
import java.util.Scanner;

class MusteaDan_Lab03_1{
    private static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);
        String inputString="";
        System.out.println("Insert a string");
        inputString = keyboard.nextLine();//read the string from keyboard which can be either int/string
        boolean isValidNumber = false;
        try{//if it can be an int
            int numberMonth = Integer.parseInt(inputString);//make it an int

            if(numberMonth>0 && numberMonth<13){//if it's between 1 and 12 
                String month;
                switch (numberMonth){//look for the name of the number of the month
                    case 1: month = "January"; break;
                    case 2: month = "February"; break;  
                    case 3: month = "March"; break;
                    case 4: month = "April"; break;
                    case 5: month = "May"; break;
                    case 6: month = "June"; break;
                    case 7: month = "July"; break;
                    case 8: month = "August"; break;
                    case 9: month = "September"; break;
                    case 10: month = "October"; break;
                    case 11: month = "November"; break;
                    case 12: month = "December"; break;
                    default: month = "Invalid data entered!";
                }
                System.out.println(month);//output the name
                isValidNumber = true;
            }
        }
        catch(NumberFormatException e){   
        
        }


        if (isValidNumber == false) {//if it's a string
            int numberMonth = 0;
            switch(inputString.toUpperCase()){//check if string is the name of a month
                case "JANUARY": numberMonth=1; break;
                case "FEBRUARY": numberMonth=2; break;
                case "MARCH": numberMonth=3; break;
                case "APRIL": numberMonth=4; break;
                case "MAY": numberMonth=5; break;
                case "JUNE": numberMonth=6; break;
                case "JULY": numberMonth=7; break;
                case "AUGUST": numberMonth=8; break;
                case "SEPTEMBER": numberMonth=9; break;
                case "OCTOBER": numberMonth=10; break;
                case "NOVEMBER": numberMonth=11; break;
                case "DECEMBER": numberMonth=12; break;
                default: numberMonth=0;
            }
            if(numberMonth>0&&numberMonth<13){//if it is, print it
                System.out.println(numberMonth);
            }else{
                System.out.println("Invalid data entered!");//incorrect input
            }
        }


    }
}
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

//Mustea Dumitru-Dan Lab03_3
import java.util.Scanner;
import java.lang.System;

public class MusteaDan_Lab03_3 {
    private static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString="";
        System.out.println("Insert a string");//reading the string
        inputString = keyboard.nextLine();
        
        char arrayA[] = inputString.toCharArray();//making a char array after the inputed string
        char arrayB[] = new char[inputString.length()];//making another with the same length
        System.arraycopy(arrayA,0,arrayB,0,3);//using arraycopu() to copy the first 3 characters from the 1st to the 2nd
        System.out.println(arrayB);//printing the result

    }
}

//Mustea Dumitru-Dan Lab03_4
import java.util.Scanner;

public class MusteaDan_Lab03_4 {
    private static Scanner keyboard;

    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        String inputString="";
        System.out.println("Insert a number");//reading the string
        inputString = keyboard.nextLine();
        try{
            int number = Integer.valueOf(inputString);//converting the string into a number
            System.out.print("The number in binary form: ");
            System.out.println(Integer.toBinaryString(number));//printing the result in binary
            System.out.print("The number in octal form: ");
            System.out.println(Integer.toOctalString(number));//printing the result in octal
            System.out.print("The number in hex form: ");
            System.out.println(Integer.toHexString(number));//printing the result in hex
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input");//invalid input
        }

    }
}

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

//Mustea Dumitru-Dan Lab03_6
import java.lang.Math;

public class MusteaDan_Lab03_6 {
    public static double getRandomDoubleBetweenRange(double min, double max){
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }
    
    public static void main(String args[]){
        double number0,number1,number2,operationDouble;

        number0 = Math.random();
        System.out.println("A random generated number");
        System.out.println(number0);

        number1=getRandomDoubleBetweenRange(-1000000,1000000);
        number2=getRandomDoubleBetweenRange(-1000000,1000000);
        System.out.println("The 2 random generated numbers");
        System.out.println(number1 + " and " + number2);
        operationDouble=getRandomDoubleBetweenRange(1,4);
        //System.out.println(operationDouble);
        int operation = (int) operationDouble;

        if(operation==1){
            System.out.println("The random operation is addition");
            System.out.println(number1+number2);
        }else if(operation==2){
            System.out.println("The random operation is subtraction");
            System.out.println(number1-number2);
        }else if(operation==3){
            System.out.println("The random operation is multiplication");
            System.out.println(number1*number2);
        }else{
            System.out.println("The random operation is division");
            System.out.println(number1/number2);
        }
    }
}

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

//Mustea Dumitru-Dan Lab03_8
import java.util.Scanner;

public class MusteaDan_Lab03_8 {
    private static Scanner keyboard;
    public static void displayMatrix(int matrix[][],int m){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        System.out.println("Insert the dimenstion of the matrix");//reading the number
        int m = keyboard.nextInt();
        int matrix[][] = new int[m][m];//instantiating the matrix

        int counter=1;//the value for each position that will be allocated
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                //System.out.println("|"+i+"-"+j+"|");
                matrix[i][j]=counter;
                counter++;//increasing the value
            }
        }
        //A
        System.out.println("Line by line matrix display");
        displayMatrix(matrix, m);
        System.out.println("Column by column matrix display");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[j][i]+" ");
            }System.out.println();
        }

        //B
        System.out.println("Insert two values, so that the matrix values that are not between those two will be deleted");
        int min = keyboard.nextInt();  
        int max = keyboard.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int val=matrix[i][j];
                if(val<min || val>max){//checking if the value if outside the bounds
                    matrix[i][j]=0;//making it 0 if it is
                }
            }
        }
        displayMatrix(matrix, m);

        //C
        System.out.println("Insert two values, which represent the indexs of a value, of which, it's neighbours will be dispalyed");
        int indexI = keyboard.nextInt();  
        int indexJ = keyboard.nextInt();
        if((indexI>=0&&indexI<m)&&(indexJ>=0&&indexJ<=m)){//the initial coordinates validation check
            if(indexI-1>=0&&indexI-1<m){//UP check
                System.out.println("The upwards neighbour is "+matrix[indexI-1][indexJ]);
            }
            if(indexJ+1>=0&&indexJ+1<m){//RIGHT check
                System.out.println("The right neighbour is "+matrix[indexI][indexJ+1]);
            }
            if(indexI+1>=0&&indexI+1<m){//DOWN check
                System.out.println("The downwards neighbour is "+matrix[indexI+1][indexJ]);            
            }
            if(indexJ-1>=0&&indexJ-1<m){//left check
                System.out.println("The left neighbour is "+matrix[indexI][indexJ-1]);            
            }
        }

    }
}

//Mustea Dumitru-Dan Lab03_9

public class MusteaDan_Lab03_9 {

    public static boolean isThisTheCard;//a "global" flag value which tells if the random genereated card is a valid one

    public static boolean isNotInDeck(String deck[],String card,int length){//looks for the random generated card in the deck
        for(int i=0;i<length;i++){
            if(deck[i]==card){//if the card was found in the deck
                return false;//then make it invalid
            }
        }
        return true;
    }

    public static double getRandomDoubleBetweenRange(double min, double max){//generates a double number between 2 values 
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }

    public static String randomCard(){//generates a random playing card
        int number,symbol;
        String card=new String();

        boolean okNumber=false,okSymbol=false;//flags which check for the card we need to find
        isThisTheCard=false;//setting the need card flag to 0, at each geneartion

        number=(int)getRandomDoubleBetweenRange(1,13);//NUMBER of the card
        if(number==1){//ace
            card="A";
        }else if(number==11){//jack
            okNumber=true;//checking the number flag
            card="J";
        }else if(number==12){//queen
            okNumber=true; //checking the number flag           
            card="Q";
        }else if(number==13){//king
            okNumber=true;//checking the number flag
            card="K";
        }else{
            if(number>8){
                okNumber=true;//checking the number flag
            }
            card=String.valueOf(number);
        }

        symbol=(int)getRandomDoubleBetweenRange(1,4);//SYMBOL of the card
        if(symbol==1){
            card+="♣";//clubs
            okSymbol=true;//checking the symbol flag
        }else if(symbol==2){
            card+="♦";//diamonds
        }else if(symbol==3){
            card+="♥";//hearts   
        }else if(symbol==4){
            card+="♠";//spades
        }

        if(okNumber==true&&okSymbol==true){//if both flags have been checked
            isThisTheCard=true;//we found the card
        }

        return card; 
    }

    public static void main(String args[]){
        String deck[]=new String[52];

        boolean cardFound=false;
        int position=0;//starting position of the deck
        
        while(cardFound==false && position<51){
            String card=randomCard();
            if(isThisTheCard==true){//has the card been found
                cardFound=true;
                System.out.println("===The card===");
                System.out.println(card);//display it
            }  
            if(isNotInDeck(deck, card, position+1)){//add a non-duplicate card to the deck 
                deck[position]=card;
                position++;//increasing the position
            }
        }

        System.out.println("===The deck===");
        for(int i=0;i<position;i++){//simplying displaying the deck with all the cards that were generated
            System.out.print(deck[i]+" ");
        }System.out.println();

    }
}
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

//Mustea Dumitru-Dan Lab03_11   
import java.util.Scanner;
import java.lang.System;

public class MusteaDan_Lab03_11 {
    private static Scanner keyboard;

    public static double getRandomDoubleBetweenRange(double min, double max){//generates a double number between 2 values 
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }

    public static void fillBoardBlank(char board[][],int dimension){//fiils the board with '*', the deafult 'blank' character
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                board[i][j]='*';
            }
        }
    }

    public static void displayBoard(char board[][],int dimension){//displays the board
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                System.out.print(board[i][j]);
            }System.out.println();
        }
    }

    public static boolean checkBoardWin(char board[][],int dimension){//checks the board if the game is over
        boolean win=false;
        /*
        Maybe not the best way to check for a winning state,
        since it a complexity of aproximately O( 2*N^2 + 2*N*sqrt(2) )
        which is pretty bad considering the check
        has to be made after every insertion of a new sign
        */
        //====check horizontal lines====
        for(int i=0;i<dimension;i++){
            boolean indentical=true;
            for(int j=1;j<dimension;j++){
                if(board[i][j-1]!='*'){//only if it's not blank
                    if(board[i][j]!=board[i][j-1]){//comparing with a past element
                        indentical=false;
                    }
                }
            }
            if(indentical==true){
                win=true;
            }
        }
        
        //====check vertical lines====
        for(int j=0;j<dimension;j++){
            boolean indentical=true;
            for(int i=1;i<dimension;i++){
                if(board[i][j]!='*'){//only if it's not blank
                    if(board[i][j]!=board[i-1][j]){//comparing with a past element
                        indentical=false;
                    }
                }
            }
            if(indentical==true){
                win=true;
            }
        }

        //====check the primary diagonal==== 
        boolean identical_diag1=true;
        for(int i=1;i<dimension;i++){
            if(board[i][i]!='*'){//only if it's not blank
                if(board[i][i]!=board[i-1][i-1]){//comparing with a past element
                identical_diag1=false;
                }
            }
        }
        if(identical_diag1==true){
            win=true;
        }
        //====check the secondary diagonal==== 
        boolean identical_diag2=true;
        int i=1,j=dimension-2;
        while(i<dimension||j>=0){
            if(board[i][i]!='*'){//only if it's not blank
                if(board[i][j]!=board[i-1][j+1]){//comparing with a past element
                    identical_diag2=false;
                }
            }
            i++;
            j--;
        }
        if(identical_diag2==true){
            win=true;
        }
        

        if(win==true){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isBoardFilled(char board[][],int dimension){
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                if(board[i][j]=='*'){
                    return false;
                }
            }
        }
        return true;
    }

    public static void fillBoard(char board[][],int dimension,char sign){
        int i=(int)getRandomDoubleBetweenRange(0, dimension-1);
        int j=(int)getRandomDoubleBetweenRange(0, dimension-1);

        //while(board[i][j]!='*' || isBoardFilled(board,dimension)==true){
            while(board[i][j]!='*'){
            i=(int)getRandomDoubleBetweenRange(0, dimension-1);
            j=(int)getRandomDoubleBetweenRange(0, dimension-1);
        }
        if(isBoardFilled(board,dimension)==true){
            System.out.println("The whole board is filled");
        }else{
            System.out.println(i+" "+j+" "+sign);
            board[i][j]=sign;
        }
    }
    public static void main(String args[]){
        keyboard = new Scanner(System.in);

        int dimension;
        System.out.println("Insert the dimensions of the board");//reading the int number
        dimension = 3;//keyboard.nextInt();
        char board[][]=new char[dimension][dimension];
        fillBoardBlank(board, dimension);

        boolean signSwitch=true;//X=true, 0=false, also it's true because X always starts first
        int failureCounter=dimension*dimension-1;
        while(checkBoardWin(board, dimension)!=true || failureCounter>0){
            System.out.println("The board has a win state:"+checkBoardWin(board, dimension));
            if(signSwitch==true){
                fillBoard(board, dimension, 'X');
                signSwitch=false;
            }else if(signSwitch==false){
                fillBoard(board, dimension, '0');
                signSwitch=true;
            }
            displayBoard(board, dimension);
            failureCounter--;
        }

        System.out.println("Game Over!");

    }
}

