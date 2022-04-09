package WEEK08ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[java, is, fun]

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        reversed = reversed.trim();


        //End your code here. do not modify below statement
        System.out.println(reversed);


    }
}
