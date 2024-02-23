package strvr.slidingwindow;

//@Link - https://leetcode.com/problems/count-number-of-nice-subarrays/description/

public class NoOfNiceSubarrays {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,2,1,2,2,1,2,2,2};
        int k = 2;

        System.out.println(numberOfSubarrays(nums,k));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int countOdd = 0, ans = 0, tempans = 0;

        while(end<n){

            //Moment new odd number is added to the subarray
            // we need to reset possible # of subarray's till that point
            if(nums[end]%2 == 1) {
                tempans = 0;
                countOdd++;
            }

            //Once countOdd gets equal to K, start would always point to 1st odd number is present window
            //That is because of next while loop
            if(countOdd > k){
                if(nums[start]%2 == 1) countOdd--;
                start++;
            }

            //Now if we have a window that has K odd elements, we would like to count all possible subarray
            //i.e. remove even numbers from the start of the present window :)
            // Remember start <= end condition is because what if window size is 1 meaning every odd element itself is also a possible subarray
            while(countOdd == k && start <= end){
                tempans++;
                if(nums[start]%2 == 1) countOdd--;
                start++;
            }
            end++;
            ans += tempans;
        }

        return ans;
    }
}
