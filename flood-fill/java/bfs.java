class Solution {
    public void populateStack (int[][] image, int row, int col, int currColor, Stack <int []> stack ){
        if(image[row][col] != currColor) return;
        int [] temp = {row, col};
        stack.add(temp); 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
       if(image[sr][sc] == color) return image;

        
       Stack <int []> stack = new Stack <>();
        int [] item =  {sr, sc};
        stack.add(item);
        int curr = image[sr][sc];
        
        while(stack.size() >0){
            item =  stack.pop();
            int row = item[0];
            int col = item[1];
            image[row][col] = color; 
            
            
            if(col-1>=0) populateStack(image, row, col-1, curr, stack);
            if(col+1<=image[0].length-1)  populateStack(image, row, col+1, curr, stack);
            if(row-1>=0 ) populateStack(image, row-1, col, curr, stack);
            if(row +1<=image.length-1) populateStack(image, row +1, col, curr, stack);
              
        }
        
        return image;
        
        
        
    }
}