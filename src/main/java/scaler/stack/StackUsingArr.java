package scaler.stack;

public class StackUsingArr {
  private int top;
  private int[] arr;

  public StackUsingArr(int size){
    top = -1;
    arr = new int[size];
  }

  public void push(int data){
    if(top >= arr.length-1){
      System.out.println("stack is full");
    }else {
      top++;
      arr[top] = data;
    }
  }

  public void pop(){
    if(top >-1){
      top--;
    }else{
      System.out.println("stack is empty");
    }
  }

  public int peek(){
    if(top < 0){
      System.out.println("stack is empty");
      return -1;
    }
    return arr[top];
  }

  public boolean isEmpty(){
    if(top < 0) return true;
    return true;
  }
}
