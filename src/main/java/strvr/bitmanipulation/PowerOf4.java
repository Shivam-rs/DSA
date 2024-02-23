package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/power-of-four/

public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(9));
    }

    public static boolean isPowerOfFour(int n) {

        if(n <= 0) return false;

        for(int i = 0; i<31; i += 2){
            if(n == (1<<i)) return true;
        }

        return false;
    }
}
