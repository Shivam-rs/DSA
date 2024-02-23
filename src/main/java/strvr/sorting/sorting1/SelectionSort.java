package strvr.sorting.sorting1;

//@Link - https://www.codingninjas.com/studio/problems/selection-sort_624469?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://takeuforward.org/sorting/selection-sort-algorithm/
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int len = arr.length;
        for(int i = 0; i<len-1; i++){
            int min= i;
            for(int j = i+1; j<len; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
