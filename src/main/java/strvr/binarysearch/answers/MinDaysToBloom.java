package strvr.binarysearch.answers;

//@Link - https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
//@Link - https://takeuforward.org/arrays/minimum-days-to-make-m-bouquets/
public class MinDaysToBloom {

    public static void main(String[] args) {
        int[] arr = new int[] {1,10,3,10,2};

        int ans = minDays(arr,3,1);
        System.out.println(ans);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        //If requirement is more than number of followers than no point in checking anything return -1 and be happy
        long leastSize = (long)m*k;
        if((long)bloomDay.length < leastSize) return -1;

        int min = Integer.MAX_VALUE;
        int max = -1;

        for(int day : bloomDay){
            max = Math.max(max, day);
            min = Math.min(min, day);
        }

        //Range would be from min days to bloom to max day required - On max day everyone would be bloomed so easy pizy
        int low = min, high = max;

        while(low <= high){
            int mid = (low + high)/2;
            //This function will inform if it's possible to make required number of bouquet after mid no. of days has passed
            if(possible(bloomDay, mid, m, k)){
                high = mid -1; //Since we have to find min no. of days we'll narrow or search by eliminating right side b/c everything on right would definitely be possible
            }else{
                low = mid + 1; //If at mid it is not possible then anything on left also it won't be possible.
            }
        }

        return low;
    }

    public static boolean possible(int[] arr, int mid, int m, int k){
        int count = 0;
        int set = 0;
        for(int day : arr){
            if(day <= mid){
                count ++;
            }else{
                set += count/k;
                count = 0;
            }
        }
        set += count/k; // This is very important, took me some debugging to identify this mistake
        // Set needs to be updated after last element as well, eg: if last 3-4 flowers are bloomed then count would be updated by since else part is not getting executed
        // set would never get updated.

        return (set >= m); // Set is greater than m that mean it is possible to make required number of bouquet
    }
}
