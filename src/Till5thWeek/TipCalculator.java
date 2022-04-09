package Till5thWeek;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Split:");
        String isSplit = sc.next();

        System.out.println("Number of people:");
        int numberOfPerson = sc.nextInt();
        String pAnd="&";
        pAnd = pAnd.repeat(numberOfPerson);

        System.out.println("Check amount:");
        double price = sc.nextDouble();

        System.out.println("Service Quality:");
        String serQuality =sc.next();
        Double tip= 0.0;



        switch(serQuality) {

            case "Poor" :
                tip += price * 5 / 100;
                break;

            case "Fair" :
                tip += price * 10 / 100;
                break;

            case "Good" :
                tip += price * 15 / 100;
                break;

            case "Great" :
                tip += price * 20 / 100;
                break;

            case "Excellent" :
                tip += price * 25 / 100;
                break;
        }
        double totalPrice = price + tip;

        System.out.println("Number of people entered: " + pAnd);
        System.out.println("Total to pay: " + totalPrice);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPrice/numberOfPerson);
        System.out.println("Tip per person: " + tip/numberOfPerson);










    }
}
/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */