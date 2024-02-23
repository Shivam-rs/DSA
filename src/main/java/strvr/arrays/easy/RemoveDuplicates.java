package strvr.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;


//@link - https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//@link - https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5));

        System.out.println(removeDuplicates(arr,7));
    }

    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        // Write your code here.
        int i = 0;
        for(int j = 1; j<n; j++){
            if(!(arr.get(j).equals(arr.get(i)))){
                arr.set(i+1,arr.get(j));
                i++;
            }
        }

        return i+1;
    }
}
