package strvr.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//@Link: https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link: https://takeuforward.org/data-structure/leaders-in-an-array/

public class SuperiorElements {
    public static void main(String[] args) {
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};


        List<Integer> ans= superiorElements(arr);

        //Collections.sort(ans, Collections.reverseOrder());

        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }

    public static List< Integer > superiorElements(int []a) {
        // This variable would help in deciding if there are any elements greater on right.
        //Last element can also be taken since it would be always be superior element.
        int max = 0;
        int n = a.length;
        List< Integer > ans = new ArrayList< Integer >();

        //We start checking from the end and keep on updating max.
        //If max is getting updated that means that current element is the greatest and all the elements on right are smaller => current element is superior
        for(int i = n-1; i>=0; i--){
            if(a[i]>max){
                ans.add(a[i]);
                max= a[i];
            }
        }
        //This would be in sorted order since we are adding smaller to higher (max is getting added)
        //if we need to preserve the order then we can simply reverse this ans.
        return ans;
    }
}
