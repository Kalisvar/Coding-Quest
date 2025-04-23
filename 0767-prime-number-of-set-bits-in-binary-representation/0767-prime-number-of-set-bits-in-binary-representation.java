class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primecount = 0;
        for(int i = left; i <= right;i++){
            int ans = 0;
            for(int j = 0;j<32;j++){
                int bit = i & (1<<j);
                if(bit != 0){
                    ans++;
                }
            }
            if(ans>1){
                boolean prime = isPrime(ans);
                if(prime){
                    primecount++;
                }
            }

        }
        return primecount;
    }

   public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i  = 2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}