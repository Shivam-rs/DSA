package scaler.stack;

import java.util.Stack;

public class BalancedParanthesis {
  public static void main(String[] args) {
    System.out.println(isValid("{([])}"));
  }

  public static boolean isValid(String str){
    Stack<Character> st = new Stack<>();

    for(char ch : str.toCharArray()){
      if(ch == '('){
        st.push(')');
      } else if (ch == '{') {
        st.push('}');
      }else if(ch == '['){
        st.push(']');
      }else if(st.isEmpty() || st.pop() != ch){
        return false;
      }
    }

    return true;
  }
}
