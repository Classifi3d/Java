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

