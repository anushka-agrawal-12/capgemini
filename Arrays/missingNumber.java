package Arrays;

public class missingNumber {
    public static int missingNumber(int[] arr){
        int n=arr.length;
        int XOR1 =0;
        int XOR2=0;
        for(int i=0;i<n;i++){
            XOR1=XOR1^arr[i];
            XOR2=XOR2^i;
        }
        return XOR1^XOR2^n;                //coz we are missing the last element so do ^n also
        
    }
}
