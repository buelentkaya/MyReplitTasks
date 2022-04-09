package Week09Methods;

public class Merge2String {
    public static void main(String[] args) {
        String one = "wooden";
        String two = "spoon";

        System.out.println(mergeStrings(one,two));//wsopoodoenn


    }
        public static String mergeStrings(String one, String two) {


        String result="";
        int theLength=0;
        theLength=(one.length()>two.length())?two.length():one.length();

        for (int i = 0; i < theLength; i++) {
            result+=one.substring(i,i+1)+two.substring(i,i+1);
        }
        result=(one.length()>two.length())?result.concat(one.substring(theLength,one.length())):result.concat(two.substring(theLength,two.length()));

        return result;


        }

    }

