package strvr.sorting.sorting2;
//@Link -  https://leetcode.com/problems/h-index/description/

public class HIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,6,1,5};
        System.out.println(hIndex(arr));
    }
    public static int hIndex(int[] citations) {

        int n = citations.length;

        //Since H-Index can be maximum of number of paper's published
        int[] freq = new int[n+1];

        //Putting number of citations into array, this will help me identify how many papers have at least this many citations
        for (int citation : citations) {
            if (citation > n) {
                freq[n]++;
            } else {
                freq[citation]++;
            }
        }

        // Over here I am checking how many papers have at least i citations. If found return true.
        int count = 0;
        for(int i = n; i>=0; i--){
            count += freq[i];

            if(count >= i) return i;
        }

        return 0;
    }
}
