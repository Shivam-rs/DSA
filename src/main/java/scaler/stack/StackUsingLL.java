package scaler.stack;

import scaler.linkedlist.ListNode;

public class StackUsingLL {
  ListNode head;
  int size;

  public StackUsingLL(){
    head = null;
    size = 0;
  }

  public void push(int data){
    ListNode temp = new ListNode(data);
    temp.next = head;
    head = temp;
    size++;
  }

  public void pop(){
    if(size == 0) return;
    head = head.next;
    size--;
  }

  public int peek(){
    if(head == null) return -1;
    return head.val;
  }

  public boolean isEmpty(){
    if(size == 0) return true;
    return false;
  }
}
