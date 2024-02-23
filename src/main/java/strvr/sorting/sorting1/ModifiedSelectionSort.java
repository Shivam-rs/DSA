package strvr.sorting.sorting1;

import java.util.Arrays;

public class ModifiedSelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,2,9,1, 6};
        modifiedSelectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void modifiedSelectionSort(int[] arr) {
        int len = arr.length;

        for(int i = len -1; i>=0; i--){
            int max= i;
            for(int j = 0; j<i; j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
}
