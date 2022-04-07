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

