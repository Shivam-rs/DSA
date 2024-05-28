package scaler.trees.traversal;

import scaler.trees.TreeNode;

import java.util.ArrayList;
import java.util.Stack;


public class PreOrder {

  public ArrayList<Integer> preOrder(TreeNode A){
    if(A == null) return null;
    ArrayList<Integer> ans = new ArrayList<>();
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(A));

    while(!st.isEmpty()){
      Pair top = st.peek();

      if(top.task == 1){
        top.task++;
        ans.add(top.node.val);
      } else if (top.task == 2) {
        top.task++;
        if(top.node.left != null) st.push(new Pair(top.node.left));
      } else if (top.task == 3) {
        top.task++;
        if(top.node.right != null) st.push(new Pair(top.node.right));
      }else {
        st.pop();
      }
    }

    return ans;
  }


  class Pair{
    TreeNode node;
    int task;

    public Pair(TreeNode a){
      node = a;
      task = 1;
    }
  }
}
