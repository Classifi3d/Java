//Mustea Dumitru-Dan Lab07_5
import java.util.*;

public class MusteaDan_Lab07_5 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        SortedSet<Student> studentSet = new TreeSet<Student>(new Comparator<Student>(){
            public int compare(Student a, Student b){
                if(a.getAverageMark()<b.getAverageMark()){// if left has a smaller mark than right
                    return 1;
                }else if(a.getAverageMark()>b.getAverageMark()){// if right has a smaller mark than left
                    return -1;
                }else{//if they have the same mark
                    return a.getName().compareTo(b.getName());//alphabetical ordering 
                }
        
            }
        });    
        System.out.println("Insert the number of students you wish to insert in the list");
        int n=integerRead();
        for(int i=0;i<n;i++){
            Student aux = new Student();
            System.out.println("Insert the name");
            aux.setName(keyboard.next());
            System.out.println("Insert the group");
            aux.setGroup(integerRead());
            System.out.println("Insert the average mark");
            aux.setAverageMark(floatRead());
            studentSet.add(aux);
        }

        //display the set for the first time
        System.out.println("====== for display ======");
        for(Student element: studentSet){
		    System.out.println(element.getName()+
                            " "+element.getGroup()+
                            " "+element.getAverageMark()
                            );
        }System.out.println();

        //displaying the set for the second time
        System.out.println("====== iterator display ======");
        Iterator <Student>iter = studentSet.iterator();
      	while (iter.hasNext()) {
		    Student element = iter.next();
            if(element.getAverageMark()>=8.0f){
                System.out.println(element.getName()+
                " "+element.getGroup()+
                " "+element.getAverageMark()
                );
            }
        }System.out.println();

        System.out.println("Insert the number of group the display all the students in it");
        int group=integerRead(); 
        //disaplying the set for the third time
        System.out.println("====== forEach display ======");
        studentSet.forEach( element -> {
            if(group==element.getGroup()){
                System.out.println(element.getName()+
                " "+element.getGroup()+
                " "+element.getAverageMark()
                );
            }
        });

    }

    public static int integerRead(){
        int n;
        try{
            n=keyboard.nextInt(); 
            return n;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return 1;
        }
    }
    public static float floatRead(){
        float n;
        try{
            n=keyboard.nextFloat(); 
            return n;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return 1;
        }
    }
}
/*
class MarkOrderingComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        if(a.getAverageMark()<b.getAverageMark()){
            return -1;
        }else if(a.getAverageMark()>b.getAverageMark()){
            return 1;
        }else{
            return 0;
        }

    }
}*/

class Student{
    private String name;
    private int group;
    private float average_mark;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setGroup(int group){
        this.group=group;
    }
    public int getGroup(){
        return this.group;
    }
    public void setAverageMark(float average_mark){
        this.average_mark=average_mark;
    }
    public float getAverageMark(){
        return this.average_mark;
    }

}
