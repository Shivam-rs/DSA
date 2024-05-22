package scaler.stack;

import java.util.Stack;

//Contri of each element as min and max
//Use stack to get smaller and greater on left and right
public class SumMinMaxDiff {
  public static void main(String[] args) {
    System.out.println(sum(new int[]{4,-2,-3,4,1}));
  }

  private static int sum(int[] input){
    int m = 1000000007;

    int[] ngli = nearestGreaterLeft(input);
    int[] ngri = nearestGreaterRight(input);
    int[] nsli = nearestSmallerLeft(input);
    int[] nsri = nearestSmallerRight(input);

    long ans =  0;
    for(int i = 0; i<input.length; i++){
                        //Start           End
      long max = ((long)(i - ngli[i])) * (ngri[i] - i);
      long min = ((long)(i - nsli[i])) * (nsri[i] - i);
      ans +=  (max - min) * input[i];
    }

    return (int)(ans%m);
  }

  private static int[] nearestGreaterLeft(int[] input){
    Stack<Integer> st = new Stack<>();
    int n = input.length;
    int[] ngl = new int[n];

    for(int i = 0; i<n; i++){

      while(!st.isEmpty() && input[i] >= input[st.peek()]){
        st.pop();
      }

      if(st.isEmpty()){
        ngl[i] = -1;
        st.push(i);
        continue;
      }

      ngl[i] = st.peek();
      st.push(i);

    }
    return ngl;
  }

  private static int[] nearestGreaterRight(int[] input){
    Stack<Integer> st = new Stack<>();
    int n = input.length;
    int[] ngr = new int[n];

    for(int i = n-1; i>=0; i--){

      while(!st.isEmpty() && input[i] > input[st.peek()]){
        st.pop();
      }

      if(st.isEmpty()){
        ngr[i] = n;
        st.push(i);
        continue;
      }

      ngr[i] = st.peek();
      st.push(i);

    }
    return ngr;
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

      while(!st.isEmpty() && input[i] < input[st.peek()]){
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
