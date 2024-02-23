package strvr.string.medium;

//@link - https://leetcode.com/problems/string-to-integer-atoi/description/

public class StringToInteger {
    public static void main(String[] args) {
        String s = "+-12";

        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        //This would remove leading white spaces
        s = s.trim();

        long ans = 0;
        char[] ch =  s.toCharArray();
        int n = s.length();
        if(n == 0) return 0;
        int set = 1;

        //This will check if number is positive or negative
        //If number has 2 symbols at the start then we have to return 0
        int  i =0;
        if(ch[0] == '+') {
            //set = -1;
            if(1 < n && ch[1] == '-') return 0;
            i++;

        }else if(ch[0] == '-') {
            set = -1;
            if(1 < n && ch[1] == '+') return 0;
            i++;
        }

        for(; i<n; i++){
            //Since we have to only consider integer part
            if(ch[i] == '.') return set*(int)ans;

            //Keep adding digits to ans and if ans > max value then  depending on +/- we can return value
            if(Character.isDigit(ch[i])){
                int a = (int)ch[i] - 48;
                ans = 10*ans + a;
                if(ans > Integer.MAX_VALUE){
                    if(set == -1){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
            //If any non-digit comes in between then we simply need to break from the loop
            }else {
                break;
            }
        }

        return set*(int)ans;
    }
}
