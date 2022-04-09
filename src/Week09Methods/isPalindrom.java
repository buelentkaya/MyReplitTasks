package Week09Methods;

import java.util.Locale;

public class isPalindrom {
    public static void main(String[] args) {
        String check = "Noon";
        String reverse ="";
        check = check.replace(" ", "");
        check = check.toLowerCase();
        for (int i = check.length()-1; i >= 0; i--) {
            reverse += check.charAt(i);
        }
        boolean isPalindrom = reverse.equals(check);

        System.out.println("isPalindrom = " + isPalindrom);
    }


}
