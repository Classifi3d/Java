//Mustea Dumitru-Dan Lab06_9
import java.util.Scanner;
import java.lang.Exception;

public class MusteaDan_Lab06_9 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Position hardCodedPoint = new Position("hardCodedPoint",2,4,4);
        int distance = 3;
        Position array[]=new Position[3];
        int n;
        System.out.println("Insert the number of position objects");
        n=IntegerRead();
        try{
            for(int i=0;i<n;i++){
                boolean flag=false;
                while(flag==false){//until we find a good point
                    String point_name;
                    int x,y,z;
                    try{//only allow points that are a certain distance apart from the hard coded point
                        point_name=stringRead();
                        x=IntegerRead();
                        y=IntegerRead();
                        z=IntegerRead();
                        Position aux=new Position(point_name,x,y,z);
                        if(Position.checkClose(hardCodedPoint,aux,distance)==true){
                            flag=true;
                            array[i] = new Position(point_name,x,y,z);  
                        }else{
                            flag=false;
                            throw new PointTooClose(null);
                        }
                    }catch(PointTooClose E){
                        System.out.println("The point is too close");
                    }
                }
  
            }
        }catch(ArrayIndexOutOfBoundsException E){
            System.out.println("The nubmer of objects is too high");
        }
    }

    private static int IntegerRead(){
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
    private static String stringRead(){
        String string;
        try{
            System.out.println("Insert a string");
            string=keyboard.next(); 
            return string;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return "Default";
        }
    }
    
}

class PointTooClose extends Exception{
    private static final long serialVersionUID = 4924023854813034704L;

    public PointTooClose(String message){
        super(message);
    }    
}

class Position{

    private String point_name;
    private Integer x,y,z;
    public Position(){
        point_name="default";
        x=0;
        y=0;
        z=0;
    }
    public Position(String point_name,int x,int y,int z){
        this.point_name=point_name;
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setXYZ(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setName(String point_name){
        this.point_name=point_name;
    }
    public void setXYZ(String point_name,int x,int y,int z){
        this.point_name=point_name;
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String getName(){
        return this.point_name;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getZ(){
        return this.z;
    }
    public static boolean checkClose(Position a,Position b,float distance) throws PointTooClose{
        //The equation d = ((x2 - x1)2 + (y2 - y1)2 + (z2 - z1)2)^1/2 
        int p1= b.getX()-a.getX();
        int p2= b.getY()-a.getY();
        int p3= b.getZ()-a.getZ();
        float d = (float)Math.sqrt(p1*p1+p2*p2+p3*p3);
        if(d<distance){//too close
            return false;
        }else{
            return true;
        }

    }


}