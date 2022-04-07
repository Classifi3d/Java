//Mustea Dumitru-Dan Lab09_1
public class MusteaDan_Lab09_1 {
    public static void main(String[] args) {
        System.out.println("All threads are in the NEW state");
        
        try {
            Thread a = new Thread(new MyRunnableClass("Ana"));
            a.start();
            Thread.sleep(1000);
            Thread b = new Thread(new MyRunnableClass("Bob"));
            b.start();
            Thread.sleep(1000);
            Thread c = new Thread(new MyRunnableClass("Dan"));
            c.start();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads are in the TERMINATED state");
    }
}

class MyRunnableClass implements Runnable{
    String name;
	static int counter=0;
	MyRunnableClass(){
        this.name=new String();
        counter++;
	}
	MyRunnableClass(String name){
		this.name=name;
        counter++;
	}
    @Override
	public void run(){
        for(int i=0;i<counter;i++){
            System.out.println(counter+"MyRunnableClass named "+name+" is running");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}

//Mustea Dumitru-Dan Lab09_2
public class MusteaDan_Lab09_2 {
    public static void main(String[] args) {
        GenerateRandomNumberThread generate = new GenerateRandomNumberThread();
        DisplayAreaThread display = new DisplayAreaThread();
        generate.start();
        // try {
        //     generate.join();
        // } catch (Exception e) {
        // }
        display.start();
    }
}

class GenerateRandomNumberThread extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            RandomArray.array[i]=Random.getRandomDoubleBetweenRange(0, 30);
        }
    }
}

class DisplayAreaThread extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            if(i%3==0){
                System.out.println(RandomArray.array[i]*RandomArray.array[i]*Math.PI); 
            }
        }
    }
}


class Random{
    public static double getRandomDoubleBetweenRange(double min, double max){
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }
}

class RandomArray{
    static double array[] = new double[30];

}

//Mustea Dumitru-Dan Lab09_3
import java.util.Scanner;

public class MusteaDan_Lab09_3 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insert the number of the number from the fibonacci sequence you want to find out");
        int n;
        try {
            n=keyboard.nextInt();
        } catch (Exception e) {
            n=0;    
        }
        NumbersArray.setN(n);
        MusteaDan_Lab09_3 ex = new MusteaDan_Lab09_3();
        GenerateThread thread1 = new GenerateThread();
        DisplayThread thread2 = new DisplayThread();
        thread1.start();
        thread2.start();
    }
}

