class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new  int[nums.length];

        if(nums.length==0){
            return nums;
        }
        for(int i=0;i<index.length;i++){
                    for(int j = index.length-1;j>index[i];j--){
                     result[j] = result[j-1];
                    }
                    result[index[i]] = nums[i];
            
        }
        return result;
    }
}