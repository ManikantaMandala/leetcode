/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime= new boolean[n+1];
        int count=0;
        for(int i=2;i<n;i++){
            if(notPrime[i]==false){
                count++;
                for(int j=i;i*j<n;j++){
                    notPrime[i*j]=true;
                }
            }
        }
        return count;
    }
}
// @lc code=end

