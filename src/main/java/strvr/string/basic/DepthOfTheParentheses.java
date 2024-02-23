package strvr.string.basic;
//@Link - leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
public class DepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println("Depth of s is : " + maxDepth(s));
    }

    public static int maxDepth(String s) {
        int count = 0;
        int depth = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }else if( ch == ')'){
                depth = Math.max(depth, count);
                count--;
            }
        }

        return depth;
    }
}

