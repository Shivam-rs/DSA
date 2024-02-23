package strvr.binarysearch.arrays2d;

//@Link - https://leetcode.com/problems/search-a-2d-matrix/
//@Link - https://takeuforward.org/data-structure/search-in-a-sorted-2d-matrix/

public class SearchSorted2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        boolean result = searchMatrix(matrix, 8);
        System.out.println(result ? "true" : "false");
    }

    //Since 2D array is sorted we can apply BS.
    //Imagine it as 1D array: Index range would be 0 to (n*m - 1)
    //At any point row = Index/m and col = Index%m
    //Rest is simple BS
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = m*n-1;
        while(low <= high){
            int mid = (low + high)/2;
            int row = mid/m, col = mid%m;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return false;
    }
}
