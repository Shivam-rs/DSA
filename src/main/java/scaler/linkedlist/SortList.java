package scaler.linkedlist;

public class SortList {
  public static void main(String[] args) {
    int[] val = new int[]{ 2, 1, 2, 1, 2, 2, 1, 3, 2, 2};
    ListNode head = new ListNode(val[0]);
    ListNode temp = head;

    for (int i = 1; i < val.length; i++) {
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }
    temp = head;
    System.out.println("before:");
    while(temp != null){
      System.out.print(temp.val + " ");
      temp = temp.next;
    }

    System.out.println("\nAfter: ");

    temp = sortList(head);
    while(temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
  }

  public static ListNode sortList(ListNode A) {
    if(A == null || A.next == null) return A;

    ListNode mid = findMid(A);
    ListNode B = mid.next;
    mid.next = null;

    A = sortList(A);
    B = sortList(B);

    return merge(A, B);
  }

  public static ListNode findMid(ListNode h){
    ListNode s = h, f = h;

    while(f.next != null && f.next.next != null){
      s = s.next;
      f = f.next.next;
    }

    return s;
  }

  public static ListNode merge(ListNode h1, ListNode h2){
    if(h1 == null) return h2;
    if(h2 == null) return h1;

    ListNode ans, t;

    if(h1.val < h2.val){
      ans = h1;
      t = h1;
      h1 = h1.next;
    }else{
      ans = h2;
      t = h2;
      h2 = h2.next;
    }

    while(h1 != null && h2 != null){
      if(h1.val < h2.val){
        t.next = h1;
        t = h1;
        h1 = h1.next;
      }else{
        t.next = h2;
        t = h2;
        h2 = h2.next;
      }
    }

    if(h1 != null){
      t.next = h1;
    }

    if(h2 != null){
      t.next = h2;
    }

    return ans;
  }
}
