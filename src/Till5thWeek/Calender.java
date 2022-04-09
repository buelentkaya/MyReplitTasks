package Till5thWeek;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();
        scan.close();
        String nameOfMonth="";
        switch(monthNum){
            case 1: nameOfMonth="January";break;
            case 2: nameOfMonth="February";break;
            case 3: nameOfMonth="March";break;
            case 4: nameOfMonth="April";break;
            case 5: nameOfMonth="May";break;
            case 6: nameOfMonth="June";break;
            case 7: nameOfMonth="July";break;
            case 8: nameOfMonth="August";break;
            case 9: nameOfMonth="September";break;
            case 10: nameOfMonth="October";break;
            case 11: nameOfMonth="November";break;
            case 12:nameOfMonth="December";break;
            default: nameOfMonth="Invalid month number";

        }
        System.out.println(nameOfMonth);
    }
}
/*
Write a program that will print out month names by receiving a number. Use Switch Statement. If an invalid month number is entered print "Invalid month number"

Example:

Display message: "Enter month number:"
​
input: 5
​
Display message: "May"
 */