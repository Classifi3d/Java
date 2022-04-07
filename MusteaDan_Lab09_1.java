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

