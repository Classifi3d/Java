import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import java.io.*;

public class components {
    public static void main(String[] args) {
        new MyFrame();

        //Input File
        try{
            InputStream file = new FileInputStream("test.txt");
            String line=new String();
            int i;
            while((i=file.read())!=-1){
                if(i==10){
                    String data[] =line.split(" ");
                    System.out.println(data[0]+" "+data[1]+" "+Integer.parseInt(data[2])); // String String Int
                    line="";
                }else{
                    line+=(char)i;
                }
            }
        }
        catch(Exception e){
        }


        //Output
        try{
            BufferedWriter buffer = new BufferedWriter(new FileWriter("test.txt"));
            for(int i=1;i<=10;i++){//generated data
                buffer.write("Name Surename "+i+"\n");
            }
            buffer.close();
            System.out.println("Succesful Writing to File!");
        }
        catch(Exception e){      
        }
    }
}
