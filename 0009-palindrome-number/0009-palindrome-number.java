class Solution {
    public boolean isPalindrome(int x) {
        return palindrome(x);
    }
    public static boolean palindrome(int n){
    int z = n;
    if(z < 0){
        return false;
    }
    int y = 0;
    while(z != 0){
        y = y * 10 + z % 10;;
        z = z/10;
    }
    return (n==y);
    }
}