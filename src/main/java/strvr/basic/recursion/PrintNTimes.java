package strvr.basic.recursion;

public class PrintNTimes {
    public static void main(String[] args) {
        int n = 5;
        print1(n,n);
    }

    static void print(int n){
        if(n>1) {
            System.out.print(n);
            print(n-1);
            System.out.print(n);
        }
        System.out.print("Coding Ninjas ");
        System.out.print(n);
    }

    static void print1(int n, int N){
        //int i =N;
        if(n<1){
            return;
        }
        print1(n-1,N);
        System.out.println(N-n+1);
    }
}
