package strvr.arrays.medium;

//@link - https://leetcode.com/problems/majority-element/
//@link - https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/

public class MajorityElementNbyTwo {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    public static int majorityElement(int []nums) {
        // Write your code here
        int count = 0;
        int majority = nums[0];
        //Logic behind this algorithm is that if an element is present for more than N/2 time than all other elements combined would be less than N/2.
        // So if we keep assuming majority everytime count is 0 we would end up with element which has occurrence more than N/2
        for(int i : nums){
            if(count == 0){
                majority = i;
                count++;
            }else if( i == majority){
                count++;
            }else{
                count--;
            }
        }

        return majority;
    }
}
