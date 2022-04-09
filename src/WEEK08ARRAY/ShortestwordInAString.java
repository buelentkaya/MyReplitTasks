package WEEK08ARRAY;

import java.util.Scanner;

public class ShortestwordInAString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]words={scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};

        String shortestWord=words[0];

        for(String currentWord:words){

           if(currentWord.length()<shortestWord.length()){
               shortestWord=currentWord;
           }

            System.out.println(shortestWord);
        }
    }
}
