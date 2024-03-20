package scaler.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class MedianOfArray {
    public static void main(String[] args) {
        //List<Integer> A = new ArrayList<>(Arrays.asList(-50, -41, -40, -19, 5, 21, 28));
        //List<Integer> B = new ArrayList<>(Arrays.asList( -50, -21, -10));

        List<Integer> A = new ArrayList<>(List.of());
        List<Integer> B = new ArrayList<>(List.of(20));

        System.out.println(findMedianSortedArrays(A,B));
    }
    public static double findMedianSortedArrays(final List<Integer> A, final List<Integer> B) {
        int n = A.size();
        int m = B.size();

        if(n > m){
            return findMedianSortedArrays(B,A);
        }
        int i  = 0;
        int len = n + m;
        int low = 0;
        int high = A.size();
        double ans = 0;
        while(low <= high){
            int partition1 = (low + high)/2;
            int partition2 = (len + 1)/2 - partition1;

            int leftA = Integer.MIN_VALUE;
            int leftB = leftA;
            int rigthA = Integer.MAX_VALUE;
            int rigthB = rigthA;

            if(partition1 > 0){
                leftA = A.get(partition1 -1);
            }

            if(partition2 > 0){
                leftB = B.get(partition2 -1);
            }

            if(partition1 != n){
                rigthA = A.get(partition1);
            }

            if(partition2 != m){
                rigthB = B.get(partition2);
            }

            if(Math.max(leftA, leftB) <= Math.min(rigthA, rigthB) ){
                if(len%2 == 0){
                    ans = ((double)Math.max(leftA, leftB) + Math.min(rigthA, rigthB))/2;
                    break;
                }else {
                    ans = (double)Math.max(leftA, leftB);
                    break;
                }
            }else if(leftA > rigthB){
                high = partition1 -1;
            }else{
                low = partition1 + 1;
            }

            //i++;

            System.out.println("low "+low + " High " + high);
            //if(i>5) break;
        }

        return ans;
    }
}
