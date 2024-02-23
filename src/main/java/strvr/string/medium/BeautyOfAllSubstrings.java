package strvr.string.medium;

//@Link - https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

public class BeautyOfAllSubstrings {
    public static void main(String[] args) {
      String s = "aabcb";
        System.out.println(beautySum(s));
    }


    public static int beautySum(String s) {

        int sum = 0;

        int n = s.length();

        // Iterate through all possible starting indices
        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];

            // Iterate through all possible ending indices
            for (int j = i; j < n; j++) {

                // Update the frequency of the character
                arr[s.charAt(j) - 'a']++;

                //Because substrings of size 1 and 2 would always have beauty as 0
                if(j - i>1){
                    int maxFreq = 0;
                    int minFreq = Integer.MAX_VALUE;

                    // Find the maximum and minimum frequency in the substring
                    for (int f : arr) {
                        if(f != 0){
                            maxFreq = Math.max(maxFreq, f);
                            minFreq = Math.min(minFreq, f);
                        }
                    }

                    // Calculate the beauty of the substring and add it to the sum
                    sum += maxFreq - minFreq;
                }
            }
        }

        return sum;
    }
}
