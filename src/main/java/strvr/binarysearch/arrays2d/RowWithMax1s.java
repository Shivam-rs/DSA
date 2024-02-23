package strvr.binarysearch.arrays2d;

import java.util.ArrayList;
import java.util.Arrays;

//@Link - https://www.codingninjas.com/studio/problems/row-of-a-matrix-with-maximum-ones_982768?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/arrays/find-the-row-with-maximum-number-of-1s/

public class RowWithMax1s {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +
                maximumOnesRow(matrix, n, m));
    }

    //We have to traverse through all the rows - This cannot be optimized
    //We'll perform BS on each col to find upperbound of 0/ lower bound of 1 then sub it from col length to get no. of 1s in that col.
    //Compare it with max and store
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int maxOne = 0;
        int ans = -1;

        for(int i = 0; i<n; i++){

            int low = 0, high=m-1;
            while(low<=high){
                int mid = (low+high)/2;

                if((matrix.get(i)).get(mid) == 1) high = mid -1;
                else low = mid + 1;
            }

            if(m - low > maxOne){
                maxOne = m -low;
                ans = i;
            }
        }

        return ans;
    }
}
