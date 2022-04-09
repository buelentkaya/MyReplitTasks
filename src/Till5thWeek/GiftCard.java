package Till5thWeek;

import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {

        int moneyIhave = 100;
        int blanket = 60, charger = 25, hat = 25, headphones = 30, laptop = 200, pants = 50, pillow = 4, smartphone = 1000, socks = 5, usb = 10;
        int shopping = 0;

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int giftCard = 100;

        switch (item) {
            case "Blanket":
                giftCard -= 60;
                break;
            case "Charger":
                giftCard -= 25;
                break;
            case "Hat":
                giftCard -= 25;
                break;
            case "Headphones":
                giftCard -= 30;
                break;
            case "Laptop":
                giftCard -= 200;
                break;
            case "Pants":
                giftCard -= 50;
                break;
            case "Pillow":
                giftCard -= 40;
                break;
            case "Smartphone":
                giftCard -= 1000;
                break;
            case "Socks":
                giftCard -= 5;
                break;
            case "USB cable":
                giftCard -= 10;
                break;
            default:
                System.out.println("Invalid item!");
                break;
        }
        if (giftCard < 0) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (giftCard == 100) {
            //nothing here
        } else {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + giftCard + "$");
        }
    }
}