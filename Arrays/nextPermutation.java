package Arrays;

public class nextPermutation {
    public static void nextPermutation(int[] arr){
        int pivot=-1;
///////////////////////////////next permutation steps: 1)find the element which is smaller then adjacent next element
/// arr[i]<arr[i+1]  (if no pivot found this means array is in descending order so reverse entire array and return)
/// 2)find the smallest element which is greater then pivot at the right .
/// 3)swap both(as after the pivot , the suffix array will always be in descending order)
/// 4)reverse the entire suffix array after pivot.

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            int low=0;
            int high=arr.length-1;
             while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
            return;
        }
        }
        int j=arr.length-1;
       while(j<=arr[pivot]){
        j--;
       }
        int temp=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=arr[pivot];

        //reverse whole array after pivot
        int low=pivot+1;
        int high=arr.length-1;
        while(low<high){
            int tempu=arr[low];
            arr[low]=arr[high];
            arr[high]=tempu;
            low++;
            high--;
        }

    }
}
