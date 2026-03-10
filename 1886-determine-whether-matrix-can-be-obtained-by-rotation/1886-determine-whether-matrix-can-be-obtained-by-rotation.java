class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(equal(mat,target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public static int[][] rotate(int[][] a){
        int n = a.length;
        int[][] nw = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                 nw[j][n-i-1] = a[i][j];
            }
        }
        return nw;
    }

    public static boolean equal(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                 if(a[i][j]!= b[i][j]){
                    return false;
                 }
            }
        }
        return true;
    }
}