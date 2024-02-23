package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Link - https://leetcode.com/problems/4sum/
//@Lik -  https://takeuforward.org/data-structure/4-sum-find-quads-that-add-up-to-a-target-value/

public class Sum4Elements {
    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
    }
//Similar to 3 sum problem
    public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.

        int n = nums.length;

        List<List < Integer >> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<n; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i+1; j<n; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum > target) l--;
                    else if(sum < target){
                        k++;
                    }else{
                        List< Integer > temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        while(k < l && nums[k-1] == nums[k]){
                            k++;
                        }

                        while(l > k && nums[l] ==  nums[l+1]){
                            l--;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
