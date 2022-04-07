//Mustea Dumitru-Dan Lab04_1   
import java.util.Scanner;

public class MusteaDan_Lab04_1 {
    private static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);
        Methods methods = new Methods();
    
        System.out.println("==== 1st Method ====");
        double avg=methods.meanOfNumbers("4.53243","5.2323","1.2222","5.232","3.3","9.3","0.0002","1.003,2");
        System.out.println(avg);

        System.out.println("==== 2nd Method ====");
        System.out.println("Insert an integer");
        int n = keyboard.nextInt();
        double doubleArray[];
        doubleArray=methods.doubleArray(n);
        int length=doubleArray.length;
        for(int i=0;i<length;i++){//displaying the double array
            System.out.print(doubleArray[i]+" ");
        }System.out.println();

        System.out.println("==== 3rd Method ====");
        char charArray[]="Hey this is the original string!".toCharArray();
        System.out.println(charArray);
        charArray=methods.toUppercase(charArray);
        System.out.println(charArray);

    }
}

class Methods{

    
    private static double getRandomDoubleBetweenRange(double min, double max){//generates a double number between 2 values 
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }

    public double meanOfNumbers(String... args){//returns the means of all the parameters
        double sum=0.f;
        for(String arg: args){
            try{//the try is present not only to make sure the parameters entered are valid, but also to prevent a double overflow
                sum+=Double.parseDouble(arg);//adding to a sum float varaibles then converting them into double 

            }
            catch(NumberFormatException e){  
            }
        }
        return sum/args.length;
    }

    public double[] doubleArray(int n){
        double array[] = new double[n];
        for(int i=0;i<n;i++){
            array[i]=getRandomDoubleBetweenRange(-100000,100000);//generates random Z numbers and adding them to the array
        }
        return array;
    } 

    public char[] toUppercase(char[] array){
        int length=array.length;
        for(int i=0;i<length;i++){
            if(array[i]>='a' && array[i]<='z'){//if a character is lowercase 
                array[i]-=('a' - 'A');//using the ascii values, decress it's value with the difference between lowercase and uppercase elements to make it uppercase
            }
        }
        return array;
    }

}




//Mustea Dumitru-Dan Lab04_2
import java.util.Arrays;

public class MusteaDan_Lab04_2 {
    public static void main(String args[]){
    X example1 = new X();
    System.out.println(example1.toString());
    X example2 = new X("array".toCharArray(),"String",1000);
    System.out.println(example2.toString());
    }
}

class X{

    private char array[];
    protected String obj;
    int integer;
    X(){//constructor without parameters
        array=Arrays.copyOf("Default".toCharArray(),"Default".length());
        setString("Default");
        setInteger(0);
    }
    X(char array[],String obj,int integer){//constructor with parameters
        setArray(array);
        setString(obj);
        setInteger(integer);
    }
    //setters
    private void setArray(char arrayCopy[]){
        array=Arrays.copyOf(arrayCopy,arrayCopy.toString().length());
    }
    private void setString(String obj){
        this.obj=obj;
    }
    private void setInteger(int integer){
        this.integer=integer;
    }
    //overrriding the finale() method
    @Override
    protected void finalize() {
        System.out.println("The object has been destroyed");
    }
        //overrriding the toString() method, to display all the atributes as 1 string
    @Override
    public String toString(){
        String copy=obj.toString();
        return Arrays.toString(array)+" "+copy+" "+Integer.toString(integer);
    }

    

}

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

//Mustea Dumitru-Dan Lab04_4
import java.util.Scanner;

public class MusteaDan_Lab04_4 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]){
        int n;
        System.out.println("Read the amount of object, after that enter the name, longitude and latitude of each one of them.");
        n=keyboard.nextInt();
        Person personArray[] = new Person[n];
        for(int i=0;i<n;i++){
            String name=keyboard.next();
            float latitude=keyboard.nextFloat();
            float longitude=keyboard.nextFloat();
            personArray[i]=new Person(name,latitude,longitude);
        } 

        for(int i=0;i<n;i++){
            System.out.println(personArray[i].toString());
        } 
    }
}

class Person{
    private String name;
    private float latitude;
    private float longitude;
    
