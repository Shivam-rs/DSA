package strvr.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
//@link - https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://leetcode.com/problems/two-sum/
//@link - https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/

public class TwoSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoPointer(n, arr, target); //2-pointer approach is best when index is not required because we are sorting the array
        System.out.println("Can it be done: " + ans);

        int[] arr1 = {2, 6, 5, 8, 11}; //This is because we are sorting array in above algo!! both the also does the same job but just wanted to play around

        int[] index = twoSum(arr1, target); // This is optimal solution if indices are required
        System.out.println("what are index " + Arrays.toString(index));
    }

    public static String twoPointer(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int left = 0;
        int right = n-1;
        int sum = 0;
        while(left<right){
            sum  = book[left] + book[right];

            if(sum == target) return "YES";

            if(sum > target) right--;
            else left++;
        }
        return "NO";
    }

    public static int[] twoSum(int[] nums, int target) {

        //     int [] output =  new int[2];
        //     for(int i = 0; i<(nums.length-1); i++){
        //         for(int j = i+1; j<nums.length; j++ ){
        //             if(nums[i]+nums[j] == target){
        //                 output[0] = i;
        //                 output[1] = j;
        //                 break;
        //             }
        //         }
        //     }
        // return output;
        HashMap<Integer, Integer> map =  new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){

            int bal = target - nums[i];

            //1st check map and then add values to the map because there is possibility that target = 2*arr[0] and function would return 0,0
            if(map.containsKey(bal) ){

                for(int q : map.keySet()){
                    System.out.println("Key: " + q + ", Value: " + map.get(q));
                }
                return new int[]{map.get(bal),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

}
