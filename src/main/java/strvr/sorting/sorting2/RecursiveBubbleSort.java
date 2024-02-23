package strvr.sorting.sorting2;

import java.util.Arrays;

//@Link - https://www.codingninjas.com/studio/problems/bubble-sort_624380?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/arrays/recursive-bubble-sort-algorithm/
public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;
        System.out.println("Before Storing: "+ Arrays.toString(arr));
        bubbleSort(arr, n);
        System.out.println("After Storing: "+ Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr, int n) {
            if(n == 1) return;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            bubbleSort(arr, n-1);
    }
}
