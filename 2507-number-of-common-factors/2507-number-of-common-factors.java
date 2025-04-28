class Solution {
    public int commonFactors(int a, int b) {
        int endpoint = 0;
        int count = 0;
        if(b>a){
            endpoint = b;
        }
        else
        {
            endpoint = a;
        }
        for(int i = 1;i<=endpoint;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}