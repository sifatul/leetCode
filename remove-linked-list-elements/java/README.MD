# strategy

 
Time  | Space
----- | ------
O(n) | O(1)

 
 Need three pointers: one for output `output`, one to track previous node `prev`and another one is to interate `head`.

if the `val` to be deleted is not found then `prev = head;` and we would need to iterate to the next node `head = head.next;`; if found current node need to be skipped and `prev` must point to the next node `prev.next = head.next;`



 
 