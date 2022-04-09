package Week09Methods;

public class CountWordsInAString {
    public static void main(String[] args) {
        String str="one two three";
        int wordCount=0;

        int lengthOfTheString=str.length();
        str=str.replace(" ","");
        int secondTimeLength=str.length();
        wordCount=lengthOfTheString-secondTimeLength;

        System.out.println(wordCount);



    }



}
