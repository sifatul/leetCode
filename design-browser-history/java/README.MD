# two-pointers

 
Time  | Space
----- | ------
O(1) | O(n)

Consider having two pointers. One `current` would hold position of the current index and the other `max` would hold the position of the last item in the stack. any values beyound the max index would be ignore (if there is any);

Homepage is the default url for the browser so set `map.put(0,homepage);` and at this point `current` and `max` both are at index 0.

Wheneven user visits a new url, a new items needs to be added to the stack 
```
current ++;
map.put(current, url);
```
but max needs to be reset as:
> Visits url from the current page. It clears up all the forward history

while going back the last item we can go is the homepage

```
current = Math.max(0, current-steps);
return map.get(current);
```

On the other hand, for going forward we need to make sure to check only within the range of 0 to max as during we adjusted the position of `max` to `current` to ignore values that are beyond `max`. 

```
current = Math.min(max, current+steps);
return map.get(current);
```



 
 
 # doubly linked list

 
Time  | Space
----- | ------
O(1) | O(n)

As simple as any other doubly linkedList. homepage would be the head `head = new ListNode(homepage);` and for each visit it will create a new node as next of the head.  

```
public void visit(String url) {
    ListNode newList  =new ListNode(url);
    newList.prev = head;
    head.next = newList;
    head = head.next;
    
}
```
previous needs to be updated. as head now will be previous for the new node.
For going back we need to iterate each step from the tail of the head. On the other hand for going forward we need to iterate to the next from the head.

 # two stacks

 
Time  | Space
----- | ------
O(1) | O(n)

would be using two stacks. one to remember to the history of the url visited and another is to remeber the urls while going back.
 as the last item  in hostory stack is the home page while going back iterate until `history.size() > 1`.

```
public String back(int steps) {
    while (steps > 0 && history.size() > 1) {
        future.add(history.pop());
        steps--;
    }
    return history.peek();
}
```

when going forward, we need to check whether we have any item in the forward stack orelse top of history would be the output. 


