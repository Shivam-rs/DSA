package scaler.queue;

import java.util.LinkedList;
import java.util.Queue;

public class UniqueLetter {
  public static void main(String[] args) {
    System.out.println(solve("ababdbcdcd"));
  }

  public static String solve(String A) {
    Queue<Character> q = new LinkedList<>();
    int[] frq = new int[26];
    StringBuilder ans = new StringBuilder();

    for(char ch : A.toCharArray()){
      q.offer(ch);
      frq[ch - 'a']++;
      if(frq[q.peek()-'a'] == 1){
        ans.append(q.peek());
      }else{
        while(!q.isEmpty() && frq[q.peek()-'a'] != 1){
          q.poll();
        }

        if(q.isEmpty()){
          ans.append('#');
        }else{
          ans.append(q.peek());
        }
      }
    }

    return ans.toString();
  }
}
