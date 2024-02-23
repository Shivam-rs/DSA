package strvr.binarysearch.answers;
//@Link - https://leetcode.com/problems/kth-missing-positive-number/description/
//@Link - https://takeuforward.org/arrays/kth-missing-positive-number/
public class FindKthPositive {

    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int k = 4;
        int ans = findKthPositive(vec, k);
        System.out.println("The missing number is: " + ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low +high)/2;

            if(arr[mid] - mid -1 < k){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        //int missing = k - (arr[high] - high -1);
        //return arr[high] + (missing);

        return k + high + 1;
        //High would always point to lower bound element and if missing element is before the 1st element then high would be negative.
        // Hence, we have to club the above two statements
    }

    /*public int findKthMissingNo(int[] arr, int k) {

        //This is brute force approach: As long as value of element is smaller than k because we need the missing element
        for(int i : arr){
            if(i <= k) k++;
            else return k;
        }

        return k;
    }*/
}
