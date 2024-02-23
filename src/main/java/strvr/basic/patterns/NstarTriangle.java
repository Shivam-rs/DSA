package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class NstarTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=(2*i +1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
