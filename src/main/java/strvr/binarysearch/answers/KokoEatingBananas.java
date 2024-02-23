package strvr.binarysearch.answers;

//@Link - https://leetcode.com/problems/koko-eating-bananas/description/
//@link - https://takeuforward.org/binary-search/koko-eating-bananas/
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minEatingSpeed(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
    public static int minEatingSpeed(int[] piles, int h) {
        //Since eating more than max in pile would not add any value as that would be min time taken finish all the bananas
        //Hence our ans would be in range 1 to max of pile.
        int max =  -1;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        int low = 1, high = max;
        //int ans = 1;
        while(low <= high){
            int mid = (low+high)/2;
            int hours = totalingHrs(piles, mid, h);

            //If hrs are ore that means Koko needs to eat faster
            if(hours > h){
                low = mid + 1;
            }else{//Else she needs to eat slower
                high = mid -1;
            }
        }
        //Low would always end up pointing towards the least possible rate.
        //If Koko eats at the rate of low then she would finish all the bananas in <= h hours
        return low;
    }

    public static int totalingHrs(int[] arr, int mid, int target){
        int hrs = 0;

        for (int j : arr) {
            hrs += (int) Math.ceil((double) j / mid); //Math.pow takes double as input and generates double as output as well.
            if (hrs > target) return target + 1;
        }
        return hrs;
    }
}
