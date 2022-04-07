//Mustea Dumitru-Dan Lab06_6
public class MusteaDan_Lab06_6 {

    public static float getRandomFloatBetweenRange(double min, double max){
        float number = (float)((Math.random()*((max-min)+1))+min) ;
        return number;
    }
    public static void main(String[] args) throws OverSaturated {
        final int MIN = 0; // 0 by default
        final int MAX = 2255; //255 by default 
        HSV hsvObj = new HSV();
        RGB rgbObj = new RGB(); 

        int tries=0;
        boolean ok=false;
        while(ok==false && tries<10){
            try{
                System.out.println("=========== The "+(tries+1)+" attempt =============");
                rgbObj.setRGB(getRandomFloatBetweenRange(MIN, MAX), getRandomFloatBetweenRange(MIN, MAX), getRandomFloatBetweenRange(MIN, MAX));
                System.out.println(rgbObj.toString());
                hsvObj = Color.RGBtoHSV(rgbObj);
                System.out.println("============= The result ==============");
                System.out.println(hsvObj.toString());
                ok=true;
            }catch(OverSaturated E){
                System.out.println("Exception caught");
            }
            tries++;
        }
        if(tries>=10){
            throw new OverSaturated(null);
        }


    }
}

class OverSaturated extends Exception{
    private static final long serialVersionUID = 8509900960280807078L;

    public OverSaturated(String message){
        super(message);
    }
}


class Color{
    public static HSV RGBtoHSV(RGB rgbObj) throws OverSaturated{
        HSV hsvObj = new HSV();
        float min,max,delta;
        min = Math.min(rgbObj.getR(),Math.min(rgbObj.getG(),rgbObj.getB()));
        max = Math.max(rgbObj.getR(),Math.max(rgbObj.getG(),rgbObj.getB()));
        hsvObj.setV(max);
        delta=max-min;

        if(max!=0){
            hsvObj.setS((delta/max)*100);
        }else{
            hsvObj.setS(0);
            hsvObj.setH(-1);
        }

        if(rgbObj.getR()==0){
            hsvObj.setH((rgbObj.getG()-rgbObj.getB())/delta);
        }else if(rgbObj.getG()==max){
            hsvObj.setH(2+(rgbObj.getB()-rgbObj.getR())/delta);
        }else{
            hsvObj.setH(4+(rgbObj.getR()-rgbObj.getG())/delta);
        }

        hsvObj.setH(hsvObj.getH()*60);
        if(hsvObj.getH()<0){
            hsvObj.setH(hsvObj.getH()+360);
        }

        if(hsvObj.getS()>90){
            throw new OverSaturated(null);
        }

        return hsvObj;
    }

    public static RGB HSVtoRGB(HSV hsvObj){
        RGB rgbObj = new RGB();
        int i;
        float f, p, q, t;
        
        if(hsvObj.getS()==0){
            rgbObj.setR(hsvObj.getV());
            rgbObj.setR(hsvObj.getV());
            rgbObj.setR(hsvObj.getV());
        }

        // sector 0 to 5
        i = (int)Math.floor(hsvObj.getH());
        f=hsvObj.getH()-i;
        p=hsvObj.getV()*(1-hsvObj.getS());
        q=hsvObj.getV()*(1-hsvObj.getS()*f);
        t=hsvObj.getV()*(1-hsvObj.getS()*(1-f));

        switch( i ) {
            case 0:
                rgbObj.setR(hsvObj.getV());
                rgbObj.setG(t);
                rgbObj.setB(p);
                break;
            case 1:
                rgbObj.setR(q);
                rgbObj.setG(hsvObj.getV());
                rgbObj.setB(p);
                break;
            case 2:
                rgbObj.setR(p);
                rgbObj.setG(hsvObj.getV());
                rgbObj.setB(t);
                break;
            case 3:
                rgbObj.setR(p);
                rgbObj.setG(q);
                rgbObj.setB(hsvObj.getV());
                break;
            case 4:
                rgbObj.setR(t);
                rgbObj.setG(p);
                rgbObj.setB(hsvObj.getV());
                break;
            // case 5:
            default:		
                rgbObj.setR(hsvObj.getV());
                rgbObj.setG(p);
                rgbObj.setB(q);
                break;
        }



        return rgbObj;
    }

}

class RGB{
    private float r;
    private float g;
    private float b;
    public void setR(float r){
        this.r=r;
    }
    public void setG(float g){
        this.g=g;
    }
    public void setB(float b){
        this.b=b;
    }
    public void setRGB(float r,float g,float b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public float getR(){
        return this.r;
    }
    public float getG(){
        return this.g;
    }
    public float getB(){
        return this.b;
    }
    RGB(){
        this.r=0;
        this.g=0;
        this.b=0;
    }
    RGB(float r,float g,float b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    @Override
    public String toString() {
        return Float.toString(this.r)+"  "+Float.toString(this.g)+"  "+Float.toString(this.b);
    }
}

class HSV{
    private float h;
    private float s;
    private float v;
    public void setH(float h){
        this.h=h;
    }
    public void setS(float s){
        this.s=s;
    }
    public void setV(float v){
        this.v=v;
    }
    public void setHSV(float h,float s,float v){
        this.h=h;
        this.s=s;
        this.v=v;
    }
    public float getH(){
        return this.h;
    }
    public float getS(){
        return this.s;
    }
    public float getV(){
        return this.v;
    }
    HSV(){
        this.h=0;
        this.s=0;
        this.v=0;
    }
    HSV(float h,float s,float v){
        this.h=h;
        this.s=s;
        this.v=v;
    }
    @Override
    public String toString() {
        return Float.toString(this.h)+"  "+Float.toString(this.s)+"  "+Float.toString(this.v);
    }
}

