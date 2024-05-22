package scaler.queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInWindow {
  public static void main(String[] args) {
    //int[] ans = maxInWindiow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    int[] ans = maxInWindiow(new int[]{1, 2, 3, 4, 2, 7, 1, 3, 6}, 6);
    for(int a : ans){
      System.out.println(a);
    }
  }

  private static int[] maxInWindiow(int[] arr, int b){
    int n = arr.length;
    int[] ans;
    if(b >=n){
      ans = new int[1];
    }else{
      ans = new int[n - b + 1];
    }
    Deque<Integer> dq = new LinkedList<>();

    for(int i = 0; i<n && i<b; i++){
      while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i]){
        dq.removeLast();
      }
      dq.addLast(i);
    }
    int idx = 0;
    ans[idx++] = arr[dq.getFirst()];

    for(int i = b; i<n; i++){
      if(dq.getFirst() == i -b){
        dq.removeFirst();
      }
      while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i]){
        dq.removeLast();
      }
      dq.addLast(i);
      ans[idx++] = arr[dq.getFirst()];
    }

    return ans;
  }
}
