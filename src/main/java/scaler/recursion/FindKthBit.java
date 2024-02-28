package scaler.recursion;

//@Link - https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/

public class FindKthBit {
    public static void main(String[] args) {
        System.out.println(findKthBit(3,5));
    }

    //Optimal Observation
    //Every row has 2^n -1 column's and following are some key observations we can see
    //Until mid -> same as above
    //At mid+1 -> Always 1
    //Afterward -> complement of 1st half

    public static char findKthBit(int n, int k) {
        if(n ==1) return '0';

        int rowLength = (1<<n) - 1;
        int mid = rowLength >> 1;

        if(k <= mid){
            return findKthBit(n-1, k);
        }else if(k == mid+1){
            return '1';
        }else{
            k = rowLength - k +1;
            char ans = findKthBit(n-1, k);
            return ans == '0'? '1' : '0';
        }


        //return (nthRow(n)).charAt(k-1);
    }

    //Brute force - Recursion
    /*
    public static char findKthBit(int n, int k) {
        return (nthRow(n)).charAt(k-1);
    }

    public static String nthRow(int n){
        if(n == 1){
            return "0";
        }
        String temp = nthRow(n-1);
        return  temp + "1" + reverse(invert(temp));

    }

    public static String invert(String s){
        System.out.println(s);
        int n = s.length();
        StringBuilder inv = new StringBuilder();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '1'){
                inv.append('0');
            }else{
                inv.append('1');
            }
        }
        System.out.println(inv);
        return inv.toString();
    }

    public static String reverse(String s){
        StringBuilder rev = new StringBuilder(s);

        return rev.reverse().toString();
    }

    */
}
