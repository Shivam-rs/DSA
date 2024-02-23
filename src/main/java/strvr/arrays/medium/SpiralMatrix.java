package strvr.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(spiralOrder(mat));



    }

    public static List<Integer> spiralOrder(int[][] a) {
        // Write your code here.
        int n = a.length;
        int m = a[0].length;

        List<Integer> ans = new ArrayList<Integer>();

        //4 pointers pointing at 4 corners of 2D array
        int top = 0, left = 0;
        int bottom = n-1, right = m-1;

        //left to right -> top to bottom -> right to left -> bottom to top

        while(top<= bottom && left <= right){

            for(int i =left; i<=right; i++){
                ans.add(a[top][i]);
            }
            top++;

            for(int i =top; i<=bottom; i++){
                ans.add(a[i][right]);
            }
            right--;

            if(top <=bottom){
                for(int i =right; i>=left; i--){
                    ans.add(a[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i =bottom; i>=top; i--){
                    ans.add(a[i][left]);
                }
                left++;
            }

        }

        return ans;

    }
}
