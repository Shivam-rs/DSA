package strvr.arrays.easy;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println(isSorted(n, arr));
    }

    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i = 0; i<n-1; i++){
            if(a[i]>a[i+1]){
                return 0;
            }
        }
        return 1;
    }


}
