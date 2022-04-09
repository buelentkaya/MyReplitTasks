package Week09Methods;

public class SimplePattern {
    public static void main(String[] args) {
        printHollowRect();

    }

    public static void printHollowRect() {

        String fiveStar = "*****";
        String twoStar = "*   *";

        System.out.println(fiveStar);

        for (int i = 0; i < fiveStar.length() - 2; i++) {
            System.out.println(twoStar);
        }

        System.out.println(fiveStar);
    }
}








