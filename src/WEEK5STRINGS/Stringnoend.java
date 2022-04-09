package WEEK5STRINGS;

import java.util.Scanner;

public class Stringnoend {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String txt=scan.next();
        scan.close();
        System.out.println(txt.substring(0,txt.length()-1));
    }
}
