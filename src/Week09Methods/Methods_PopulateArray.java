package Week09Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_PopulateArray {

    public static int[] populate(int[] r) {

        for (int i = 0; i < r.length; i++) {
            r[i] = i + 1;
        }

        return r;
    }

    public static void main(String[] args) {
        int[] i = new int[new Scanner(System.in).nextInt()];
        i = populate(i);
        System.out.println(Arrays.toString(i));

    }
}
