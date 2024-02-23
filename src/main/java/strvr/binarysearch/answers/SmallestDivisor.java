package strvr.binarysearch.answers;
//@Link - https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
//@Link - https://takeuforward.org/arrays/find-the-smallest-divisor-given-a-threshold/
public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }

    public static int smallestDivisor(int[] nums, int threshold) {

        //Divisor's greater than or equal to max of the array would return 1 for all the elements (i.e. sum would length of array).
        //Hence, range would be from 1 to max
        int max = -1;
        for(int num : nums){
            max = Math.max(max, num);
        }

        if(threshold == nums.length) return max;

        int low =1, high = max;

        while(low <= high){
            int mid = (low + high)/2;

            if(possible(nums, mid, threshold)){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean possible(int[] arr, int div, int target){
        int sum = 0;
        for(int val : arr){
            sum += (int)Math.ceil((double)val/div);
        }
        return (sum <= target);
    }
}
