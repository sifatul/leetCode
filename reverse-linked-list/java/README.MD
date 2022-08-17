# iteration

 
Time  | Space
----- | ------
O(n) | O(1)

Iterate through each node, and keep a copy of the ` ListNode nextTemp = curr.next;` for the next iteration.
Replace current.next with output (reversing) and reset output = current ( reversed)
```
 curr.next = output;
  output = curr;
```
change current with the copy of `nextTemp` for next iteration. ` curr = nextTemp;` 

 
 