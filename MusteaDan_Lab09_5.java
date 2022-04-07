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
