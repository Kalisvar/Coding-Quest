class Solution {
    public int majorityElement(int[] nums) {
  /*      int n = nums.length;
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
    return -1; */
            int element = 0;
            int cnt =0;
            int n = nums.length;
            for(int i=0; i<n ;i++)
            {
                if(cnt == 0)
                {
                    element = nums[i];
                    cnt = 1;
                }
               else  if(element == nums[i])
                {
                    cnt ++;
                }
                else
                {
                    cnt--;
                }
            }
            return element;
          
    }

}