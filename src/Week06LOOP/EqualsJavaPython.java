package Week06LOOP;
import java.util.Scanner;
public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJ=0;
        int countP=0;

        for (int i = 0; i <sentence.length() ; i++) {
            boolean jaword=sentence.toLowerCase().contains("java");
            countJ++;

            boolean pytword=sentence.toLowerCase().contains("python");
            countP++;

        }
        System.out.println(countJ==countP);



        scan.close();

    }
}
