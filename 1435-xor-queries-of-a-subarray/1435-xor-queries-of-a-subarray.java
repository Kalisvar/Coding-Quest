class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        // int[] a = new int[queries.length];
        // for(int i = 0; i < queries.length;i++){
        //     int xor = 0;

        //     for(int j = queries[i][0]; j <= queries[i][1]; j++){
        //         xor = xor ^ arr[j];
        //     }
        //     a[i] = xor;
        // }  
        // return a;

        int[] ans = new int[queries.length];
        for(int i = 1;i<arr.length;i++){
            arr[i] = arr[i-1] ^ arr[i];
        }
        for(int j = 0; j < queries.length;j++){
            if(queries[j][0] > 0){ 
                ans[j] = arr[queries[j][0] - 1] ^ arr[queries[j][1]]; 
            }
            else{
                ans[j] = arr[queries[j][1]];
            }
        }
        return ans;
    }
}