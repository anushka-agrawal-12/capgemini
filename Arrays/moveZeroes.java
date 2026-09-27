package Arrays;

public class moveZeroes {
    public static int[] moveZeroes(int[] arr){
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]==0&&arr[j]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[i]==0&&arr[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for(int num:arr){
            System.out.print(num+",");
        }
    }
}
