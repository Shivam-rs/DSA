package strvr.dynamicprograming;

import java.util.Arrays;
//Question : https://leetcode.com/problems/unique-paths/
//Refer : https://takeuforward.org/data-structure/grid-unique-paths-count-paths-from-left-top-to-the-right-bottom-of-a-matrix/

public class UniquePaths {
    public static void main(String[] args) {
      System.out.println(uniquePaths(3,7));
    }
    /*
      This question can be solved using Recursion, but it will give TLE due to TC being exponential
      We can improve solution by memorizing ans for a state
      Create an 2D array and fill it with -1, then update the state if it is still -1
      If DP array is not -1 that means we have performed further recursion already, and we'll get same ans in future as well.
      Simply return state value.
    */
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(0,0,m,n, dp);
    }

    private static int helper(int i, int j, int m, int n, int[][] dp){
         if(i >= m || j >= n) return 0;
         if(i == m-1 && j == n-1) return 1;

         if(dp[i][j] != -1){
           return dp[i][j];
         }else{
             int l = helper(i+1,j,m,n,dp);
             int r = helper(i,j+1,m,n,dp);
             dp[i][j] = l+r;
         }

         return dp[i][j];
    }
}
