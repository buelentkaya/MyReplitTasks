package WEEK08ARRAY;
import java.util.*;
public class FindingMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max=0;
        for(int eachNumber:nums){
            if(eachNumber>max)
                max=eachNumber;

        }
        System.out.println(max);
input.close();

    }
}
