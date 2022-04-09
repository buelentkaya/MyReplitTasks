package Week09Methods;

public class UniqueElement {
    public static void main(String[] args) {
        int[] nums={2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int i = 0; i < nums.length; i++) {
            int element=nums[i];
            int count = 0;

            for (int each :nums) {
                if(each==element){
                    count++;
                }
            }
           if(count==1){
               System.out.println(element);
           }
        }


    }
}
