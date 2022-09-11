# bfs

 
Time  | Space
----- | ------
O(n) | O(n)

 
BFS into the `p` and `q` to iterate through all child nodes. 

tree does not match only when 
```
if(p==null && q !=null) return false;
if(p !=null && q ==null) return false;
if(p.val != q.val) return false;
```
So add the root to the stack and run a loop to pop and insert the left and right child if check does not fail


# recursion

 
Time  | Space
----- | ------
O(n) | O(n)

We can use recursion. Tree is same only when 
```
if(p ==null && q ==null) return true;
if(p == null || q ==null) return false;
if(p.val != q.val) return false;
```
if child nodes match need to check with the next child node. for left child nodes

`isSameTree(p.left, q.left)` 

and for right child node

 `isSameTree(p.right, q.right);`. 

Overall for to check for both left and right

 `return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);` 


 
 