package Week06LOOP;

public class xyz {
    public static void main(String[] args) {
        String str="xxxabyyyycd";
        String result;
        int count=0;

        for(int i = 0; i <= str.length()-3; i ++){

            result = str.substring(i,i+3);
            if( (result.charAt(0) == (result.charAt(1))) && (result.charAt(1) == result.charAt(2)) )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
