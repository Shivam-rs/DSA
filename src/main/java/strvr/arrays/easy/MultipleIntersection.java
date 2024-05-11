package strvr.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleIntersection {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{3,1,2,4,5}, {1,2,3,4}, {3,4,5,6}};
        System.out.println(intersection(arr));

    }

    public static List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;

        int[] tempAns = new int[1001];
        for(int i : nums[0]){
            tempAns[i] = 1;
        }

        for(int i = 1; i<n; i++){
            intersection(tempAns , count(nums[i]));
        }

        List<Integer> ans = new ArrayList<>();

        System.out.println("Ans" + Arrays.toString(tempAns));
        for(int i : tempAns){
            if(i == 1){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void intersection(int[] a, int[] b){
        for(int i = 0; i<1001; i++){
            a[i] = Math.min(a[i], b[i]);
        }
        System.out.println(Arrays.toString(a));
    }

    public static int[] count(int[] a){
        int[] temp = new int[1001];
        for(int i : a){
            temp[i] = 1;
        }
        return temp;
    }
}
