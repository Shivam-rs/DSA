package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//@Link - https://leetcode.com/problems/3sum/description/
//@Link - https://takeuforward.org/data-structure/3-sum-find-triplets-that-add-up-to-a-zero/
public class Sum3Elements {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
    }

    public static List<List<Integer>> threeSum(int[] arr){
        int n = arr.length;

        List<List < Integer >> ans = new ArrayList<>();
        Arrays.sort(arr); //This would make our life easy

        //Idea is to fix the i and then change j & k until sum is 0
        for(int i = 0; i<n; i++){

            //Since we need unique triplets, no point in checking for same values
            if(i != 0 && arr[i]==arr[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                //Want to reduce the sum coming backwards
                if(sum > 0) k--;

                //Want to increase the dum so moving forward
                else if(sum < 0) j++;
                //This would mean we have sum = 0
                else{
                    List < Integer > temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;


                    //Since we need unique triplets, no point in checking for same values
                    while(j < k && arr[j-1] == arr[j]) j++;
                    while(k > j && arr[k] == arr[k+1]) k--;
                }
            }
        }

        return ans;
    }
    //Hashing Approach
    /* public List<List<Integer>> threeSum(int[] arr) {
        Set< List<Integer> > hashAns = new HashSet<>();
        int n = arr.length;
        for(int i =0; i<n; i++){
            Set<Integer> arrayBucket = new HashSet<Integer>();
            for(int j = i+1; j<n; j++){

                int bal = -(arr[i] + arr[j]);

                if(arrayBucket.contains(bal)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], bal);
                    temp.sort(null);
                    hashAns.add(temp);
                }
                arrayBucket.add(arr[j]);
            }
        }
        List<List < Integer >> listAns = new ArrayList<>(hashAns);
        return listAns;
    }*/
}
