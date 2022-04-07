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

