package scaler.linkedlist;

public class LongestPalindrome {
  public static void main(String[] args) {
    int[] val = new int[]{ 2, 1, 2, 1, 2, 2, 1, 3, 2, 2};
    ListNode head = new ListNode(val[0]);
    ListNode temp = head;

    for (int i = 1; i < val.length; i++) {
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }
    System.out.println(longestPali(head));
  }

  public static int longestPali(ListNode head){
    int maxLen = 1;
    ListNode prefix = head;
    head = head.next;
    prefix.next = null;
    ListNode curr = head;

    while(curr != null){
      ListNode tempRight = curr;
      ListNode templeft = prefix;
      int countE = 0;
      while(templeft != null && tempRight != null && tempRight.val == templeft.val){
        countE+=2;
        templeft = templeft.next;
        tempRight = tempRight.next;
      }

      int countO = 1;
      tempRight = curr.next;
      templeft = prefix;
      while(templeft != null && tempRight != null && tempRight.val == templeft.val){
        countO+=2;
        templeft = templeft.next;
        tempRight = tempRight.next;
      }

      maxLen = Math.max(maxLen, Math.max(countO,countE));

      head = curr.next;
      curr.next = prefix;
      prefix = curr;
      curr = head;
    }

    return maxLen;
  }
}
