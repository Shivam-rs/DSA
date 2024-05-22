package scaler.queue;

import java.util.Stack;

public class queueUsingStack {
  private Stack<Integer> enq;
  private Stack<Integer> deq;
  int size;

  public queueUsingStack(){
    enq = new Stack<>();
    deq = new Stack<>();
    size = 0;
  }

  public void push(int data){
    enq.push(data);
    size++;
  }

  public int pop(){
    if(deq.isEmpty()){
      while(!enq.isEmpty()){
        deq.push(enq.pop());
      }
    }
    size--;
    return deq.peek();
  }

  public int front(){
    if(!deq.isEmpty()) return deq.peek();
    else{
      while(!enq.isEmpty()){
        deq.push(enq.pop());
      }
    }

    return deq.peek();
  }

  public boolean isEmptyQueue(){
    return size == 0;
  }

}
