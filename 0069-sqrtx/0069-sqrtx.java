class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int start = 1;
        int end = x;
        int whole =0;
        while(start <= end){
            int m = start +(end-start)/2;
            if(m*m == x){
                return m;
            }
            else if((long)m*m < x){
                whole = m;
                start = m + 1;
            }
            else if((long)m*m > x){
                end = m -1;
            }
        }
        return whole;
    }
}