class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []  ans = new int[nums.length];
        int pointer1= 0;
        int pointer2= n;
        for(int i =0;i<nums.length;i++){
            if((i%2==0) &&  pointer1<nums.length)
            {
                ans[i]=nums[pointer1];
                pointer1++;
            }
            else if(pointer2<nums.length){
                    ans[i] = nums[pointer2];
                    pointer2++;
            }
        }
        return ans;
    }
}