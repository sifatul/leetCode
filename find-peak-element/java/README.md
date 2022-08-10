# Linear approach

 
Time  | Space
----- | ------
O(n) | O(1)

In this approach, we make use of the fact that two consecutive numbers `nums[j]` and `nums[j + 1]` are never equal. Thus, we can traverse over the `nums` array starting from the beginning. Whenever, we find a number `nums[i]`, we only need to check if it is larger than the next number `nums[i+1]` for determining if `nums[i]` is the peak element.
[read more](https://leetcode.com/problems/find-peak-element/solution/).



# Recursive Binary Search

 
Time  | Space
----- | ------
O(logn) | O(logn)


We start off by finding the middle element, `mid` from the given `nums` array. If this element happens to be lying in a descending sequence of numbers. or a local falling slope(found by comparing `nums[i]` to its right neighbour), it means that the peak will always lie towards the left of this element. Thus, we reduce the search space to the left of `mid`(including itself) and perform the same process on left subarray.

If the middle element, `mid` lies in an ascending sequence of numbers, or a rising slope(found by comparing `nums[i]` to its right neighbour), it obviously implies that the peak lies towards the right of this element. Thus, we reduce the search space to the right of `mid` and perform the same process on the right subarray.

In this way, we keep on reducing the search space till we eventually reach a state where only one element is remaining in the search space. This single element is the peak element. [read more](https://leetcode.com/problems/find-peak-element/solution/).