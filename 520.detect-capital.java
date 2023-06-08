/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        int wordSize=word.length();
        boolean isRightUsage;
        for(int i=1;i<wordSize;i++){
            if(word.charAt(i)<'Z'){
                isRightUsage=false;
                break;
            }
        }
        return isRightUsage;
    }
}
// @lc code=end