    public Person(){//constructor without parameters
        name=null;
        latitude=0;
        longitude=0;
    }
    public Person(String name,float latitude,float longitude){//constructor with parameters
        this.name=name;
        this.latitude=latitude;
        this.longitude=longitude;
    }
    @Override
    protected void finalize() throws Throwable {//finalize method
        System.out.println("DELETION!!!");
    }
    
    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setLatitude(int latitude){
        this.latitude=latitude;
    }
    public void setLongitude(int longitude){
        this.longitude=longitude;
    }
    @Override
    public String toString(){//overriden the toString method to return all 3 atributes
        return name+" "+String.valueOf(latitude)+" "+String.valueOf(longitude);
    }

    //getters
    String getName(){
        return name;
    }
    float getLongitude(){
        return longitude;
    }
    float getLatitude(){
        return latitude;
    }
}
//Mustea Dumitru-Dan Lab04_5
import java.util.regex.Pattern;
import java.util.StringTokenizer;

public class MusteaDan_Lab04_5 {
    public static void main(String args[]){  
		String input1 = "This is a sentence that conatins numbers";
        String input2 = "1";
		String pattern1 = "\\d";//is a digit

		boolean isMatch1 = Pattern.matches(pattern1, input1);
		boolean isMatch2 = Pattern.matches(pattern1, input2);
		System.out.println(isMatch1);
        System.out.println(isMatch2);

        System.out.println("======================================");
        String input3 = "This is a message that will be changed";
		Pattern pattern2 = Pattern.compile("( a|e|i|o|u)");
		String[] parts = pattern2.split(input3);

		for(String part: parts){
			 System.out.print(part + " ");	 
		}System.out.println();

        StringBuilder stringBuilder = new StringBuilder(input3);
		String result = stringBuilder.reverse().toString();
		System.out.println(result);

        System.out.println("======================================");
        String input4 = "fast red muscle";
        StringTokenizer stringTokenizerVar = new StringTokenizer(input4," ");
		while (stringTokenizerVar.hasMoreTokens()){
            String token = (String)stringTokenizerVar.nextToken();
            System.out.println("The "+token+" car");
        }

        System.out.println("======================================");
        String input5 = "qwerty";
        String input6 = "qwerty";
        System.out.println(input5.equals(input6));
        System.out.println(input5.compareTo(input6));

        System.out.println("======================================");
        StringBuffer input7 = new StringBuffer(0);
        System.out.println(input7.insert(0, "qwerty"));
        System.out.println(input7.insert(input7.length(), "asdfghjkl"));
	}
}

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

//Mustea Dumitru-Dan Lab04_8
import java.util.Scanner;

public class MusteaDan_Lab04_8 {
    public static void main(String args[]){
        Key key = new Key();//making a key object and displaying it
        key.display();
    }
}

class Key{
    private static Scanner keyboard = new Scanner(System.in); 
    
    private char[] charArray= new char[20];
    Key(){
        System.out.println("Enter a key with 20 digits or uppercase character");
        String stringKey = keyboard.nextLine();
        char[] arrayKey = stringKey.toCharArray();
        for(int i=0;i<20;i++){
            charArray[i]=arrayKey[i];
        }
        verify();
    }

    private boolean verifyChar(){//a first verification which determines if the key has the correct values in it
        boolean flag=true;
        for(int i=0;i<20;i++){
            if(!((charArray[i]>='A'&&charArray[i]<='Z')||(charArray[i]>='0'&&charArray[i]<='9'))){//only upper characters and digits
                flag=false;
            }
        }
        return flag;
    }
    public void display(){//displays the key with the '-' characters once every 5 digits
        for(int i=0;i<20;i++){
            System.out.print(charArray[i]);
            if(i==4||i==9||i==14){
                System.out.print("-");
            }
        }System.out.print('\n');
    }

