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
         return h(l1,l2,0);
    }
    public ListNode h(ListNode l1,ListNode l2, int carry){
         //base case
         if(l1==null && l2==null){
              if(carry==1) return new ListNode(1);
              else return null;
         }

         //adding the values
         int sum = carry;
         sum = (l1!=null)?sum+l1.val:sum;
         sum = (l2!=null)?sum+l2.val:sum;

         //handling carry
         carry = sum/10;
         sum = sum%10;

         //making new node
         ListNode newNode= new ListNode(sum);

         //Calling the recursive call
         if(l1 == null){
              newNode.next = h(l1,l2.next,carry);
         }
         else if(l2 == null){
              newNode.next= h(l1.next,l2,carry);
         }
         else{
              newNode.next(l1.next,l2.next,carry);
         }

         //returning
         return newNode;
    }
}
