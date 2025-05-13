class Solution {
    public int reverse(int x) {
        int n =x;
        if(n==0){
            return 0;
        }
        if(n<0){
            n = n*-1;
        }
        long result =0;
        while(n!=0){
            result = result* 10+(n%10);
            n /= 10;
        }
        if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE ){
            if(x<0){
                return (int)result * -1;
            }
            return (int)result;
        }
        return 0;
    }
}