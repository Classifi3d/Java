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


