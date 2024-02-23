package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/ninja-and-the-number-pattern-i_6581959?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class NoFilledSqr {
    public static void getNumberPattern(int n) {
        // Write your code here

        for(int i = 0; i<2*n -1; i++){
            for(int j = 0; j<2*n -1; j++){
                int top = i;
                int lft = j;
                int rgt = 2*n -2 -j;
                int btm = 2*n -2  - i;
                int a =n - (Math.min( Math.min(top,btm), Math.min(rgt,lft) ));
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
