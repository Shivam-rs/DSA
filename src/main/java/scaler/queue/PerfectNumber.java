package scaler.queue;

import java.util.PriorityQueue;
import java.util.Queue;


public class PerfectNumber {
  public static void main(String[] args) {
    System.out.println(perfectNumber(4));
  }

  private static String perfectNumber(int n){
    if(n <= 2) return String.valueOf(n);
    Queue<String> q = new PriorityQueue<>();
    int cnt = 0;
    StringBuilder ans = new StringBuilder();
    q.offer("1");
    q.offer("2");

    while(true){
      String temp = q.poll();

      q.offer(temp + "1");
      if(++cnt == n){
        ans.append(temp).append('1');
        break;
      }

      q.offer(temp + "2");
      if(++cnt == n){
        ans.append(temp).append('2');
        break;
      }
    }

    StringBuilder ans2 = new StringBuilder(ans);
    ans.append(ans2.reverse());

    return ans.toString();

  }
}
