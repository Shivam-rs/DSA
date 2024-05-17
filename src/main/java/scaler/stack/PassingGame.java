package scaler.stack;

import java.util.Stack;

public class PassingGame {
  public static void main(String[] args) {
    int A = 10;
    int B = 23;
    int[] C = new int[]{86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
    System.out.println(passingGame(A, B, C));
  }

  public static int passingGame(int totalPassed, int startID, int[] passRecord){
    Stack<Integer> st = new Stack<>();
    st.push(startID);
    for(int pass : passRecord){
      if(pass == 0){
        st.pop();
      }else{
        st.push(pass);
      }
    }

    return st.peek();
  }
}
