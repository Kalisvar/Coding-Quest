class Solution {
    public boolean checkStraightLine(int[][] co) {
        int x0 = co[0][0];
        int y0 = co[0][1];
        int x1 = co[1][0];
        int y1 = co[1][1];
        int dx = x1-x0;
        int dy = y1-y0;
        for(int[] c : co){
            int x = c[0];
            int y = c[1];
            if(dx * (y-y1) != dy*(x-x1)){
                return false;
            }
        }
        return true;
    }
}