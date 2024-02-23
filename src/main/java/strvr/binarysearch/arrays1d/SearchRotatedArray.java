package strvr.binarysearch.arrays1d;
//@Link for no duplicates - https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//@Link for with duplicates - https://leetcode.com/problems/search-in-rotated-sorted-array/
//@Link - https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/
public class SearchRotatedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6};
        int k = 1;
        int ans = search(arr, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;

            //If all the pointers become equal then it would be impossible to determine which half is sorted
            //What we did is shrank the search space until 1 pointer points to different value
            //That would help us in determining which half to look at for target value.
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                //Remember it's not possible to point out the index at which target is present if duplicates are present
                low++;
                high--;
                continue;
            }

            //Search for sorted half
            if(nums[low] <= nums[mid]){ //<= because array can be of small size
                //this means that left half is sorted
                //Now we need to confirm is our target is here in sorted part or not
                if(nums[low] <= target && target <=nums[mid] ){ //This would mean our target is somewhere in sorted part
                    high = mid - 1;
                }else{ //This would mean our target is in unsorted part, so we'll move low
                    low = mid + 1;
                }

            }else{ //This would mean right part is sorted
                if(nums[mid] <= target && target <=nums[high] ){ //This would mean our target is somewhere in sorted part
                    low = mid + 1;
                }else{ //This would mean our target is in unsorted part, so we'll move low
                    high = mid - 1;
                }
            }

        }

        return -1;

    }
}
