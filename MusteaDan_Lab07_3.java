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


