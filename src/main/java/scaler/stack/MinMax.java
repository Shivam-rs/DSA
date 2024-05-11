package scaler.stack;

import java.util.Stack;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{994390,986616,976849,979707,950477,968402,992171,937674,933065,960863,980981,937319,951236,959547,991052,991799,992213,941294,978103,997198,960759,988476,963517,980366,921767,979757,977912,983761,981869,947454,930202,999086,973538,999798,996446,944001,974217,951595,942688,975075,970973,970130,897109,927660,862233,997130,986068,954098,978175,889682,988973,996036,969675,985751,977724,881538,988613,924230,906475,915565,986952,975702,994316,964011,986848,983699,949076,989673,981788,929094,988310,926471,994763,999736,980762,973560,996622,934475,998365,966255,998697,998700,911868,983245,996382,996992,953142,994104,987303,853837,960626,904203,998063,977596,977868,996012,946345,949255,988138,996298,954933,965036,886976,998628,990878,953725,916744,985233,919661,970903,986066};
        System.out.println(arr.length);
        System.out.println(solve(arr));

    }

    public static int solve(int[] A) {
        int m = 1000000007;
        int[] NSLI = prevSmaller(A);
        int[] NSRI = nextSmaller(A);
        int[] NGLI = prevGreater(A);
        int[] NGRI = nextGreater(A);
        long ans =  0;
        for(int i = 0; i<A.length; i++){
            long max = 1L * (i - NGLI[i]) * (NGRI[i] - i);
            long min = 1L * (i - NSLI[i]) * (NSRI[i] - i);
            System.out.println("min: " + min + " max: " + max);
            ans +=  (max - min) * A[i];
            System.out.println("ans: " + ans);

        }
        return (int)(ans%m);
//        if(A.length==1) return 0;
//
//        long ans=0; long mod=1L*1000000007;
//
//        int[] ngl=new int[A.length];
//
//        int[] ngr=new int[A.length];
//
//        int[] nsl=new int[A.length];
//
//        int[] nsr=new int[A.length];
//
//        ngl=nglFunc(A); ngr=ngrFunc(A);
//
//        nsl=nslFunc(A); nsr=nsrFunc(A);
//
//
//
//        for(int i=0;i<A.length;i++){
//
//            long max=1L*(i-ngl[i])*(ngr[i]-i);
//
//            long min=1L*(i-nsl[i])*(nsr[i]-i);
//
//            System.out.println("min: " + min + " max: " + max);
//            ans+=(max-min)*A[i];
//            System.out.println("ans: " + ans);
//        }
//
//        return (int)(ans%mod);
    }
//    public static int[] nslFunc(int[] A) {
//
//        Stack<Integer> stack=new Stack<>();
//
//        int ans[]=new int[A.length];
//
//        for(int i=0;i<A.length;i++){
//
//            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){ stack.pop(); }
//
//            if(stack.isEmpty()) ans[i]=-1;
//
//            else ans[i]=stack.peek();
//
//            stack.push(i);
//
//        }
//
//        return ans;
//
//    }
//
//
//
//    public static int[] nsrFunc(int[] A) {
//
//        Stack<Integer> stack=new Stack<>();
//
//        int ans[]=new int[A.length];
//
//        for(int i=A.length-1;i>=0;i--){
//
//            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){ stack.pop(); }
//
//            if(stack.isEmpty()) ans[i]=A.length;
//
//            else ans[i]=stack.peek();
//
//            stack.push(i);
//
//        }
//
//        return ans;
//
//    }
//
//
//
//    public static int[] nglFunc(int[] A) {
//
//        Stack<Integer> stack=new Stack<>();
//
//        int ans[]=new int[A.length];
//
//        for(int i=0;i<A.length;i++){
//
//            while(!stack.isEmpty() && A[stack.peek()]<=A[i]){ stack.pop(); }
//
//            if(stack.isEmpty()) ans[i]=-1;
//
//            else ans[i]=stack.peek();
//
//            stack.push(i);
//
//        }
//
//        return ans;
//
//    }
//
//
//
//    public static int[] ngrFunc(int[] A) {
//
//        Stack<Integer> stack=new Stack<>();
//
//        int ans[]=new int[A.length];
//
//        for(int i=A.length-1;i>=0;i--){
//
//            while(!stack.isEmpty() && A[stack.peek()]<=A[i]){ stack.pop(); }
//
//            if(stack.isEmpty()) ans[i]=A.length;
//
//            else ans[i]=stack.peek();
//
//            stack.push(i);
//
//        }
//
//        return ans;
//
//    }

    public static int[] nextSmaller(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){
            while(!st.empty() && A[st.peek()] >= A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = n;
            }else{
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    public static int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.empty() && A[st.peek()] >= A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }

        return ans;
    }

    public static int[] nextGreater(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){
            while(!st.empty() && A[st.peek()] <= A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = n;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }

        return ans;
    }

    public static int[] prevGreater(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.empty() && A[st.peek()] <= A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }

        return ans;
    }
}
