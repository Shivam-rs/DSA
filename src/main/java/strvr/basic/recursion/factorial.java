package strvr.basic.recursion;

import java.util.ArrayList;
import java.util.List;

public class factorial {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> output = new ArrayList<Long>();
        long fact = 0;
        for(int i = 1; i<=n; i++ ){
            fact = factorial(i);

            if(fact <= n){
                output.add(fact);
            }else{
                break;
            }
        }
        return output;
    }

    public static long factorial(long a){
        long factMethod =1;
        if(a>=1){
            factMethod = a*factorial(a-1);
        }
        return factMethod;


    }
}
