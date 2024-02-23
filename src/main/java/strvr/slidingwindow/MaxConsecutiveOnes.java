package strvr.slidingwindow;

//@Link - https://leetcode.com/problems/max-consecutive-ones-iii/description/

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }
    //We have to count no of zeros basically in a window
    //User 2 pointers, keep on increasing end pointer and count number of 0
    //Moment limit is reached start shrinking the window size by move start pointer ahead
    //Finally measure the window size store the max len
    public static int longestOnes(int[] nums, int k) {
        int start = 0, end = 0;
        int n = nums.length;
        int maxLen = 0;
        int countOfZero = 0;

        while(end < n){
            if(nums[end] == 0){
                countOfZero++;
            }

            if(countOfZero > k){
                while(countOfZero > k){
                    if(nums[start] == 0){
                        countOfZero--;
                    }
                    start++;
                }
            }

            maxLen = Math.max(maxLen, end -start +1);
            end++;
        }

        return maxLen;
    }
}
