package WEEK5STRINGS;
import java.util.Scanner;
public class longestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
scan.close();
        String result=(word1.length()>word2.length())? word1:word2;
        System.out.println(result);



    }
}
