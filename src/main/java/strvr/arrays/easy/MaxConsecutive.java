package strvr.arrays.easy;
//@link - https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0, max =0;
        int n = nums.length;

        for(int i =0; i<n; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }else{

                count =0;
            }
        }
        return max;
    }
}
