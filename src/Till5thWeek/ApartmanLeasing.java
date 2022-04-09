package Till5thWeek;

import java.util.Scanner;
public class ApartmanLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;
        String result="";

        if(numberOfBedrooms>0&&numberOfBedrooms<4){
            switch(numberOfBedrooms){
                case 1:
                    result= "One Bedroom Selected";
                    startingPrice= 1100;
                    break;
                case 2:
                    result="Two Bedroom Selected";
                    startingPrice = 1850;
                    break;
                default:
                    result="Three Bedroom Selected";
                    startingPrice =2550;
            }

        }else{
            result= "No such Bedrooms available";

        }
        System.out.println(result+"\nStarting Price: "+startingPrice);


    }

    public static class BlackJack {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int house = s.nextInt();
            int player = s.nextInt();



            String result=(house>player)?"player loss ":(house<player&&player<=21)? "player win"
                    :(house<player&&player>21)?"player bust":"its a tie";

            System.out.println(result);



        }
    }
}
