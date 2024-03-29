package strvr.arrays.medium;

import java.util.Arrays;
import java.util.Comparator;

//@Link - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/?envType=daily-question&envId=2024-03-18

public class ArrowShots {
    public static void main(String[] args) {
        int[][] points = new int[][]{{9, 12},
                {1, 10},
                {4, 11},
                {8, 12},
                {3, 9},
                {6, 9},
                {6, 7}
        };

        System.out.println(findMinArrowShots(points));
    }

    /*Logic: 1) Sort based on end points because they determine if next interval will overlap or not
            2) Now if start of current interval is greater than the previous end that means intervals don't overlap
            3) We update previous end only when we see a non overlapping end points. -> Think about it, we don't need Continuous overlap rather we need all of them to overlap
    */
    public static int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n == 1) return 1;

        Arrays.sort(points, new Comparator<int[]>(){
            @Override
            public int compare(int[] a1, int[] a2){
                //return (a1[0]).compare(a2[0]);

                return Integer.compare(a1[1], a2[1]);
            }
        });

        System.out.println(Arrays.deepToString(points));

        int arrow=1;
        int prevEnd = points[0][1];
        for(int i=1; i<n; i++){
            int currStart =  points[i][0];
            if(currStart > prevEnd){
                arrow++;
                prevEnd=points[i][1];
            }
        }
        return arrow;
    }

}
