//Mustea Dumitru-Dan Lab04_3
import java.util.LinkedList;
import java.util.Scanner;

public class MusteaDan_Lab04_3 {
    public static void main(String args[]){
        //instantiating an object
        Matrix example = new Matrix();
        int matrix[][];
        matrix=new int[2][2];
        matrix[0][0]=100;
        matrix[0][1]=98;
        matrix[1][0]=85;
        matrix[1][1]=97;
        //set method
        example.setMatrix(matrix,2,2);
        //display method
        example.displayMatrix();
        //get methods
        System.out.println(example.getN());
        System.out.println(example.getM());
        int matrix2[][]=new int[example.getN()][example.getM()];
        example.getMatrix(matrix2);
        //copying the matrix
        Matrix example2 = new Matrix();
        example2.setMatrix(matrix2,example.getN(),example.getM());
        //display the 2nd matrix to show that the copying was succesful
        example2.displayMatrix();

        //adjecent element compare method, returned as a linked list
        LinkedList<Integer> neighbours = new LinkedList<Integer>();
        neighbours.add(3);
        neighbours = example.neighbourFinder(0,0);
        System.out.println("neighbour list: "+neighbours);  

        //toString overriden method
        System.out.print(example.toString());   

    }
}

class Matrix{
    
    private static Scanner keyboard = new Scanner(System.in);
    private int n,m;
    private int matrix[][];

    public void setN(int n){//setter for n
        this.n=n;
    }
    public void setM(int m){//setter for m
        this.m=m;
    }
    public void setMatrix(int matrix[][],int n,int m){//setter for the matrix with parameters
        this.n=n;
        this.m=m;
        this.matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                this.matrix[i][j]=matrix[i][j];
            }
        }

    }
    public void setMatrix(){//setter for the matrix without parameters
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=keyboard.nextInt();
            }
        }
    }
    public int getN(){//getter for n
        return n;
    }
    public int getM(){//getter for m
        return m;
    }
    public void getMatrix(int matrix[][]){//getter for the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=this.matrix[i][j];
            }
        }
    }
    public void displayMatrix(){//display the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    
    @Override
    public String toString(){//a toString overriden function that return the matrix and it's dimenstions as a string 
        String output=new String();
        output=output.concat("N:"+Integer.toString(n)+" ");
        output=output.concat("M:"+Integer.toString(m)+"\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                output=output.concat(Integer.toString(matrix[i][j])+" ");
            }output=output.concat("\n");
        }
        return output;
    }
    
    public LinkedList<Integer> neighbourFinder(int locationX,int locationY){//adjecent fit neighbour finder 
        int y[]={-1,-1,-1,0,0,1,1,1};//vertical off-set
        int x[]={-1,0,1,-1,1,-1,0,1};//horizontal off-set
        LinkedList<Integer> neighbours = new LinkedList<Integer>();

        int original=matrix[locationX][locationY];//the value of the main location
        int marginOfError=((5*original)/100);//the 5% margin of error in finding a match
        int maxError=original+marginOfError;//the max number the neighbour can be
        int minError=original-marginOfError;//the min number the neighbour can be 
        for(int i=0;i<8;i++){
            int aux;
            //System.out.println("i: "+(locationX+y[i])+" j: "+(locationY+x[i]));        
            if(!((locationX+y[i]<0 || locationX+y[i]>n)||(locationY+x[i]<0)||locationY+x[i]>m)){//if the neighbour is within the parameters of the matrix
                //System.out.println(matrix[locationX+y[i]][locationY+x[i]]);         
                aux=matrix[locationX+y[i]][locationY+x[i]];
                //System.out.println("Original:"+original+"Aux:"+aux+" Min Error:"+minError+" Max Error:"+maxError+" Margin Of Error:"+marginOfError);
                if(aux>minError && aux<maxError){//if the neighbour is within the parameters of margin of error
                    neighbours.push(aux);//add it to the list
                }
            }
        }
        return neighbours;//return the list
    }
}

