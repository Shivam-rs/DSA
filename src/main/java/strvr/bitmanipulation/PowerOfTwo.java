package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/power-of-two/

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
    }

    public static boolean isPowerOfTwo(int n) {

        return n>0 && (n&(n-1)) == 0;

    }
}
