# linear-check

 
Time  | Space
----- | ------
O(n) | O(1)

no extra space is used.

consider the list like `[1node, 2node, 3nodeDelete, 4nodeNext, 5nodeSeconNext, 6node]`
When deleting a node here for example `3nodeDelete` need to connect `2node` to `4nodeNext` or we can replace the data of node-to-be-deleted with data of node next to it:  `3nodeDelete` with data of `4nodeNext`. 


```
curr.val = curr.next.val;
curr.next = curr.next.next;

```

 
 