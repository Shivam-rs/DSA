package strvr.slidingwindow;

import java.util.Arrays;
//@Link - https://leetcode.com/problems/defuse-the-bomb/description/
/*
Many ways to implement solution for this question. Below solution is easy to visualize.

    Take sum of window for 0th element
    Then remove element from 1end and add from other end
    if k is zero we simply need to return an array which would be initialized by its default value.
*/
public class DefuseABomb {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,9,3};
        int k = -2;
        int[] ans = decrypt(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        int n = code.length;
        if(k > 0){
            int sum = 0;
            int i = 1;
            int window = k;
            while(window>0){
                sum += code[i];
                i =(i+1)%n ;
                window--;
            }

            ans[0] = sum;

            for(int j = 1; j<n; j++){
                sum = sum - code[j] + code[i];
                i = (i+1)%n;
                ans[j] = sum;
            }
        }else if(k<0){
            int sum = 0;
            int i = n-1;
            int window = -k;
            while(window>0){
                sum += code[i];
                i--;
                window--;
            }

            ans[0] = sum;

            for(int j = 1; j<n; j++){
                System.out.println("i " + i + "j " + j);
                i = (i+1)%n;
                sum = sum + code[j-1] - code[i];

                ans[j] = sum;
                //System.out.println(ans[j] + " - " + sum + " - " + code[j] + " - " + code[i]);
            }
        }
        return ans;
    }
}
