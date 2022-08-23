# strategy

 
Time  | Space
----- | ------
O(m) | O(m)



Iterate through each node and put the values in an array.

```
ArrayList <Integer> list = new ArrayList<Integer>();

ListNode curr = head;
while(curr !=null){
    list.add(curr.val);
    curr = curr.next;   
}

```
Next, check whether the list is palindrome.
 
 