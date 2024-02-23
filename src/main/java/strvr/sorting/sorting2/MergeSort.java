package strvr.sorting.sorting2;
//@Link - https://www.codingninjas.com/studio/problems/merge-sort_5846?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/merge-sort-algorithm/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Storing: "+ Arrays.toString(arr));

        mergeDivide(arr, 0, n-1);

        System.out.println("After Storing: "+ Arrays.toString(arr));
    }

    private static void mergeDivide(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid = (low + high)/2;
        mergeDivide(arr,low, mid);   // left half
        mergeDivide(arr,mid+1, high);  // right half
        mergeSort(arr, low, mid, high);     // merging sorted halves
    }

    private static void mergeSort(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low; // starting index of left half of arr
        int right = mid + 1;  // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner
        while(left<=mid && right <= high){
            if(arr[left]<= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left
        while(left<= mid){
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
