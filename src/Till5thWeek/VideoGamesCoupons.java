package Till5thWeek;

import java.util.Scanner;
public class VideoGamesCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        String output = (version == 1.5) ? "Cupcake" : (version == 1.6) ? "Donut" : (version == 2.1) ? "Eclair"
                : (version == 2.2) ? "Froyo" : (version == 2.3) ? "Gingerbread" : (version == 3.1) ? "Honeycomb"
                : (version == 4.0) ? "Ice Cream Sandwich" : (version == 4.1) ? "Jelly Bean" : (version == 4.4) ? "KitKat"
                : (version == 5.0) ? "Lollipop" : (version == 8.0) ? "Oreo" : (version == 9.0) ? "Pie"
                : "Sorry, I don't know this version!";

        System.out.println(output);

    }

}