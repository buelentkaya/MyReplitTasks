package Till5thWeek;

import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        String result="";


        switch(a){

            case "a": case "c":
                result= a +" is wrong";
                break;

            case "b":
                result=a+" is correct";
                break;

            default:
                result= a+" is not a valid answer";

        }

        System.out.println(result);


    }
}
