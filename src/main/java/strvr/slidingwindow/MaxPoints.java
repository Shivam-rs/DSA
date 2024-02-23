package strvr.slidingwindow;

//@Link - https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaxPoints {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,1};
        int k = 3;

        System.out.println(maxScore(nums,k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int maxSum = 0;
        for(int i = 0; i<k; i++){
            maxSum += cardPoints[i];
        }
        int sum = maxSum;
        int back = cardPoints.length -1;
        int end = k -1;

        while(end >= 0){
            sum -= cardPoints[end];
            sum += cardPoints[back];

            maxSum = Math.max(sum, maxSum);

            end--;
            back--;
        }

        return maxSum;
    }
}
