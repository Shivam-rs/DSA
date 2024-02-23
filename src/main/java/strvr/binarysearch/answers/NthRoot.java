package strvr.binarysearch.answers;
//@Link  - https://www.codingninjas.com/studio/problems/nth-root-of-m_1062679?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link  - https://takeuforward.org/data-structure/nth-root-of-a-number-using-binary-search/
public class NthRoot {

    public static void main(String[] args) {
        int n = 9, m = 1953125;
        int ans = nthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
    public static int nthRoot(int n, int m) {
        //Because Nth root would definitely be between 1 to m
        int low = 1, high = m;

        while(low <= high){
            int mid = low + (high - low)/2;
            //Passing for calculating mid^n.
            //Since we are using log(n) complexity for power calculation, passing mid as long so that it can hold larger values
            int midN = power(mid,n,m);

            //If match is found then return mid
            if(midN == 1) return mid;

            //This means mid is on left of ans, and we need to increase the value
            if( midN == 0){
                low = mid +1;
            }else{ //Mid is on right of ans, and we need to decrease the value
                high = mid -1;
            }
        }
        //No integer value found, return -1
        return -1;
    }

    public static int power(long num, int power, int target){
        long ans = 1;
        while(power>0){
            if(power%2 == 1){
                ans = ans* num;
                if(ans > target) return -1;
                power--;
            }else{
                num *= num; //It will cause issue here if we don't take input as long
                if(num > target) return -1;
                power =  power/2;
            }
        }
        //System.out.println(ans);
        if(ans == target) return 1;
        return 0;
    }
}
