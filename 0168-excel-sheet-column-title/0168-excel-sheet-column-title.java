class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            int charac = (n-1)%26;
            result.append((char) ('A' + charac));
            n = (n-1)/26;
        }
        return result.reverse().toString();
    }
}