package strvr.binarysearch.arrays1d;
//@Link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//@Link - https://takeuforward.org/data-structure/minimum-in-rotated-sorted-array/
public class MinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }

    public static int findMin(int[] nums) {

        int n = nums.length;
        int low = 0, high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low+high)/2;

            //This condition would improve efficiency because we can directly select min value
            //for give half of the array
            if(nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
            }

            if(nums[low] <= nums[mid]){//left half is sorted
                ans = Math.min(ans, nums[low]); //selecting min of ans and 1st element from the left half
                low = mid + 1; //moving pointer to right half
            }else{
                ans = Math.min(ans, nums[mid]);
                high = mid -1 ;
            }
        }
        return ans;
    }
}
