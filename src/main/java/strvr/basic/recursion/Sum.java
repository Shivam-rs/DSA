package strvr.basic.recursion;

public class Sum {

    public static long sumFirstN(long n) {
        // Write your code here.
        //addition(n);
        // if(n==0) return 0;
        // return n+sumFirstN(n-1);
        return (n*(n+1)/2);
    }
    // static long sum = 0L;
    // static void addition(long a){
    //     if(a<1) return;
    //     addition(a-1);
    //     sum+=a;

    // }
}
