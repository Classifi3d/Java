//Mustea Dumitru-Dan Lab08_2
import java.io.*;

public class MusteaDan_Lab08_2 {
    public static void main(String[] args) {
        String message = new String();
        boolean messageRead=false;
        Integer day = 0;
        boolean dayRead=false;
        String month = new String();
        boolean monthRead=false;
        Integer year = 0;
        boolean yearRead=false;


        try{
            String path = System.getProperty("user.dir");
            //System.out.println(path+"/"+"MusteaDan_Lab08_2_InputFile.txt");
            BufferedReader bufRead = new BufferedReader(new InputStreamReader(new FileInputStream(path+"/"+"MusteaDan_Lab08_2_InputFile.txt"))); 
            StreamTokenizer strToken = new StreamTokenizer(bufRead);            
            boolean eof=false;

            
            do{
                int token=strToken.nextToken();
                switch(token){
                    case StreamTokenizer.TT_EOF:
                        System.out.println("End of the file");
                        eof=true;
                        break;
                    case StreamTokenizer.TT_EOL:
                        System.out.println("End of the line");
                        break;
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word "+strToken.sval);
                        if(messageRead==false){
                            message=strToken.sval;
                            messageRead=true;
                        }else if(monthRead==false){
                            monthRead=true;
                            month=strToken.sval;
                        }
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Num "+strToken.nval);
                        if(dayRead==false){
                            day=(int)strToken.nval;
                            dayRead=true;
                        }else if(yearRead==false){
                            year=(int)strToken.nval;
                            yearRead=true;
                        }
                        break;
                    default:
                        System.out.println((char)token+"encountered");
                    
                    if(token=='!'){
                        System.out.println("Exit!");
                        eof=true;
                    }

                }
            }while(!eof);
            

        }catch(Exception e){
            System.out.println("Reading Error!");
        }
        System.out.println(message+" "+day+" "+month+" "+year);

    }
}
