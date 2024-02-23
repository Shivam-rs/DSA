package strvr.binarysearch.arrays1d;

public class UpperAndLowerBound {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 9, 10, 10, 15, 19};
        int n = arr.length, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);

        ind = upperBound(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }
    //1st element that is greater than the target element i.e. arr[indx] > x
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){

            int mid =  (low + high)/2;

            if(arr[mid] > x){
                high = mid -1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }


    //Smallest index at which value is greater than or equal to the target i.e. arr[index] >= x
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here

        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){

            int mid =  (low + high)/2;

            if(arr[mid] >= x){
                high = mid -1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
