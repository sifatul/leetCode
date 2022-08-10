# Linear approach

 
Time  | Space
----- | ------
O(n) | O(1)

In this approach, we make use of the fact that two consecutive numbers `nums[j]` and `nums[j + 1]` are never equal. Thus, we can traverse over the `nums` array starting from the beginning. Whenever, we find a number `nums[i]`, we only need to check if it is larger than the next number `nums[i+1]` for determining if `nums[i]` is the peak element.



