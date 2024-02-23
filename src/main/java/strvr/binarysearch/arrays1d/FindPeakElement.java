package strvr.binarysearch.arrays1d;
//@Link - https://leetcode.com/problems/find-peak-element/
//@Link - https://takeuforward.org/data-structure/peak-element-in-array/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int ans = findPeakElement(arr);
        System.out.println("The peak is at index: " + ans);
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        //Corner cases, questions asked to assume there would be -infinity before and after the array
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        //Trimmed the array for better readability
        int low = 1, high = n-2;

        while(low <= high){
            int mid = (low + high)/2;

            //Element is peak if it's greater than right and left element
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) return mid;

            //If mid -1 is smaller than mid then mid is on increasing slope
            if(nums[mid-1] < nums[mid]) low = mid + 1;
            //Else on decreasing slope, remember for else we are not writing condition because
            //If array contains multiple peaks and mid is pointing towards floor b/w 2 peaks then it's on neither of the slope.
            //Hence, we can eliminate any side of the mid. Here we chose right side.
            else high = mid -1;
        }

        return -1;
    }
}
