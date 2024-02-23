package strvr.sorting.sorting1;
//@link - https://www.codingninjas.com/studio/problems/insertion-sort_624381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/insertion-sort-algorithm/
public class InsertionSort {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i = 0; i<size; i++){
            for(int j = i; j>0; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
