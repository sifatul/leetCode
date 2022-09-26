/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack <TreeNode> stack = new Stack<>();
        ArrayList <Integer> list = new ArrayList <>();
        if(root != null) stack.add(root);
        
        while(stack.size()>0){
            TreeNode current = stack.pop();
            if(current.left != null){
                TreeNode left = current.left;
                current.left = null;
                stack.add(current);
                stack.add(left);
                continue;
            }
             
            list.add(current.val); 
             
            if(current.right != null){
                stack.add(current.right);
            }
        }
        return list;
        
    }
}