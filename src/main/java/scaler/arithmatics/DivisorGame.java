package scaler.arithmatics;

public class DivisorGame {

    public static void main(String[] args) {
        int A = 864788491, B = 9182, C = 5504;
        System.out.println(solve(A,B,C));
        System.out.println(solve(47153,4754,6150));
    }

    public static int solve(int A, int B, int C) {
        int g = gcd(B,C);
        //int count = 0;

        long LCM = ((long)B*C)/g;
        return (int)(A/LCM);
        /*System.out.println("g: " + g);
        if(g ==1){
            count = A/(B*C);
        }else{
            int max = Math.max(B,C);
            int temp = max;
            int min = Math.min(B,C);
            while(max<=A){
                if(max%min == 0){
                    //System.out.println(max);
                    count++;
                }

                max += temp;
            }
        }

        return count;*/
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}
