package scaler.queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxMinInWindow {
  public static void main(String[] args) {
    System.out.println(solve(new int[]{2, 5, -1, 7, -3, -1, -2}, 4));
  }

  public static int solve(int[] A, int B) {
    Deque<Integer> max = new LinkedList<>();
    Deque<Integer> min = new LinkedList<>();
    long ans = 0;
    int m = 1000* 1000* 1000 + 7;
    for(int i = 0; i<B; i++){
      while(!max.isEmpty() && A[max.getLast()] <= A[i]){
        max.removeLast();
      }
      max.addLast(i);

      while(!min.isEmpty() && A[min.getLast()] >= A[i]){
        min.removeLast();
      }
      min.addLast(i);
    }

    ans = A[max.getFirst()] + A[min.getFirst()];

    for(int i = B; i<A.length; i++){
      if(max.getFirst() <= i - B){
        max.removeFirst();
      }
      while(!max.isEmpty() && A[max.getLast()] <= A[i]){
        max.removeLast();
      }
      max.addLast(i);

      if(min.getFirst() <= i - B){
        min.removeFirst();
      }
      while(!min.isEmpty() && A[min.getLast()] >= A[i]){
        min.removeLast();
      }
      min.addLast(i);

      ans = ans + A[max.getFirst()] + A[min.getFirst()];
    }


    return (int)((ans%m +m)%m); //to handel negative number
  }
}
