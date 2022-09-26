# stack

 
Time  | Space
----- | ------
O(n) | O(n)

 
Start with the root, add it to a stack and create a loop to iterate all the element in the tree

```

if(root != null) stack.add(root);
        
while(stack.size()>0){
 // main program
}

```
take out the top item from stack `TreeNode current = stack.pop();` and check whether it has a left.
If it has a left child, put it back into the stack along with the left child. but need to make sure to set `current.left =null` orelse later it will keep iterating left for the same left child. make it null to represent that its visited. 

```
 if(current.left != null){
    TreeNode left = current.left;
    current.left = null;
    stack.add(current);
    stack.add(left);
    continue;
}
```
 if there is no left child current val is good to be added to result. `list.add(current.val); `

 else add the right child to the stack
 
 ```
 if(current.right != null){
    stack.add(current.right);
}
 ```



# recursion

 
Time  | Space
----- | ------
O(n) | O(n)

 
as long as there is a child in the left keep recursively going to the left.
Then print value in current node;
then recursively iterate for right

```

recursion(list, root.left);

list.add(root.val);

recursion(list, root.right);

```
 
 