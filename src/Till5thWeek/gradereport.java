package Till5thWeek;

import java.util.Scanner;
public class gradereport {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        String result=(grade>90)?"excellent":(grade<=90&&grade>70)?"good":(grade>=60&&grade<=70)?"pass":"fail";
        System.out.println(result);





    }
}
