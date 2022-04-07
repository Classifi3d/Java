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

