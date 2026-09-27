package Arrays;

public class bestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int[] arr){
        int buy = 0;
        int profit=0;
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]<arr[buy]){
                buy=i;
            }
            else{
                profit=arr[i]-arr[buy];
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
