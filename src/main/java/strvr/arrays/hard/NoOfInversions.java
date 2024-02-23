package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.List;
//@Link - https://www.codingninjas.com/studio/problems/number-of-inversions_6840276?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/count-inversions-in-an-array/

//Logic of this question is very simple
//Perform merge sort and while merging the divided arrays count how many times element is picked from array2
//Optimization done over here is since both arr1 and arr2 would be sorted while merging we can say that if any element in arr1 is grater than any element in arr2
//then all future elements in arr1 would be grater than that particular element in aar2, so all of such instance can be counted at once.
public class NoOfInversions {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = mergeDivide(a, 0, n-1);
        System.out.println("The number of inversions are: " + cnt);
    }

    private static int mergeDivide(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;

        cnt += mergeDivide(arr, low, mid); // left half
        cnt += mergeDivide(arr, mid + 1, high); // right half
        cnt += mergeSort(arr, low, mid, high); // merging sorted halves

        return cnt;
    }

    private static int mergeSort(int[] arr, int low, int mid, int high) {
        int cnt= 0;
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
                cnt += (mid - left + 1);
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
        return cnt;
    }
}
