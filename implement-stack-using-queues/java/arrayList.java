class MyStack {
    
    ArrayList<Integer> list;

    public MyStack() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        
        list.add(x);
  
    }
    
    public int pop() {
       int lastItem = list.remove(list.size()-1);
        return lastItem;
        
    }
    
    public int top() {
         int lastItem = list.get(list.size()-1);
        return lastItem;
    }
    
    public boolean empty() {
       return list.size() == 0;
        
    }
    
   
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */