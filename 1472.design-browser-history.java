/*
 * @lc app=leetcode id=1472 lang=java
 *
 * [1472] Design Browser History
 */

// @lc code=start
class BrowserHistory {
    
    int x=0;//for getting no. of nodes
    int y=0;//for getting no. of 
    String homepage;
    browserNode pointer;
    public BrowserHistory(String homepage) {
        this.homepage=homepage;
        pointer=new browserNode(this.homepage);
    }
    
    public void visit(String url) {
        browserNode newNode = new browserNode(url,pointer);
        pointer.next=newNode;
        pointer=pointer.next;
    }
    
    public String back(int steps) {
        while(steps!=0 && pointer.previous!=null){
            pointer=pointer.previous;
            steps--;
        }
        return pointer.nodeVal;
    }
    
    public String forward(int steps) {
        while(steps!=0 && pointer.next!=null){
            pointer=pointer.next;
            steps--;
        }
        return pointer.nodeVal;
    }
}
class browserNode{
    String nodeVal;
    browserNode next;
    browserNode previous;
    public browserNode(String nodeVal){
        this.nodeVal=nodeVal;
        this.next=null;
        this.previous=null;
    }
    public browserNode(String nodeVal,browserNode previous){
        this.nodeVal=nodeVal;
        this.next=null;
        this.previous=previous;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
// @lc code=end

