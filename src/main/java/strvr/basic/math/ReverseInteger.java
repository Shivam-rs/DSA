package strvr.basic.math;
//@Link - https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public int reverse(int x) {
        int a = Math.abs(x);
        long rev = 0L;
        int r = 0;
        while(a!=0){
            int digit = a%10;
            rev = (rev *10) + digit;
            if(rev> Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
            r = (int)rev;
            a /=10;
        }

        if(x<0){
            return -1*r;
        }else {
            return r;
        }

    }
}