class GenerateThread extends Thread{//waiting thread
    public Object lock;
    int n=0;
    public GenerateThread(){
        n=NumbersArray.n;
    }
    public void run(){
        generate();
    }
    public void generate(){
        synchronized(lock){
            int n1=0,n2=1,n3;
            for (int i = 0; i < n; i++) {
                if(i>1){
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                    NumbersArray.insertAtPosition(i, n3);
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    if(i==0){
                        NumbersArray.insertAtPosition(i, n1);
                        try {
                            lock.notifyAll();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else if(i==1){
                        NumbersArray.insertAtPosition(i, n2);
                        try {
                            lock.notifyAll();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } 
                }
            }
        }
    }

}


class DisplayThread extends Thread{//first thread
    public Object lock;
    int n=0;
    public DisplayThread(){
        n=NumbersArray.n;
    }
    public void run(){
       display();
    }
    public void display(){
        synchronized(lock){
            for(int i=0;i<n;i++){
                System.out.println("Fib. sequence is: ");
                for (int j = 0; j < NumbersArray.last; j++) {
                    System.out.print(NumbersArray.getFromPosition(j)+" ");
                }
                System.out.println();
                try {
                    lock.notifyAll();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class NumbersArray{
    static int array[];
    static int n;
    static int last=0;
    public NumbersArray(int num) {
        n=num;
        this.array = new int[n];
    }
    public static void setN(int num){
        n=num;
    }
    public static int getN(){
        return n;
    }
    public static void insertAtPosition(int i,int k){
        if(i>=0||i<n){
            array[i]=k;
        }
        last=i;
    }
    public static int getFromPosition(int i){
        if(i>=0||i<n){
            return array[i];
        }else{
            return 0;
        }
    }
}
//Mustea Dumitru-Dan Lab09_4

public class MusteaDan_Lab09_4 {
    public static void main(String[] args) {
        int n=3;//number of incrementations and decrementaions
        Thread1 t1 = new Thread1(n);
        Thread2 t2 = new Thread2(n);
        Thread3 t3 = new Thread3(n);
        t1.start();
        t2.start();
        t3.start();
        //when not using mutex the assembly machine code will go out of order and even the simplest addition or subtraciton operation will not be correct due to them not being in the correct order
        
    }
}

class Thread1 extends Thread{
    private int n;
    Thread1(int n){
        this.n=n;
    }
    public void run(){
        // SequenceGeneratorNoMutex a = new SequenceGeneratorNoMutex();
        SequenceGenerator a = new SequenceGenerator();
        for(int i=0;i<n;i++){
            System.out.println(Thread.currentThread().getName()+" "+a.getNextSequence());   
        }
        for(int i=n;i>0;i--){
            System.out.println(Thread.currentThread().getName()+" "+a.getPrevSequence());   
        }  
       
    }
}

class Thread2 extends Thread{
    private int n;
    Thread2(int n){
        this.n=n;
    }
    public void run(){
        // SequenceGeneratorNoMutex a = new SequenceGeneratorNoMutex();
        SequenceGenerator a = new SequenceGenerator();
        for(int i=0;i<n;i++){
            System.out.println(Thread.currentThread().getName()+" "+a.getNextSequence());   
        }
        for(int i=n;i>0;i--){
            System.out.println(Thread.currentThread().getName()+" "+a.getPrevSequence());   
        }  
       
    }
}

class Thread3 extends Thread{
    private int n;
    Thread3(int n){
        this.n=n;
    }
    public void run(){
        // SequenceGeneratorNoMutex a = new SequenceGeneratorNoMutex();
        SequenceGenerator a = new SequenceGenerator();
        for(int i=0;i<n;i++){
            System.out.println(Thread.currentThread().getName()+" "+a.getNextSequence());   
        }
        for(int i=n;i>0;i--){
            System.out.println(Thread.currentThread().getName()+" "+a.getPrevSequence());   
        }  
       
    }
}



class SequenceGenerator {
    
    static int currentValue = 0;
    static Object mutex = new Object();

    static int getNextSequence(){
        synchronized (mutex){
            currentValue = currentValue + 1;
            return currentValue;
        }
    }
    static int getPrevSequence(){
        synchronized(mutex){
            currentValue = currentValue - 1;
            return currentValue;
        }
    }

}


class SequenceGeneratorNoMutex {
    
    static int currentValue = 0;
    static Object mutex = new Object();

    static int getNextSequence(){
        currentValue = currentValue + 1;
        return currentValue;
    }
    static int getPrevSequence(){
        currentValue = currentValue - 1;
        return currentValue;
    }

}


//Mustea Dumitru-Dan Lab09_5
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MusteaDan_Lab09_5 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insert pair of numbers bigger than 100.000, you can exit the program by entering a pair of 0,0");
        ExecutorService executor = Executors.newFixedThreadPool(8);
        boolean flag=true;
        int a=0;
        int b=0;
        int i=0;
		do{
            i++;
            try {
                a=keyboard.nextInt();
                b=keyboard.nextInt();
            } catch (Exception e) {
                a=0;
                b=0;
            }

            if(a==0 & b==0){
                flag=false;
            }else{
                System.out.print("Thread number "+i+" computes ");
                GCDNumbersRunnable thread = new GCDNumbersRunnable(a,b);
                executor.execute(thread);
            }
		}while(flag==true);

		executor.shutdown();
		while (!executor.isTerminated()) {}
		System.out.println("All threads are terminated");

    }

}

class GCDNumbersRunnable implements Runnable{
    private int a;
    private int b;
    public GCDNumbersRunnable(int a,int b) {
        this.a=a;
        this.b=b;
    }

    @Override
	public void run(){     
        System.out.println("gcd: "+GCD.gcd(a, b)); 
	}
}

class GCD{
    static int gcd(int a,int b){
        while(a != b){
            if(a > b){
                a-= b;
            }else{
                b-= a;
            }
        }
        return a;
    }
}
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

