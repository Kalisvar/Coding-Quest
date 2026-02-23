class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] temp = candies;
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for(int i = 0;i<n;i++){
            if(temp[i] > maxCandies){
                maxCandies = temp[i];
            }
        }
        for(int i=0;i<n;i++){
            result.add(((temp[i]+extraCandies)>= maxCandies));
        }
        return result; 
    }
}