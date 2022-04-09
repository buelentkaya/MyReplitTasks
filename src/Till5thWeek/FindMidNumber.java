package Till5thWeek;

import java.util.Scanner;
public class FindMidNumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number:");
        num1=scan.nextInt();
        System.out.println("Enter second number:");
        num2=scan.nextInt();
        System.out.println("Enter third number:");
        num3=scan.nextInt();

        boolean mediumValueNum1 =( num1>num2&&num1<num3)||(num1>num3&&num1<num2);
        boolean mediumValueNum2 =( num2>num1&&num2<num3)||(num2>num3&&num2<num1);
        boolean mediumValueNum3=!mediumValueNum1 && !mediumValueNum2;

        if(mediumValueNum1){
            System.out.println("Medium value is: "+num1);}
        if(mediumValueNum2){
            System.out.println("Medium value is: "+num2);
        }

        if(mediumValueNum3){System.out.println("Medium value is: "+num3);}






    }
}
/*
Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25
​
Medium value is: 25
Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
140
Enter second number:
34
Enter third number:
1
​
Medium value is: 34
 */
