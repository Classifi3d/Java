//Mustea Dumitru-Dan Lab08_1
import java.io.*;

public class MusteaDan_Lab08_1 {
    public static void main(String[] args) {
        String message = new String();
        boolean messageRead=false;
        Integer day = 0;
        boolean dayRead=false;
        String month = new String();
        boolean monthRead=false;
        Integer year = 0;
        boolean yearRead=false;
        
        try{
            BufferedReader bufRead = new BufferedReader(new InputStreamReader (System.in)); 
        

            StreamTokenizer strToken = new StreamTokenizer(bufRead);            
            boolean eof=false;

            
            do{
                int token=strToken.nextToken();
                switch(token){
                    case StreamTokenizer.TT_EOF:
                        System.out.println("End of the file");
                        eof=true;
                        break;
                    case StreamTokenizer.TT_EOL:
                        System.out.println("End of the line");
                        break;
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word "+strToken.sval);
                        if(messageRead==false){
                            message=strToken.sval;
                            messageRead=true;
                        }else if(monthRead==false){
                            monthRead=true;
                            month=strToken.sval;
                        }
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Num "+strToken.nval);
                        if(dayRead==false){
                            day=(int)strToken.nval;
                            dayRead=true;
                        }else if(yearRead==false){
                            year=(int)strToken.nval;
                            yearRead=true;
                        }
                        break;
                    default:
                        System.out.println((char)token+"encountered");
                    
                    if(token=='!'){
                        System.out.println("Exit!");
                        eof=true;
                    }

                }
            }while(!eof);
            

        }catch(Exception e){
            System.out.println("Reading Error!");
        }
        System.out.println(message+" "+day+" "+month+" "+year);

    }
}
//Mustea Dumitru-Dan Lab08_2
import java.io.*;

public class MusteaDan_Lab08_2 {
    public static void main(String[] args) {
        String message = new String();
        boolean messageRead=false;
        Integer day = 0;
        boolean dayRead=false;
        String month = new String();
        boolean monthRead=false;
        Integer year = 0;
        boolean yearRead=false;


        try{
            String path = System.getProperty("user.dir");
            //System.out.println(path+"/"+"MusteaDan_Lab08_2_InputFile.txt");
            BufferedReader bufRead = new BufferedReader(new InputStreamReader(new FileInputStream(path+"/"+"MusteaDan_Lab08_2_InputFile.txt"))); 
            StreamTokenizer strToken = new StreamTokenizer(bufRead);            
            boolean eof=false;

            
            do{
                int token=strToken.nextToken();
                switch(token){
                    case StreamTokenizer.TT_EOF:
                        System.out.println("End of the file");
                        eof=true;
                        break;
                    case StreamTokenizer.TT_EOL:
                        System.out.println("End of the line");
                        break;
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word "+strToken.sval);
                        if(messageRead==false){
                            message=strToken.sval;
                            messageRead=true;
                        }else if(monthRead==false){
                            monthRead=true;
                            month=strToken.sval;
                        }
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Num "+strToken.nval);
                        if(dayRead==false){
                            day=(int)strToken.nval;
                            dayRead=true;
                        }else if(yearRead==false){
                            year=(int)strToken.nval;
                            yearRead=true;
                        }
                        break;
                    default:
                        System.out.println((char)token+"encountered");
                    
                    if(token=='!'){
                        System.out.println("Exit!");
                        eof=true;
                    }

                }
            }while(!eof);
            

        }catch(Exception e){
            System.out.println("Reading Error!");
        }
        System.out.println(message+" "+day+" "+month+" "+year);

    }
}
//Mustea Dumitru-Dan Lab08_3
import java.io.*;
import java.util.LinkedList;
import java.text.*;
public class MusteaDan_Lab08_3 {
    public static void main(String[] args) {
        LinkedList<Integer> day= new LinkedList<Integer>();
        LinkedList<Integer> month= new LinkedList<Integer>();
        LinkedList<Integer> year= new LinkedList<Integer>();
        int counter=0;
        boolean flag=true;
        //05/06/2000

        try{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader (System.in)); 
        System.out.println("Insert a date formated as such\"DD/MM/YYYY\" ");
            String line = new String();
            while(flag==true){
                line = bufRead.readLine();
                if(line.toUpperCase().charAt(0)!='X'){
                    if(line.length()!=10){
                        System.out.println("Wrong data, read again!");
                    }else{//only if it has length 10
                        if(Integer.parseInt(line.substring(0,1))==0){
                            //System.out.println(line.substring(1,2));
                            day.add(Integer.parseInt(line.substring(1,2)));
                            
                        }else{
                            // System.out.println(line.substring(0,2));
                            day.add(Integer.parseInt(line.substring(0,2)));
                        }
                        if(Integer.parseInt(line.substring(3,4))==0){
                            // System.out.println(line.substring(4,5));
                            month.add(Integer.parseInt(line.substring(4,5)));
                        }else{
                            // System.out.println(line.substring(3,5));
                            month.add(Integer.parseInt(line.substring(3,5)));
                        }
                        // System.out.println(line.substring(6,10));
                        year.add(Integer.parseInt(line.substring(6,10)));
                        counter++;
                    }
                }else{//if the string is X
                    flag=false;
                }
            }
        }catch(Exception e){
            System.out.println("Reading Error!");
        }

