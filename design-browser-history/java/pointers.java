class BrowserHistory {
    int current =0, max=0;
    HashMap <Integer, String> map= new HashMap<>();

    public BrowserHistory(String homepage) {
        map.put(current,homepage);
    }
    
    public void visit(String url) {
        current ++;
        map.put(current, url);
        max= current;
        
    }
    
    public String back(int steps) {
        current = Math.max(0, current-steps);
        return map.get(current);
        
    }
    
    public String forward(int steps) {
        System.out.println(max +"  "+map.size());
        current = Math.min(max, current+steps);
        return map.get(current);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */