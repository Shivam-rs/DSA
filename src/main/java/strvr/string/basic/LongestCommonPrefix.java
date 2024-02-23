package strvr.string.basic;

import java.util.Arrays;

//@Link - https://leetcode.com/problems/longest-common-prefix/description/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println("Longest Common prefix is:" + longestCommonPrefix(strs));
    }

    //Sort the array, and that would mean that 1st and last element would have the least common chars.
    //Hence, comparing them would give the longest common prefix for the array
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
