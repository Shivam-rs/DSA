package scaler.arithmatics;
//@Link - https://leetcode.com/problems/prime-arrangements/description/

public class PrimeArrangements {
    static int m = 1000000007;
    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(100));
    }

    public static int numPrimeArrangements(int n) {
        boolean[] temp = new boolean[n+1];

        for(int i = 2; i*i<=n; i++){
            if(!temp[i]){
                for(int j = i*i ; j<=n; j+=i ){
                    temp[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<temp.length; i++){
            if(!temp[i]) count++;
        }

        return (int)(fact(n-count)%m * fact(count)%m)%m;
    }

    public static long fact(int a){
        if(a == 0) return 1;

        return (a * fact(a-1)%m)%m ;
    }
}
