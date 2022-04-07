//Mustea Dumitru-Dan Lab07_2

public class MusteaDan_Lab07_2 {
    public static void main(String[] args) {
        Calculator obj0 = new Calculator();
		
		System.out.println(obj0.additon(7, 8));
        System.out.println(obj0.subtraction(27.3f, 8.f));    
        System.out.println(obj0.multiplication(7.d, 4.34d));   
        System.out.println(obj0.division(7324234234234234234L, 3234234283287423238L));  
        System.out.println(obj0.additon("hello ", "world"));
        System.out.println(obj0.subtraction("hello world", "o"));
        try{
            System.out.println(obj0.multiplication("abc", "zya"));
            System.out.println(obj0.division("abc", "xyz"));
        }catch(ErrorMessage e){
            System.out.println("Wrong type!");
        }


    }
}


class Calculator{
  
    //addition
    public <M extends Long>Long additon(M object1,M object2){
        return object1.longValue()+object2.longValue();
    }
    public <M extends Double>Double additon(M object1,M object2){
        return object1.doubleValue()+object2.doubleValue();
    }
    public <M extends Float>Float additon(M object1,M object2){
        return object1.floatValue()+object2.floatValue();
    }
    public <M extends Integer>Integer additon(M object1,M object2){
        return object1+object2;
    }
    public <M extends String>String additon(M object1,M object2){
        return object1.toString()+object2.toString();
    }
    //subtraction
    public <M extends Long>Long subtraction(M object1,M object2){
        return object1.longValue()-object2.longValue();
    }
    public <M extends Double>Double subtraction(M object1,M object2){
        return object1.doubleValue()-object2.doubleValue();
    }
    public <M extends Float>Float subtraction(M object1,M object2){
        return object1.floatValue()-object2.floatValue();
    }
    public <M extends Integer>Integer subtraction(M object1,M object2){
        return object1-object2;
    }
    public <M extends String>String subtraction(M object1,M object2){
        return object1.toString().replaceAll(object2.toString(),"");
    }
    //multiplication
    public <M extends Long>Long multiplication(M object1,M object2){
        return object1.longValue()*object2.longValue();
    }
    public <M extends Double>Double multiplication(M object1,M object2){
        return object1.doubleValue()*object2.doubleValue();
    }
    public <M extends Float>Float multiplication(M object1,M object2){
        return object1.floatValue()*object2.floatValue();
    }
    public <M extends Integer>Integer multiplication(M object1,M object2){
        return object1*object2;
    }
    public <M extends String>String multiplication(M object1,M object2) throws ErrorMessage {
        throw new ErrorMessage(null);
    }
    //division
    public <M extends Long>Long division(M object1,M object2){
        return object1.longValue()/object2.longValue();
    }
    public <M extends Double>Double division(M object1,M object2){
        return object1.doubleValue()/object2.doubleValue();
    }
    public <M extends Float>Float division(M object1,M object2){
        return object1.floatValue()/object2.floatValue();
    }
    public <M extends Integer>Integer division(M object1,M object2){
        return object1/object2;
    }
    public <M extends String>String division(M object1,M object2) throws ErrorMessage {
        throw new ErrorMessage(null);
    }
    
}

class ErrorMessage extends Exception{
    private static final long serialVersionUID = 4706118674671500784L;
    ErrorMessage(String meesage){
        super(meesage);
    }
}


