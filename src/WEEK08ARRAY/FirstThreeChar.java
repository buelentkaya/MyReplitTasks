package WEEK08ARRAY;
import java.util.Scanner;
import java.util.Arrays;

public class FirstThreeChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        String[] substring = new String[0];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
}
        for(String each:arr){
            System.out.println(each.substring(0,3));

        }
/*the fist three chars of the every string
how
are
you
fri
ahm
 */


    }
}
