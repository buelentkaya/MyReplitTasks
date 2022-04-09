package WEEK08ARRAY;

public class SplitEmail {
    public static void main(String[] args) {
        String email="info@cybertekschool.com";

        if(!email.contains("@")){
            System.out.println("invalid email");
        }else{
            String[] partOfEmail=email.split("@");
            if(partOfEmail.length==2){

                System.out.println("Email id: "+partOfEmail[0]);
                System.out.println("Email domain: "+partOfEmail[1]);
            }else
                System.out.println("Invalid Email");
        }
    }
}
