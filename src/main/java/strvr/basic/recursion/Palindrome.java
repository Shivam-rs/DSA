package strvr.basic.recursion;
//@Link - https://www.codingninjas.com/studio/problems/check-palindrome-recursive_624386?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://leetcode.com/problems/valid-palindrome/submissions/
//@link - https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/
public class Palindrome {

    //LeetCode
    public boolean isPalindrome(String s) {
        StringBuilder a = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return pal(0, a.toString());

    }

    public boolean pal(int i, String str){
        boolean output;
        int len = str.length();
        if(i>=len/2) return true;

        if(str.charAt(i)==str.charAt(len-i-1)){
            output = pal(i+1,str);
        }else{
            output = false;
        }

        return output;
    }

    //Coding Ninja
    public static boolean isPalindromeCN(String str) {
        // Write your code here.
        //int l = str.length();
        return checkStr(0,str);
    }

    public static boolean checkStr(int i, String word){

        int l = word.length();
        boolean o;
        if(i>= l/2) return true;

        if(word.charAt(i)== word.charAt(l-i-1)){
            o = checkStr(i+1, word);
        }else{
            o = false;
        }

        return o;
    }

}
