package Week06LOOP;

public class PrintLettersCombination {
    public static void main(String[] args) {

        for(char i='z';i >= 'v';i--){
            for(char j='z'; j >= 'v'; j--) {
                System.out.println("" + i + j);




/*char star='y';
char end='z';
        for (char i = end; i >=star ; i--) {//  if this is so i++  abcdefghijklmnopqrstuvwx
                                         //if this is so i--  xwvutsrqponmlkjihgfedcba
                System.out.print(i);
        }

        }



*/


            }}}
}
/*
Write a loop that displays all possible combinations of two letters 
where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. 
The combinations should be displayed in descending alphabetical order:

zz

zy

zx

zw

zv

yz

....

vv
 */