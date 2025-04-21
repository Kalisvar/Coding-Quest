class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int product = 1;
        while(n != 0){
            int last = n % 10;
            product = product * last;
            sum = sum + last;
            n = n / 10;
        }
        return product-sum;
    }
}