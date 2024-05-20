class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            int value = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
        }  
        for(Map.Entry<Integer,Integer> i:mpp.entrySet())
        {
            if(i.getValue() > n/2)
            {
                return i.getKey();
            }
        }
        return -1;
          
    }

}