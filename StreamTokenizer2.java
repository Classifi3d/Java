
import java.io.*;

public class StreamTokenizer2{
	
	public static void main (String[] args){

		try{

		Reader r = new BufferedReader(new InputStreamReader(new FileInputStream("test.dat")));


		StreamTokenizer st = new StreamTokenizer(r);

		boolean eof = false;
         

		do {
		int token = st.nextToken();

		switch (token) {
			case StreamTokenizer.TT_EOF:
			System.out.println("End of File encountered.");
			eof = true;
			break;
                  
		case StreamTokenizer.TT_EOL:
			System.out.println("End of Line encountered.");
			break;
                  
		case StreamTokenizer.TT_WORD:
			System.out.println("Word: " + st.sval);
			break;
                  
		case StreamTokenizer.TT_NUMBER:
			System.out.println("Number: " + st.nval);
			break;
                  
		default:
			System.out.println((char) token + " encountered.");
                  
		if (token == '!') {
			eof = true;
		}
		}
		} while (!eof);	

		}catch(IOException ioex){
			System.out.println("Exception while reading the data...");
		}

	}
}
