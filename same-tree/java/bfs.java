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
  public boolean check(TreeNode p, TreeNode q) {

        if(p==null && q !=null) return false;
        if(p !=null && q ==null) return false;
        if(p.val != q.val) return false;
        return true;

  }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack <TreeNode> stackP = new Stack<>();
        Stack <TreeNode> stackQ = new Stack<>();
        
        if(p ==null && q ==null) return true;
        if(!check(p,q)) return false;
        
        
        
        stackP.add(p);
        stackQ.add(q);
        
        
        while(stackP.size()>0){
            
          p = stackP.pop();
          q = stackQ.pop();

          if(p == null && q == null) continue;

          if(!check(p,q)) return false;

          stackP.add(p.left);
          stackP.add(p.right);


          stackQ.add(q.left);
          stackQ.add(q.right);
                   
            
        }
        
        return true;
        
    }
}