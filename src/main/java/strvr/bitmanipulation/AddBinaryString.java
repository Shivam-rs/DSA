package strvr.bitmanipulation;

//@Link - https://leetcode.com/problems/add-binary/description/

public class AddBinaryString {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int digit = 0;
        int carry = 0;
        int n = a.length() -1, m = b.length() -1;
        while(n >=0  && m >= 0){
            int d1 = a.charAt(n) - '0';
            int d2 = b.charAt(m) - '0';
            digit = (d1+d2+carry)%2;
            carry = (d1+d2+carry)/2;

            ans.append(digit);
            n--;
            m--;
        }

        while(n >=0){
            int d1 = a.charAt(n) - '0';
            digit = (d1+carry)%2;
            carry = (d1+carry)/2;

            ans.append(digit);
            n--;
        }

        while(m >= 0){
            int d2 = b.charAt(m) - '0';
            digit = (d2+carry)%2;
            carry = (d2+carry)/2;

            ans.append(digit);
            m--;
        }

        if(carry == 1){
            ans.append(carry);
        }

        return (ans.reverse()).toString();

    }
}
