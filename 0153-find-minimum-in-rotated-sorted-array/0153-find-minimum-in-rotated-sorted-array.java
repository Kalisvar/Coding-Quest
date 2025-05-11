class Solution {
    public int findMin(int[] nums) {
      int n = nums.length;
      int start = 0;
      int end = n-1;

      if(nums[start] < nums[end]){
        return nums[start];
      }
      while(start <= end){
        int mid = start + (end -start)/2;
        if(isMin(nums,mid)){
            return nums[mid];
        }
        else if(isMax(nums,mid)){
            return nums[mid+1];
        }
        else if(nums[start] < nums[mid]){
            start= mid+1;
        }
        else {
            end = mid-1;
        }
      }
        return 0;  
    }

    public static boolean isMin(int[] arr, int mid){
        int lVal = (mid -1 < 0)? Integer.MAX_VALUE:arr[mid-1];
        int rVal = (mid+1>=arr.length)?Integer.MAX_VALUE:arr[mid+1];
        return(arr[mid]<lVal&& arr[mid]<rVal);
    }

        public static boolean isMax(int[] arr, int mid){
        int lVal = (mid -1 < 0)? Integer.MIN_VALUE:arr[mid-1];
        int rVal = (mid + 1 >=arr.length)?Integer.MIN_VALUE:arr[mid+1];
        return (arr[mid]>lVal && arr[mid]>rVal);
    }
}