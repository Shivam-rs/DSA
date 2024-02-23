package strvr.arrays.hard;

import java.util.Arrays;
//@Link - https://leetcode.com/problems/merge-sorted-array/
//@Link - https://www.codingninjas.com/studio/problems/merge-two-sorted-arrays-without-extra-space_6898839?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/
public class Merge2SortedArray {

    //Gap Method
    public static void gapMethod(long []a, long []b){

        int n = a.length;
        int m  = b.length;

        int len = n+m;

        //Calculate length/2 and use it as a pointer
        int gap = (int)Math.ceil((double)(n+m)/2); //+ (n+m)%2; //
        //int gap = (len / 2) + (len % 2);


        while(gap > 0){
            int left = 0;
            int right = left + gap;

            //3 case would occur:
            //      1) left would be in arr1 and right would be in arr2 --> In this case we would swap from 2 diff array
            //      2) Both the pointers are in arr2 --> swap within same array (arr1 or arr2) only

            while(right < len){
                //Case 1
                if(left < n && right >= n){
                    swap(a, b, left, right-n);
                }//Case 2: Both pointers are in arr2
                else if(left >= n){
                    swap(b, b, left-n, right-n);
                } //Case 3: Both pointers are in arr1
                else{
                    swap(a, a, left, right);
                }

                left++;
                right++;
            }
            //We need to break out of the loop after gap attains value of 1 because after gap is 1 we need to run loop only once.
            if(gap == 1) break;

            gap = (int)Math.ceil((double)(gap)/2);
            //gap = (gap / 2) + (gap % 2);
        }

    }

    public static void swap(long[] arr1, long[] arr2, int ind1, int ind2){
        if(arr1[ind1] > arr2[ind2]){
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    //2 pointer with sorting
     public static void twoPointer(long []a, long []b){
         // We are comparing last element of sorted array1 with 1st element of sorted array2
         //Swap until all the small elements are in array1
         //Break the loop if any element is arr1 is identified to be greater than element in arr2.
         int left = a.length -1;
         int right = 0;

         while(left>=0 && right< b.length){
             if(a[left] > b[right]){
                 long temp  = a[left];
                 a[left] = b[right];
                 b[right] = temp;
             }else break;

             left--;
             right++;
         }

         Arrays.sort(a);
         Arrays.sort(b);
     }

     //LeetCode Solution
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Comparing last elements of both the array and placing the largest on at the end of arr1(length is N+M)
         int left = m-1;
         int right = n-1;
         int sorted = n+m-1;

         while(right >=0){

             if( left>= 0 && nums1[left] >= nums2[right] ){
                 nums1[sorted]  = nums1[left];
                 left--;
                 sorted--;
             }else{
                 nums1[sorted]  = nums2[right];
                 right--;
                 sorted--;
             }
         }
     }
}
