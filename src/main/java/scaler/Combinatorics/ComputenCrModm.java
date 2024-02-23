package scaler.Combinatorics;

public class ComputenCrModm {
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println();
    }

    public int solve(int A, int B, int C) {
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


        return (int)((num%C * (long)(Math.pow(dem, C-2) %C)) %C) ;
    }

}
