# iterative

 
Time  | Space
----- | ------
O(n) | O(1)

 Take two pointer at the start and end of the array `int left =0, right = s.length -1;`,  loop until left and right meet `while(left<right)` and swipe

 ```
  char temp = s[left];
  s[left] = s[right];
  s[right] = temp;
 ```
 # recursion

 Time  | Space
----- | ------
O(n) | O(n)

Similar to iterative method above, Take two pointer and keep recursively calling until left crosses right.
Here space complexity is higher because of storing the stack during recursion.
 