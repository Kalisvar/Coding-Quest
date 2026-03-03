public class Solution {

    public int findNumbers(int[] nums) {
        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     int val = countDigit(nums[i]);

        //     if (val % 2 == 0) {
        //         count++;
        //     }
        // }

        // return count;

        int count = 0;
        for(int num:nums){
            int length = String.valueOf(num).length();
            if(length % 2 == 0){
                count ++;
            }
        }
        return count;
    }

    public static int countDigit(int num) {
        // num = Math.abs(num);  // Handle negative numbers

        if (num == 0) return 1;  // Handle zero case

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }
}