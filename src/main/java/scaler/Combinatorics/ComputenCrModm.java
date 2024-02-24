package scaler.Combinatorics;

public class ComputenCrModm {
    public static void main(String[] args) {
        int  A = 41, B= 27, C=143;

        System.out.println(compute(A,B,C));
    }
    public static int compute(int n, int r, int m){
        int[][] ncr = new int[n+1][r+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=Math.min(i,r); j++){
                if((j == 0) || (i == j)) {
                    ncr[i][j] = 1;
                }else{
                    ncr[i][j] = (ncr[i-1][j-1]%m + ncr[i-1][j]%m)%m;
                }
            }
        }

        return ncr[n][r];
    }
   /* This will not work on online compiler, it will give TLE
      Because of redundant work on different branches
    public static int solve(int A, int B, int C) {
        if(B == 0 || (A == B)) return 1;

        return (solve(A-1,B-1,C)%C + solve(A-1,B,C)%C)%C;

    }*/
    /*public static int solve(int A, int B, int C) {
        if(B < A/2) B= A - B;
        long num = 1;
        long oga = A;
        while(A > B){
            num *= A%C;
            A--;
        }

        long dem = 1;
        long temp = oga-B;
        while(temp >0){
            dem *= temp;
            temp--;
        }

        System.out.println(num + " - " + dem);

        long q = pow(dem, C-2, C);
        System.out.println(q);
        return (int)((num%C * (q %C)) %C) ;
    }

     public static long pow(long a, int b, int C){
         if(b == 1) return a;

         long temp = pow(a, b/2,C);

         if(b%2 == 1){
             return (a%C*temp%C*temp%C)%C;
         }else{
             return (temp%C*temp%C)%C;
         }
    }*/

}
