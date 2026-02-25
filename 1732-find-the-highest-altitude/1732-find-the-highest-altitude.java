class Solution {
    public int largestAltitude(int[] gain) {
        int large = 0;
        int[] result = new int[gain.length+1];
        for(int i =1;i<result.length;i++){
            result[i] = result[i-1] + gain[i-1];
            large= Math.max(result[i],large);
        }
        return large;
    }
}