package WEEK5STRINGS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
       scan.close();
        char firstCh = word.charAt(0);
        char lastCh = word.charAt(word.length() - 1);

        if (firstCh == 'X' || firstCh == 'x') {
            System.out.println(word.substring(1));
        }// if x or X state in the first charcter than excute after the first character

        if (lastCh == 'X' || lastCh == 'x') {
            System.out.println(word.substring(0,word.length()-1));
        }
        System.out.println(word);

        }
    }
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX
​
output: Hi
input: xHiX

output: Hi
input: apple
​
output: apple
input: apple

output: apple
input: xUxL
​
output: UxL
input: xUxL

output: UxL
input: JavaX
​
output: Java
 */