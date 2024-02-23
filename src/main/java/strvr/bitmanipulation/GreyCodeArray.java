package strvr.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

//@Link - https://leetcode.com/problems/gray-code/description/

public class GreyCodeArray {
    public static void main(String[] args) {
        int n =  4;
        System.out.println(grayCode(n));
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int limit = (1<<n);
        for(int i = 0; i<(limit); i++){
            ans.add(i^(i>>1));
        }
        return ans;
    }
}
