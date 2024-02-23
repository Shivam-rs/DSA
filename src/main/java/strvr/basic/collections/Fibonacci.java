package strvr.basic.collections;

import java.util.Scanner;

public class Fibonacci {
    //static int sum = 0;
    public static int fib(int n){
        int sum = 0;
        if(n==1 || n==2) {
            sum += 1;
        } else {
            //for(int i =n; i>=1;i--){
                sum = fib(n-1) + fib(n-2);
                //System.out.println(sum);
            //}
        }
        return sum;
        //System.out.println(b);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int b = fib(a);
        System.out.println(b);
        //int sum = 0;

    }
}
