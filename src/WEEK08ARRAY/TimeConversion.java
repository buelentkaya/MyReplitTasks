package WEEK08ARRAY;

import java.util.*;

public class TimeConversion {

    //Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }

    public static void timeConversion(String s) {

        // char [] ch=s.toCharArray();


        if (s.contains("PM")) {
            s = s.replace("PM", "");
            String[] timeS = s.split(":");
            if (!timeS[0].equals("12")) {
                Integer time = Integer.parseInt(timeS[0]);
                time = time + 12;

                timeS[0] = Integer.toString(time);
            }
            s = timeS[0] + ":" + timeS[1] + ":" + timeS[2];

        } else if (s.contains("AM")) {
            s = s.replace("AM", "");
            String[] timeS = s.split(":");
            if (timeS[0].equals("12")) {
                timeS[0] = "00";
            }
            s = timeS[0] + ":" + timeS[1] + ":" + timeS[2];
        }

        System.out.println(s);

    }
}
/*
Input: 07:05:45PM

Output: 19:05:45
 */