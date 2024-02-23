package strvr.binarysearch.answers;
//@Link - https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//@Link - https://takeuforward.org/arrays/capacity-to-ship-packages-within-d-days/
public class ShipWithinDays {
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = shipWithinDays(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int max = -1;
        int sum = 0;
        for(int weight : weights){
            max = Math.max(max, weight);
            sum += weight;
        }

        if(days == weights.length) return max;

        int low = max, high = sum;

        while(low <= high){
            int mid = (low + high)/2;

            if(possible(weights, mid, days)){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean possible(int[] arr, int capacity, int target){
        int daysTaken = 0;
        int space = capacity;
        for(int val : arr){
            if(space >= val){
                space -= val;
            }else{
                daysTaken++;
                space = capacity - val;
            }
        }
        daysTaken++;
        return (daysTaken <= target);
    }
}
