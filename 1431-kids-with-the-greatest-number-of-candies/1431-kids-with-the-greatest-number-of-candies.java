class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        // for(int i = 0;i<n;i++){
        //     if(temp[i] > maxCandies){
        //         maxCandies = temp[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     result.add(((temp[i]+extraCandies)>= maxCandies));
        // }

        for(int element : candies){
            maxCandies = Math.max(element,maxCandies);
        }
         for(int element : candies){
            if((element + extraCandies) >= maxCandies ){
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result; 
    }
}