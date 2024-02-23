package strvr.basic.hashing;

import java.util.*;

public class MinMax {

    public static void main(String[] args) {
        int[] a ={11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3, 22 };
        int[] b = {10, 10, 10, 3, 3, 3};
        int[] c = {1, 2, 3, 1, 1, 4};

        int[] z = getFrequencies(a);

        System.out.println(Arrays.toString(z));
    }
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here

        TreeMap<Integer,Integer> map = new TreeMap<>();
        int len = v.length;

        for(int i=0; i<len; i++){
            if(map.containsKey(v[i])){
                map.put(v[i], map.get(v[i]) + 1);
            } else{
                map.put(v[i],1);
            }
        }

        int maxF = 0, minF = len;
        int maxE = 0, minE = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            System.out.println(element + "-->" + count);
            if(count>maxF){
                maxF= count;
                maxE = element;
            }

            if(count< minF){
                minF= count;
                minE = element;
            }
        }

        return new int[]{maxE, minE};
    }
}
