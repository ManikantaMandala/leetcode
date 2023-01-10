/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start
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
    // public ListNode swapPairs(ListNode head) {
    //     if(head==null || head.next==null) return head;
    //     ListNode end=head.next;
    //     ListNode startOfReversedList=swapPairs(end.next);
    //     swapFirstPair(head);
    //     head.next=startOfReversedList;
    //     return end;
    // }
    // public void swapFirstPair(ListNode head){
    //     ListNode end= head.next;
    //     end.next =head;
    // }
    public ListNode swapPairs(ListNode head){
        ListNode p=null,c=head,n=head.next;
        ListNode nextStartNode;
        while(pointer!=null){
            
            nextStartNode=n.next;
            n=n.next.next;
            c.next.next=c;
            p=c;
            c.next=n;
            c=nextStartNode;

        }
    }
}
// @lc code=end

