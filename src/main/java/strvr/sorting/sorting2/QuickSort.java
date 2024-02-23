package strvr.sorting.sorting2;
//@Link - https://www.codingninjas.com/studio/problems/quick-sort_5844?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/quick-sort-algorithm/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Storing: "+ Arrays.toString(arr));

        quickSort(arr, 0, n-1);

        System.out.println("After Storing: "+ Arrays.toString(arr));
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }

            while(arr[j]>pivot && j>low){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int tem = arr[low];
        arr[low] = arr[j];
        arr[j] = tem;

        return j;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
}
