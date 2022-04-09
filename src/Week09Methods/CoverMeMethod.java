package Week09Methods;

public class CoverMeMethod {
    public static void main(String[] args) {
       String main="Certified Wooden Spoon";//Certified W[o][o]den Sp[o][o]n
       String coverMe="o";

       int lastIndex=0;
       if(main.indexOf(coverMe,lastIndex)==-1){
           main="[" + main + "]";
          // return main;
       }

       while(lastIndex!=-1){
           lastIndex=main.indexOf(coverMe,lastIndex);
           if(lastIndex!=-1){
               main=main.substring(0,lastIndex) + "[" + coverMe + "]" + main.substring(lastIndex+coverMe.length());
               lastIndex += coverMe.length()+2; // 2 for brackets
           }
       }
        System.out.println("main = " + main);
    }
}
