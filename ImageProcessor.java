# ---------------------------------------------------------------------------- #
#                            ImageProcessor package                            #
# ---------------------------------------------------------------------------- #



# -------------------------------- Pixel.java -------------------------------- #

package ImageProcessor;

public class Pixel {
    private short r;
    private short g;
    private short b;
    public Pixel(){
        this.r=0;
        this.g=0;
        this.b=0;
    }
    public Pixel(short r,short g,short b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public void setR(short r){
        this.r=r;
    }
    public void setG(short g){
        this.g=g;
    }
    public void setB(short b){
        this.b=b;
    }
    public void setRGB(short r,short g,short b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public short getR(){
        return this.r;
    }
    public short getG(){
        return this.g;
    }
    public short getB(){
        return this.b;
    }
    public static void displayPixel(Pixel pixel){
        System.out.println(Integer.toString(pixel.r)+"  "+Integer.toString(pixel.g)+"  "+Integer.toString(pixel.b));
    }

    @Override
    public String toString() {
        return Integer.toString(this.r)+"."+Integer.toString(this.g)+"."+Integer.toString(this.b);
    }

}





# ----------------------------- MyImage.java  ------------------------------- #

package ImageProcessor;
import java.util.Scanner;

public class MyImage {
    private static Scanner keyboard = new Scanner(System.in);
    private int n;
    private int m;
    private Pixel pixelMatrix[][];
    public MyImage(){
        this.n=IntegerRead();
        this.m=IntegerRead();
        pixelMatrix = new Pixel[this.n][this.m];
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.m;j++){
                pixelMatrix[i][j]=new Pixel();
            }
        }
    }
    public MyImage(int n,int m){
        this.n=n;
        this.m=m;
        pixelMatrix = new Pixel[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pixelMatrix[i][j]=new Pixel();
            }
        }
    }
    public void setMatrix(){
        this.n=IntegerRead();
        this.m=IntegerRead();
        pixelMatrix = new Pixel[this.n][this.m];
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.m;j++){
                pixelMatrix[i][j]=new Pixel();
            }
        }
    }
    public void setMatrix(int n,int m){
        this.n=n;
        this.m=m;
        pixelMatrix = new Pixel[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pixelMatrix[i][j]=new Pixel();
            }
        }
    }
    public int getN(){
        return this.n;
    }
    public int getM(){
        return this.m;
    }
    public Pixel getPixel(int x,int y){
        return pixelMatrix[x][y];
    }
    public void setPixel(int x,int y,Pixel pixel){
        pixelMatrix[x][y]=pixel;
    }
    public void deleteAllPixels(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pixelMatrix[i][j]=new Pixel();
            }
        }
    }
    public boolean isPixelWithinParameters(Pixel pixel,Pixel maxValue){
        boolean flag=true;
        if(pixel.getR()>maxValue.getR()){
            flag=false;
        }
        if(pixel.getG()>maxValue.getG()){
            flag=false;
        }
        if(pixel.getB()>maxValue.getB()){
            flag=false;
        }

        return flag;
    }
    public boolean isPixelWithinParameters(Pixel pixel,short r,short g,short b){
        boolean flag=true;
        if(pixel.getR()>r){
            flag=false;
        }
        if(pixel.getG()>g){
            flag=false;
        }
        if(pixel.getB()>b){
            flag=false;
        }

        return flag;
    }
    public void matrixWithinParameters(short r,short g,short b){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isPixelWithinParameters(pixelMatrix[i][j],r,g,b)==false){
                    pixelMatrix[i][j]=new Pixel();
                }
            }
        }
    }
    public void matrixWithinParameters(Pixel pixel){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isPixelWithinParameters(pixelMatrix[i][j],pixel.getR(),pixel.getG(),pixel.getB())==false){
                    pixelMatrix[i][j]=new Pixel();
                }
            }
        }
    }
    public Pixel grayscaleTransform(Pixel pixel){
        pixel.setR((short)(0.21*pixel.getR()));
        pixel.setG((short)(0.71*pixel.getG()));
        pixel.setB((short)(0.07*pixel.getB()));
        
        return pixel;
    }
    public void display(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(pixelMatrix[i][j].toString()+" "); 
            }System.out.println();
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
}



