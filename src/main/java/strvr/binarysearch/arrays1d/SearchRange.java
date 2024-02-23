package strvr.binarysearch.arrays1d;

import static strvr.binarysearch.arrays1d.UpperAndLowerBound.lowerBound;
import static strvr.binarysearch.arrays1d.UpperAndLowerBound.upperBound;
//@Link -  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//@Link -  https://takeuforward.org/arrays/first-and-last-occurrences-in-array/
public class SearchRange {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, k = 8;
        int[] ans = searchRange(arr, k);
        System.out.println("The first and last positions are: "
                + ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int n =  nums.length;
        int first = lowerBound(nums, n, target);
        if(first == n || nums[first] != target) return new int[]{-1, -1};

        int last = upperBound(nums, target, n);

        return new int[]{first, last -1};

    }

    /*public static int lowerBound(int []arr, int x) {
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){

            int mid =  (low + high)/2;

            if(arr[mid] >= x){
                high = mid -1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int []arr, int x){
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){

            int mid =  (low + high)/2;

            if(arr[mid] > x){
                high = mid -1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }*/
}
