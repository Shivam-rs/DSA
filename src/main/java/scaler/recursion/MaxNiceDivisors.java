package scaler.recursion;
//https://leetcode.com/problems/maximize-number-of-nice-divisors/description/

public class MaxNiceDivisors {
    static int m = (int)Math.pow(10,9)+7;
    public static void main(String[] args) {
        System.out.println(maxNiceDivisors(88));
    }

    //Logic is that nice divisor would have at least 1 prime factor from all possible distinct prime factor
    //that mean given primeFactors needs to divided such product of size of parts should be max
    //Some greek algo says it should be multiple of 3
    //Edge cases are if reminder is 2 then one grp can be formed of size 2
    // If remainder is 1 then form 2 groups of 2
    public static int maxNiceDivisors(int primeFactors) {
        if(primeFactors <= 3) return primeFactors;

        if(primeFactors%3==0){

            return (int) power(3,primeFactors/3);

        }else if(primeFactors%3==1){

            return (int) ((power(3,(primeFactors-4)/3) *4)%m); // to abandon 1 we have to choose two 2s = 2*2 = 4

        }else {

            return (int) ((power(3,primeFactors/3)*2)%m); // if n%3=2

        }

    }

    public static long power(int a, int b){
        if(b ==0) return 1;

        long temp = power(a, b/2);

        if(b%2 == 1){
            return (a * temp%m * temp%m)%m;
        }else{
            return (temp%m * temp%m)%m;
        }
    }
}
