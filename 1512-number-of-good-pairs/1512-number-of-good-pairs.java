class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && i<j){
        //             count+=1;
        //         }
        //     }
        // }
        for(int i = 0;i<nums.length;i++){

                if(map.containsKey(nums[i])){
                    result += map.get(nums[i]);
                }
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return result;
    }
}