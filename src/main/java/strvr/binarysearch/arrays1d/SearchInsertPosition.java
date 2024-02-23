package strvr.binarysearch.arrays1d;
//@Link -  https://leetcode.com/problems/search-insert-position/description/
//@Link -  https://takeuforward.org/arrays/search-insert-position/

//This problem is like finding lower bound of the target which needs to be inserted.
//If element is present then we get the smallest index at which it is present.
//if not present then we'll get the index at which 1st element which is greater than target is present
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 0;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){

            int mid =  (low + high)/2;

            if(nums[mid] >= target){
                high = mid -1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
