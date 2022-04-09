package WEEK5STRINGS;
import java.util.*;
public class printHalf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int newWord = word.length() / 2;
scan.close();
        System.out.println(word.substring(0, newWord).repeat(2));

/*
String nw= word.substring(0,newWord);

System.out.println(nw.repeat(2));  */




    }
    }
