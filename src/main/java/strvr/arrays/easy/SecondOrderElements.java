package strvr.arrays.easy;
//@link - https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
import java.util.Arrays;

public class SecondOrderElements {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println(Arrays.toString(getSecondOrderElements(n, arr)));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;


        for(int i =0; i<n; i++){
            if(a[i]<min){
                sMin = min;
                min = a[i];
            }else if(a[i]<sMin && a[i] != min){
                sMin = a[i];
            }

            if(a[i]>max){
                sMax = max;
                max = a[i];
            }else if(a[i]>sMax && a[i] != max){
                sMax = a[i];
            }
        }

        return new int[]{sMax, sMin};
    }

}
