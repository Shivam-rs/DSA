package strvr.string.basic;

//@Link - https://leetcode.com/problems/remove-outermost-parentheses/description/

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    //Open parentheses will be added to ans only when at least one open parentheses is previously identified
    //Close parentheses will not be added if its last of the set

    //Above 2 conditions would make sure that we are not including outer parenthesis
    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(count != 0){
                    ans.append(c);
                }
                count++;
            }else{
                if(count != 1){
                    ans.append(c);
                }
                count--;
            }
        }

        return ans.toString();
    }
}
