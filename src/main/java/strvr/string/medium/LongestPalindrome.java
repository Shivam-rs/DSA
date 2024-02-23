package strvr.string.medium;

//@Link - https://leetcode.com/problems/longest-palindromic-substring/description/

//There is one more solution with O(n) solution but not able to grasp it properly
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    //TC= O(n2)
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        //Because every char is palindrome
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            //For odd, a char is centre and palindrome expands around it
            String odd = expandFromCenter(s, i, i);

            //For even, 2 chars are centre and palindrome expands around it
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }

    private static String expandFromCenter(String s, int left, int right) {
        //Check if l & r is within string, then check is char at l & r are equal
        //If true expand in both the directions
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        //l+1 would be inclusive, r would be exclusive
        return s.substring(left + 1, right);
    }

    //Brute force solution with TLE
    public static String longestPalindromeTLE(String s) {
        int maxLen = 0;
        String ans = "";
        int n = s.length();
        if(n == 1) return s;
        for(int i =0; i<n-1;i++){

            for(int j = i+1; j<n+1; j++){
                String tempString = s.substring(i,j);
                StringBuilder temp = new StringBuilder(s.substring(i,j));

                if(((temp.reverse()).toString()).equals(tempString)){

                    if(temp.length() > maxLen){
                        ans = temp.toString();
                        maxLen = temp.length();

                    }
                }
            }
        }

        return ans;
    }
}
