class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a = new int[nums.length/2];
        int[] b = new int[nums.length/2];
        int p =0;
        int n =0;
        for(int i = 0; i < nums.length;i++)
        {
            
            if(nums[i] > 0 &&  p < a.length)
            {
                a[p] = nums[i];
                p +=1;
            }
            if (nums[i] < 0 && n < b.length)
            {
                b[n] = nums[i];
                n+=1;

            }
        }
        p =0;
        n =0;
        for(int i = 0;i<nums.length;i++)
        {
            if ( i % 2 != 0 && n < a.length)
            {
                nums[i] = b[n];
                n+=1;
            }
           else  if( i % 2 == 0 &&  p < a.length )
            {
                nums[i] = a[p];
                p +=1;
            }
       
        }
        return nums;
   }
}