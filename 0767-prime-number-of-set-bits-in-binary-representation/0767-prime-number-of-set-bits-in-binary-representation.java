class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primecount = 0;
        for(int j = left; j <= right;j++){
            int i = j;
            int ans = 0;
            // for(int j = 0;j<32;j++){
            //     int bit = i & (1<<j);
            //     if(bit != 0){
            //         ans++;
            //     }
            // }
            while(i > 0){
                int bit = i % 2;
                if(bit ==1){
                    ans++;
                }
                i = i/2;
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