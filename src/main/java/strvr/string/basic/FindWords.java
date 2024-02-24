package strvr.string.basic;

import java.util.ArrayList;
import java.util.Arrays;

//Logic: - 1st check which set oes 1 letter of word belong too and then check or whole word only in that row
//Learning => use String.valueOf(), str = str.toLowerCase & Character.toLowerCase(char)
public class FindWords {

    public static void main(String[] args) {
        String[] words = new String[]{"Hello","Alaska","Dad","Peace"};
        //String[] words = new String[]{"adsdf","sfd"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        String set1 = "qwertyuiop", set2 = "asdfghjkl", set3 = "zxcvbnm";
        ArrayList<String> ans = new ArrayList<>();
        for(String word : words){
            char letter = Character.toLowerCase(word.charAt(0));
            String firstLetter = String.valueOf(letter);

            if(rowCheck(set1, firstLetter)){
               if(rowCheck(set1, word)) ans.add(word);
            }else if(rowCheck(set2, firstLetter)){
                if(rowCheck(set2, word)) ans.add(word);
            }else{
                if(rowCheck(set3, word)) ans.add(word);
            }

        }

        return ans.toArray(new String[0]);

    }

    public static boolean rowCheck(String keyRow, String word){
        int n = word.length();
        word = word.toLowerCase();
        for(int i = 0; i<n; i++){
            char apla = word.charAt(i);
                if(!keyRow.contains(String.valueOf(apla))){
                    return false;
                }
        }

        return true;
    }
}
