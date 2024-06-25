package DailyChallenge;
//Question: https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/description/?envType=daily-question&envId=2024-06-24
//Explanation : https://www.youtube.com/watch?v=oe9HR-cLAHo

public class MinKConsecutiveBitFlips_995 {
  public static void main(String[] args) {
    System.out.println(minKBitFlips(new int[]{0,0,0,1,0,1,1,0}, 3));
  }

  //Logic is when ever you flip a element that is 0 mark it as flipped and increment a counter times
  // Then line number 24 will tell the current state of element
  // if that also need to be flipped then increment times
  // It is important to note that effect of a flip would be till k consecutive terms only
  // hence line number 19 is checking if i - k element is having impact on times than reduce it

  //Lastly if any of last k elements needs to flipped then it is no possible to have all the element as 1

  public static int minKBitFlips(int[] nums, int k) {
    int n = nums.length;
    int ans = 0, times = 0;

    for(int i = 0; i<n; i++){
      if(i >= k){
        if(nums[i -k] > 1){
          times--;
          nums[i - k] -= 2;
        }
      }

      if((nums[i] == 0 && times%2 == 0) || (nums[i] == 1 && times%2 == 1)){
        if(i + k > n) return -1;
        times++;
        ans++;

        nums[i] += 2;
      }
    }

    if(nums[n - k] > 1) nums[n - k] -= 2;

    return ans;
  }

}
