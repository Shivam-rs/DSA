package strvr.arrays.easy.largestsubarray;

import java.util.HashMap;
//@Link - https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/
public class PositiveNegative {
    public static void main(String[] args) {
        int[] a = { -1, 1, 1,0,-1, 2,-1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    public static int getLongestSubarray(int []a, int k) {
        // Write your code here.
        int n = a.length;
        HashMap<Long, Integer> map = new HashMap<>();
        int maxLen = 0;
        long sum = 0;

        //Iterate over the array
        for(int i = 0; i<n; i++){
            sum +=a[i]; //Keep adding the elements - call it prefix sum

            //If sum is equal to K then subarray length would be i+1
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            //If we can find a subarray of total rem then we can find subarray of total k
            long rem = sum - k;

            //If rem is there is hashmap then subarray can  found,
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //sum would insert the sum into the map along with index i as value
            if(!(map.containsKey(sum))){
                map.put(sum, i);
            }

        }
        return maxLen;
    }
}
