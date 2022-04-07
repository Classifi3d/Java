//Mustea Dumitru-Dan Lab04_6
public class MusteaDan_Lab04_7 {
    public static void main(String args[]){
        //chessboard
        int n,m;
        n=8;m=8;
        Child danny = new Child();
        danny.introduce();
        danny.tellAge();
        danny.addSmallNumbers(4, 9);
        danny.colorChessBoard(n, m);
        danny.goodbye();
    }
}


class Child{
    //a date class that helps calculate the child's age
    private class Date{
        protected int year;
        protected int month;
        protected int day;
        public Date(int year,int month,int day){
            this.year=year;
            this.month=month;
            this.day=day;
        }
        public Date(){
        }
        public String dateDifferenceString(int year,int month,int day){
            String output="";
            int y=this.year-year;
            int m=this.month-month;
            int d=this.day-day;
            if(d<0){//not completly accurate but it's a pretty approximate date
                m--;
                d+=30;
            }
            if(m<0){
                y--;
                m+=12;
            }
            output=output.concat(Integer.toString(y)+" years ");
            output=output.concat(Integer.toString(m)+" months ");
            output=output.concat(Integer.toString(d)+" days");
            return output;
        }
    }

    private String name;
    private Date bday= new Date();
    private Date currentYear = new Date(2021,3,28);

    public Child(){
        bday.year=2015;
        bday.month=6;
        bday.day=5;
        this.name="Danny";
    }

    public void introduce(){
        System.out.println("Hello my name is "+name);
    }
    public void tellAge(){//tell it's current age
        System.out.println("I have "+currentYear.dateDifferenceString(bday.year,bday.month,bday.day));
    }
    public void addSmallNumbers(int x,int y){//adds 2 numbers, each smaller than 10
        if(x<10&&y<10){
            System.out.println("I added "+x+" and "+y+" and the result is "+Integer.toString(x+y));
        }else{
            System.out.println("I don't know how to do that");
        }
    }

    private String alphabet="abcdefghijklmnopqrstuvwxyz";
    private StringBuilder outputAlphabet = new StringBuilder();
    
    public void tellAlphabet(){//tells the alphabet
        System.out.println(alphabet);
    }
    public void tellAlphabetReversed(){//tells the alphabet in reverse
        outputAlphabet.append(alphabet);
        outputAlphabet.reverse();
        System.out.println(outputAlphabet);
    }
    public void goodbye(){//says goodbye
        System.out.println("Goodbye!");
    }

    public void colorChessBoard(int n,int m){
        //I removed the matrix since it wasn't needed to 'color' and display a chess board 
        //int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i+j)%2==0){//black
                    //matrix[i][j]=0;
                    System.out.print("0 ");
                }else{//white
                    //matrix[i][j]=1;
                    System.out.print("1 ");
                }
            }System.out.println();
        }
    }

    public void ticTacToe(){
        //unufortunally the last tic tac toe/dots and crosses has bug that makes it enter an infinte loop when the board is full
        //and I haven't got around fixing that yet, so the kid won't be able to play by himself :(
    }

}

