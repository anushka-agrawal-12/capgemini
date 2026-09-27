package Arrays.Binary Search;

public class lowerBound {
    public static int lowerBound(int[] arr,int k){
        int low=0,high=arr.length-1,lb=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=k){
                lb=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lb;
    }
}
