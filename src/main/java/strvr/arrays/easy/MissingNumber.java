package strvr.arrays.easy;

//@link - https://leetcode.com/problems/missing-number/
//@link - https://takeuforward.org/arrays/find-the-missing-number-in-an-array/
public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1, 3,4,5};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int XOR1 = 0, XOR2 = 0;

        for(int i = 0; i<n; i++){
            XOR1 = XOR1 ^ nums[i];
            XOR2 = XOR2 ^ (i+1);
        }

        return XOR1 ^ XOR2;
    }
}
