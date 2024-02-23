package strvr.arrays.hard;
//@Link - https://leetcode.com/problems/maximum-product-subarray/
//@Link - https://takeuforward.org/data-structure/maximum-product-subarray-in-an-array/
public class maxProductSubArray {

    public static void main(String[] args) {
        int[] arr = {-3, 0, -4};
        int answer = maxProdSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }

    //Prefix or suffix of each negative number would be the max.
    //What we are doing here is calculating all the prefix & suffixes and comparing it with the max.
    public static int maxProdSubArray(int[] arr) {
        int n = arr.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
}
