class Solution {
    public int reverse(int n) {
        long result = 0;
        while(n!=0){
            result = result* 10+(n%10);
            n /= 10;
        }
        return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE )?0 : (int)result;
    }
}