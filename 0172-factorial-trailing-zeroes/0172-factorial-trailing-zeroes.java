class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int denom = 5;
        while(denom <= n){
            ans = ans + n/denom;
            denom = denom*5;
        }
        return ans;
    }
}