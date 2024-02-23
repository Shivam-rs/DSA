package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//@Link - https://leetcode.com/problems/pascals-triangle/
//@Link -  https://www.codingninjas.com/studio/problems/print-pascal-s-triangle_6917910?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//@Link - https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = pascalTriangle(n);

        System.out.print(Arrays.deepToString(a));
    }


    //LeetCode
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int row =1;
        while(row <= numRows){
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            int res =1;

            //Value of each element is (R-1)C(Col-1) - > If id write the formula it would come as row-col/col recursively
            for(int i =1; i<row; i++){
                res *= (row-i);
                res = res/i;

                temp.add(res);
            }

            ans.add(temp);
            row++;
        }

        return ans;
    }

    //CodingNinja
    public static int[][] pascalTriangle(int N) {

        int[][] ans = new int[N][N];
        int row =1;
        while(row <= N){

            //ans[row-1][0] = 1;
            int[] temp = new int[row];

            int res =1;
            temp[0] = 1;
            for(int i =1; i<row; i++){

                res *= (row-i);
                res = res/i;

                temp[i] = res;

            }
            ans[row-1] = temp;

            row++;
        }

        return ans;
    }
}
