package WEEK08ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String[] firstAndLastChar = new String[words.length];

        for (int i = 0; i < words.length; i++) {

            firstAndLastChar[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
        }

        System.out.println(Arrays.toString(firstAndLastChar));

        input.close();
    }
}
/*
Given a String array words, iterate through each word and
print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
​
print:
ho
wy
by
ae
ne
 */