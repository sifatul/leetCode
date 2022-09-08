# linkedList

 
Time  | Space
----- | ------
O(1) | O(1)


Singly linked list can be used as queue. adding new item in reverse order would return data as  FIFO.

```
ListNode next = new ListNode(x, head);
ListNode headCopy = head;
head = next;
head.next = headCopy;
```

# arrayList

 
Time  | Space
----- | ------
O(1) | O(1)


reverse order `pop()` would return the data as FIFO
 
 