    private int numberOfLetters(){//counts how many letters there are in the key
        if(verifyChar()==true){
            int counter=0;
            for(int i=0;i<20;i++){
                if(charArray[i]>='A'&&charArray[i]<='Z'){
                    counter++;
                }
            }
            //System.out.println("Number of letters "+counter);
            return counter;
        }else{
            //System.out.println("The key is invalid");
            return -1;
        }
    }
    private int numberOfDigits(){//counts how many digits there are in the key
        if(verifyChar()==true){
            int counter=0;
            for(int i=0;i<20;i++){
                if(charArray[i]>='0'&&charArray[i]<='9'){
                    counter++;
                }
                
            }      
            //System.out.println("Number of digits "+counter);
            return counter;
        }else{
            //System.out.println("The key is invalid");
            return -1;
        }
    }

    public void verify(){
        int digits=numberOfDigits();
        int letters=numberOfLetters();
        if(digits>letters&&letters>0&&digits>0){//if the number of digits is bigger then the number of letters, and also if the results are valid then the key is correct
            System.out.println("Valid Key!");
        }else{
            System.out.println("Invalid Authentication Key!");
        }
    }

}
//Mustea Dumitru-Dan Lab04_9
import java.util.Scanner;
import java.util.StringTokenizer;

public class MusteaDan_Lab04_9 {
    private static Scanner keyboard = new Scanner(System.in); 
    public static void main(String args[]){
    System.out.println("Enter an amount of student");
    int dimension=keyboard.nextInt();//reading the amount of students
    Student[] group = new Student[dimension];
    for(int i=0;i<dimension;i++){
        group[i]=new Student();
    }
    for(int i=0;i<dimension;i++){//for each student
        System.out.print( group[i].getName()+" ");//display the name
        for(int j=0;j<10;j++){//telephone number
            System.out.print(group[i].getTelephone()[j]); 
        }
        System.out.println(" "+ group[i].getMark());//and the average mark
    }

    }
}

class Student{
    private static Scanner keyboard = new Scanner(System.in); 
    String name;
    char[] telephone = new char[10];
    float averageMark;
    Student(){
        char[] stringAuxTele = new char[10];
        String auxName = new String();
        float auxMarkParsed = 0;

        boolean flag=true;
        while(flag==true){//while the input is incorrect I will keep re-reading an input string
            flag=false;
            String everything = keyboard.nextLine();//input string that contains everything/all the data
            String auxTele = new String();//aux vars
            String auxMark = new String();
            StringTokenizer tokenizer = new StringTokenizer(everything,"^^^");//the string tokenizer with a "^^^" delimiator for the information

            auxName=(String)tokenizer.nextToken();//the 1st token is the name
            
            auxTele=(String)tokenizer.nextToken();//the 2nd token is the telephone number
            stringAuxTele = auxTele.toCharArray();//convert the telephone numberstring into char array
            if(auxTele.length()!=10){//validate that only 10 length digits set are possible
                System.out.println("Wrong Length!");
                flag=true;//flagging as incorrect
            }else{
                for(int i=0;i<10;i++){//traverse the char array
                    if((stringAuxTele[i]>='0'&&stringAuxTele[i]<='9')||(stringAuxTele[i]=='-'||stringAuxTele[i]=='.')){//only digits and '.' '-'
                    }else{
                        System.out.println("Wrong Character!");
                        flag=true;//flagging as incorrect
                    }
                }
            }
            auxMark=(String)tokenizer.nextToken();//the 3rd token is the average mark
            auxMarkParsed = Float.parseFloat(auxMark);//parsing the string into float
            if(flag==true){//if a mistake was flagged
                /*System.out.println(auxName);
                System.out.println(auxTele);
                System.out.println(auxMark);*/
                System.out.println("Invalid Input, Try Again!");//display the message 
            }//and ofcourse re-enter the while loop
        }

        //assigning the aux variable values into the class variable
        name=auxName;
        for(int i=0;i<10;i++){
            telephone[i]=stringAuxTele[i];
        }
        averageMark=auxMarkParsed;


    }
    //setters
    void setName(String name){
        this.name=name;
    }
    void setTelephone(char[] telephone){
        for(int i=0;i<10;i++){
            this.telephone[i]=telephone[i];
        }
    }
    void setMark(float averageMark){
        this.averageMark=averageMark;
    }
    //getters
    String getName(){
        return this.name;
    }
    char[] getTelephone(){
        return this.telephone;
    }
    float getMark(){
        return averageMark;
    }

}

