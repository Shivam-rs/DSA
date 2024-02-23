package strvr.string.basic;
//@Link - https://leetcode.com/problems/rotate-string/description/
public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

        System.out.println(rotateString(s,goal));
    }

    public static boolean rotateString(String s, String goal) {

        int n1 = s.length();
        int n2 = goal.length();

        // Step1:
        // if they are unequal then, start cannot be converted to goal
        if(n1 != n2){
            return false;
        }

        StringBuilder str = new StringBuilder(goal);

        // Step2:
        // repeat the goal string.
        str=str.append(str);

        // Step3 and Step4:
        // if start string is present in it then return true.
        // otherwise return false

        return (str.indexOf(s)!=-1);

        /*
        The return statement can be expanded as:
                if(str.indexOf(s)!=-1)
                {
                     return true;
                }
                else
                {
                     return false;
                }
        */
    }
}
