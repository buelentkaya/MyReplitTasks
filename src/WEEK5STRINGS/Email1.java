package WEEK5STRINGS;

public class Email1 {
    public static void main(String[] args) {
       String email="tom_cruise@gmail.com";//mike_tyson@gmail.com



if(email.contains("_")){
    int underline=email.indexOf('_');
    int atSign=email.indexOf('@');

    String name=email.substring(0,underline);
    String surname=email.substring(underline+1,atSign);



    System.out.println(surname+"_"+name+email.substring(atSign));


}else{      System.out.println(email);}




    }
}
