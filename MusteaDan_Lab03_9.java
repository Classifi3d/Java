//Mustea Dumitru-Dan Lab03_9

public class MusteaDan_Lab03_9 {

    public static boolean isThisTheCard;//a "global" flag value which tells if the random genereated card is a valid one

    public static boolean isNotInDeck(String deck[],String card,int length){//looks for the random generated card in the deck
        for(int i=0;i<length;i++){
            if(deck[i]==card){//if the card was found in the deck
                return false;//then make it invalid
            }
        }
        return true;
    }

    public static double getRandomDoubleBetweenRange(double min, double max){//generates a double number between 2 values 
        double number = (Math.random()*((max-min)+1))+min;
        return number;
    }

    public static String randomCard(){//generates a random playing card
        int number,symbol;
        String card=new String();

        boolean okNumber=false,okSymbol=false;//flags which check for the card we need to find
        isThisTheCard=false;//setting the need card flag to 0, at each geneartion

        number=(int)getRandomDoubleBetweenRange(1,13);//NUMBER of the card
        if(number==1){//ace
            card="A";
        }else if(number==11){//jack
            okNumber=true;//checking the number flag
            card="J";
        }else if(number==12){//queen
            okNumber=true; //checking the number flag           
            card="Q";
        }else if(number==13){//king
            okNumber=true;//checking the number flag
            card="K";
        }else{
            if(number>8){
                okNumber=true;//checking the number flag
            }
            card=String.valueOf(number);
        }

        symbol=(int)getRandomDoubleBetweenRange(1,4);//SYMBOL of the card
        if(symbol==1){
            card+="♣";//clubs
            okSymbol=true;//checking the symbol flag
        }else if(symbol==2){
            card+="♦";//diamonds
        }else if(symbol==3){
            card+="♥";//hearts   
        }else if(symbol==4){
            card+="♠";//spades
        }

        if(okNumber==true&&okSymbol==true){//if both flags have been checked
            isThisTheCard=true;//we found the card
        }

        return card; 
    }

    public static void main(String args[]){
        String deck[]=new String[52];

        boolean cardFound=false;
        int position=0;//starting position of the deck
        
        while(cardFound==false && position<51){
            String card=randomCard();
            if(isThisTheCard==true){//has the card been found
                cardFound=true;
                System.out.println("===The card===");
                System.out.println(card);//display it
            }  
            if(isNotInDeck(deck, card, position+1)){//add a non-duplicate card to the deck 
                deck[position]=card;
                position++;//increasing the position
            }
        }

        System.out.println("===The deck===");
        for(int i=0;i<position;i++){//simplying displaying the deck with all the cards that were generated
            System.out.print(deck[i]+" ");
        }System.out.println();

    }
}

