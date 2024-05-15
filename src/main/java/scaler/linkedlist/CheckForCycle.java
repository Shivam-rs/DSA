package scaler.linkedlist;

public class CheckForCycle {
  public static void main(String[] args) {
    int[] val = new int[]{1, 2, 3, 4, 5, 7} ;
    ListNode head = new ListNode(val[0]);
    ListNode temp = head;

    for(int i = 1; i<val.length; i++){
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }
    ListNode tail = temp;

    int rand = (int)(Math.random()*10)%val.length;
    temp = head;
    System.out.println(rand);
    while(rand > 0 && rand != val.length -1){
      temp = temp.next;
      rand--;
    }

    if(rand != val.length -1) tail.next = temp;

    System.out.println(hasCycle(head));
  }

  public static boolean hasCycle(ListNode head) {
    ListNode f = head;
    ListNode s = head;

    while(f != null && f.next != null){
      s = s.next;
      f = f.next.next;

      if(s == f) return true;
    }

    return false;
  }
}
