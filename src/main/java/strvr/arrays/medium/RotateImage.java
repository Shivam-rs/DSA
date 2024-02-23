package strvr.arrays.medium;

//@link: https://leetcode.com/problems/rotate-image/
//@link: https://takeuforward.org/data-structure/rotate-image-by-90-degree/

public class RotateImage {

    public static void main(String[] args) {
        int[][] arr =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] a) {
        int n = a.length;

        //Step 1: Lets transpose the matrix
        for(int i = 1; i<n; i++){
            for(int j =0; j<i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //Step 2: Reverse each row

        int row = 0;
        while(row < n){
            int start = 0, end = n-1;
            while(start<end){
                int temp = a[row][start];
                a[row][start] = a[row][end];
                a[row][end] = temp;


                start++;
                end--;
            }
            row++;
        }
    }
}
