package strvr.combinatorics;

public class ExcelColNum {
    public static void main(String[] args) {
        String a = "AB";
        System.out.println(titleToNumber(a));
    }

    public static int titleToNumber(String A) {
        int n = A.length();
        System.out.println(n);
        System.out.println(A.charAt(n-2));
        int temp = A.charAt(0) - 'A' + 1;
        System.out.println(temp);
        for(int i = 1; i<n; i++){
            temp = 26*temp + (A.charAt(i) - 'A' + 1);
        }

        return temp;
    }
}
