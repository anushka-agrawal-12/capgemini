package Arrays.Binary Search;

public class singleElementInSortedarray {
    public static int singleElementInSortedarray(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high){                      //when we need to find a target element we do low<=high and when need to shrink the window then low<high
            int mid=low+(high-low)/2;
            if(mid%2==1){                    //if mid is odd index->make it even coz before single element all pairs start at even index and after single element they tend to start at odd index
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                low=mid+2;
            }
            else{
                high=mid;
            }

        }
        return arr[low];
    }
}
