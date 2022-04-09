package WEEK08ARRAY;

import java.util.*;

public class FindingMaxlength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            if (currentWord.length() > longestWord.length())
                longestWord = currentWord;

        }
        System.out.println(longestWord);
    }


}





