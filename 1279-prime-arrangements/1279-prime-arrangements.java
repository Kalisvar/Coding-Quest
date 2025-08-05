class Solution {
    static int MOD = 1_000_000_007;
    public int numPrimeArrangements(int n) {
        int prime = 0;
        for(int i = 2;i<=n;i++){
            if(getPrime(i)){
                prime ++;
            }
        }
        long primeFact = fact(prime);
        long nonPrime = fact(n-prime);
        return (int)((primeFact*nonPrime) % MOD);
    }
    public static long fact(int n){
        long fact = 1;
        for(int i =1;i<=n;i++){
            fact = (fact *i)%MOD;
        }
        return fact;
    }
    public static  boolean getPrime(int n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    } 
}