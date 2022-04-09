package Week06LOOP;
import java.util.Scanner;
public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {

            if(i!=count-1){
                System.out.print(word+separator);}
            else{
                System.out.print(word);
            }

        }






    }
}
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3
​
output: WordXWordXWord
copied!
input:
Word
X
3

output: WordXWordXWord
Example:
 */