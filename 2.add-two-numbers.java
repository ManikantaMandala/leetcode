/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          if(l1==null || l2==null) return null;//checks whether l1,l2 null or not
          ListNode p1=l1,p2=l2;//pointing two pointers at two lists
          int carry=0;//carry
          ListNode add=new ListNode();//add list
          ListNode ans=add;//pointing the add list
          while(p1.next!=null && p2.next!=null){//Do addition util either of the lists are null
               add.val=p1.val+p2.val+carry;//adding
               handleCarry(add);
               carry=(isGreaterThan10(add.val))?1:0;
               //changing to next node
               p1=p1.next;
               p2=p2.next;
               add.next=new ListNode();
               add=add.next;
          }
          if(p1.next!=null && p2.next==null){//if p2.next==null
               while(p1.next!=null){
                    add.val=p1.val+carry;
                    handleCarry(add);
                    carry=(isGreaterThan10(add.val))?1:0;
               }
          }
          else if(p2.next!=null && p1.next==null){// if p1.next==null
               while(p2.next!=null){
                    add.val=p2.val+carry;
                    handleCarry(add);
                    carry=(isGreaterThan10(add.val))?1:0;
               }
          }
          else{//if p1.size == p2.size
               add.val= p1.val+p2.val+carry;
               if(add.val>10){
                    add.val=p1.val%10;
                    add.next=new ListNode(1,null);
               }
          }
          return ans;
    }
    public boolean isGreaterThan10(int val){
         return val>10;
    }
    public void handleCarry(ListNode p){
         if(isGreaterThan10(p.val)){
              p.val=p.val%10;
         }
    }
}
