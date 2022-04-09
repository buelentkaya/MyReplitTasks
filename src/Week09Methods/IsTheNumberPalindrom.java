package Week09Methods;
import java.util.Scanner;
public class IsTheNumberPalindrom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int originalNum, reversedNum, remainder;

        originalNum = num;
        reversedNum = 0;

        while (num != 0) {
            remainder = num % 10;//1
            reversedNum = reversedNum * 10 + remainder;//0+
            num /= 10; //
            System.out.println("reversedNum = " + reversedNum);// 1-15-155-1551
            System.out.println(num);
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
