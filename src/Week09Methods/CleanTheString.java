package Week09Methods;
import java.util.Scanner;
public class CleanTheString {
    public static String clean(String text , String badWord)
    {
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = text.indexOf(badWord,lastIndex);

            if(lastIndex != -1)
            {
                text=text.substring(0,lastIndex) + text.substring(lastIndex+badWord.length());
                lastIndex += badWord.length();
            }
        }
        text=text.replace("  "," ");

        return text;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
        in.close();

    }
}