        DateFormatSymbols monthNames = new DateFormatSymbols();
        String months[]=monthNames.getMonths();
        for(int i=0;i<counter;i++){
            if(month.get(i)>0 && month.get(i)<=12){//validation of the month
                System.out.println(day.get(i)+" "+months[month.get(i)-1]+" "+year.get(i));
            }else{
                System.out.println("Invalid month entered while reading");
                System.out.println(day.get(i)+" "+month.get(i)+" "+year.get(i));
            }
        }
    }
}
//Mustea Dumitru-Dan Lab08_4
import java.io.*;
public class MusteaDan_Lab08_4 {
    static final String dataFile = "bitcoinBinary.dat";
    public static void main(String[] args) throws IOException {
        DataInputStream inFile = null;
        int counter=0;
        String bitcoinKey = new String();
        String userKey = new String();
        String output = new String();
        try {
            inFile = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

            int c1;
            try {
                boolean flag=true;
                while (flag==true) {
                    c1=inFile.read();
                    if(c1==-1){
                        flag=false;
                    }else{
                        counter++;
                        bitcoinKey+=(char)c1;
                        //System.out.print((char)c1);
                    }
                }
            } 
            catch(EOFException e) {
                System.out.println("DataInputStream File Error!");
            }
        }finally{
            inFile.close();
        }


        BufferedReader bufRead=new BufferedReader (new InputStreamReader (System.in));
		try{
            System.out.println("Insert a 256 characters and numbers and symbols user key");
            while(userKey.length()!=256){
                userKey=bufRead.readLine();
                if(userKey.length()!=256){
                    System.out.println("Wrong amount of characters to be a 256 char user key, it had "+userKey.length());
                }
            }
        }
        catch(IOException e){
            System.out.println("BufferedReader Keyboard Error!");
        }
        finally{
            bufRead.close();
        }

        
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
            for (int i = 0; i <counter; i++) {
                // System.out.println((char)(bitcoinKey.charAt(i)^userKey.charAt(i)));
                output+=(char)(bitcoinKey.charAt(i)^userKey.charAt(i));
                out.write((char)(bitcoinKey.charAt(i)^userKey.charAt(i)));
            }
        }catch(Exception e){
            System.out.println("DataOutput File Error");
        }finally {
            out.close();
        }
        System.out.println("======= The Bitcoin Key =======");
        System.out.println(bitcoinKey);
        System.out.println("======= The User Key =======");
        System.out.println(userKey);
        System.out.println("======= The Output =======");
        System.out.println(output);
        //System.out.println(output.length());
    }
}
//Mustea Dumitru-Dan Lab08_5
import java.io.*;
import java.util.*;
public class MusteaDan_Lab08_5 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();
        int counter=0;
        try{
            InputStream a = new FileInputStream("Year_2021_Group_2021.txt");
            InputStream b = new FileInputStream("Year_2021_Group_2022.txt");
            InputStream c = new FileInputStream("Year_2021_Group_2023.txt");
            SequenceInputStream abc = new SequenceInputStream(new SequenceInputStream(a, b),c);

            int i;
            String line=new String();
            while((i=abc.read())!=-1){
                if(i==10){
                    String data[] =line.split(" ");
                    Student aux = new Student(data[0],data[1],Float.parseFloat(data[2]));
                    studentList.add(aux);
                    counter++;
                    line="";
                }else{
                    line+=(char)i;
                }
            }
            abc.close();
            a.close();
            b.close();
            c.close();
        }catch(Exception e){
            System.out.println("File Reading Error!");
        }
        
        studentList.sort(new SortStudentByName());
        for(int i=0;i<counter;i++){
            System.out.println(studentList.get(i).getName()+" "+studentList.get(i).getSurename()+" "+studentList.get(i).getGrade());
        }

    }
}

class SortStudentByName implements Comparator<Student>{
    @Override
    public int compare(Student a,Student b){
        int x=a.getName().compareTo(b.getName());
        if(x==0){
            return a.getSurename().compareTo(b.getSurename());
        }
        return x;
    }
}

class Student{
    private String name;
    private String surename;
    private float grade;
    public Student(){

    }
    public Student(String name,String surename,float grade){
        this.name=name;
        this.surename=surename;
        this.grade=grade;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSurename(String surename){
        this.surename=surename;
    }
    public void setGrade(float grade){
        this.grade=grade;
    }
    public String getName(){
        return this.name;
    }
    public String getSurename(){
        return this.surename;
    }
    public float getGrade() {
        return this.grade;
    }   

}

