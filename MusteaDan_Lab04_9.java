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

