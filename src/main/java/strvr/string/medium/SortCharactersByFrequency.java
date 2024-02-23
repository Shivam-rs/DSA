package strvr.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//@Link  - https://leetcode.com/problems/sort-characters-by-frequency/

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "Mississippi";
        System.out.println(frequencySort(s));

    }

    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        //Store frequency into a map
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) +1);
        }
        //Create an array of list - This array would be frequency array
        List<Character>[] arr = new ArrayList[s.length() +1];

        for(Character ch : map.keySet()){
            //Frequency would be the index at which the char would go in the arr
            int frequency = map.get(ch);

            //Now check if list is present at particular index or not. If not then add a new list
            if(arr[frequency] == null){
                arr[frequency] = new ArrayList<>();
            }
            //Keep adding
            arr[frequency].add(ch);
        }

        StringBuilder ans = new StringBuilder();

        //Since we need char with the highest frequency first, we'll start from the end
        for(int i = arr.length -1; i>=1; i--){
            //We only need indexes that have a list
            if(arr[i] != null){
                //Since multiple char can have sane frequency
                for(int j = 0; j<arr[i].size(); j++){
                    //Repeating each char, index times
                    for(int k = 0; k<i; k++){
                        ans.append(arr[i].get(j));
                    }
                }
            }
        }

        return ans.toString();
    }
}
