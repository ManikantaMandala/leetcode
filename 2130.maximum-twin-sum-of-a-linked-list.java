/*
 * @lc app=leetcode id=2130 lang=java
 *
 * [2130] Maximum Twin Sum of a Linked List
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
//Method1-iterative
// class Solution {
//      public int pairSum(ListNode head) {
//           if(head.next==null) return head.val;
//           ListNode slow=head,fast=head;
//           Stack<Integer> stack = new Stack<>();
//           int max=Integer.MIN_VALUE,i,val;
//           while(fast.next!=null && fast.next.next!=null){
//                stack.push(slow.val);
//                fast=fast.next.next;
//                slow=slow.next;
//           }
//           stack.push(slow.val);
//           slow=slow.next;
//           while(slow.next!=null){
//                i=stack.pop();
//                System.out.print(i+" ");
//                val=i+slow.val;
//                if(max<val){
//                     max=i+slow.val;
//                }
//                slow=slow.next;
//           }
//           return max;
//      }
// }

// Method2-Recursive
class Solution {
	// max to keep the track of max sum value
    private int max;
	
	// this pointer moves from left to right
    private ListNode head;
    
    public int pairSum(ListNode node) {
		// initialising global values
        max = Integer.MIN_VALUE;
        head = node;
        
		// this pointer *node* will traverse in reversed direction
		// using findMax(), which a recursive function
        findMax(node);
        
		// finally we return the max value
        return max;
    }
    
    private void findMax(ListNode node) {
		// base case
        if (node == null) return;
        
		// here we have called findMax() for the next node
		// since we want to go to the last node first
		// then we wish to start calculating the max
        findMax(node.next);
        
		// we will reach here first only when the last node is
		// reached, then we calculate the max value
        max = Math.max(max, head.val + node.val);
		
		// once we are done with the calculation,
		// we shift the next left-to-right pointer to the right
		// for the next iteration
        head = head.next;
    }
}// @lc code=end

