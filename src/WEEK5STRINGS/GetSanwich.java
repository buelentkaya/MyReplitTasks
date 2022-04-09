package WEEK5STRINGS;
import java.util.Scanner;
public class GetSanwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();                     //  xxbreadjambreadyy
        String output="nothing";
        if(str.contains("bread")){                    //checking if there is a first bread
            int bread1 = str.indexOf("bread");           //  index of first bread
            String str1=str.substring((5+bread1));       // 2+5 bread  str1=  jambreadyy    we cut first bread and continue with remainder
            if(str1.contains("bread")){                  //  checking if there is another bread
                int bread2 = str1.lastIndexOf("bread");    //   index of last bread
                output= str1.substring(0,(bread2));        //   we cut the last bread and remainder is equals to output
            }
        }
        System.out.println(output);                    // if we got 2 breads then remainder is written otherwise it is nothing
        scan.close();







        /*String str="jambreadvdsdd";

        System.out.println(str.substring(str.indexOf("bread")+5,(str.lastIndexOf("bread"))));

        String result= "nothing";

        if (str.indexOf("bread")!=str.lastIndexOf("bread"))

        {  result=str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")); }

        System.out.println(result);*/



    }
}
