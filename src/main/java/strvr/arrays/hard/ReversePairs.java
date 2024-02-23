package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.List;

//@Link - https://leetcode.com/problems/reverse-pairs/
//@Link - https://takeuforward.org/data-structure/count-reverse-pairs/

public class ReversePairs {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3, 1};
        int n = 5;
        int cnt = mergeDivide(a, 0, 4);
        System.out.println("The number of reverse pair is: " + cnt);
    }

    private static int mergeDivide(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;

        // left half
        cnt += mergeDivide(arr, low, mid);  //This addition would make sure that all the pairs from left side are counted

        // right half
        cnt += mergeDivide(arr, mid + 1, high); // right side pairs counted

        cnt += countPairs(arr, low, mid, high); //pairs in left and right side

        // merging sorted halves
        mergeSort(arr, low, mid, high);

        return cnt;
    }

    private static void mergeSort(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    //This is like comparing 2 sorted arrays and checking if arr1 has element that is greater than 2*element in arr2.
    private static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1; //Hypothetical array2
        int cnt = 0;
        for (int i = low; i <= mid; i++) { //this loop will take me over arr1
            while (right <= high && (long)arr[i] > 2 * (long)arr[right])
                //We'll keep on moving arr2 if 2*ele is smaller than ele in arr1
                //since both the arrays are sorted we can say that if any 2*ele in arr2 is smaller than any ele in array 1
                // then this condition would be true for all the future ele in arr1.

                //Hence we continue this loop till condition is met
                right++;
            cnt += (right - (mid + 1)); //Once above condition is met for 1 ele then this addition would make sure it get counted for all the future element in arr1.
        }
        return cnt;
    }
}
