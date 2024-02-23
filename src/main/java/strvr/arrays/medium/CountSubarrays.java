package strvr.arrays.medium;

import java.util.HashMap;
//@Link: https://takeuforward.org/arrays/count-subarray-sum-equals-k/
//@Link: https://leetcode.com/problems/subarray-sum-equals-k/
public class CountSubarrays {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = subarraySum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;


        //Logic same as arrays.easy.subarray
        //If at any point prefix sum is X and there is a subarray with sum k then remaining part would be prefix sum -k
        for(int val : nums){
            sum += val;

            int bal = sum - k;

            if(sum == k) count++;

            if(map.containsKey(bal)){
                count +=map.get(bal);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum) + 1);
            }else{
                map.put(sum,1);
            }
        }

        return count;
    }
}
