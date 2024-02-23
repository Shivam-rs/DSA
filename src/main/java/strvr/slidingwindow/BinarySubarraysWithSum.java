package strvr.slidingwindow;
//@Link  - https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubarraysWithSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums,goal));
        nums = new int[]{0,0,0,0,0};
        goal = 0;

        System.out.println(numSubarraysWithSum(nums,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int start = 0, end = 0, count = 0, sum = 0, temp = 0;
        while (end<nums.length) {
            sum += nums[end];

            //Unless new element is 1, we can say that all the existing subarrays that sum to goal can be again added to total count
            if (nums[end] == 1) temp = 0;


            while(sum > goal) {
                sum -= nums[start];
                start++;
            }

            //This loop is to count sub arrays with trailing 0
            while (sum == goal && start <= end) {
                temp++;
                sum -= nums[start];
                start++;
            }
            end++;
            count += temp;
        }
        return count;
    }
}
