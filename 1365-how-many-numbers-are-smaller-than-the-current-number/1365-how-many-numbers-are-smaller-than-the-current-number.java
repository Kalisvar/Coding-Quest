class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[101];
        int[] finalResult = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            result[i]+=result[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                finalResult[i] = 0;
            }
            else{
                finalResult[i] = result[nums[i]-1];
            }
        }

        return finalResult;
    }
}