class Solution {
    public boolean check(int[] nums) {
        int count =0 ; int length = nums.length;
        if(nums[0] < nums[length-1])
        {
                count++;
        }

        for(int i = 1;i<length;i++)
        {
            if(nums[i-1] > nums[i])
            {
                count++;
            }
            if(count > 1)
            {
                return false;
            }
        }
        return true;
        
    }
}