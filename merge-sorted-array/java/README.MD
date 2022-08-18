# Three pointer

 
Time  | Space
----- | ------
O(n+m) | O(1)

Consider three points: 1) at the end of nums1 2) at last item in nums1 3) at the end of nums2

`int i=m-1, j = n-1, p = nums1.length -1;` 

Now, iterate back from pointer no.1,
```
while(j>=0){
    
    // other logics
    
    p--;
}
```
check for smaller values between pointer no.2 and pointer 3

Example: 
```
 if(i>=0&&nums1[i]>nums2[j]) nums1[p] = nums1[i--];
  else nums1[p] = nums2[j--];
```
# Recursion

There can be three cases where we need to check not to fall into arrayIndex out of bound.
```
if (m > 0 && n > 0) {

} else if (m > 0) {
    
} else if (n > 0) {
    
}

```

we need to compare last available number in nums1 and nums2 and find the smallest
for case 1 `if (m > 0 && n > 0)`, value at nums1 might be smaller or nums2
```
if (nums1[m - 1] > nums2[n - 1]) {
     
} else {
     
}
```

if `nums1[m - 1] > nums2[n - 1]` is true we take the value of `nums1[m - 1]` and put at the end of nums1 array `nums1[m + n - 1] = nums1[m - 1];`. So, as we took a number from nums1 need to call recursion with `merge(nums1, m - 1, nums2, n);` one index less `m-1` than before. 
 
 