package testing;

import java.sql.Array;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class test {
    static void fun(int[] a){
        a[0] = 1;
    }
    public static void main(String[] args) {
//        int[] A = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
//        int n = A.length;
//        int[] pfMax = new int[n];
//        int max = A[0];
//        pfMax[0] = A[0];
//        for(int i = 1; i<n; i++){
//            // if(A[i] > max){
//            //     pfMax[i] = A[i];
//            //     max = A[i];
//            // }else{
//            //   pfMax[i] = pfMax[i-1];
//            // }
//            pfMax[i] = Math.max(pfMax[i-1], A[i]);
//        }
        String s = "";
        s += "sss";
        System.out.println(s);
        System.out.println((long)Math.pow(2,32));
        System.out.println((1L <<32));

        ArrayList<int[]> temp = new ArrayList<>();
        temp.add( new int[]{0,1});
        int[] arr = new int[]{2, 3, 4, 5};
        for(int a : arr){
            a = a%2;
        }
        System.out.println(Arrays.toString(arr));
        temp.add(arr.clone());

        System.out.println(temp.contains(arr));

/*
        int[] sfMax = new int[n];
        System.out.println(sfMax[0]);
        max = A[n-1];
        sfMax[n-1] = A[n-1];
        for(int i = n-2; i>=0; i--){
            // if(A[i] > max){
            //     sfMax[i] = A[i];
            //     max = A[i];
            // }else{
            //   pfMax[i] = pfMax[i+1] ;
            // }
            sfMax[i] = Math.max(pfMax[i+1], A[i]);
        }
        System.out.println(Arrays.toString(pfMax));
        System.out.println(Arrays.toString(sfMax));
        int aaaaaa;
        aaaaaa =1;
        System.out.println(aaaaaa);
        /*System.out.println(sumFactor(10));* /
        char[] ch = new char[5];
        ch[0] = 'a';
        System.out.println(new String(ch));
        int a = 10;
        int b = 5;
        System.out.println(a|1);
        double c = (double)(1)/2;
        System.out.println("c: " +c);
        int d = (int)Math.ceil(c);

        System.out.println("d: " +d);

        int[] sh = new int[]{3};
        fun(sh);
        System.out.println("LOL " + sh[0]);
        String s = "11";
        s += 1;
        System.out.println(s + 1);
        char[] aa = new char[5];
        aa = s.toCharArray();

        System.out.println(Arrays.toString(aa));
*/
/*int[][] ans = new int[2][2];
        ans[0] = new int[]{1,2};
        //ans[0][1] = 2;

        System.out.println(ans.length);*/

        /*double a = 2.4444;


        DecimalFormat f = new DecimalFormat("##.##");
        //double b = Double.parseDouble(f.format(a)) ;
        double b = Math.ceil(a);

        System.out.print(b-3.0);*/

        /*String s = "maam";
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(-3);
        set.add(null);
        set.add(5);
        set.add(2);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5));
        int[] a = {9, 4, 0, 6, 0, 0, 5};
        System.out.println(set.add(2));*/


      /*  for(int val : HS2){
            if(!(HS1.add(val))){
                System.out.println(val);
            }
        }*/

    /*        int[][] ans = new int[3][3];
            int[] temp = new int[]{1,2};
            ans[1] = temp;
            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }*/
    }

//    public static int sumFactor(int A) {
//        int sum = 1;
//        int i = 0;
//        for(i = 2; i*i<A; i++){
//            if(A%i == 0) {
//                sum += (i + A/i);
//            }
//        }
//        Integer.bitCount(10);
//        if (i*i == A) sum += i;
//        if(A == 1) sum = 1;
//        return sum;
//    }

    /*public static String solve(String A) {
        int len = A.length();
        String ans = "";
        for(int i = 0; i<len; i++){
            int a = A.charAt(i) - 'a' + 1;
            System.out.println(a);
            ans +=  A.charAt(i);
            ans += a;
        }

        return ans;
    }*/
    /*public static boolean isPalin(String s) {
        // complete the function template
        int len = s.length();
        //boolean ans = true;
        for(int i = 0; i<len/2; i++){
            int b =0;
            char c ='a';
            int a = s.charAt(i);
            if(a<97){
                b = a +32;
                c = (char)b;
            }else{
                b = a-32;
                c = (char)b;
            }
            System.out.println(s.charAt(i) +" "+ c);
            //System.out.println(s.charAt(len-i-1) != c);
            if(
                    (s.charAt(i) != s.charAt(len-i-1)) &&
                            (c != s.charAt(len-i-1))
            ) return false;
        }

        return true;
    }*/
}
