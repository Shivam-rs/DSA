package strvr.string.basic;

//@Link - https://leetcode.com/problems/valid-anagram/description/

public class IsAnagram {
    public static void main(String[] args) {
       String a = "secure";
        String b = "rescue";

        System.out.println(isAnagram(a,b));
    }

    public static int isAnagram(String s, String t) {
        int n = s.length();
        int[] count = new int[26];

        for(int i = 0; i<n; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0) return 0;
        }

        return 1;
    }
}
