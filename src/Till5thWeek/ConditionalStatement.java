package Till5thWeek;

import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();


        //boolean result=name=="Chen";

        switch(name){
            case "Chen":
                System.out.println("teacher");
                break;
            default:
                System.out.println("student");
        }
    }
}
