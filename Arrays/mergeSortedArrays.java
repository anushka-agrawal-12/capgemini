package Arrays;

public class mergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2){
        int i=0,j=0;
        int[] temp=new int[arr1.length+arr2.length];
        int k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                temp[k++]=arr1[i];
                i++;
            }
            else{
                temp[k++]=arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            temp[k++]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            temp[k++]=arr2[j];
            j++;
        }
        return temp;
    }
}
