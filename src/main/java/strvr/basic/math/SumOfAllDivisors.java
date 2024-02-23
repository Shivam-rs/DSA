package strvr.basic.math;
//@Link - https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SOLUTION
//@Link - https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
public class SumOfAllDivisors {

    // This is in general method for identifying all possible divisor
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1; i<=Math.sqrt(n); i++ ){
            if(n%i==0){
                System.out.println(i);
                if(i!=Math.sqrt(n)){
                    System.out.println(n/i);
                }
            }
        }
    }


    //This function gives sum off all divisor of values from 1 to n in sqrt(n) time complexity. Little tough to understand though
    public static int sumOfAllDivisors(int n){
    /*
    Time Complexity: O(sqrt(n))

    Space Complexity: O(1)
    */

        int ans = 0;
        int l = 1;

        // Iterating over all values of 'l' such that 'n/l' is distinct.
        // There at most 2*sqrt(n) such values.
        while (l <= n)
        {
            int val = n / l;

            // 'r' = maximum value of 'i' such that 'n/i' is val.
            int r = n / val;

            ans += ((r * (r + 1)) / 2 - (l * (l - 1)) / 2) * val;

            // moving on to next range.
            l = r + 1;
        }

        return ans;
    }

    // This is quite intuitive but gives the time complexity is O(n).
    public static int sumOfAllDivisors2(int n){
        int ans = 0;

        // Iterating over all 'i'. Each 'i' contributes to final answer
        // exactly 'floor(n/i)' times.
        for (int i = 1; i <= n; i++)
        {
            ans += i * (n / i);
        }

        return ans;
    }

}



