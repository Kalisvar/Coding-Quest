class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt = 0;
        int longest = 0; 
     Set<Integer> resultSet = new HashSet<>();
     for(int i = 0; i < nums.length; i++)
     {
        resultSet.add(nums[i]);
     }
     for(int it :resultSet)
     {
        if(!resultSet.contains(it-1))
        {
            cnt = 1;
            int x = it;
            while(resultSet.contains(x+1))
            {
                x= x+1;
                cnt = cnt+1;
            }
            longest = Math.max(longest,cnt);
        }
     }
     return longest;

    }
}