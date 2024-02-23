package strvr.binarysearch.arrays2d;

//@Link - https://www.codingninjas.com/studio/problems/median-of-a-row-wise-sorted-matrix_1115473?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/median-of-row-wise-sorted-matrix/

public class MedianOfMatrix {
    public static void main(String[] args) {
        int row = 3, col = 3;
        int[][] arr = {{1, 3, 8},
                {2, 3, 4},
                {1, 2, 5}};
        System.out.println("The median of the row-wise sorted matrix is: "+
                findMedian(arr, row, col));
    }

    public static int findMedian(int[][] matrix, int n, int m) {
        // Median would always be between min and max of the matrix
        //Row wise sorted hence -> min would be in 1st col and max would be last col
        int min = Integer.MAX_VALUE;
        int max = -1;
        for(int i = 0; i<n; i++){
            max = Math.max(max, matrix[i][m-1]);
            min = Math.min(min, matrix[i][0]);
        }

        //Median would always have at least half of the total elements smaller than or equal to it.
        //Low will start from not possible median
        //High would start from possible median
        //By the end of BS low would always point to median
        int low = min, high = max;
        while(low <= high){
            int mid = (low + high)/2;
            int count = elementLessThanMid(matrix, mid);
            if(count <= (n*m)/2) low = mid + 1 ;
            else high = mid -1 ;
        }

        return low;
    }

    //Simple upper bound code for each row
    public static int elementLessThanMid(int[][] arr, int target){
        int col = arr[0].length;
        int ans = 0;
        for (int[] ints : arr) {
            int l = 0, h = col - 1;

            while (l <= h) {
                int md = (l + h) / 2;

                if (ints[md] > target) h = md - 1;
                else l = md + 1;
            }

            ans += l;
        }

        return ans;
    }

}
