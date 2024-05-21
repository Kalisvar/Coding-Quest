class Solution {
    public int maxProfit(int[] a) {
        int maxProfit = 0;
        int minElement = Integer.MAX_VALUE;
        for(int i =0;i<a.length;i++)
        {
            if(a[i] < minElement)
            {
                minElement = a[i];
            }
            else if(a[i] - minElement > maxProfit)
            {
                maxProfit = a[i] - minElement;
            }

        }
        return maxProfit;
        
        
    }
}