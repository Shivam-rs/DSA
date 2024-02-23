package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/single-number/description/

public class OddCountElement {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    //Idea is simple, all the elements that present for even number of times will become 0 after XOR,
    //Only the element that is present for odd number of times would be left
    public static int singleNumber(int[] nums) {
        int XOR =0;

        for(int i : nums){
            XOR = XOR^i;
        }
        return XOR;
    }
}
