package strvr.basic.patterns;
//@Link -
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class ReverseStarTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=(i-1); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <=(2*n - 2*i +1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
