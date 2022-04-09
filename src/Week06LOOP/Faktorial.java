package Week06LOOP;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
        long faktoriyel=1;
        for(int i=1; n>=i;i++){
            faktoriyel *=i;
        }
        System.out.println(faktoriyel);

        scan.close();
/*
        int faktoriyel=1;
        if(n>0) {

            for (int i = 1; i <= n; i++) {
                faktoriyel = faktoriyel * n;
            }
        }
        System.out.println(faktoriyel);
        scan.close();*/

    }


}
