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
    
    public void recursion (List<Integer> list, TreeNode root){
        if(root ==null) return;
        
        recursion(list, root.left);
        
        list.add(root.val);
        
        recursion(list, root.right);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
 
        ArrayList <Integer> list = new ArrayList <>();
       
        recursion(list, root);
         
        return list;
        
    }
}

 