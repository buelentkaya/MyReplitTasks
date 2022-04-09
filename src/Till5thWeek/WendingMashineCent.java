package Till5thWeek;

import java.util.Scanner;
public class WendingMashineCent {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int itemPrice,change;
        int quarters,dimes,nickels;
        System.out.println("Enter price in Cents");
        itemPrice=scan.nextInt();

        if(itemPrice<25 ||itemPrice>100|| itemPrice%5 !=0){// girelen fiyatin 5 bolumunden kalan sifira esitdegilse
            System.out.println("Invalid Price");
        }else{
            change=100-itemPrice;//40
            quarters=change/25;//40/25=1, 15ent remaining
            int remainingCentsAfterQuRTER=change%25;// 15
            dimes=remainingCentsAfterQuRTER/10;// 15/10=1 and 5 cents
            int remainingCentsAfterDimes=dimes%10;// 5 cents
            nickels=remainingCentsAfterDimes/5;//5/5=1
            System.out.println("Your change is "+ quarters+" quarters "+ dimes+ " dimes, and "+ nickels+" nickels");



        }


    }
}
