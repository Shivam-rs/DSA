package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//@Link - https://leetcode.com/problems/merge-intervals/
//@Link - https://www.codingninjas.com/studio/problems/merge-all-overlapping-intervals_6783452?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//@Link - https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/
public class MergeOverlappingArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);


        System.out.print("The CodingNinja intervals are: \n");
        System.out.println(ans);
        /*for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }*/

        int[][] ans1 = merge(arr);

        System.out.print("The LeetCode intervals are: \n");
        System.out.println(Arrays.deepToString(ans1));

    }

    //Leetcode: return type is 2D matrix
    public static int[][] merge(int[][] intervals) {
        int r = intervals.length;

        List<int[]> ans = new ArrayList<>();

        //Sort the input array
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        //Add 1st row into ans list
        ans.add( new int[] {intervals[0][0], intervals[0][1]} );

        //traverse over the 2D array from 2nd row
        for(int i =1; i<r; i++){

            //if end of interval is greater than start of next interval than they are overlapping
            //Update end point in ans list of interval end point is greater
            if(ans.get(ans.size() - 1)[1] >= intervals[i][0]){
                ans.get(ans.size() - 1)[1] = Math.max( ans.get(ans.size() - 1)[1] , intervals[i][1]);
            }else{
                //If there is no match then add a new interval into the list
                ans.add( new int[] {intervals[i][0], intervals[i][1]} );
            }
        }
        //Since return tyep is 2D array, converting list to array
        return ans.toArray(new int[ans.size()][2]);
    }

    public static List< List< Integer > > mergeOverlappingIntervals(int [][]intervals){
        // Write your code here.
        int r = intervals.length;

        List<List< Integer >> ans = new ArrayList<>();

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        ans.add( Arrays.asList(intervals[0][0], intervals[0][1]) );

        for(int i =1; i<r; i++){
            if(ans.get(ans.size() - 1).get(1) >= intervals[i][0]){
                ans.get(ans.size() - 1).set(1, Integer.max( ans.get(ans.size() - 1).get(1) , intervals[i][1]));
            }else{
                ans.add( Arrays.asList(intervals[i][0], intervals[i][1]) );

            }
        }

        return ans;
    }
}
