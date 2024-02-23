package strvr.basic.recursion;
//@Link - https://www.codingninjas.com/studio/problems/reverse-an-array_8365444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/reverse-a-given-array/
public class ReverseArray {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        //int[] output = new int[n];
        swap(0,n-1,nums);
        swapOne(0,nums);
        return nums;

    }
    // 2 pointer approach
    public static void swap(int l, int r, int[] arr){
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        swap(l+1,r-1,arr);
    }

    // Single pointer approach
    public static void swapOne(int i, int[] arr){
        int l = arr.length;
        if(i>=l/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[l-i-1];
        arr[l-i-1] = temp;
        swapOne(i+1,arr);
    }
}
