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
