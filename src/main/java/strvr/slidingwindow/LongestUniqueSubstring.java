package strvr.slidingwindow;

import java.util.HashMap;

//@Link - https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcaabcdba";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int start =0;
        int n = s.length();
        char[] ch = s.toCharArray();
        for(int i = start; i<n; i++){

            //If map contains the char, and it is present after start i.e. part of substring then update the start as index of char + 1
            //Important to update the new index of the repeated char into the map
            if(mp.containsKey(ch[i]) && start <= mp.get(ch[i])){
                maxLen = Math.max(maxLen, (i - start)); // +1 not required because we already at the index which ahead of substring
                start = mp.get(ch[i]) + 1;
                mp.put(ch[i],i);
            }else{
                mp.put(ch[i],i);
                maxLen = Math.max(maxLen, (i - start+1));
            }

        }

        return maxLen;
    }
}
