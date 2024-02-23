package strvr.basic.patterns;

//@link - https://www.codingninjas.com/studio/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class Seeding {
    public static void seeding(int n) {
        // Write your code here
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
