package strvr.binarysearch.arrays2d;

import java.util.Arrays;

//@Link - https://leetcode.com/problems/find-a-peak-element-ii/description/
//@Link - https://www.youtube.com/watch?v=nGGp5XBzC4g

public class PeakElement {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{10,20,15},{21,19,14},{7,16,32}};
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }

    //Find mid-column and then max value in that column -> This will ensure that value is greater than top and bottom
    //now check left and right exists or not and update value into left & right variable
    //Selected element is greater than left and right then it is peak
    //Or else move in the direction of greater side (Intuition is if right/left greater than selected element then right/left would be greater than whole selected row)
    //Finding max in new col would make sure top, bottom and either right/left is smaller.

    public static int[] findPeakGrid(int[][] mat) {
        int m = mat[0].length;

        int low = 0, high = m-1;

        while(low <= high){
            int mid = (low+high)/2;

            int row = rowOfMaxInCol(mat, mid);

            int left = mid -1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid +1 <= m-1 ? mat[row][mid+1] : -1;

            if(mat[row][mid] > left && mat[row][mid] > right) return new int[]{row, mid};
            else if(mat[row][mid] < left) high = mid -1;
            else low = mid + 1;
        }

        return new int[]{-1,-1};
    }

    public static int rowOfMaxInCol(int[][] arr, int mid){
        int max = -2;
        int row  = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i][mid] > max){
                max = arr[i][mid];
                row = i;
            }
        }
        return row;
    }
}
