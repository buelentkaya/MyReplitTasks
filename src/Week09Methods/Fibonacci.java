package Week09Methods;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }
    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int fibnum1=0;
        int fibnum2=1;
        int fibtemp;


        for(int i=0;i<=num;i++)
        {
            if(i!=0 && i!=1)
            {
                fibtemp=fibnum2;
                fibnum2=fibnum1+fibnum2;
                fibnum1=fibtemp;
            }
        }

        if(num==0 || num==1)
        {
            System.out.println(num);
        } else
        {
            System.out.println(fibnum2);
        }







    }
}
