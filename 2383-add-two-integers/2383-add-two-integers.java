class Solution {
    public int sum(int num1, int num2) {
        // return num1+num2;
        // by bit wise operation
        // while(num2!=0){
        //     int carry = num1 & num2;
        //     num1 = num1 ^ num2;
        //     num2 = carry << 1;
        // }
        // return num1;

        // BY recusrive way
        if(num2 == 0){
            return num1;
        }
        return sum(num1 ^ num2,(num1 & num2) << 1);
    }
}