class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix[0].length;
        int[][] a = new int[n][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                a[i][j] = matrix[j][i];
            }
        }
        return a;
    }
}