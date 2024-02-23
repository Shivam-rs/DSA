package strvr.arrays.hard;

import java.util.HashMap;

public class SubArrayXOR {

    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here

        HashMap<Long, Integer> map = new HashMap<>();
        int count = 0;
        long xor = 0;

        //Iterate over the array
        for (int j : a) {
            xor = xor ^ j;


            if (xor == b) {
                count++;
            }

            //Whole subarray's XOR is xor, and we are looking for x such that x^b = xor
            // both side, and we'll get x i.e. our remainder
            long rem = xor ^ b;

            //If rem is there is hashmap then subarray can  found,
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            //
            if (!(map.containsKey(xor))) {
                map.put(xor, 1);
            } else {
                map.put(xor, map.get(xor) + 1);
            }

        }
        return count;
    }
}
