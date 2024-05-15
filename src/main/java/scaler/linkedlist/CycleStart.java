package scaler.linkedlist;

public class CycleStart {
  public static void main(String[] args) {
    int[] val = new int[]{1, 2, 3, 4, 5, 7} ;
    //val = new int[]{0};
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

    ListNode ans = detectCycle(head);
    if(ans == null) System.out.println("No Cycle");
    else System.out.println(ans.val);
  }

  public static ListNode detectCycle(ListNode head) {
    ListNode f = head;
    ListNode s = head;

    while(f != null && f.next != null){
      s = s.next;
      f = f.next.next;

      if(s == f) break;
    }
    if(f == null || f.next == null) return null;

    s = head;

    while(s != f){
      s = s.next;
      f = f.next;
    }

    return f;
  }
}
