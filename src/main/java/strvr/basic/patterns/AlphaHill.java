package strvr.basic.patterns;
//@Link - https://www.codingninjas.com/studio/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//@Link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class AlphaHill {
    public static void alphaHill(int n) {
        for(int i = 1; i<=n; i++){

            //This loop prints white spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            char a = 'A';

            //This loop increments a till k is less than k and then decrements its.
            //i.e. for every row a will increase until K  row number and then decrease until it reaches A
            for(int k = 1; k<=(2*i - 1) ; k++){

                System.out.print(a + " ");
                //if(k< ((2*i + 1)/2))
                if(k< i){
                    a++ ;
                }else{
                    a--;
                }
            }
            System.out.println();
        }
    }
}
