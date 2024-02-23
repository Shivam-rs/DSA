package strvr.basic.math;
//@Link - https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://takeuforward.org/data-structure/count-digits-in-a-number/
public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        int evenCount = 0;
        int digit = 0;
        int og = n;

        do{
            digit = og%10;
            if(digit!=0 && n%digit == 0){
                evenCount++;
            }
            og/=10;
        }while(og!=0);
        return evenCount;
    }
}
