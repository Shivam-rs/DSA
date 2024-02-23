package strvr.arrays.easy.largestsubarray;
//HashMap implementation in positive & Negative elements can also be use but this one is better solution in terms of time.
//If im not wrong then this algo is like a sliding window  - a window whose panel size can be increased -- LOL

//@Link - https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//@Link - https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
public class OnlyPositive {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 11;
        int len = longestSubarrayWithSumK(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int left =0, right = 0;
        long sum = a[0];
        int n = a.length;
        int maxLen = 0;


        while(right<n){

            //reduce the sum value by removing element from left
            while(left<=right && sum>k){
                sum -= a[left];
                left++;
            }

            //+1 is because both left and right are inclusive
            if(sum == k){
                maxLen = Math.max(maxLen, right -left +1);
            }

            right++;
            if(right<n) sum += a[right];

        }

        return maxLen;
    }
}
