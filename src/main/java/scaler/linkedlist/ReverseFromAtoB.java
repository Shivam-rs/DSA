package scaler.linkedlist;

public class ReverseFromAtoB {

  /*
  Logic:
    1) Divide the linked list into 3 parts
    2) reverse the 2nd part
    3) Connect all 3 linked list
   */
  public static void main(String[] args) {

    int[] val = new int[]{1, 2, 3, 4, 5};
    ListNode head = new ListNode(val[0]);
    ListNode temp = head;

    for (int i = 1; i < val.length; i++) {
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }

    temp = reverseBetween(head, 1, 4);

    while(temp != null){
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  public static ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode tail1 = head;
    ListNode start = head;
    for(int i = 0; i<m-1; i++){
      tail1 = start;
      start = start.next;
    }

    ListNode end = start;
    for(int i = 0; i<n-m; i++){
      end = end.next;
    }

    ListNode head2 = end.next;
    end.next = null;

    end = reverse(start);

    tail1.next = end;
    start.next = head2;

    if(m == 1) return end;
    return head;

  }

  public static ListNode reverse(ListNode head){
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null){
      ListNode nxt = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nxt;
    }

    return prev;
  }
}
