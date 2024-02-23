package strvr.arrays.easy;

import java.util.Arrays;
//@Link - https://leetcode.com/problems/rotate-array/
//@link - https://takeuforward.org/data-structure/rotate-array-by-k-elements/
public class Rotate {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        rotateRight(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k= k % n;

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n-1);
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k= k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n-1);
    }

    public static void reverse(int[] arr, int start, int end){

        while(start <=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end --;
        }
    }
}
