package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/ninja-and-the-star-pattern-i_6581920?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class SqrStar {

    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i==1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
