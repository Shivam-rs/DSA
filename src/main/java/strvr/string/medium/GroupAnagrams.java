package strvr.string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//@Link - https://leetcode.com/problems/group-anagrams/description/

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] str = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        char[] sig;
        String sigString;
        List<String> list;
        for(String s : strs){
            sig = s.toCharArray();
            Arrays.sort(sig);
            //sigString = Arrays.toString(sig);
            sigString = new String(sig);
            if(map.containsKey(sigString)){
                (map.get(sigString)).add(s);
            }else{
                list = new ArrayList<>();
                list.add(s);
                map.put(sigString,list);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for(String signature : map.keySet()){
            ans.add(map.get(signature));
        }

        return ans;
    }
}
