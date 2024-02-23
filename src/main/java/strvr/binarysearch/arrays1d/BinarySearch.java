package strvr.binarysearch.arrays1d;
//@Link - https://leetcode.com/problems/binary-search/
//@Link - https://takeuforward.org/data-structure/binary-search-explained/
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;

        return recursionBS(nums, low, high, target);
    }

    public static int recursionBS(int[] nums, int low, int high, int target){
        if(low > high) return -1;

        int mid = (low + high)/2; // This can overflow if both low and high are very big. One way to deal with this is low + (high - low)/2

        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return recursionBS(nums, low, mid - 1, target);
        else return recursionBS(nums, mid +1, high, target);
    }
}
