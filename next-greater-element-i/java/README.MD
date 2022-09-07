# brute force

 
Time  | Space
----- | ------
O(mn) | O(n)


Instead of searching for the occurence of  `nums1[i]` linearly in the `nums2` array, we can make use of a hashmap to store the elements of `nums2` in the form of (element, index).

```
for(int i=0; i< nums2.length; i++){
    map.put(nums2[i],i);
}
```

By doing this, we can find `nums1[i]`'s index in `nums2` array directly and then continue to search for the next larger element in a linear fashion.

 
instead of using a new array we can reuse the `num1` array to output by storing `num1[i]` in a variable while iterating and set value to -1 
```
int num = nums1[i];
nums1[i]= -1;
```
and replace by the next great number if found.
```
if(nums2[j]> num){
    nums1[i] = nums2[j];
    break;
}
```

# brute force

 
Time  | Space
----- | ------
O(mn) | O(n)

https://youtu.be/TunTV2-griM

We make use of a stack and a hashmap  to do pre-processing and map is used to store the result for every posssible number in nums2.

during iteration stack is used to find the number greater than the number in stack. Only items that are smaller than `nums2[i]` will be popped out and saved in map for later usage.

```
for(int i=0; i< nums2.length; i++){
    int digit = nums2[i];
    while(!stack.isEmpty() && stack.peek()< digit){
        int top = stack.pop();
        map.put(top, digit);
    }
    stack.push(digit);
}
```

 