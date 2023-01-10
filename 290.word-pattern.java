/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(pattern.length()!= words.length) return false;
        HashMap<Character, String> match = new HashMap<>();
        int length= pattern.length();
        char curChar;
        for(int i=0;i<length;i++){
            curChar= pattern.charAt(i);
            if(match.containsKey(curChar)){
                if(!match.get(curChar).equals(words[i])){
                    return false;
                }
            }
            else{
                if(match.containsValue(words[i])) return false;
                match.put(curChar,words[i]);
            }
        }
        for(int i=0;i<words.length;i++){
            curChar = pattern.charAt(i);
            if(!words[i].equals(match.get(curChar))){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

