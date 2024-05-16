package scaler.linkedlist;


public class DeepCopyList {
  public RandomListNode copyRandomList(RandomListNode head){
    RandomListNode x = head;
    while(x != null){
      RandomListNode y = new RandomListNode(x.label);
      y.next = x.next;
      x.next = y;
      x = x.next.next;
    }

    x = head;
    while(x != null){
      if(x.random == null){
        x.next.random = null;
      }else{
        x.next.random = x.random.next;
      }

      x = x.next.next;
    }

    RandomListNode h2 = head.next;
    x = head;
    RandomListNode y = h2;

    while(x != null){
      x.next = x.next.next;
      if(y.next !=null){
        y.next = y.next.next;
      }

      x = x.next;
      y = y.next;
    }

    return h2;
  }
}
