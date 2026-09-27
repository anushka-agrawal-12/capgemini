package Arrays.Binary Search;

public class upperBound {
    public static int upperBound(int[] arr, int k){
        int low=0,high=arr.length-1,up=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=k){
                low=mid+1;
            }
            else{
                up=mid;
                high=mid-1;
            }
        }
        return up;
    }
}
