class Solution {
    public int commonFactors(int a, int b) {
        int endpoint = Math.min(a,b);
        int count = 0;
        for(int i = 1;i<=endpoint;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}