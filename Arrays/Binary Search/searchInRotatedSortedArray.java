package Arrays.Binary Search;

public class searchInRotatedSortedArray {
    public static int search(int[] arr, int k){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(k>=arr[low]&&k<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<=arr[high]){
                if(k>arr[mid]&&k<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
