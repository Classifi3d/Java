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

