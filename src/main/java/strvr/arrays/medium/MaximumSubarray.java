package strvr.arrays.medium;
//@link: https://leetcode.com/problems/maximum-subarray/
//@Link: https://www.codingninjas.com/studio/problems/maximum-subarray-sum_630526?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link: https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
public class MaximumSubarray {


    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(arr));
    }

    //Leetcode: Does not take negative empty sub-array as output
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i : nums){

            sum += i;

            //At this step we'll get negative value of sum as well hence we won't need empty array as output
            max = Math.max(sum, max);

            //This step would make sum equal to 0 because adding any value to negative value will make it smaller
            if(sum < 0){
                sum = 0;
            }

        }

        return max;
    }

    //CodingNinja: Over here are okay with empty array as well so we are 1st making sum =0 and then inserting in max
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here

        long sum = 0;
        long max = Long.MIN_VALUE;

        for(int i : arr){

            sum += i;

            if(sum < 0){
                sum = 0;
            }

            max = Math.max(sum, max);

        }

        return max;
    }
}
