class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n =image[0].length;
        int[][] result = new int[image.length][n];
        for(int i =0;i<image.length;i++){
            for(int j=0;j<n;j++){
                    result[i][j] = image[i][n-1-j] ^ 1;
            }
        }
        return result;
    }
}