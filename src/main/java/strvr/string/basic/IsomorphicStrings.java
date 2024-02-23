package strvr.string.basic;

//@Link - https://leetcode.com/problems/isomorphic-strings/

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        System.out.println(s + " and " + t + " are isomorphic strings?: " + isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        // 2 Maps of length 256 to store all possible value of char
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        // Traverse all elements through the loop...
        for(int idx = 0; idx < s.length(); idx++){
            // Compare the maps, if not equal, return false...
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;
            // Insert each character if string s and t into separate map...
            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;
        }
        return true;
    }
}
