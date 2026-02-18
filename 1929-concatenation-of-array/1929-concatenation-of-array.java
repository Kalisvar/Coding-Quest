class Solution {
    public int[] getConcatenation(int[] nums) {
        int n  = 2*nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(i > (nums.length-1)){
                int temp = i - nums.length;
                ans[i] = nums[temp];
            }
            else{
            ans[i] = nums[i];
            }
        }
        return ans;
    }
}