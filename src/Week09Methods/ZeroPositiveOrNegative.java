package Week09Methods;

import java.util.Scanner;

public class ZeroPositiveOrNegative {

    public static void sign(int n) {
        String result = "";
        result = (n > 0) ? "positive" : (n < 0) ? "negative" : "zero";
        System.out.println(result);


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
/*
 Scanner inp = new Scanner(System.in);
    int size = inp.nextInt();

    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++){
    arr[i]=inp.nextInt();
       isPos(arr[i]);
    }


 */
    }


}
