package Arrays;

public class rotateArray {
    public static int[] rotateArr(int[] arr, int k){
        if(arr.length==0){
            return arr;
        }
        k=k%arr.length;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        return arr;

    }
    public static void rotate(int[]arr,int low, int high){
    
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return;
    }
}
