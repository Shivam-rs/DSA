package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SOLUTION
//@link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class Nforest {

    public static void nForest(int n) {

        // For loop 'row' in range 0 to N-1.
        for(int row = 0; row < n; row++)
        {
            // For loop 'col' in range 0 to N-1.
            for(int col = 0; col < n; col++)
            {
                // Print a '*'.
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
