//Mustea Dumitru-Dan Lab04_5
import java.util.regex.Pattern;
import java.util.StringTokenizer;

public class MusteaDan_Lab04_5 {
    public static void main(String args[]){  
		String input1 = "This is a sentence that conatins numbers";
        String input2 = "1";
		String pattern1 = "\\d";//is a digit

		boolean isMatch1 = Pattern.matches(pattern1, input1);
		boolean isMatch2 = Pattern.matches(pattern1, input2);
		System.out.println(isMatch1);
        System.out.println(isMatch2);

        System.out.println("======================================");
        String input3 = "This is a message that will be changed";
		Pattern pattern2 = Pattern.compile("( a|e|i|o|u)");
		String[] parts = pattern2.split(input3);

		for(String part: parts){
			 System.out.print(part + " ");	 
		}System.out.println();

        StringBuilder stringBuilder = new StringBuilder(input3);
		String result = stringBuilder.reverse().toString();
		System.out.println(result);

        System.out.println("======================================");
        String input4 = "fast red muscle";
        StringTokenizer stringTokenizerVar = new StringTokenizer(input4," ");
		while (stringTokenizerVar.hasMoreTokens()){
            String token = (String)stringTokenizerVar.nextToken();
            System.out.println("The "+token+" car");
        }

        System.out.println("======================================");
        String input5 = "qwerty";
        String input6 = "qwerty";
        System.out.println(input5.equals(input6));
        System.out.println(input5.compareTo(input6));

        System.out.println("======================================");
        StringBuffer input7 = new StringBuffer(0);
        System.out.println(input7.insert(0, "qwerty"));
        System.out.println(input7.insert(input7.length(), "asdfghjkl"));
	}
}

