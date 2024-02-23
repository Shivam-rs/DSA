package strvr.arrays.easy;

import java.util.Arrays;
//@Link - https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {9, 4, 0, 6, 0, 0, 5};

        moveZeros(7, arr);

        System.out.printf(Arrays.toString(arr));
    }
    public static void moveZeros(int n, int []a) {
        // Write your code here.

        int i = 0;
        for(int j = 0; j<n; j++){
            if(a[j] != 0){
                int temp = a[j];
                a[j] =a[i];
                a[i] = temp;
                //a[j] =0;
                i++;
            }
        }

    }
}
