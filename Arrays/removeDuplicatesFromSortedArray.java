package Arrays;

public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] arr){
        if(arr.length==0){[
            return 0;
        ]}
        int i=0;int j=1;
        while(j<arr.length){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i+1;
    }
}
