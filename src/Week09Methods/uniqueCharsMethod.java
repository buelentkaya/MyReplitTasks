package Week09Methods;

public class uniqueCharsMethod {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String str) {
        int frequency = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!result.contains("" + ch)) {
                result += ch;
            }

        }

        return result;
    }
}




