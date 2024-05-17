package scaler.stack;

import java.util.Stack;

public class DoubleCharRemoved {
  public static void main(String[] args) {
    System.out.println(removeDblChr("abccbc"));
  }

  public static String removeDblChr(String str){
    Stack<Character> st = new Stack<>();
    int n = str.length();

    st.push(str.charAt(n-1));

    for(int i = n-2; i>=0; i--){
      if(str.charAt(i) == st.peek()){
        st.pop();
      }else{
        st.push(str.charAt(i));
      }
    }
    StringBuilder ans = new StringBuilder();

    while(!st.isEmpty()){
      ans.append(st.pop());
    }

    return ans.toString();
  }
}
