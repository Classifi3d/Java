//Mustea Dumitru-Dan Lab06_7
import ImageProcessor.*;

public class MusteaDan_Lab06_7 {
    public static short getRandomShortBetweenRange(int min, int max){
        return (short)((Math.random()*((max-min)+1))+min);
    }
    public static void main(String[] args) {
        final int MIN = 0; // 0 by default
        final int MAX = 255; //255 by default 
        final int N = 2048;
        final int M = 2048;
        final short R=190;
        final short G=255;
        final short B=210;

        long startNano = System.nanoTime();
        long startMili = System.currentTimeMillis();
        MyImage screen = new MyImage(N,M);
        System.out.println("======== Uninitialized display ========");
        screen.display();
        System.out.println("======== Random values display ========");
        for(int i=0;i<screen.getN();i++){
            for(int j=0;j<screen.getM();j++){
                Pixel aux = new Pixel(getRandomShortBetweenRange(MIN,MAX),getRandomShortBetweenRange(MIN,MAX),getRandomShortBetweenRange(MIN,MAX));
                screen.setPixel(i, j, aux);
            }
        }
        screen.display();

        System.out.println("======== Whitin Parameters values display ========");
        screen.matrixWithinParameters(R,G,B);
        screen.display();

        System.out.println("======== Delete all pixels display ========");
        screen.deleteAllPixels();
        screen.display();
        
        System.out.println("======== Elapsed Time ========");
        long finishNano = System.nanoTime();
        long finishMili = System.currentTimeMillis();
        long timeElapsedNano = finishNano - startNano;
        long timeElapsedMili = finishMili - startMili;
        System.out.println("Nano time: "+timeElapsedNano);
        System.out.println("Miliseconds time: "+timeElapsedMili);

        /* --------------------------------------------------------------------------- */
        /*                              My Timing Results                              */
        /* --------------------------------------------------------------------------- */
        /*  For 32:32       Nano Time:  174545580       Miliseconds Time:  174         */
        /*  For 64:64       Nano Time:  264782212       Miliseconds Time:  265         */
        /*  For 128:128     Nano Time:  552479506       Miliseconds Time:  553         */
        /*  For 256:256     Nano Time:  1378148931      Miliseconds Time:  1378        */
        /*  For 512:512     Nano Time:  4617479694      Miliseconds Time:  4617        */
        /*  For 1024:2014   Nano Time:  16448860334     Miliseconds Time:  16449       */
        /* --------------------------------------------------------------------------- */
        /* The program has a complixity of about O(8*n*m):                             */
        /*   4 ciclyes of which are used for displaying                                */
        /*   1 for assinging instantiation                                             */
        /*   1 for assinging values                                                    */
        /*   1 for keeping the values whiting certain parameters                       */
        /*   1 for deleting the values                                                 */
        /* Compiled on a 6 core AMD FX 6300 processor                                  */
        /* --------------------------------------------------------------------------- */
    }
}
