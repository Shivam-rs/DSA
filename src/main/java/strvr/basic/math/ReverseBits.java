package strvr.basic.math;

//@link - https://www.codingninjas.com/studio/problems/reverse-bits_2181102?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://takeuforward.org/c-programs/reverse-a-number-in-c/
public class ReverseBits {
    public static long reverseBits(long n) {
        // Converting Long to Binary
        String a = Long.toBinaryString(n);

        //Padding length to 32 bits
        a = String.format("%32s", a).replace(' ','0');
        //System.out.println("a:" + a);
        //Storing it in StringBuilder for ease of performing reverse. Costly operation!!!
        StringBuilder b = new StringBuilder();
        b.append(a);
        b.reverse();
        //System.out.println("b:" + b);
        //Converting to string and then to Long
        return Long.parseLong(b.toString(), 2);
    }
    public static void main(String[] args) {

        long z = reverseBits(2);
        System.out.println("z:" + z);
    }
}
