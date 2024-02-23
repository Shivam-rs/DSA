package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/

public class ToHex {
    public static void main(String[] args) {
        int num = -1;
        System.out.println(toHex(num));
    }
    /*
    If number is negative, it is stored is 2's compliment form in binary. Since input range is int, if we get negative input we'll add 2 power 32 to it negate role sign bit
    Now we'll simply keep on adding remainder of num/16 to our ans and then update num with num/16.
    At last, we need to reverse the stringBuilder.
    */
    public static String toHex(int num) {
        StringBuilder ans = new StringBuilder();
        char[] hexDigits = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) return "0";
        long temp = num;
        if(num<0){
            temp = (1L<<32)+num;
        }
        while(temp != 0){
            int rem = (int)(temp%(1<<4));
            ans.append(hexDigits[rem]);
            temp = temp >> 4;
        }

        return (ans.reverse()).toString();
    }
}
