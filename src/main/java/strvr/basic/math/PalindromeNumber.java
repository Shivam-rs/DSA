package strvr.basic.math;

//@Link - https://www.codingninjas.com/studio/problems/palindrome-number_624662?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not/
public class PalindromeNumber {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        String a = Integer.toString(n);
        StringBuilder b = new StringBuilder();
        b.append(a);
        b.reverse();
        if(a.equals(b.toString())){
            return true;
        }else{
            return false;
        }
    }
}
