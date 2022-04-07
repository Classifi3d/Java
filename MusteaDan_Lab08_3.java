//Mustea Dumitru-Dan Lab08_3
import java.io.*;
import java.util.LinkedList;
import java.text.*;
public class MusteaDan_Lab08_3 {
    public static void main(String[] args) {
        LinkedList<Integer> day= new LinkedList<Integer>();
        LinkedList<Integer> month= new LinkedList<Integer>();
        LinkedList<Integer> year= new LinkedList<Integer>();
        int counter=0;
        boolean flag=true;
        //05/06/2000

        try{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader (System.in)); 
        System.out.println("Insert a date formated as such\"DD/MM/YYYY\" ");
            String line = new String();
            while(flag==true){
                line = bufRead.readLine();
                if(line.toUpperCase().charAt(0)!='X'){
                    if(line.length()!=10){
                        System.out.println("Wrong data, read again!");
                    }else{//only if it has length 10
                        if(Integer.parseInt(line.substring(0,1))==0){
                            //System.out.println(line.substring(1,2));
                            day.add(Integer.parseInt(line.substring(1,2)));
                            
                        }else{
                            // System.out.println(line.substring(0,2));
                            day.add(Integer.parseInt(line.substring(0,2)));
                        }
                        if(Integer.parseInt(line.substring(3,4))==0){
                            // System.out.println(line.substring(4,5));
                            month.add(Integer.parseInt(line.substring(4,5)));
                        }else{
                            // System.out.println(line.substring(3,5));
                            month.add(Integer.parseInt(line.substring(3,5)));
                        }
                        // System.out.println(line.substring(6,10));
                        year.add(Integer.parseInt(line.substring(6,10)));
                        counter++;
                    }
                }else{//if the string is X
                    flag=false;
                }
            }
        }catch(Exception e){
            System.out.println("Reading Error!");
        }

        DateFormatSymbols monthNames = new DateFormatSymbols();
        String months[]=monthNames.getMonths();
        for(int i=0;i<counter;i++){
            if(month.get(i)>0 && month.get(i)<=12){//validation of the month
                System.out.println(day.get(i)+" "+months[month.get(i)-1]+" "+year.get(i));
            }else{
                System.out.println("Invalid month entered while reading");
                System.out.println(day.get(i)+" "+month.get(i)+" "+year.get(i));
            }
        }
    }
}
