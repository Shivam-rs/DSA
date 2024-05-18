package scaler.stack;

import java.util.Stack;

public class NearestSmaller {
  public static void main(String[] args) {
    int[] arr = nearestSmaller(new int[]{4, 5, 2, 10, 8});

    for (int a: arr){
      System.out.println(a);
    }
  }

  private static int[] nearestSmaller(int[] input){
    Stack<Integer> st = new Stack<>();
    int n = input.length;
    int[] nsl = new int[n];

    for(int i = 0; i<n; i++){

      while(!st.isEmpty() && input[i] <= st.peek()){
        st.pop();
      }

      if(st.isEmpty()){
        nsl[i] = -1;
        st.push(input[i]);
        continue;
      }

      nsl[i] = st.peek();
      st.push(input[i]);

    }
    return nsl;
  }
}
