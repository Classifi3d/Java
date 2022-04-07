//Mustea Dumitru-Dan Lab06_4
import java.lang.Exception;

public class MusteaDan_Lab06_4 {
    public static void main(String[] args) {
        ThrowException a = new ThrowException();

        try{
            a.a();
        }
        catch(SmallerException E){
            System.out.println("Smaller Exception");

        }

        try{
           a.b();
        }
        catch(SmallerException E){
            System.out.println("Smaller Exception");
        }
        catch(SuperException E){
            System.out.println("Super Exception");
        }

    }
}

class SuperException extends Exception{
    private static final long serialVersionUID = -2414716562436410070L;

    public SuperException(String message){
        super(message);
    }
}

class SmallerException extends SuperException{
    private static final long serialVersionUID = 9179287553495847083L;

    public SmallerException(String message){
        super(message);
    }
}

class ThrowException {
    public void a() throws SmallerException{
        throw new SmallerException("Wrong");
    }
    public void b() throws SuperException{
        throw new SuperException("Wrong");
    }
}

