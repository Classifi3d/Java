//Mustea Dumitru-Dan Lab07_1

public class MusteaDan_Lab07_1 {
    public static void main(String[] args) {
        ImplementedGenerator<Integer> ob1 = new ImplementedGenerator<Integer>();
        Integer integerEx = 343;
        ob1.next(integerEx);
        
        ImplementedGenerator<String> ob2 = new ImplementedGenerator<String>();
        String stringEx = "This is my personal example string";
        ob2.next(stringEx);

        ImplementedGenerator<Number> ob3 = new ImplementedGenerator<>();
        Float floatEx=34.3f;
        ob3.next(floatEx);
        Integer intEx=64;
        ob3.next(intEx);

        ImplementedGenerator<Character> ob4 = new ImplementedGenerator<>();
        ob4.next('c');
        Character characterEx='f';
        ob4.next(characterEx); 
    }
}

interface Generator<T>{
    public void next(T var);
}

class ImplementedGenerator<T> implements Generator<T>{
    public void next(T var){
		System.out.println(var+" of variable type "+var.getClass());
    }
}
//Mustea Dumitru-Dan Lab07_2

public class MusteaDan_Lab07_2 {
    public static void main(String[] args) {
        Calculator obj0 = new Calculator();
		
		System.out.println(obj0.additon(7, 8));
        System.out.println(obj0.subtraction(27.3f, 8.f));    
        System.out.println(obj0.multiplication(7.d, 4.34d));   
        System.out.println(obj0.division(7324234234234234234L, 3234234283287423238L));  
        System.out.println(obj0.additon("hello ", "world"));
        System.out.println(obj0.subtraction("hello world", "o"));
        try{
            System.out.println(obj0.multiplication("abc", "zya"));
            System.out.println(obj0.division("abc", "xyz"));
        }catch(ErrorMessage e){
            System.out.println("Wrong type!");
        }


    }
}


class Calculator{
  
    //addition
    public <M extends Long>Long additon(M object1,M object2){
        return object1.longValue()+object2.longValue();
    }
    public <M extends Double>Double additon(M object1,M object2){
        return object1.doubleValue()+object2.doubleValue();
    }
    public <M extends Float>Float additon(M object1,M object2){
        return object1.floatValue()+object2.floatValue();
    }
    public <M extends Integer>Integer additon(M object1,M object2){
        return object1+object2;
    }
    public <M extends String>String additon(M object1,M object2){
        return object1.toString()+object2.toString();
    }
    //subtraction
    public <M extends Long>Long subtraction(M object1,M object2){
        return object1.longValue()-object2.longValue();
    }
    public <M extends Double>Double subtraction(M object1,M object2){
        return object1.doubleValue()-object2.doubleValue();
    }
    public <M extends Float>Float subtraction(M object1,M object2){
        return object1.floatValue()-object2.floatValue();
    }
    public <M extends Integer>Integer subtraction(M object1,M object2){
        return object1-object2;
    }
    public <M extends String>String subtraction(M object1,M object2){
        return object1.toString().replaceAll(object2.toString(),"");
    }
    //multiplication
    public <M extends Long>Long multiplication(M object1,M object2){
        return object1.longValue()*object2.longValue();
    }
    public <M extends Double>Double multiplication(M object1,M object2){
        return object1.doubleValue()*object2.doubleValue();
    }
    public <M extends Float>Float multiplication(M object1,M object2){
        return object1.floatValue()*object2.floatValue();
    }
    public <M extends Integer>Integer multiplication(M object1,M object2){
        return object1*object2;
    }
    public <M extends String>String multiplication(M object1,M object2) throws ErrorMessage {
        throw new ErrorMessage(null);
    }
    //division
    public <M extends Long>Long division(M object1,M object2){
        return object1.longValue()/object2.longValue();
    }
    public <M extends Double>Double division(M object1,M object2){
        return object1.doubleValue()/object2.doubleValue();
    }
    public <M extends Float>Float division(M object1,M object2){
        return object1.floatValue()/object2.floatValue();
    }
    public <M extends Integer>Integer division(M object1,M object2){
        return object1/object2;
    }
    public <M extends String>String division(M object1,M object2) throws ErrorMessage {
        throw new ErrorMessage(null);
    }
    
}

class ErrorMessage extends Exception{
    private static final long serialVersionUID = 4706118674671500784L;
    ErrorMessage(String meesage){
        super(meesage);
    }
}


//Mustea Dumitru-Dan Lab07_3
import java.util.*;

