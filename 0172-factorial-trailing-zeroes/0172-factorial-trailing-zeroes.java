class Solution {
    public int trailingZeroes(int n) {
        // int ans = 0;
        // int denom = 5;
        // while(denom <= n){
        //     ans = ans + n / denom;
        //     denom = denom * 5;
        // }
        // return ans;
        int ans =0;
        while(n!=0){
            n = n/5;
            ans = ans + n;
        }
        return ans;
    }
}