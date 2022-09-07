# Single stack

 
Time  | Space
----- | ------
O(1) | O(n)

 

Stack is implemented with an arrayList but could have been done with built-in stack too. 
Here stack is used to keep track of each element along with min val at that stage by introducing an array inside the stack. Each item of the stack is an array. where first index contains the val and the second item contains the min value. An example: 
```
int [] prevITem =  list.get(size-1);
int min = Math.min(val,prevITem[1]);
newItem[0] = val;
newItem[1] = min;
list.add(newItem);
```

# Two stacks
 
Time  | Space
----- | ------
O(1) | O(n)

Two stacks can be used to avaid using an array within in the ArrayList/stack shown in the first solution. So one stack would keep track of the each element pushed into stack and the other stack keep track of the minimum only;

```
       
if (minStack.isEmpty() || val <= minStack.peek()) {
    minStack.push(val);
}
```

One thing to keep in mind is everytime there is an element which is equal or smaller will be saved to `minStack`. If new minimum is saved than for repeated occurance of minimum number there will be an empty stack or number not found in `minStack`
 
 
 # Two stacks improved
 # Two stacks
 
Time  | Space
----- | ------
O(1) | O(n)

Similar to the first and second solutions. Here, to avoid storing repeated occurance in minStack, an array is introduced to use as a counter of that element.
 ```
else if (x == minStack.peek()[0]) {
    minStack.peek()[1]++;
}
```

So everytime we pop we need to reduce the count 
```
if (stack.peek().equals(minStack.peek()[0])) {
    minStack.peek()[1]--;
}
```
and delete the array from the stack when counter is `0`
```
if (minStack.peek()[1] == 0) {
    minStack.pop();
}
```