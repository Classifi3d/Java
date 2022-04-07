import java .io.* ;

public class FileReaserWriter_01{

	public static void main (String[] args){
		String s1,s2=new String();
		String str=new String();
		String str2=new String();
		
		try{
			BufferedReader bufRead=new BufferedReader (new InputStreamReader (System.in));
			System.out .println ("Prima linie?");
			str=bufRead.readLine ();
			System.out .println("Linia scrisa este: "+str);
			System.out .println("A doua linie?");
			str2=bufRead.readLine ();
			System.out .println("Linia scrisa este: "+str2);
			bufRead.close ();
		}
		catch(IOException e){System.out .println("Eroare citire" +e);}
		
		try{
			PrintWriter outF1=new PrintWriter (new BufferedWriter (new FileWriter ("test.dat")));
			outF1 .println(str);
			outF1.close ();
			
			BufferedReader inF1=new BufferedReader (new FileReader ("test.dat"));
			s2=new String ();
			while((s1=inF1.readLine ())!=null)
				s2 +=s1 + "\n";
			System.out .println("Citire din fisier: "+s2);
			inF1.close();
			
			PrintWriter outF2=new PrintWriter (new FileWriter ("test.dat"));
			outF2.println("My own example");
			outF2.close();
			
			BufferedReader inF2=new BufferedReader (new FileReader ("test.dat"));
			while((s1=inF2.readLine ())!=null)
				s2 +=s1 + "\n";
			System.out .println("Citire din fisier: "+s2);
			inF2.close();
			
			System.out .println("Citire BufferedReader-StringReader");
			BufferedReader inBS=new BufferedReader (new StringReader (str2));
			System.out .println(inBS.readLine());
		}
		catch(IOException e){System.out .println("Exceptie: "+e);}
		
		try{
			int c;
			StringReader inSR1=new StringReader (s2);
			System.out .println("Citire cu StringReader cu conversie in char");
			while((c=inSR1.read()) != -1)
				System.out .print((char)c);
			inSR1.close ();
			System.out .println("Citire cu StringReader fara conversie in char");
			StringReader inSR2 =new StringReader (s2);
			while((c = inSR2.read()) != -1)
				System.out .print(c);
			inSR2.close();
		}
		catch (IOException e){System.out .println("Eroare citire din memorie");}
		
	}
			
}

