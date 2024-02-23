package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class IncreasingLetterTriangle {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i =0; i<n; i++){
            for(char j = 'A'; j<='A'+i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
