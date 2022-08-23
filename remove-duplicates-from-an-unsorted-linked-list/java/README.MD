# Iterative

 
Time  | Space
----- | ------
O(n) | O(n)

To find the numbers that are duplicate `HashMap` can be used where number can be the key and `count` can be the value; `count >1` means that number is duplicate.

```
HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();

ListNode copy = head;
while(copy != null){
    int num = copy.val;
    int count = map.getOrDefault(num, 0) + 1;
    map.put(num, count);
    copy = copy.next;
}

```
Now we can iterate through each node and if we find a duplicate connect previous node next to current node next. 

```
if(count>1){
    prev.next = curr.next;
    curr.next = null;
    curr = prev;
}
```
 
 