package strvr.slidingwindow;

//@Link - https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

public class NoOfSubstrings {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    //We are maintaining an array of size 3 and the moment all elements of array becomes non-zero (meaning we have a,b,c in subarray)
    //Now, we know number of subarrays starting before ith index is "n-i" therefore we add it to count
    //We increment start as long as we have all 3 char (i.e. size is 0)
    public static int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int size=3;
        int start=0;
        int n= s.length();
        int count = 0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);

            freq[ch-'a']++;

            //when we find the first occurrence of a character
            if(freq[ch-'a']==1){
                size--;
            }

            //when the substring start...i is valid
            while(size==0 && start<n){

                count+=n-i;
                freq[s.charAt(start)-'a']--;

                if(freq[s.charAt(start)-'a']==0){
                    size++;
                }

                start++;
            }
        }
        return count;
    }
}
