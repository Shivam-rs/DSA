package strvr.basic.patterns;

//@Link - https://www.codingninjas.com/studio/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class RotatedTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
