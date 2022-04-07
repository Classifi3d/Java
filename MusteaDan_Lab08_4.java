//Mustea Dumitru-Dan Lab08_4
import java.io.*;
public class MusteaDan_Lab08_4 {
    static final String dataFile = "bitcoinBinary.dat";
    public static void main(String[] args) throws IOException {
        DataInputStream inFile = null;
        int counter=0;
        String bitcoinKey = new String();
        String userKey = new String();
        String output = new String();
        try {
            inFile = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

            int c1;
            try {
                boolean flag=true;
                while (flag==true) {
                    c1=inFile.read();
                    if(c1==-1){
                        flag=false;
                    }else{
                        counter++;
                        bitcoinKey+=(char)c1;
                        //System.out.print((char)c1);
                    }
                }
            } 
            catch(EOFException e) {
                System.out.println("DataInputStream File Error!");
            }
        }finally{
            inFile.close();
        }


        BufferedReader bufRead=new BufferedReader (new InputStreamReader (System.in));
		try{
            System.out.println("Insert a 256 characters and numbers and symbols user key");
            while(userKey.length()!=256){
                userKey=bufRead.readLine();
                if(userKey.length()!=256){
                    System.out.println("Wrong amount of characters to be a 256 char user key, it had "+userKey.length());
                }
            }
        }
        catch(IOException e){
            System.out.println("BufferedReader Keyboard Error!");
        }
        finally{
            bufRead.close();
        }

        
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
            for (int i = 0; i <counter; i++) {
                // System.out.println((char)(bitcoinKey.charAt(i)^userKey.charAt(i)));
                output+=(char)(bitcoinKey.charAt(i)^userKey.charAt(i));
                out.write((char)(bitcoinKey.charAt(i)^userKey.charAt(i)));
            }
        }catch(Exception e){
            System.out.println("DataOutput File Error");
        }finally {
            out.close();
        }
        System.out.println("======= The Bitcoin Key =======");
        System.out.println(bitcoinKey);
        System.out.println("======= The User Key =======");
        System.out.println(userKey);
        System.out.println("======= The Output =======");
        System.out.println(output);
        //System.out.println(output.length());
    }
}
