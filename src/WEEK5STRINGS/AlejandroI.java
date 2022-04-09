package WEEK5STRINGS;
import java.util.*;
public class AlejandroI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();


        s.close();

        if(a.contains("alejandro")&& a.contains("project")){  // emailde adamin adi ve proje ifadelerigeciyorsa oku

            System.out.println("read");}

        else{
            System.out.println("don't read"); }




    }
}
