class Solution {
    public int missingNumber(int[] nums) {
    //  int[] hash = new int[nums.length+1];
    //  for(int i = 0;i<nums.length;i++)
    //  {
    //     hash[nums[i]] ++;
    //  }

    //  for(int i = 0;i<hash.length;i++)
    //  {
    //     if(hash[i]==0)
    //     {
    //         return i;
    //     }
    //  }
    // return -1;

    int  xor1 = 0;
    int  xor2 = 0;
    for(int i =0;i<nums.length;i++)
    {
        xor2 = xor2 ^ nums[i];
        xor1 = xor1^i;
    }
    xor1 = xor1 ^ nums.length;
    return xor1^xor2;


    }
}