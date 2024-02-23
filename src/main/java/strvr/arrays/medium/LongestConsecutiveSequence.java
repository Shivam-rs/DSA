package strvr.arrays.medium;

import java.util.HashSet;

//@link: https://leetcode.com/problems/longest-consecutive-sequence/
//@link: https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        System.out.println( longestConsecutive(a));
    }

    public static int longestConsecutive(int[] nums) {

        int n = nums.length;
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();

        if(n ==0) return 0;

        for(int num : nums){
            set.add(num);
        }

        for(int val : set){
            int count = 0;

            //We only work if element is smallest of the sequence
            if(!(set.contains(val-1))){
                count =1;
                int x = val;

                //Once the smallest element of the sequence is identified keep incrementing the count till smallest +1 is available in the set
                while(set.contains(x+1)){
                    count++;
                    x+=1;
                }
            }

            longest = Math.max(longest,count);
        }

        return longest;
    }
}
