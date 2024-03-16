package strvr.basic.collections;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorsTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{9,1,2,4,6};
        Arrays.sort(arr, new ArraysSorting());

        System.out.println(Arrays.toString(arr));
    }
}

class ArraysSorting implements Comparator<Integer>{
    public static int fact(int a){
        int ans = 0;
        int i;
        for(i = 1; i*i<a; i++){
            if (a % i == 0) {
                if (a / i == i)
                    ans++;
                else
                    ans += 2;
            }
        }

        return ans;
    }

    @Override
    public int compare(Integer a1, Integer a2) {
        int v1 = fact(a1), v2 = fact(a2);

        if(v1 == v2){
            return a1.compareTo(a2);
        }else if(v2 > v1){
            return -1;
        } else{
            return 1;
        }
    }
}
