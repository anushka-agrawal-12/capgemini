package Arrays.Binary Search;

public class sqrt {
    public static int sqrt(int n){
        int low=1,high=n;int answer=0;
        if(n==0){
            return answer;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=n/mid){
                answer=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;
    }
}
