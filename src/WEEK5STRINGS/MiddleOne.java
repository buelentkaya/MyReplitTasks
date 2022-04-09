package WEEK5STRINGS;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    String word= scan.next();

 if(word.length()%2==1){ if(word.length()>=3){
     System.out.println(word.charAt(word.length()/2));
 }if(word.length()==1){
     System.out.println(word.repeat(3));}

 }else{if(word.length()>=4){
     System.out.print(word.charAt((word.length()/2)-1));
     System.out.println(word.charAt((word.length()/2)));
 }else if(word.length()==2){
     System.out.println(word.repeat(2));}

 }


    }

}