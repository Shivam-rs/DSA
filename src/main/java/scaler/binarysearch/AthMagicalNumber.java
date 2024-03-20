package scaler.binarysearch;

public class AthMagicalNumber {
    public static void main(String[] args) {
        System.out.println(solve(19,11,13));
    }

    public static long calcLCM(int n, int m){
        long temp = ((long)n*m);

        while(n%m!=0){
            int remainder = n%m;
            n=m;
            m=remainder;
        }
        System.out.println(temp/m);
        return (temp/m);
    }

    public static int solve(int A, int B, int C) {
        long lcm = calcLCM(B,C);
        int m = 1000000007;
        long ans = 0;
        long low = Math.min(B,C);
        long high = low * A;

        while(low <= high){
            long mid = low + (high - low)/2;

            long magCount = mid/C + mid/B - mid/lcm;

            if(magCount == A){
                ans = mid;
                System.out.println("possible: "+ ans);
                high = mid -1;
            }else if(magCount > A){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return (int)(ans%m);
    }
}
