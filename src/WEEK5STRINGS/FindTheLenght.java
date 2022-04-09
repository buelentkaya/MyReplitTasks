package WEEK5STRINGS;

import java.util.Scanner;

public class FindTheLenght {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.nextLine();
        scan.close();
        int lengthOfTheText=text.length();
        System.out.println("Length is: "+lengthOfTheText);
        System.out.println(text.charAt(text.length()-1));// son karaketeri yazdirma.


    }

}
