class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
      long low = Math.min(a,b);
      long high = low*n;
      long ans = -1;
      long lcm = (a*b)/(gcd(a,b));
      long mod=1000000007;
      while(low<=high){
        long mid = low + (high-low)/2;
        long count = mid/a+mid/b-mid/lcm;
        if(count>n){
            high = mid-1;
        }
        else if(count<n){
            low = mid+1;
        }
        else if(count == n){
            ans = mid;
            high = mid-1;
        }
      } 
      return (int) (ans%mod); 
    }

    private static long gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}