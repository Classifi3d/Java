//Mustea Dumitru-Dan Lab09_6
import java.io.*;
public class MusteaDan_Lab09_6 {
    public static void main(String[] args) {
        MyFileClass.setFileName("test.txt");
        WriteThread t1 = new WriteThread();
        ReadThread t2 = new ReadThread();

        MusteaDan_Lab09_6 ex = new MusteaDan_Lab09_6();
        t1.lock=ex;
        t2.lock=ex;
        t1.start();
        t2.start();
    }
}

class WriteThread extends Thread{
    public Object lock;
    @Override
    public void run() {
        synchronized(lock){
            try{
                BufferedWriter buffer = new BufferedWriter(new FileWriter(MyFileClass.getFileName()));
                for(int i=1;i<=10;i++){//generated data
                    buffer.write("Name Surename "+i+"\n");
                }
                buffer.close();
                System.out.println("Succesful Writing to File!");
            }
            catch(Exception e){      
            }
    
            super.run();
        }

    }
}

class ReadThread extends Thread{
    public Object lock;
    @Override
    public void run() {
        synchronized(lock){
            try{
                InputStream file = new FileInputStream(MyFileClass.getFileName());
                System.out.println("======= The data Read From the File =======");
                String line=new String();
                int i;
                while((i=file.read())!=-1){
                    if(i==10){
                        String data[] =line.split(" ");
                        //Student aux = new Student(data[0],data[1],Float.parseFloat(data[2]));
                        System.out.println(data[0]+" "+data[1]+" "+Integer.parseInt(data[2]));
                        line="";
                    }else{
                        line+=(char)i;
                    }
                }
            }
            catch(Exception e){
            }
            super.run();
        }
    }
} 

class MyFileClass{
    private static String fileName;
    MyFileClass(String fileNameParameter){
        fileName=fileNameParameter;
    }
    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileNameParameter) {
        fileName=fileNameParameter;
    }

}


// class Student{
//     private String name;
//     private String surename;
//     private float grade;
//     public Student(){

//     }
//     public Student(String name,String surename,float grade){
//         this.name=name;
//         this.surename=surename;
//         this.grade=grade;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public void setSurename(String surename){
//         this.surename=surename;
//     }
//     public void setGrade(float grade){
//         this.grade=grade;
//     }
//     public String getName(){
//         return this.name;
//     }
//     public String getSurename(){
//         return this.surename;
//     }
//     public float getGrade() {
//         return this.grade;
//     }   
// }

