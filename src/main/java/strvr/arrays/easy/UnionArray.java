package strvr.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//@link - https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//@Link - https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
public class UnionArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {2,3,4,4,5,11,12};

        System.out.println(unionOfArray(a,b).toString());
    }

    public static List< Integer> unionOfArray(int []a, int []b) {
        // Write your code here

        int n = a.length;
        int m = b.length;

        List<Integer> ans = new ArrayList<Integer>();

        int i =0, j=0;

        while(i<n && j<m){
            if(a[i]<=b[j]){ // comparing both the array's
                if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]){ //making sure no duplicates
                    ans.add(a[i]);
                }
                i++;
            }else{
                if(ans.isEmpty() || ans.get(ans.size()-1) != b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while(i<n){ //B array is inserted completely
            if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        while(j<m){ //A array is inserted completely
            if(ans.isEmpty() || ans.get(ans.size()-1) != b[j]){
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}
