package Week09Methods;

public class ReverseNoSpec {
    public static void main(String[] args) {
        String str = "----qwe--r--tyf...gd.---";//"----dgf--y--tre...wq.---"

        String tmp1 = "";
        String tmp2 = "";

        for (int i = 0, j = str.length() - 1; i < j; ) {
            if (Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j))) {

                tmp1 = "" + str.charAt(i);
                tmp2 = "" + str.charAt(j);

                str = str.substring(0, i) + tmp2 + str.substring(i + 1, j) + tmp1 + str.substring(j + 1);

                i++;
                j--;
            } else {
                if (!(Character.isDigit(str.charAt(i)))) {
                    i++;
                }
                if (!(Character.isLetter(str.charAt(j)))) {
                    j--;
                }
            }
        }
        System.out.println(str);
    }
}
