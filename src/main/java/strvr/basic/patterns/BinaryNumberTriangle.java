package strvr.basic.patterns;

//@Link - https://www.codingninjas.com/studio/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class BinaryNumberTriangle {
    public static void nBinaryTriangle(int n) {
        // Write your code here.

        for(int i = 1; i<=n; i++){
            int start = 1;
            if(i%2 == 0)
                start = 0;

            for(int j = 1; j<=i; j++){
                System.out.print(start + " ");
                start = 1 -start;
            }
            System.out.println();
        }
    }
}
