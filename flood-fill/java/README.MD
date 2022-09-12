# bfs

 
Time  | Space
----- | ------
O(n) | O(n)

 
1. start at the starting position
2. store the starting value for later usage `int curr = image[sr][sc];`
3. add the initial position in the stack
4. loop until stack is empty.
5. pop new item from stack
4. check surrounding indexes, left, right, top and bottom. If neighbor value is equal to starting value add it to stack for next iteration
5. repeat 4



 # dfs or recursive method

 
Time  | Space
----- | ------
O(n) | O(n)
 

1. create a dfs method that change color from current color to new color `image[r][c] = newColor;`
2. for going towards bottom of the matrix, recursively add new color `if (r >= 1) dfs(image, r-1, c, color, newColor)`
3. for going towards top of the matrix, `if (r+1 < image.length) dfs(image, r+1, c, color, newColor);`
4. for going towards right of the matrix, `if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);`
5. 4. for going towards left of the matrix, `if (c >= 1) dfs(image, r, c-1, color, newColor);`