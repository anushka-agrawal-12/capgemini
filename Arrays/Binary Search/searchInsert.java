//package Arrays.Binary Search;

public class searchInsert {
    public static int searchInsert(int[] arr, int k){
        int low=0,high=arr.length-1,answer=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=k){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8};
        int k=2;
        System.out.println(searchInsert(arr, k));
    }
}
