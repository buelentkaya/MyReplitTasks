package Week06LOOP;

public class Vowelsprinting {
    public static void main(String[] args) {
      String str="howd0yhoeiqe";

        String vowels="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'){

                vowels+=ch;
            }
        }
        System.out.println(vowels);


    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho
​
Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue
​
Output: ueueueue
 */