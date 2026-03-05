class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2051];
        for(int[] log:logs){
            arr[log[0]]+=1;
            arr[log[1]]-=1;
        }
        int maxYear = 1950; int maxPop = arr[1950];
        for(int i=1951;i<arr.length;i++){
            arr[i] += arr[i-1];
            if(arr[i] > maxPop){
                maxPop = arr[i];
                maxYear = i;
            }
        }
        return maxYear;
    }
}