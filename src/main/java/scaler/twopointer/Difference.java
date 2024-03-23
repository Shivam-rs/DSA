package scaler.twopointer;

import java.util.Arrays;

public class Difference {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,2,8,8,8,8,4,4,6,10,10,9,2,9,3,7};
        arr = new int[]{1,2};
        System.out.println(solve(arr,0));
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        if( n < 2) return 0;
        System.out.println(Arrays.toString(A));
        int count = 0;
        int i = 0, j = 1;

        while(j < n){
            int dif = A[j] - A[i];

            if(dif == B && i != j){
                System.out.println("i: "+ i + " j: " +j);
                count++;
                int j2 = j;
                while(A[j] == A[j2]){
                    j2++;
                    if(j2 == n) break;
                }
                j = j2;

                int i2 = i;
                while(A[i] == A[i2]){
                    i2++;
                    if(i2 == n) break;
                }
                i = i2;
                System.out.println("i2: " + i + " j2: " +j);
            }else if(dif > B){
                i++;
            }else{
                j++;
            }
        }

        return count;
    }

}
