package strvr.binarysearch.answers;

import java.util.Arrays;
//@Link - https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/aggressive-cows-detailed-solution/
public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }

    public static int aggressiveCows(int []stalls, int k) {

        int n = stalls.length;
        Arrays.sort(stalls);

        if(k == 2) return stalls[n-1] - stalls[0];

        //Max distance B/w 2 cows can be max - min of the array and min distance would be 1
        int low = 1, high = stalls[n-1] - stalls[0];

        while(low <= high){
            int mid = (low + high)/2;

            if(possible(stalls, mid, k)){
                low = mid + 1; //Since we need to maximize the distance B/w 2 cows we'll keep on checking for more distance if it's possible to place the cows
            }else{
                high = mid -1;
            }
        }

        return high;
    }

    public static boolean possible(int[] arr, int maxPossibleDistance, int maxCows){
        int noOfCows = 1;
        int lastCow = arr[0];

        for(int val : arr){
            if(val - lastCow >= maxPossibleDistance){ //We are assuming mid as max possible distance B/w 2 cows,
                // if diff between last placed cow and current stall is greater than equal to mid than next cow can be placed.
                lastCow = val; //Updating last cow placed stall value.
                noOfCows++; // Updating number of cows placed
                if(noOfCows >= maxCows) return true; //Once we know required number of cows are placed then we can return true
            }
        }
        return false;
    }
}
