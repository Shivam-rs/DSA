package strvr.binarysearch.arrays1d;

public class SingleNonDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1, high = n-2; // We are going compare right & left of element hence shrinking the array

        //Below are the edge case, writing in separate if blocks to make code easy
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        while(low <= high){
            int mid = (low + high)/2;

            //This always run because eliminating part of array which has pairs
            if(nums[mid] != nums[mid -1] && nums[mid] != nums[mid +1]) return nums[mid];

            //Single element would be either on right or left of mid
            //Everything on left of single element would form pair as (even, odd) and on right side it would be (odd,even)
            //Based in value of mid we are checking for pair and eliminating left of right part of the array
            if( (mid%2 == 1 && nums[mid -1] == nums[mid]) ||
                    (mid%2 == 0 && nums[mid] == nums[mid+1])
            ){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}
