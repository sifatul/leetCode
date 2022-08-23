# iteration

 
Time  | Space
----- | ------
O(n) | O(1)

For an example: `[a,b,c]`. Here if `a` is the current it would point to `null` instead of `b`. So the connect from `a` is changing and we need to remember next item after `a`. So to remember and i terate through each node: ` ListNode nextTemp = curr.next;` ie. b -> c

Replace current.next with output (reversing) `curr.next = output;` ie. b -> a; hence `output = curr;` as the new head.
 
For sake of next iterationm, change current ` curr = nextTemp;` 


# recursion

 
Time  | Space
----- | ------
O(n) | O(n)

simply thing about two nodes. When reversing `head.next` connect needs to disconnect and item in `head.next.next` needs to point to the item in `head`;

```
head.next.next = head;
head.next = null;
```
Recursion will do the rest to find the newHead `ListNode newHeadNode = reverseList(head.next);`

 
 