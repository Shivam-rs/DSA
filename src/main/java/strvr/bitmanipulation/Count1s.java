package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/number-of-1-bits/solutions/4699803/java-beats-100-0ms-run-time-best-solution/
//Key learning is >>> is used when signed bit is not to be preserved
public class Count1s {
    public static void main(String[] args) {
        int n = -3;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;

        /* This code is for 1st approach
        while (n != 0) {
            count ++;
            n = n&(n-1);
        }
        */

        //This is for approach 2
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;

    }
}
