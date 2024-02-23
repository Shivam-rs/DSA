package strvr.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

//@Link: https://leetcode.com/problems/set-matrix-zeroes/description/
//@Link: https://www.codingninjas.com/studio/problems/zero-matrix_1171153?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link: https://takeuforward.org/data-structure/set-matrix-zero/

public class SetMatrixZeroes {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // In this code set means 0 -> LOL, because 1 is already there.

        int col0 = 1;

        //Step 1:
        //Iterate over the matrix and mark the 1st row, col and col0 accordingly
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix.get(i).get(j) == 0){
                    matrix.get(i).set(0,0);

                    if(j!=0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        //Step 2:
        //Set elements that has 1st row, col & col0 as set but keep in mind that you don't have to start from 1st row/col
        // i.e. start from (1,1) -> (n-1, m-1)
        for(int i =1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(matrix.get(i).get(j) != 0){

                    if(
                            (matrix.get(i).get(0) == 0) ||
                                    (matrix.get(0).get(j) == 0)
                    )

                        matrix.get(i).set(j,0);
                }
            }
        }


        //Step 3:
        // Now we'll mark the 1st col and then the 1st row
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }


        return matrix;

    }
}
