package scaler.linkedlist;

public class NthNodeFromLast {
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

    temp = removeFromLast(head , 2);
    while(temp != null){
      System.out.println(temp.val);
      temp = temp.next;
    }

  }

  public static ListNode removeFromLast(ListNode head, int b){
    if(head == null) return head;

    ListNode temp = head;
    int size = 0;
    while(temp != null){
      size++;
      temp = temp.next;
    }
    temp = head;

    if(b >= size){
      return head.next;
    }else{
      int idx = size -b;
      for(int i = 1; i< idx; i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }

    return head;
  }
}
