package strvr.basic.hashing;
//@link: https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
//@link: https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class FreqArray {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] a = new int[n];

        for(int i =0;i<n;i++){
            if(nums[i]<=n){
                a[nums[i]-1]++;
            }
        }
        return a;
    }
}
