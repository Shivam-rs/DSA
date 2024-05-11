package scaler.twopointer;

import java.util.Arrays;

public class ClosestPair {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,4,6,8};
        System.out.println(Arrays.toString(solve(a,b,9)));
    }

    public static int[] solve(int[] A, int[] B, int C) {
        int min = Integer.MAX_VALUE;
        int[] ans = new int[2];
        for(int i = 0; i< A.length; i++){
            int target = C - A[i];
            int[] pos = upperBound(B, target);
            System.out.println(Arrays.toString(pos));
            int b = Math.abs(target - pos[0]) > Math.abs(target - pos[1]) ? pos[1] : pos[0];
            System.out.println(b);
            if(Math.abs(A[i] + b - C) < min){
                min = Math.abs(A[i] + b - C);
                ans[0] = A[i];
                ans[1] = b;
            }
            System.out.println(min);
        }

        return ans;
    }

    public static int[] upperBound(int[] arr, int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        if(right<0) right = 0;
        if(left == n) left = n-1;

        return new int[]{arr[right], arr[left]};
    }
}
