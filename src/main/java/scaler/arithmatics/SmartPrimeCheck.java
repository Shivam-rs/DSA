package scaler.arithmatics;
//@Link: https://leetcode.com/problems/prime-in-diagonal/

public class SmartPrimeCheck {

    public static void main(String[] args) {
        System.out.println(isPrime(2347));
    }
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        int i = 5;
        //If not divisible until sqrt then not possible
        while (i * i <= n) {
            //Every number can be presented as multiple of prime number
            //Here we are checking for all prime numbers up till sqrt of n
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

            //This is very interesting part
            //If you increment 5 with 6 you land on prime number and +2 would be next prime number
            i += 6;
        }

        return true;
    }
}
