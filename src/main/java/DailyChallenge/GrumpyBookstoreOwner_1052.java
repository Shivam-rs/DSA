package DailyChallenge;

//Question : https://leetcode.com/problems/grumpy-bookstore-owner/description/

public class GrumpyBookstoreOwner_1052 {
  public static void main(String[] args) {
    System.out.println(maxSatisfied(new int[]{1,0,1,2,1,1,7,5}, new int[]{0,1,0,1,0,1,0,1}, 3));
  }

  public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int n = customers.length;

    int[] unhappyCust = new int[n];
    int ans = 0;

    //If owner is not grumpy then add to ans
    //else store in an array of unhappy customer
    for(int i = 0; i<n; i++){
      if(grumpy[i] == 0){
        ans += customers[i];
      }else{
        unhappyCust[i] = customers[i];
      }
    }

    int temp = 0;
    //1st window of size minutes
    for(int i = 0; i<minutes; i++){
      temp += unhappyCust[i];
    }

    //Finding max window of size minutes where max customers are unhappy
    int maxWindow = temp;
    int end = 0;

    for(int i = minutes; i<n; i++){
      temp -= unhappyCust[end];
      end++;

      temp += unhappyCust[i];
      maxWindow = Math.max(temp, maxWindow);
    }

    //Add already happy customers and maxWindow of unhappy customers
    return ans + maxWindow;
  }

}
