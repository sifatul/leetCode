class MinStack {
    ArrayList<int[]> list;
    public MinStack() {
        list= new ArrayList<>();
    }
    
    public void push(int val) {
        int[] newItem = new int[2];
        int size = list.size();
        if(size == 0){
            newItem[0] = val;
            newItem[1] = val;
            list.add(newItem);
        }else{
            int [] prevITem =  list.get(size-1);
            int min = Math.min(val,prevITem[1]);
            newItem[0] = val;
            newItem[1] = min;
            list.add(newItem);
        }
    }
    
    public void pop() {
        int size = list.size();
        
        if(size >0) list.remove(size-1);    
      
    }
    
    public int top() {
        int size = list.size();
        
        if(size>0){
            int [] output =  list.get(size-1);    
            return output[0];
        }
        return -1;
    }
    
    public int getMin() {
        int size = list.size();
        
        if(size >0){
            int [] output =  list.get(size-1);    
            return output[1];
        }
        return -1;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */