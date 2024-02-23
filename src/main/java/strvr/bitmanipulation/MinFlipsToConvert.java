package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/

public class MinFlipsToConvert {
    public static void main(String[] args) {
        int start = 10, goal = 7;
        System.out.println(minBitFlips(start,goal));
    }

    //Approach is to compare every bit of start and goal, if they are not equal then I need to count it as one flip.
    public static int minBitFlips(int start, int goal) {
        int count = 0;
        while(start != 0 || goal != 0){
            if( (start&1) != (goal&1) ){
                count++;
            }
            start = start >>1;
            goal = goal >>1;
        }
        return count;
    }
}
