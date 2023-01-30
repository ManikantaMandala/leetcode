/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // Iteration approach
        // int left =1, right = n,mid=0,guess=0;
        // while(left<=right){
        //     mid = left + ((right-left)/2);
        //     guess=guess(mid);
        //     if(guess==0){
        //         break;
        //     }
        //     else if(guess==-1){
        //         right= mid-1;
        //     }
        //     else{
        //         left=mid+1;
        //     }
        // }
        // return mid;
        // time complexity: O(log(n))
        // space complexity: O(1)
        // Recursive approach
        return guessNumberRecursive(n,1,n);
        //time complexity: O(log(n))
        //space complexity: O(log(n))
    }
    public static int guessNumberRecursive(int n,int left,int right){
        int mid = left + ((right-left)/2);
        GuessGame gg = new GuessGame();
        int guess= gg.guess(mid);
        if(guess==0) return mid;
        else if(guess==-1) return guessNumberRecursive(n,left,mid-1);
        else return guessNumberRecursive(n,mid+1,right);
    }
}
// @lc code=end

