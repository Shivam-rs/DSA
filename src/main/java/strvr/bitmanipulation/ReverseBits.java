package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/reverse-bits/description/

public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        System.out.println(reverseBits(n));
    }
    // Logic is to rotate the binary string
    // What we will do here is take LSB of n and store it in our ans
    // Then we will left shift our ans by 1
    // Now right shift n by 1, we have 1st bit at LSB now
    // We need to loop 32 times so that every bit becomes LSB once and get stored in ans
    public static int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i<32; i++){
            // Shifting LSB towards MSB
            ans = ans << 1;

            // Storing LSB to ans
            ans =  ans | (n & 1);

            //Moving LSB towards MSB (that is rotating)
            n = n >> 1;
        }

        return ans;
    }
}
