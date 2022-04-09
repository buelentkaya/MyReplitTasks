package WEEK08ARRAY;


import java.util.Arrays;
import java.util.Scanner;

public class PrintShortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(",");


        String shortestWord = words[0];
        for (String currentWord : words) {
            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;
            }
        }

        int numberOfShortest = 0;
        for (String currentWord : words) {
            if (currentWord.length() == shortestWord.length()) {
                shortestWord = currentWord;
                numberOfShortest++;
            }
        }

        String[] allShortestArr = new String[numberOfShortest];
        int x = 0;
        for (String currentWord : words) {
            if (currentWord.length() == shortestWord.length()) {
                allShortestArr[x] = currentWord;
                x++;
            }
        }
        Arrays.sort(allShortestArr);
        System.out.println(Arrays.toString(allShortestArr));


    }
}
/*
Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
​
output: [cat, old, ray]
 */