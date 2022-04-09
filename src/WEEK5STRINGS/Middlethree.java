package WEEK5STRINGS;
import java.util.*;
public class Middlethree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
         scan.close();

        if(word.length()>5 && word.length()%2==1){
       System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2)+word.charAt(word.length()/2+1));

        }else{System.out.println("invalid");}


    }
}
