import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        char peekedCharacter = ' ';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
                charStack.push(s.charAt(i));
            if(s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)==')'){
                if(!s.isEmpty()){
                    peekedCharacter = charStack.peek();
                    if(Math.abs(peekedCharacter-s.charAt(i))==1||Math.abs(peekedCharacter-s.charAt(i))==2)
                        charStack.pop();
                    else
                        return false;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

