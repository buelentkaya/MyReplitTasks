package Week06LOOP;

public class UtopianTree {
    public static void main(String[] args) {

        int growth=0;
        int treeSize=0;
        for(int i=1; i<=10; i++){

            if(i<=3){// first three years grows 1cm
                growth=1;
            }else{
                growth=2; //since year 4th grows 2 cm everyyear
            }
            treeSize+=growth;// this shows the the size of the tree each year.

            System.out.println("year "+i+" - growth "+ growth+" cm");
            System.out.println("tree size: "+treeSize+"cm");

        }



    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm
​
year 2 - growth 1 cm
tree size: 2cm
​
year 3  - growth 1 cm
tree size:3cm
​
year 4 - growth 2 cm
tree size: 5cm
​
year 5 - growth 2 cm
tree size: 7cm
​
year 6 - growth 2 cm
tree size: 9cm
​
... until you reach year 10
 */