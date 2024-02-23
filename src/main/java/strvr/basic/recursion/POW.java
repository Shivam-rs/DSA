package strvr.basic.recursion;
//Scaler recursion question

public class POW {

    public static void main(String[] args) {
        System.out.println( pow( 71045970, 41535484, 64735492));
        //20805472
        System.out.println(pow(9,2,7));
    }

    //Key learning here is that how we perform modulo operation
    public static long pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if(A == 0) return 0;
        if(B == 0) return 1;
        long temp = power(A,B,C);
        if(A<0 && (B%2 == 1)) return C-(int)temp;

        return temp%C;
    }

    public static long power(long A, long B, long C){
        A = Math.abs(A);
        if(B == 0) return 1;

        long temp = power(A, B/2, C);

        if(B%2 == 1){
            return  /*A*temp*temp;*/((A%C)* (((temp%C)*(temp%C))%C)%C )%C;
        }else{
            return /*temp*temp;*/((temp%C)*(temp%C))%C;
        }
    }
}
