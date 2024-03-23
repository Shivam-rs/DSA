package strvr.string.medium;

import java.util.ArrayList;
import java.util.List;

//@Link  - https://leetcode.com/problems/find-common-characters/submissions/1211992154/

public class CommonChar {
    public static void main(String[] args) {
        String[] arr = new String[]{"bella","label","roller"};
        System.out.println(commonChars(arr));
    }

    public static List<String> commonChars(String[] words) {
        int[] tempAns = count(words[0]);

        for(int i = 1; i<words.length; i++){
            intersection(tempAns, count(words[i]));
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++){
            if(tempAns[i] != 0){
                char ch = 'a';
                ch += i;

                while(tempAns[i] != 0){
                    ans.add(String.valueOf(ch));
                    tempAns[i]--;
                }
            }
        }

        return ans;
    }

    public static void intersection(int[] a, int[] b){
        for(int i = 0; i<26; i++){
            a[i] = Math.min(a[i] , b[i]);
        }
    }

    public static int[] count(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        //System.out.println(Arrays.toString(freq));
        return freq;
    }
}
