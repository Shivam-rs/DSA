package scaler.linkedlist;

public class PartitionList {
  public static void main(String[] args) {
    int[] val = new int[]{1,4,3,2,5,2};
    ListNode head = new ListNode(val[0]);
    ListNode temp = head;

    for (int i = 1; i < val.length; i++) {
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }

    temp = partition(head, 3);

    while(temp != null){
      System.out.println(temp.val);
      temp = temp.next;
    }


  }

  public static ListNode partition(ListNode head, int x) {
    if(x<-100 || x>100 || head == null) return head;
    ListNode temp = new ListNode(-101);
    ListNode ans = temp;

    ListNode prev = null;
    ListNode curr = head;

    while(curr != null && curr.val >= x){
      prev = curr;
      curr = curr.next;
    }

    if(curr != head){
      prev.next = null;
      temp.next = head;
      temp = prev;
      if(curr == null) return ans.next;
      head = curr;
    }

    prev = curr;
    curr = curr.next;

    while(curr != null){
      ListNode next = curr.next;

      if(curr.val >= x){
        prev.next = next;
        curr.next = null;
        temp.next = curr;
        temp = curr;
        curr = next;
      }else{
        prev = curr;
        curr = next;
      }
    }

    prev.next = ans.next;
    return head;
  }
}
