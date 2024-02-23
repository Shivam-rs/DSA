package strvr.arrays.easy;

import java.util.HashMap;
//@Link - https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class FindTheSingleElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 3,4, 4,5, 5};
        System.out.println(getSingleElement(arr));
    }
    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = arr.length;

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)==1) return key;
        }

        return -1;
    }
}
