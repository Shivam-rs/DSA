package strvr.arrays.medium;
//@Link  - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//@link  - https://takeuforward.org/data-structure/stock-buy-and-sell/
public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {7,99,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }

    public static int maxProfit(int[] prices) {

        int max = 0;
        int buy = prices[0];
        int n = prices.length;

        //Logic is to find the min buying price as we iterate over the array and then max selling price in the remaining of future array such that profit is max.
        for(int i = 1; i<n; i++){
            if(prices[i]<buy) buy = prices[i];
            max = Math.max(max, prices[i] - buy);
        }
        return max;
    }
}
