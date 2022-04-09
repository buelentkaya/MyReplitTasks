package Week06LOOP;

public class FrequencyOfAWordInAString {
    public static void main(String[] args) {
String str="abc hi how hi";
int hiCount=0;

        for (int i = 0; i < str.length() ; i++) {

            while(str.contains("hi")){
                str = str.replaceFirst("hi","");
                hiCount++;
            }


        }

        System.out.println(hiCount);
        }
    }
   /* Print out the number of times that the string "hi" appears anywhere in the given string.
    Only lowercase "hi" should be counted.

        Example:

        input: abc hi how hi
        ​
        output: 2
        input: abc hi how hi

        output: 2
        Example:

        input: hi code java please
        ​
        output: 1
*/