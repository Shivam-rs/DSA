package DailyChallenge;

import java.sql.SQLOutput;

public class SumOfSquareNumbers_663 {
  public static void main(String[] args) {
    System.out.println(judgeSquareSum(5));
  }

  // 1st : range of a and b would be 0 to sqrt(c)
  // 2nd : it would be like 2 sum problem because given range is already sorted
  public static boolean judgeSquareSum(int c) {
    long start = 0;
    long end = (long)Math.sqrt(c);

    while(start <= end){
      long sum = start*start + end*end;

      if(sum == c) return true;
      else if(sum > c) end--;
      else start++;
    }

    return false;
  }
}
