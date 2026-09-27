package Arrays.Binary Search;

public class firstOccurence {
    public static int firstOccurence(int[] arr,int k){
        int low=0,high=arr.length-1;int answer=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k){
                answer=mid;
                high=mid-1;
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
