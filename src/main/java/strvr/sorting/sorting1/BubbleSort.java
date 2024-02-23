package strvr.sorting.sorting1;
//@Link - https://www.codingninjas.com/studio/problems/bubble-sort_624380?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/bubble-sort-algorithm/
public class BubbleSort {

    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i =n-1; i>=1; i--){
            int didSwap = 0;
            for(int j=0; j<=i-1; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }

            if(didSwap == 0) break;
        }
    }
}
