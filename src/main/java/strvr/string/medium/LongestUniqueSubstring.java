package strvr.string.medium;

//@Link - https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Reference : https://takeuforward.org/data-structure/length-of-longest-substring-without-any-repeating-character/
// This was solved suing sliding window by striver but better solution is present

public class LongestUniqueSubstring {
  public static void main(String[] args) {
    String s = "abcaabcdba";
    System.out.println(lengthOfLongestSubstring(s));
  }

  public static int lengthOfLongestSubstring(String s) {
    int[] index = new int[128];
    int maxLength = 0;
    int start = 0;

    for (int end = 0; end < s.length(); end++) {
      char c = s.charAt(end);
      start = Math.max(start, index[c]); //If this char was seen previously then update start
      maxLength = Math.max(maxLength, end - start + 1);
      index[c] = end + 1; //If next time this char is seen just move start to 1 pointer ahead
    }

    return maxLength;
  }
}
