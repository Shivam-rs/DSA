package strvr.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
//@link - https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://leetcode.com/problems/sort-colors/submissions/1121892756/
//@link - https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/
public class DNF {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:" + arr);
    }
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low = 0, mid = 0, high = n-1; //low would be end of sorted 0, mid -> 1's and high be start of sorted 2's

        while(mid<=high){
            // if mid is 0 then we need to push it to range of low
            if(arr.get(mid) == 0){

                int temp  = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid,temp);

                low++;
                mid++;
            }
            //if its 1 then keep it in mid range and move forward
            else if(arr.get(mid)==1){
                mid++;
            }
            //if 2 then push it to high range
            else {
                int temp  = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high,temp);

                high--;
            }

            //we are sorted
        }
    }
}
