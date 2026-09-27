package Arrays.Binary Search;

public class peakElement {
    public static int peak(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[low];

    }
}
