package strvr.basic.math;
//@Link - https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//@Link - https://takeuforward.org/data-structure/find-gcd-of-two-numbers/

//This is for git  test
public class GCD {

    public static void main(String[] args) {
        System.out.println(calcGCD(7473,3438));
        System.out.println(gcd(9182,5504));
        //864788491
    }
    public static int calcGCD(int n, int m){
        // Write your code here.
        while(n%m!=0){
            int remainder = n%m;
            n=m;
            m=remainder;
        }
        return m;
    }

    public static int gcd(int a, int b){
        if (b ==  0) return a;

        return gcd(b, a%b);
    }
}
