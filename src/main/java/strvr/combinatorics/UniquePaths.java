package strvr.combinatorics;

//Question : https://leetcode.com/problems/unique-paths/
//Refer : https://takeuforward.org/data-structure/grid-unique-paths-count-paths-from-left-top-to-the-right-bottom-of-a-matrix/

public class UniquePaths {
  public static void main(String[] args) {
    System.out.println(uniquePaths(3,7));
  }

  /*
    Robot can at max move m-1 right and n-1 down
    So we have m - 1 + n -1 place to fill and if we choose either right or down movement then we are good.
    Check how to calculate nCr. It is a nice way.
  */
  public static int uniquePaths(int m, int n) {
    int N = m + n - 2;
    int R = Math.min(m,n) -1;

    //long res = 1;
    long ans = 1;
    for(int i = 1; i<=R; i++){
      //this will compute rhs then multiple lhs which will give wrong ans because of rounding.
      //res *= (N-R+i)/i;
      ans = ans * (N-R+i)/i;
      //System.out.println("res: " + res + " ans: " + ans);
    }

    return (int)ans;
  }
}
