package WEEK08ARRAY;

import java.util.Arrays;

public class ArraysReversnumber {
    public static void main(String[] args) {
     int[] arr={4,3,2,44,1,100,55};

        for (int i = 0; i < (arr.length / 2); i++) {
            int temp=arr[i];// temp=4
            arr[i]=arr[6-i];//arr== 55
            arr[6-i]=temp;//temp =55

        }
        System.out.println(Arrays.toString(arr));
    }//[55, 100, 1, 44, 2, 3, 4]
}
