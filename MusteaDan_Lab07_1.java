//Mustea Dumitru-Dan Lab07_1

public class MusteaDan_Lab07_1 {
    public static void main(String[] args) {
        ImplementedGenerator<Integer> ob1 = new ImplementedGenerator<Integer>();
        Integer integerEx = 343;
        ob1.next(integerEx);
        
        ImplementedGenerator<String> ob2 = new ImplementedGenerator<String>();
        String stringEx = "This is my personal example string";
        ob2.next(stringEx);

        ImplementedGenerator<Number> ob3 = new ImplementedGenerator<>();
        Float floatEx=34.3f;
        ob3.next(floatEx);
        Integer intEx=64;
        ob3.next(intEx);

        ImplementedGenerator<Character> ob4 = new ImplementedGenerator<>();
        ob4.next('c');
        Character characterEx='f';
        ob4.next(characterEx); 
    }
}

interface Generator<T>{
    public void next(T var);
}

class ImplementedGenerator<T> implements Generator<T>{
    public void next(T var){
		System.out.println(var+" of variable type "+var.getClass());
    }
}
