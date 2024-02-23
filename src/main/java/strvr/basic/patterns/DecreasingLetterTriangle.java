package strvr.basic.patterns;

//@Link - https://www.codingninjas.com/studio/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class DecreasingLetterTriangle {
    public static void alphaTriangle(int n) {

        int b = n-1;
        for(int i = 1; i<=n; i++){
            char a = 'A';
            a+=b;
            for(int j = 1; j<=i; j++){
                System.out.print(a + " ");
                a--;
            }

            System.out.println();
        }
    }
}
