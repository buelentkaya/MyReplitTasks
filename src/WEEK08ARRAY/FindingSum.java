package WEEK08ARRAY;

import java.util.*;

public class FindingSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int sum = 0;
        for (int eachNumber : nums) {
            sum += eachNumber;
        }
        System.out.println(sum);
    }
}
