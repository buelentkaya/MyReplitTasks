package Week09Methods;

import java.util.Arrays;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 1, 2}};
        int n = 5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               matrix[i][j]= n * matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
//[[5, 5, 5], [5, 5, 10]]
    }
}
