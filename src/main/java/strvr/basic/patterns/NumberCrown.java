package strvr.basic.patterns;

//@Link - https://www.codingninjas.com/studio/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class NumberCrown {
    public static void main(String[] args) {
        int n = 6;
        int space = 2*(n-1);

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }

            for(int k = 1; k<=space; k++){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
            space -=2;
        }
    }
}
