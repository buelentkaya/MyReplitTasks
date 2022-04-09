package Extras;
import java.util.Arrays;
import java.util.Scanner;
public class CreditCardNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a credit card number: ");//4388576018410707
        String cardNUmber = scan.nextLine();//4388576018402626


        validateCreditCardNumber(cardNUmber);
       
    }

    private static void validateCreditCardNumber(String cardNUmber) {

        int[] ints = new int[cardNUmber.length()];

        for (int i = 0; i < cardNUmber.length(); i++) {
            ints[i] = Integer.parseInt(cardNUmber.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];//5
            j = j * 2;//10
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        System.out.println(Arrays.toString(ints));//[8, 3, 7, 8, 1, 7, 3, 0, 2, 8, 8, 1, 0, 7, 0, 7]

        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            System.out.println(cardNUmber + " is a valid credit card number \n Use it happily after!!!");
        } else {
            System.err.println(cardNUmber + " is an invalid credit card number \n Please contact your Bank immediately ");
        }







    }
}
