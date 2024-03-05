package scaler.hashing;

import java.util.HashMap;

public class CountSubArraySumK {

    public static void main(String[] args) {
        int[] arr = new int[]{19,-10,-13,10,-13,6,7,2,18,-19,-4};
        int k = 19;
        System.out.println(solve(arr,k));
    }
    public static int solve(int[] A, int B) {
        int pf = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int i = 0;
        for(int a: A){
            pf += a;
            System.out.println(pf + " i: " + i);
            int other = pf-B;

            if(map.containsKey(other)){
                System.out.println("pf: "+pf+ " other:" + other);
                ans += map.get(other);
            }

            map.put(pf, map.getOrDefault(pf,0)+1);
            i++;
        }

        return ans;
    }
}
