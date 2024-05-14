package scaler.linkedlist;

public class ReverseInGroup {

  public static void main(String[] args) {
    int[] val = new int[]{1, 2, 3, 4, 5} ;
    ListNode head = new ListNode(val[0]);
    ListNode temp = head;

    for(int i = 1; i<val.length; i++){
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }
    temp = head;

    System.out.println("before");
    while(temp != null){
      System.out.println(temp.val);
      temp = temp.next;
    }

    System.out.println("\nAfter");

    temp = reverseKGroup(head , 2);
    while(temp != null){
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  public static ListNode reverseKGroup(ListNode head, int k) {
    if(head == null) return head;

    ListNode temp = head;
    ListNode tail = head;
    int cnt = 0;

    while(tail != null && cnt < k-1){
      tail = tail.next;
      cnt++;
    }

    if(tail == null) return head;

    temp = tail.next;
    tail.next = null;

    tail = reverse(head);
    head.next = reverseKGroup(temp, k);

    return tail;
  }

  private static ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null){
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}
