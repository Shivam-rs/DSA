package scaler.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> ans;
    static List<Integer> temp;
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,6,7};
        ans = new ArrayList<>();
        temp = new ArrayList<>();

        genPermutation(arr, 7,0);

        System.out.print(ans.toString());
    }


    public static void genPermutation(int[] A, int remainder, int s){
        if(remainder == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = s; i<A.length; i++ ){
            int a = A[i];
            if(a <= remainder){
                temp.add(a);
                System.out.println("Before " + temp + " " + remainder);
                genPermutation(A, remainder-a , i);
                temp.remove(temp.size()-1);
                System.out.println("After " + temp + " " + remainder);
            }else{
                break;
            }
        }
    }
}
