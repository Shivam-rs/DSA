package strvr.sorting.sorting2;

import java.util.Arrays;

//@link - https://www.codingninjas.com/studio/problems/insertion-sort_624381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/insertion-sort-algorithm/
public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Storing: "+ Arrays.toString(arr));
        insertionSort1(arr, 1);
        System.out.println("After Storing: "+ Arrays.toString(arr));
    }
    public static void insertionSort1(int[] arr, int start) {
        if(start >= (arr.length )) return;
        for(int j = start; j>=1; j--){
            if(arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        //System.out.println("ITR: "+start+ ": "+ Arrays.toString(arr));
        insertionSort1(arr, start+1);
    }
}
