package strvr.binarysearch.arrays2d;

//@Link - https://leetcode.com/problems/search-a-2d-matrix-ii/
//@Link - https://takeuforward.org/arrays/search-in-a-row-and-column-wise-sorted-matrix/
public class SearchSorted2DMatrixII {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(searchMatrix(matrix, 8));
    }

    //Since rows and cols are sorted -> left to right in row would inc val and top to bottom would inc val in col
    //We'll eliminate based on above fact
    //Start from top right corner -> if val is grater than target then current col won't have target
    //                            -> if val is smaller than target then curr row won't have target (val on right are already eliminated as part of col)
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m-1;

        while(row <n && col>=0){

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }

        return false;
    }
}
