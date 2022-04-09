package WEEK08ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class FindingShortestWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();// with this code we are having a sentence or many words

        String[] words = str.split(",");//with this method we can split each word from the string

        String shortestWord = words[0];

        for (String currentWord : words) { // with  this code we find the shortest word in the String
            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;
            }
        }
//// onemli...daha kisa formu

        String allShortest = "";
        for (String currentWord : words) {
            if (currentWord.length() == shortestWord.length()) {
                allShortest += currentWord + ",";
            }
        }
        allShortest = allShortest.substring(0, allShortest.length() - 1);
        String[] shortestWordArray = allShortest.split(",");


/*
int countOfShortest=0; // with  this code we can find how many shortest word in the string
for(String currentWord:words){  //  with  this code we  find another shortest word with same length
    if(currentWord.length()==shortestWord.length()){
        //System.out.println(currentWord);
        countOfShortest++;
    }
}
        System.out.println(countOfShortest);// bu sekilde olusturacagimizin array size ni buluyoruz. coook onemli

        String [] shortestWordArray=new String[countOfShortest];

        int x=0;
        for(String currentWord:words){  //  with  this code we  find another shortest word with same length
            if(currentWord.length()==shortestWord.length()){
            shortestWordArray[x]=currentWord;// en kisa kelimelerle olusturdugumuz string
            x++;

            }
        }*/
        Arrays.sort(shortestWordArray);
        System.out.println(Arrays.toString(shortestWordArray));


    }
}
