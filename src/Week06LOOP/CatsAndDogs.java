package Week06LOOP;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();

        for (int i = 0; i <= word.length()-3; i++) {

            if (word.substring(i, i+3).equalsIgnoreCase("cat")) {

                countOfCats++;
            }
            if (word.substring(i, i+3).equalsIgnoreCase("dog")) {

                countOfDogs++;

            }



        }
        scan.close();
        System.out.println(countOfCats == countOfDogs);
    }
}
