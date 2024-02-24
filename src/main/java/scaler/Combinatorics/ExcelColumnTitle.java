package scaler.Combinatorics;

public class ExcelColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(78));
    }

    //Like how we convert decimal to binary we have to convert this number to base 26
    //Important point to note is to make 0 based indexing we subtract 1 before performing modulo
    public static String convertToTitle(int A) {
        String ans = "";
        while(A > 0){
            ans = (char)((A-1)%26 + 'A') + ans;

            A = (A-1)/26;
        }
        return ans;
    }
}
