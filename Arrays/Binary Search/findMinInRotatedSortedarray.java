package Arrays.Binary Search;

public class findMinInRotatedSortedarray {
    public static int findMin(int[] arr){
        int low=0,high=arr.length-1,min=-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
}
