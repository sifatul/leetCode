class MyStack {
    
    ListNode head;

    public MyStack() {
        
    }
    
    public void push(int x) {
        
        ListNode next = new ListNode(x, head);
        ListNode headCopy = head;
        head = next;
        head.next = headCopy;
  
    }
    
    public int pop() {
        if(head == null) return -1;        
        int val = head.val;
        head = head.next;
        
        return val;
        
    }
    
    public int top() {
        if(head == null) return -1; 
        return head.val;
    }
    
    public boolean empty() {
       return head == null;
        
    }
    
    private class ListNode{
        int val;
        ListNode next;
        private ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
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