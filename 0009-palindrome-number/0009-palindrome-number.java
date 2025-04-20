class Solution {
    public boolean isPalindrome(int x) {
        return palindrome(x);
    }
    public static boolean palindrome(int n){
    int z = n;
    if(z < 0){
        z = z * -1;
    }
    int y = 0;
    while(z != 0){
        int last = z % 10;
         y = y * 10 + last;
        z = z/10;
    }
    if(n != y){
        return false;
    }
        return true;
    }
}