package Till5thWeek;

public class EmailTask2 {
    public static void main(String[] args) {
        String email="craig_federighi@apple.com";

        String firstName=email.substring(0,email.indexOf("_"));
        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1);
        System.out.println("First name: "+firstName);

        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);
        System.out.println("Last name: "+lastName);

        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        domain=(""+domain.charAt(0)).toUpperCase()+domain.substring(1);
        System.out.println("Domain: "+domain);





    }
}
/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */