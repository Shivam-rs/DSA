package strvr.slidingwindow.hard;

import java.util.HashMap;

//@Link - https://leetcode.com/problems/minimum-window-substring/description/

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }

    public static String minWindow(String s, String t) {
        //If s is smaller than t then it's not possible to have ans
        if(s.length()<t.length()){
            return "";
        }

        HashMap<Character,Integer> mp = new HashMap<>();

        // Store the entire t string into the map
        for(int i =0; i<t.length(); i++){
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i),0) +1 );
        }

        int start =0, minLen = Integer.MAX_VALUE, count = 0;
        int ansStart = 0;

        //Start checking s string char in the map
        for(int end = 0; end<s.length(); end++){

            //If map contains the char that means 1 char from t string is found
            if(mp.containsKey(s.charAt(end))){
                if(mp.get(s.charAt(end)) > 0){
                    count++; //1 char found that's why ++
                }
                //Reduce the value in map to indicate that match has already been found
                mp.put(s.charAt(end), mp.get(s.charAt(end)) -1 );
            }

            //If all the match is found then we start shrinking the substring
            if(count == t.length()){

                //If char at start is no part of t or same char is present more than required times (<0, check line 38)
                //Then we move start ahead
                while(start < end && (!mp.containsKey(s.charAt(start)) || mp.get(s.charAt(start)) < 0)){
                    //If char is present more than required amount of time then we need to update the map to indicate that extra part is removed from substring
                    if(mp.containsKey(s.charAt(start))){
                        mp.put(s.charAt(start), mp.get(s.charAt(start)) +1);
                    }
                    start++;
                }

                //After moving the start if length of substring is smaller than min length then update it.
                if(minLen > end - start + 1){
                    minLen = end - start + 1;
                    ansStart = start; //ansStat will store start point of smallest substring
                }

                //We remove one more char from start and update the map so that we can find other possible substrings
                if(mp.containsKey(s.charAt(start))){
                    mp.put(s.charAt(start), mp.get(s.charAt(start)) +1);
                }
                count--;
                start++;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(ansStart, ansStart+minLen);
        }

    }
}
