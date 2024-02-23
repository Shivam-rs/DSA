package strvr.basic.general;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,17,9};
        arr = new int[]{783000521,766639918,195102639,230793946,757604720,77842679,674858911,496636809,855231289};
        System.out.println(solve(arr));
    }
    public static int solve(int[] A) {

        ArrayList<int[]> ans = new ArrayList<>();
        int[] temp = new int[A.length];
        boolean[] visited = new boolean[A.length];

        genPermutation(ans, temp, A, 0, visited);
        System.out.println(ans);


        return ans.size();
    }

    public static boolean containsArray(ArrayList<int[]> arrayList, int[] array) {
        for (int[] arr : arrayList) {
            if (Arrays.equals(arr, array)) {
                return true;
            }
        }
        return false;
    }

    public static void genPermutation(ArrayList<int[]> ans, int[] temp, int[] A, int idx, boolean[] visted){
        if(idx == A.length){

            if(containsArray(ans, temp)){
                return;
            }
            ans.add(temp.clone());
            return;
        }

        for(int i = 0; i<A.length; i++){
            if(!visted[i]){
                if(idx != 0){
                    double sqrRoot = Math.sqrt(temp[idx-1] + A[i]);
                    if(sqrRoot != Math.ceil(sqrRoot)){
                        continue;
                    }
                }
                temp[idx] = A[i];
                visted[i] = true;
                genPermutation(ans, temp, A, idx+1, visted);
                visted[i] = false;
            }
        }
    }
}
