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
