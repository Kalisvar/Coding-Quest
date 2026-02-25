class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];
        int count =0;
        for(int i=0;i<indices.length;i++){
            for(int j = 0;j<indices[0].length;j++){
                if(j==0){
                    func(0,indices[i][j],result);
                }
                else{
                    func(1,indices[i][j],result);
                }
            }
        
            
        }
        for(int i=0;i<result.length;i++){
            for(int j =0;j<result[0].length;j++){
               
                if(result[i][j] % 2 !=0){
                    count ++;
                }
            } 
        }
        return count;
    }
    public static void func(int type,int val,int[][] arr){
        if(type == 0){
            for(int i = 0;i<arr[0].length;i++){
                arr[val][i] ++;
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                arr[i][val]++;
            }
        }
    }

}