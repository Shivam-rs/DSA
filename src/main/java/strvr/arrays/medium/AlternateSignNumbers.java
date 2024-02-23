package strvr.arrays.medium;

import java.util.Arrays;
//@link - https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
//@link - https://takeuforward.org/arrays/rearrange-array-elements-by-sign/
public class AlternateSignNumbers {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, -4, -5,6,-6};
        int [] ans = rearrangeBySign(arr);

            System.out.print(Arrays.toString(arr));

    }

    public static int[] rearrangeBySign(int []a) {
        // Write your code here.
        int n = a.length;
        int[] ans = new int[n];
        int pIndex =0, nIndex=1;
        for(int i =0; i<n; i++){
            if(a[i]>0) {
                ans[pIndex] = a[i];
                pIndex+=2;
            }else{
                ans[nIndex] = a[i];
                nIndex+=2;
            }
        }

        return ans;
    }
}
