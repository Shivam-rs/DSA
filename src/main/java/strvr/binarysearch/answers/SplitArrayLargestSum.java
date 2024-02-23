package strvr.binarysearch.answers;

//@Link - https://leetcode.com/problems/split-array-largest-sum/
//@Link - https://takeuforward.org/arrays/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = splitArray(a, k);
        System.out.println("The answer is: " + ans);
    }
    public static int splitArray(int[] nums, int k) {

        int max = -1;
        int sum = 0;
        for(int val : nums){
            max = Math.max(max, val);
            sum += val;
        }
        //Min(sum of sub-array) would be at least max.
        if(k == nums.length) return max;

        //Max min(sum of sub-array) can go to is sum of the entire
        int low = max, high = sum;

        while(low <= high){
            int mid = (low + high)/2;

            if(possible(nums, mid, k)){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean possible(int[] arr, int possibleMaxSum, int maxSplit){
        int noOfSplit = 0;
        int space = possibleMaxSum;

        for(int val : arr){
            if(space >= val){ //If space is available
                space -= val; //then include the element in sub-array
            }else{
                noOfSplit++; //Once new sub array is started increment the split count
                space = possibleMaxSum - val; //Add the element to the new sub-array
            }
        }
        noOfSplit++; //Since we started with 0, we have to increment once after loop is over
        return (noOfSplit <= maxSplit);
    }
}