public class MusteaDan_Lab07_3 {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        SetterGetter<Kid> setterGetterKidObj = new SetterGetter<Kid>();

        System.out.println("Insert the number of kids");
        int n=integerRead();
        Kid array[] = new Kid[n];
        for(int i=0;i<n;i++){
            array[i]=new Kid();
            System.out.println("Insert the name");
            String name=keyboard.next();
            setterGetterKidObj.setName(array[i], name);
            int age=integerRead(); 
            setterGetterKidObj.setAge(array[i], age);

        }
        for(int i=0;i<n;i++){
            System.out.println( setterGetterKidObj.getAge(array[i])+" "+setterGetterKidObj.getName(array[i]));
        }System.out.println();

        LinkedList<Kid> kidArray = new LinkedList<Kid>();
        for(int i=0;i<n;i++){
            kidArray.add(array[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println( setterGetterKidObj.getAge(kidArray.peekFirst())+" "+setterGetterKidObj.getName(kidArray.peekFirst()));
            kidArray.removeFirst();
        }System.out.println();

       System.out.println("================");
        SetterGetter<Adult> setterGetterAdultObj = new SetterGetter<>();
        System.out.println("Insert the number of adults");
        n=integerRead();
        Adult array2[] = new Adult[n];
        for(int i=0;i<n;i++){
            array2[i]=new Adult();
            System.out.println("Insert the name");
            String name=keyboard.next();
            setterGetterAdultObj.setName(array2[i], name);
            int age=integerRead(); 
            setterGetterAdultObj.setAge(array2[i], age);

        }
        for(int i=0;i<n;i++){
            System.out.println( setterGetterAdultObj.getAge(array2[i])+" "+setterGetterAdultObj.getName(array2[i]));
        }System.out.println();

        ArrayDeque<Adult> aduArray = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            aduArray.add(array2[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println( setterGetterAdultObj.getAge(aduArray.peekLast())+" "+setterGetterAdultObj.getName(aduArray.peekLast()));
            aduArray.removeLast();
        }System.out.println();

        System.out.println("================");
        SetterGetter<Retired> setterGetterRetiredObj = new SetterGetter<>();
        System.out.println("Insert the number of retired");
        n=integerRead();
        Retired array3[] = new Retired[n];
        for(int i=0;i<n;i++){
            array3[i]=new Retired();
            System.out.println("Insert the name");
            String name=keyboard.next();
            setterGetterRetiredObj.setName(array3[i], name);
            int age=integerRead(); 
            setterGetterRetiredObj.setAge(array3[i], age);

        }
        for(int i=0;i<n;i++){
            System.out.println( setterGetterRetiredObj.getAge(array3[i])+" "+setterGetterRetiredObj.getName(array3[i]));
        }System.out.println();

        Stack<Retired> retArray = new Stack<Retired>();
        for(int i=0;i<n;i++){
            retArray.push(array3[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println( setterGetterRetiredObj.getAge(retArray.peek())+" "+setterGetterRetiredObj.getName(retArray.peek()));
            retArray.pop();
        }System.out.println();

    }

    public static int integerRead(){
        int n;
        try{
            System.out.println("Insert a number");
            n=keyboard.nextInt(); 
            return n;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return 1;
        }
    }
}


class SetterGetter<T extends Human>{
    void setName(T obj,String name){
        obj.name=name;
    } 
    String getName(T obj){
        return obj.name;
    }
    void setAge(T obj,int age){
        obj.age=age;
    }
    int getAge(T obj){
        return obj.age;
    }

}

class Human{
    String name;
    int age;
}

class Kid extends Human{
    Kid(){
        name="No Name";
        age=0;
    }
}

class Retired extends Human{
    Retired(){
        this.name="No Name";
        this.age=0;
    }
}


class Adult extends Human{
    Adult(){
        this.name="No Name";
        this.age=0;
    }
}


//Mustea Dumitru-Dan Lab07_4
import java.util.*;
import java.util.Scanner;
public class MusteaDan_Lab07_4 {   
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        //extension hash table
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(0,"image");
        hashtable.put(1,"text");
        hashtable.put(2,"application");
 
        //data reading
        System.out.println("Insert the number of UserFile objects");
        int n=integerRead();
        UserFile aux= new UserFile();
        LinkedList<UserFile> listUserFile = new LinkedList<UserFile>();
        for(int i=0;i<n;i++){
            //System.out.println("Insert in this order the name, extension, type in number form; and size");
            System.out.println("Insert the name");
            aux.setName(keyboard.next());
            System.out.println("Insert the extension");
            aux.setExtension(keyboard.next());
            System.out.println("Insert the type of extenstion image->0, text->1, application->2");
            aux.setType(integerRead());
            System.out.print("Insert the size (byte value)");
            aux.setSize(byteRead());
            listUserFile.add(aux);
            aux=new UserFile();
        }

        //displaying type1
        System.out.println("======== Original List ==========");
        for(UserFile element: listUserFile){
            System.out.println(element.getName()+
            "."+element.getExtenstion()+
            " "+hashtable.get(element.type)+
            " "+element.getSize()+
            " "+element.getClass().getName()
            );
        }System.out.println();

        //sorting
        Collections.sort(listUserFile,new FileSizeComparator());

        //displaying type2
        System.out.println("======== Sorted List ==========");
        Iterator <UserFile>iter = listUserFile.iterator();
      	while (iter.hasNext()) {
		    UserFile element = iter.next();
		    System.out.println(element.getName()+
                            "."+element.getExtenstion()+
                            " "+hashtable.get(element.type)+
                            " "+element.getSize()+
                            " "+element.getClass().getName()
                            );
        }System.out.println();
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
    public static byte byteRead(){
        byte n;
        try{
            n=keyboard.nextByte(); 
            return n;
        }catch(Exception E){
            System.out.println("Wrong type of byte");
            return 1;
        }
    }
}

class FileSizeComparator implements Comparator<UserFile>{
    @Override
    public int compare(UserFile a, UserFile b){
        return a.getSize()-b.getSize();
    }
}


class UserFile{
    String name;
    String extension;
    int type;
    byte size;
    UserFile(){
        name="No name";
        extension="txt";
        type=1;
        size=0;
    }
    UserFile(String name,String extension,int type,byte size){
        this.name=name;
        this.extension=extension;
        this.type=type;
        this.size=size;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setExtension(String extension){
        this.extension=extension;
    }
    String getExtenstion(){
        return this.extension;
    }
    void setType(int type){
        this.type=type;
    }
    int getType(){
        return this.type;
    }
    void setSize(byte size){
        this.size=size;
    }
    byte getSize(){
        return this.size;
    }
}
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
//Mustea Dumitru-Dan Lab07_6
import java.util.*;
import java.util.stream.Collectors;


public class MusteaDan_Lab07_6 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Employee> listEmployee = new LinkedList<Employee>();
        System.out.println("Insert the number of employees you wish to add");
        int n=integerRead();
        for(int i=0;i<n;i++){
            Employee aux = new Employee();
            System.out.println("Insert the name");
            aux.setName(keyboard.next());
            System.out.println("Insert the age");
            aux.setAge(integerRead());
            System.out.println("Insert the salary");
            aux.setSalary(integerRead());
            listEmployee.add(aux);
        }


        //ascending order by name
        Collections.sort(listEmployee,new EmployeeNameComparator());
        System.out.println("====== first display ======");
        for(Employee element: listEmployee){
		    System.out.println(element.getName()+
                            " "+element.getAge()+
                            " "+element.getSalary()
                            );
        }System.out.println();

        //descending order by age
        //Collections.sort(listEmployee,new EmployeeAgeComparator());
        Comparator<Employee> reverseAgeComparator = (h1, h2) -> h2.getAge()-h1.getAge();
        List<Employee>reversedAgedEmployees = listEmployee.stream().sorted(reverseAgeComparator).collect(Collectors.toList());
        System.out.println("====== second display ======");
        for(Employee element: reversedAgedEmployees){
		    System.out.println(element.getName()+
                            " "+element.getAge()+
                            " "+element.getSalary()
                            );
        }System.out.println();

        //ascending order by name descending by salary
        Collections.sort(listEmployee,new EmployeeAgeAndNameComparator());
        System.out.println("====== third display ======");
        for(Employee element: listEmployee){
		    System.out.println(element.getName()+
                            " "+element.getAge()+
                            " "+element.getSalary()
                            );
        }System.out.println();

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

}

class EmployeeAgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a,Employee b){
        return b.getAge()-a.getAge();

    }
}

class EmployeeNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a,Employee b){
        return a.getName().compareTo(b.getName());
    }
}

class EmployeeAgeAndNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a,Employee b){
        if(a.getName().compareTo(b.getName())<0){
            return -1;
        }else if(a.getName().compareTo(b.getName())>0){
            return 1;
        }else{
            return b.getSalary()-a.getSalary();
        }


    }
}



class Employee{
    private String name;
    private int age;
    private int salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

}
