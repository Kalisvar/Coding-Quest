class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        // for(int i = 0;i<n;i++){
        //     if(temp[i] > maxCandies){
        //         maxCandies = temp[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     result.add(((temp[i]+extraCandies)>= maxCandies));
        // }
        // using stream api to find the maximum element in the array
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        for(int elemnt : candies){
            result.add(((elemnt+extraCandies)>= maxCandies));
        }

        return result; 
    }
}