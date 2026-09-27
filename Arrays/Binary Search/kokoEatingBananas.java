package Arrays.Binary Search;

public class kokoEatingBananas {
    public static int koko(int[] piles, int h){
        int maxSpeed=0; 
        for(int pile:piles){
            maxSpeed =Math.max(pile, maxSpeed);
        }
        int low=1;
        int high=maxSpeed;
        int answer=maxSpeed;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalHours =0;
             for(int pile:piles){
                 long hours = (pile+mid-1L)/mid;
                 totalHours+=hours;
              }
             if(totalHours<=h){
                answer=mid;
               high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return answer;
    }
}
