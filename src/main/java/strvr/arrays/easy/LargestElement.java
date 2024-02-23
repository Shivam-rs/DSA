package strvr.arrays.easy;

//@link: https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link: https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println(largestElement(arr,n));
    }

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
