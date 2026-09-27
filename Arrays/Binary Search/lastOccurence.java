package Arrays.Binary Search;

public class lastOccurence {
    public static int lastOccurence(int[] arr,int k){
        int low=0,high=arr.length-1,answer=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k){
                answer=mid;
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;
    }
}
