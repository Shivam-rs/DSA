package DailyChallenge;
//Question : https://leetcode.com/problems/count-number-of-nice-subarrays/description/?envType=daily-question&envId=2024-06-22

public class NiceSubarrays_1248 {

  public static void main(String[] args) {
    System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2}, 2));
  }

  public static int numberOfSubarrays(int[] nums, int k) {
    int start = 0;
    int end = 0;
    int n = nums.length;
    int countOdd = 0, ans = 0, tempans = 0;

    while(end<n){

      //If current number is odd then increment the odd counter and
      //reset temp ans to 0 so that we can count number of nice subarrays that can be formed ending at this odd element
      if(nums[end]%2 == 1) {
        tempans = 0;
        countOdd++;
      }

      // If number of odd elements have become greater than K then move start because we would have already counted nice array for previous one
      while(countOdd > k){
        if(nums[start]%2 == 1) countOdd--;
        start++;
      }

      //count number of nice subarray that can be formed ending at this odd elements
      while(countOdd == k && start <= end){
        tempans++;
        if(nums[start]%2 == 1) countOdd--;
        start++;
      }
      end++;

      //This is very important, all the even elements between 2 odd elements can be included into subarray
      //hence we add temp ans into our ans if curr element is even
      // and reset temp ans only when we get new odd element
      ans += tempans;
    }

    return ans;
  }
}
