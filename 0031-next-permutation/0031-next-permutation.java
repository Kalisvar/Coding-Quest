class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i = n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            reverse(nums,0,n-1);
            
        }
        else
        {
        for(int i = n-1;i>=0;i--)
        {
            if(nums[i]>nums[index])
            {
                swap(nums,i,index);
                break;
            }
        }

       reverse(nums,index+1,n-1);

    }
    }
    public static void swap(int[] n,int a,int b)
    {
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }

    public static void reverse(int[] n ,int a,int b)
    {
        while(a<b)
        {
            swap(n,a,b);
            a++;
            b--;
        }
    }


}