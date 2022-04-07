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
