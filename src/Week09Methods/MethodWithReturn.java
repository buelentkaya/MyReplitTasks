package Week09Methods;


public class MethodWithReturn {
    public static int countAppearance(String[] arr,String t) {
int countOft=0;
        for (String each : arr) {
            if(each==t){
                countOft++;
            }
        }
return countOft;


    }
        public static void main(String[] args) {

            String [] strs = {"a","foo","bar","foo","bla"};
            String word = "foo";
           
            

            System.out.println(countAppearance(strs,word));





    }
}
