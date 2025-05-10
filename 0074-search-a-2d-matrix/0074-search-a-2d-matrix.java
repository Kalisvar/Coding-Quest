class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int r = arr.length;
        int c = arr[0].length;
        int start =0;
        int end = r*c-1;
        while(start<=end){
            int mid = (start+end)/2;
            int row =  mid / c;
            int col= mid % c;
            if(arr[row][col]==tar){
                return true;
            }
            else if(arr[row][col]>tar){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}