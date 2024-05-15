package scaler.linkedlist;

public class MergeSortedList {

  public static void main(String[] args) {
    int[] val = new int[]{1,2,4} ;
    ListNode list1 = new ListNode(val[0]);
    ListNode temp = list1;

    for(int i = 1; i<val.length; i++){
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }

    val = new int[]{1,3,4} ;
    ListNode list2 = new ListNode(val[0]);
    temp = list2;

    for(int i = 1; i<val.length; i++){
      temp.next = new ListNode(val[i]);
      temp = temp.next;
    }

    System.out.println("Before");
    temp = list1;
    System.out.print("List1: ");
    while(temp != null){
      System.out.print(temp.val + " ");
      temp = temp.next;
    }

    temp = list2;
    System.out.print("\nList2: ");
    while(temp != null){
      System.out.print(temp.val + " ");
      temp = temp.next;
    }

    System.out.println("\n\nAfter");

    temp = mergeTwoLists(list1 , list2);
    while(temp != null){
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
  }

  public static ListNode mergeTwoLists(ListNode A, ListNode B) {
    if (A == null) return B;
    if (B == null) return A;

    ListNode head, tail;

    if (A.val < B.val) {
      head = A;
      tail = A;
      A = A.next;
    } else {
      head = B;
      tail = B;
      B = B.next;
    }

    while (A != null && B != null) {
      if (A.val < B.val) {
        tail.next = A;
        tail = A;
        A = A.next;
      } else {
        tail.next = B;
        tail = B;
        B = B.next;
      }
    }

    if (A != null) {
      tail.next = A;
    }

    if (B != null) {
      tail.next = B;
    }

    return head;
  }
}
