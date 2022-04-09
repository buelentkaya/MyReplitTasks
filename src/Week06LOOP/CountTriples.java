package Week06LOOP;
import java.util.Scanner;
public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String!");
        String str = scan.next();
        int count = 0 ;

        for (int i = 0; i < str.length() ; i++) {
            char ch1=str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                char ch2=str.charAt(j);

                for (int k = 0; k < str.length(); k++) {

                    char ch3=str.charAt(j);
                    while(ch1==ch2&&ch2==ch3){
                        count++;
                    }

                }


            }

        }

        System.out.println(count);

scan.close();




    }
}
/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc
​
output: 1
input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd
​
output: 3
input: xxxabyyyycd

output: 3
Example:

input: java
​
output: 0
 */