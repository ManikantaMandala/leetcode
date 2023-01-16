/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> newList = new ArrayList<>();
        ArrayList<Integer> previousListItem = null;
        for(int i=1;i<numRows+1;i++){
            ArrayList<Integer> newListItem= helper(i,previousListItem);
            newList.add(newListItem);
            previousListItem=newListItem;
        }
        return newList;
    }
    public static ArrayList<Integer> helper(int num,ArrayList<Integer> previousListItem){
        ArrayList<Integer> newListItem = new ArrayList<>();
        int add;
        if(num==1){
            newListItem.add(1);
        }
        else if(num==2){
            newListItem.add(1);
            newListItem.add(1);
        }
        else{
            newListItem.add(1);
            for(int i=1;i<num-1;i++){
                add= previousListItem.get(i-1)+previousListItem.get(i);
                newListItem.add(add);
            }
            newListItem.add(1);
        }
        return newListItem;
    }
}
// @lc code=end

