package Till5thWeek;

import java.util.Scanner;

public class WehicleRecall {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehiclesYear=scan.nextInt();
        String result="";
        switch(vehiclesYear){
        case 1995: case 1996: case 1997: case 1998: case 2001: case 2002:
            case 2004: case 2005: case 2006: case 2015: case 2016: case 2017:
             result="Your vehicle needs to be recalled!"; break;
            default:
                result="Your vehicle is fine, enjoy!";

        }
        System.out.println(result);












    }

}
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

If the year is in the provided range print: Your vehicle needs to be recalled!

If the year is fine print: Your vehicle is fine, enjoy!

Example:

Enter vehicle's year:
1996
​
Your vehicle needs to be recalled!
Enter vehicle's year:
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
2018
​
Your vehicle is fine, enjoy!
 */