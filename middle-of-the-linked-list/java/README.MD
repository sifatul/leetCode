# Single pointer

 
Time  | Space
----- | ------
O(n) | O(n)

example :` head = [1,2,3,4,5]`
To determine the mid point of the list total length of the list is important.

```
int length = 0;
ListNode copy = head;

while(copy !=null){
    copy = copy.next;
    length ++;
}
```

Now, after having the total length, list can be iterated again until the mid point and return the node as the head of the output list.
```
ListNode output = null;
for(int i=0; i<=length/2 ;i++){
    output = head;
    head = head.next;
}
return output;
```

 # Using array

 Similar to #Single pointer (above). Here instead of finding length create an array of ListNode 
 ```
 ListNode [] arr = new ListNode[100];
int length=0;
while(head !=null){
    arr[length] = head;
    head = head.next;
    length ++;
}
 ```
 
 
 and return the node in the mid of the array `return arr[length/2];`
 