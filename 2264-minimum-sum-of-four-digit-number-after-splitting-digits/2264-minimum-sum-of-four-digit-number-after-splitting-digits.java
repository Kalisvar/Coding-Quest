class Solution {
    public int minimumSum(int num) {
        int[] d = new int[4];
        int i = 0;
        while(num!=0){
            d[i++]=num%10;
            num/=10;
        }
        Arrays.sort(d);
        int num1 = d[0]*10+d[2];
        int num2 = d[1]*10+d[3];
        return num1+num2;
    }
}