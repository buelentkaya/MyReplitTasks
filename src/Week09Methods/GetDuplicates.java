package Week09Methods;

import java.util.Scanner;

public class GetDuplicates {
    public static int getDup(String[] r) {
        int counter = 0;
        boolean counterBoolean = false;

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[i].equals(r[j]) && !(r[i].equals("")) && i != j) {
                    counterBoolean = false;
                    break;
                }
                counterBoolean = true;
            }

            if (counterBoolean == true) {
                r[i] = "";
            }
        }

        for (int i = 0; i < r.length; i++) {
            if (!(r[i].equals(""))) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
