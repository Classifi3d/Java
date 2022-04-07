//Mustea Dumitru-Dan Lab03_1
import java.util.Scanner;

class MusteaDan_Lab03_1{
    private static Scanner keyboard;
    public static void main(String args[]){
        keyboard = new Scanner(System.in);
        String inputString="";
        System.out.println("Insert a string");
        inputString = keyboard.nextLine();//read the string from keyboard which can be either int/string
        boolean isValidNumber = false;
        try{//if it can be an int
            int numberMonth = Integer.parseInt(inputString);//make it an int

            if(numberMonth>0 && numberMonth<13){//if it's between 1 and 12 
                String month;
                switch (numberMonth){//look for the name of the number of the month
                    case 1: month = "January"; break;
                    case 2: month = "February"; break;  
                    case 3: month = "March"; break;
                    case 4: month = "April"; break;
                    case 5: month = "May"; break;
                    case 6: month = "June"; break;
                    case 7: month = "July"; break;
                    case 8: month = "August"; break;
                    case 9: month = "September"; break;
                    case 10: month = "October"; break;
                    case 11: month = "November"; break;
                    case 12: month = "December"; break;
                    default: month = "Invalid data entered!";
                }
                System.out.println(month);//output the name
                isValidNumber = true;
            }
        }
        catch(NumberFormatException e){   
        
        }


        if (isValidNumber == false) {//if it's a string
            int numberMonth = 0;
            switch(inputString.toUpperCase()){//check if string is the name of a month
                case "JANUARY": numberMonth=1; break;
                case "FEBRUARY": numberMonth=2; break;
                case "MARCH": numberMonth=3; break;
                case "APRIL": numberMonth=4; break;
                case "MAY": numberMonth=5; break;
                case "JUNE": numberMonth=6; break;
                case "JULY": numberMonth=7; break;
                case "AUGUST": numberMonth=8; break;
                case "SEPTEMBER": numberMonth=9; break;
                case "OCTOBER": numberMonth=10; break;
                case "NOVEMBER": numberMonth=11; break;
                case "DECEMBER": numberMonth=12; break;
                default: numberMonth=0;
            }
            if(numberMonth>0&&numberMonth<13){//if it is, print it
                System.out.println(numberMonth);
            }else{
                System.out.println("Invalid data entered!");//incorrect input
            }
        }


    }
}
