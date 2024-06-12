package scaler.trees.traversal.recursive;

import scaler.trees.TreeNode;

import java.util.ArrayList;

public class PreOrder {
    
    public int[] preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();

        helper(root, ans);

        int[] res = new int[ans.size()];
        int idx = 0;
        for(int a : ans){
            res[idx++] = a;
        }

        return res;
    }
    
    private void helper(TreeNode root, ArrayList<Integer> ans) {
        if(root == null) return;

        ans.add(root.val);
        helper(root.left, ans);
        helper(root.right, ans);
    }
}
