package strvr.slidingwindow.hard;

import java.util.HashMap;

//@Link - https://leetcode.com/problems/subarrays-with-k-different-integers/description/

public class SubarraysOfKDiffElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2,3};
        int k = 2;

        System.out.println(subarraysWithKDistinct(arr,k));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        //Logic: At most k will give all the subarrays with <= k distinct integers, so if we take out all subarrays with at most K-1 distinct integers
        //then ill be left with subarrays with exactly K distinct integers.
        return (atMostKDistinct(nums, k) - atMostKDistinct(nums, k-1));
    }

    public static int atMostKDistinct(int[] nums, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i = 0, j=0;
        int count = 0;

        while(j<nums.length){
            //Keep growing window and put the new element into the hashmap
            mp.put(nums[j], mp.getOrDefault(nums[j],0) +1);

            //If count of distinct elements go over K then shrink the window until one distinct element is completely removed
            while(mp.size() > k){
                mp.put(nums[i], mp.get(nums[i]) -1);
                if(mp.get(nums[i]) == 0) mp.remove(nums[i]);

                i++;
            }
            //Given an end point j, number of subarray ending at j would be j -start +1
            count += j-i +1;
            j++;
        }

        return count;
    }
}
