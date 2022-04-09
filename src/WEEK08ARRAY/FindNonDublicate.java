package WEEK08ARRAY;
import java.util.*;
public class FindNonDublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        //



        for (int i = 0; i <= nums.length - 1; i++) {
            int count = 0;
            for (int eachNumber : nums) {
                if (eachNumber == nums[i]){
                    count++;}
            }

            if (count == 1){
                System.out.println(nums[i]);
            }

        }




        input.close();
    }
}
