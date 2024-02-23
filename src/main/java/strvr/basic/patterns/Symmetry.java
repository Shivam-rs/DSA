package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/symmetry_6581914?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class Symmetry {
    public static void symmetry(int n) {
        // Write your code here
        int star = 0;
        int space = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                star = i;
            } else {
                star = 2 * n - i;
            }

            if (i <= n) {
                space = 2 * (n - i);
            } else {
                space = 2 * (i - n);
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= star; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
