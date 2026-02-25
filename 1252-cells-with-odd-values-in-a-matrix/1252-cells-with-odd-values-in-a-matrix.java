class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // int[][] result = new int[m][n];
        // int count =0;
        // for(int i=0;i<indices.length;i++){
        //     for(int j = 0;j<indices[0].length;j++){
        //         if(j==0){
        //             func(0,indices[i][j],result);
        //         }
        //         else{
        //             func(1,indices[i][j],result);
        //         }
        //     }
        
            
        // }
        // for(int i=0;i<result.length;i++){
        //     for(int j =0;j<result[0].length;j++){
               
        //         if(result[i][j] % 2 !=0){
        //             count ++;
        //         }
        //     } 
        // }
        int oddRows=0 ;
        int oddCol =0;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for(int[] a:indices){
            rows[a[0]]++;
            cols[a[1]]++;
        }
        for(int i =0;i<m;i++){
            if(rows[i]%2 ==1){
                oddRows++;
            }
        }
        for(int i =0;i<n;i++){
            if(cols[i]%2==1){
                oddCol++;
            }
        }
        return oddRows * (n-oddCol) + (m-oddRows)*oddCol;
    }
    // public static void func(int type,int val,int[][] arr){
    //     if(type == 0){
    //         for(int i = 0;i<arr[0].length;i++){
    //             arr[val][i] ++;
    //         }
    //     }
    //     else{
    //         for(int i=0;i<arr.length;i++){
    //             arr[i][val]++;
    //         }
    //     }
    // }

}