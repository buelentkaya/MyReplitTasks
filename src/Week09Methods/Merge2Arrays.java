package Week09Methods;

import java.sql.Array;
import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] merged = new int[a.length + b.length];


        for (int i = 0; i < a.length; i++) {
            merged[i]=a[i];
        }
        for (int i = a.length; i < merged.length; i++) {
            merged[i]=b[i-a.length];
            // merged start with the (a.length)on the other hand b start wit zero
        }

        System.out.println(Arrays.toString(merged));
        /*int x = 0;
        for (int each : a) {

            merged[x] = each;
            x++;
        }
        for (int each : b) {
            merged[x] = each;
            x++;
        }

        System.out.println(Arrays.toString(merged));

*/
    }

}
