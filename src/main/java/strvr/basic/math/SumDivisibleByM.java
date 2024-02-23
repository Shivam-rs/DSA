package strvr.basic.math;

import java.util.HashMap;

public class SumDivisibleByM {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 17, 100, 11};
        int B = 28;

        System.out.println(countSumDivisibleByM(arr, B));
    }

    public static int countSumDivisibleByM(int[] A, int B){
        long m = (long)Math.pow(10,9) + 7;
        int n = A.length;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i =0; i<n; i++){
            A[i] = A[i]%B;
            freq.put(A[i], freq.getOrDefault(A[i],0) +1);
        }

        long count;

        long temp = freq.getOrDefault(0,0);
        long temp2;
        count = ((temp *(temp -1))/2)%m;

        if(B%2 == 0){
            temp = freq.getOrDefault(B/2,0);
            count = ( count%m + ((temp *(temp -1))/2)%m )%m;
        }

        for(int i = 1; i<(B+1)/2; i++){
            temp = freq.getOrDefault(i,0);
            temp2 =freq.getOrDefault(B-i,0);

            count = (count%m + (temp*temp2)%m)%m;
        }

        return (int)count;
    }
}
