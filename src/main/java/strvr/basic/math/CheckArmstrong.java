package strvr.basic.math;
//@Link - https://www.codingninjas.com/studio/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/
import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        String b = Integer.toString(a);
        int k = b.length();
        int sum = 0;
        for(int i =0; i<k; i++){
            int z = (int)b.charAt(i) - '0';
            sum += Math.pow(z,k);
        }

        if(sum == a){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
