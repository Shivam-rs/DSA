package scaler.recursion;


/*
-> Write down row's on paper
-> Index column on 0-based indexing
-> You'll observe that all the even index is same as parent & odd invert of parent

=> Using above observation implemented for 1-based indexing
*/
public class KthSymbolInGrammar {

    public static void main(String[] args) {
        System.out.println(kthGrammar(26, 3));
    }
    public static int kthGrammar(int n, int k) {

        if(n == 1 || k == 1) return 0;

        int parent = kthGrammar(n-1,(k+1)/2);

        if(k%2 == 0){
            return 1 - parent;
        }else{
            return  parent;

        }
    }

}
