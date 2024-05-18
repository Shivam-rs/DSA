package scaler.stack;

import java.util.Stack;

public class LargestRectange {
  public static void main(String[] args) {
    System.out.println(largestRectangeArea(new int[]{2, 1, 5, 6, 2, 3}));

  }

  private static int largestRectangeArea(int[] input){
    int[] nsli = nearestSmallerLeft(input);
    int[] nsri = nearestSmallerRight(input);

    int n = input.length;
    int ans = 0;
    int area;
    for(int i = 0; i<n; i++){
      int width = nsri[i] - nsli[i] - 1;
      area = input[i] * width;
      ans = Math.max(ans, area);
    }

    return ans;
  }

  private static int[] nearestSmallerLeft(int[] input){
    Stack<Integer> st = new Stack<>();
    int n = input.length;
    int[] nsl = new int[n];

    for(int i = 0; i<n; i++){

      while(!st.isEmpty() && input[i] <= input[st.peek()]){
        st.pop();
      }

      if(st.isEmpty()){
        nsl[i] = -1;
        st.push(i);
        continue;
      }

      nsl[i] = st.peek();
      st.push(i);

    }
    return nsl;
  }

  private static int[] nearestSmallerRight(int[] input){
    Stack<Integer> st = new Stack<>();
    int n = input.length;
    int[] nsr = new int[n];

    for(int i = n-1; i>=0; i--){

      while(!st.isEmpty() && input[i] <= input[st.peek()]){
        st.pop();
      }

      if(st.isEmpty()){
        nsr[i] = n;
        st.push(i);
        continue;
      }

      nsr[i] = st.peek();
      st.push(i);

    }
    return nsr;
  }
}
