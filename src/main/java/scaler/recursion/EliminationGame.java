package scaler.recursion;


//@Link: https://leetcode.com/problems/elimination-game/

/*
2 Ideas:
-> 1 implemented with loop & recursion (2ms solution, but intuitive)
    - Gap increases by 2 and elements decreases by 2
    - left most element gets updated when round is odd or elements left are odd

-> This solution requires you to look very closely (I won't present this solution in interview even though its 1ms solution)
    - Elements left after elimination would be same if n 2k+1 or 2k
    - Distance of final outcome would be same irrespective where you start from left/right (ans would change, but I am talking about distance)
    - finally you'll need this n and n+1 when divided by 2 would give same int value.
*/
public class EliminationGame {
    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
        System.out.println(eliminator(1,1,9));
        System.out.println(lastRemaining1Line(9));
    }

    public static int lastRemaining(int n) {
        int round = 0, gap = 1, count = n;
        int left = 1;
        while(count > 1){
            round++;

            if((round & 1) == 1 || (count & 1) == 1){
                left += gap;
            }

            count >>= 1;
            gap <<= 1;
        }
        return left;
    }

    public static int eliminator(int left, int gap, int count){
        if(count == 1) return left;

        int round = (int) (Math.log10(gap)/Math.log10(2)) + 1;

        if((round & 1) == 1 || (count & 1) == 1){
            return eliminator(left+gap, (gap<<1), (count>>1));
        }else{
            return eliminator(left, (gap<<1), (count>>1));
        }
    }

    public static int lastRemaining1Line(int n) {
        if(n ==1 ) return 1;
        return 2*(n/2 - lastRemaining(n/2) + 1);
    }
}
