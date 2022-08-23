# Hashset

 
Time  | Space
----- | ------
O(m+n) | O(m)

 Create a set of node from one of the ListNode. 

 ```
Set<ListNode> set = new HashSet <>();
if(headA == null || headB == null) return null;

while(headA !=null){
    set.add(headA);
    headA = headA.next;
}
 ```

Next, iterate through elements of other ListNode and check whether exists in the `set`. If exists then thats the intersection. 

```        
while(headB !=null){
  if(set.contains(headB)) return headB;
  headB = headB.next;
}
```
 
 
# Two pointer

 
Time  | Space
----- | ------
O(m+n) | O(1)


Take two pointers at the head of two lists, and iterate until the end. If head becomes `null` assign the pointer to the head of the other list. pointer will always meet at the intersection.