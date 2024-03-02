package strvr.arrays.medium;
//@Link - https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,0,2};
        System.out.println(findDuplicate(nums));
        nums = new int[]{2,2,2,2,2};
        System.out.println(findDuplicate(nums));
    }
    //NOTE: Range of input elements is very important for this algo

    //If there is a loop then this also works in finding such loop
    //Take 2 pointers, move 1 slow and other one at 2x speed
    //In our case we are incrementing by num[i] & num[nums[i]]
    //Once we have detected the cycle now out job is to find the entry point in the cycle
    //To do that we'll reset one of the pointer and move both the pointers with same pace

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}
