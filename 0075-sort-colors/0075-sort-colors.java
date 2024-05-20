class Solution {
    public void sortColors(int[] nums) {
        for(int i =0;i<nums.length;i++)
        {
            int lastIndex = nums.length-i;
            int maxIndex = Index(nums,0,lastIndex);
            swap(nums,maxIndex,lastIndex-1);
            
        }

        
    }
    public static int Index(int[] n , int start,int end )
    {
        int maxIndex = 0;
        for(int i =start;i<end;i++)
        {
            if(n[i] > n[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;

    }

    public static void swap(int[] a,int i ,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}