/*
 * @lc app=leetcode id=2326 lang=java
 *
 * [2326] Spiral Matrix IV
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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr= new int[m][n];
        for(int x[] : arr) Arrays.fill(x,-1);
        int nsr=0;
        int i=0,j=0;

        while(head!=null){
            while(j!=n-nsr-1 && head!=null){
                if(head!=null){
                    arr[i][j]=head.val;
                    head=head.next;
                }
                else arr[i][j]=-1;
                j++;
            }
            while(i!=m-nsr-1&& head!=null){
                if(head!=null){
                    arr[i][j]=head.val;
                    head=head.next;
                }
                else arr[i][j]=-1;
                i++;
            }
            while(j!=nsr&& head!=null){
                if(head!=null){
                    arr[i][j]=head.val;
                    head=head.next;
                }
                else arr[i][j]=-1;
                j--;
            }
            nsr++;
            while(i!=nsr&& head!=null){
                if(head!=null){
                    arr[i][j]=head.val;
                    head=head.next;
                }
                else arr[i][j]=-1;
                i--;
            }
        }
        return arr;
    }
}
// @lc code=end

