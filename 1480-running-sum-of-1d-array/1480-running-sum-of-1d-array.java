class Solution {
    public int[] runningSum(int[] nums) {
       int[] ans = new int[nums.length];
       int temp = 0;
    //    for(int i = 0;i<nums.length;i++){
    //     int temp = 0;
    //     for(int j=0;j<=i;j++){
    //         temp += nums[j];
    //     }
    //     ans[i] = temp;
    //    }
    for(int i=0;i<nums.length;i++){
        temp += nums[i];
        ans[i] = temp;
    }
       return ans; 
    }
}