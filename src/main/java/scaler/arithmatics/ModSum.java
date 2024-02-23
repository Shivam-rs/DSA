package scaler.arithmatics;

import java.util.HashMap;
//Logic is to creat a frequency map since range of value of elements is 1 to 1000
//Now for each value of i in 1 to 1000, perform modulo with all the value in 1 to 1000
//To improve runtime skip i and j whose freq is 0
public class ModSum {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{794,924,452,548,78,475,836,924,426,421,548,115,480,926,519,45,464,116,356,111,79,732,309,817,880,12,119,207,433,1,947,202,95,90,468,620,996,692,178,700,311,848,742,782,933,586,7,671,872,235,92,383,637,952,507,360,705,684,618,303,334,876,500,104,491,866,966,863,498,581,554,244,223,679,892,166,877,246,699,595,794,567,282,6,862,528,936,19,64,796,212,24,714,725,749,620,862,37,90,876};
        //arr = new int[]{1, 2, 3};
        System.out.println(modSum(arr));
    }
    public static int modSum(int[] A) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int k : A) {
            freq.put(k, freq.getOrDefault(k, 0) + 1);
        }

        int ans = 0;
        int m = 1000000007;

        for(int i = 1; i<1001; i++){
            int freqAtI = freq.getOrDefault(i,0);
            int sumAtI = 0;
            if(freqAtI != 0){
                //System.out.println("i : "+ i);
                //for (int k : A) {
                //    sumAtI += ((i % k));
                    //System.out.println(sumAtI);
                //}
                for(int j = 1; j<1001 ; j++){
                    int freqAtJ = freq.getOrDefault(j,0);
                    if(freqAtJ != 0) {
                        sumAtI += (i % j) * freqAtJ;
                    }
                }
                ans += (freqAtI *sumAtI);
            }

        }

        return (int)(ans%m);
    }
}
