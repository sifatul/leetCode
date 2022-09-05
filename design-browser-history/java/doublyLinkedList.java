class BrowserHistory {
     
    public class ListNode{
        ListNode next;
        ListNode prev;
        String val;
        public ListNode(String url){
            this.val = url;
        }
    }
    ListNode head;

    public BrowserHistory(String homepage) {
        head = new ListNode(homepage);
        
    }
    
    public void visit(String url) {
        ListNode newList  =new ListNode(url);
        newList.prev = head;
        head.next = newList;
        head = head.next;
        
    }
    
    public String back(int steps) {
        while(head.prev != null && steps>0){
            
            head = head.prev;
            steps --;
        }
        return head.val;
        
    }
    
    public String forward(int steps) {
        
        while(head.next != null && steps>0){
            
            head = head.next;
            steps --;
        }
        return head.val;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */