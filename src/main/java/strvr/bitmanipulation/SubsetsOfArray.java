package strvr.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

//@Link - https://leetcode.com/problems/subsets/

public class SubsetsOfArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(subsets(nums));
    }

    //An array will have 2^n subsets, now the logic is to iterate over all the number from 0 to 2^n -1
    //and for each number check which all bits are set, for every set bit include that index number into your subset.
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i<(1<<n); i++){
            int j = i;
            int indx = 0;
            List<Integer> temp = new ArrayList<>();
            while(j != 0){
                if((j&1) != 0){
                    temp.add(nums[indx]);
                }
                indx++;
                j = j>>1;
            }
            ans.add(temp);
        }
        return ans;
    }
}
